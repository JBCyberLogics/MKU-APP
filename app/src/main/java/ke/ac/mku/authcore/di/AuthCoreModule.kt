package ke.ac.mku.authcore.di

import android.content.Context
import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ke.ac.mku.authcore.auth.engine.AuthenticationEngine
import ke.ac.mku.authcore.auth.events.AuthenticationEventManager
import ke.ac.mku.authcore.auth.network.WebFormLoginHandlerAdapter
import ke.ac.mku.authcore.auth.state.AuthenticationStateManager
import ke.ac.mku.authcore.bootstrap.*
import ke.ac.mku.authcore.config.ConfigManager
import ke.ac.mku.authcore.config.HealthMonitor
import ke.ac.mku.authcore.contracts.authentication.*
import ke.ac.mku.authcore.contracts.cookie.*
import ke.ac.mku.authcore.contracts.network.*
import ke.ac.mku.authcore.contracts.portal.*
import ke.ac.mku.authcore.contracts.security.*
import ke.ac.mku.authcore.contracts.session.*
import ke.ac.mku.authcore.contracts.storage.*
import ke.ac.mku.authcore.contracts.ui.*
import ke.ac.mku.authcore.data.api.AuthApiService
import ke.ac.mku.authcore.data.api.WebFormLoginHandler
import ke.ac.mku.authcore.data.repository.AuthRepositoryImpl
import ke.ac.mku.authcore.domain.repository.AuthRepository
import ke.ac.mku.authcore.feature.FeatureRegistry
import ke.ac.mku.authcore.health.SystemHealthMonitor
import ke.ac.mku.authcore.lifecycle.LifecycleManager
import ke.ac.mku.authcore.manager.*
import ke.ac.mku.authcore.manager.ui.*
import ke.ac.mku.authcore.registry.*
import ke.ac.mku.authcore.session.validation.SessionValidator
import ke.ac.mku.authcore.session.recovery.SessionRecoveryManager
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager
import ke.ac.mku.authcore.recovery.RecoveryManager
import ke.ac.mku.authcore.runtime.RuntimeEnvironment
import ke.ac.mku.authcore.security.cert.CertificateTrustManager
import ke.ac.mku.authcore.security.cert.CertificatePinningService
import ke.ac.mku.authcore.security.monitor.SecurityMonitor
import ke.ac.mku.authcore.security.storage.SecureStorageManager
import ke.ac.mku.authcore.service.ServiceRegistry
import ke.ac.mku.authcore.state.StateRegistry
import okhttp3.ConnectionSpec
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Provider
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthCoreModule {

    private const val TAG = "AuthCoreModule"

    @Provides
    @Singleton
    fun provideDependencyRegistry(): DependencyRegistry {
        Log.d(TAG, "Providing DependencyRegistry")
        val registry = DependencyRegistry()
        registry.initialize()
        registry.register("dependency_registry", registry)
        return registry
    }

    @Provides
    @Singleton
    fun provideEventBus(registry: DependencyRegistry): EventBus {
        Log.d(TAG, "Providing EventBus")
        val bus = EventBus()
        registry.register("event_bus", bus)
        return bus
    }

    @Provides
    @Singleton
    fun provideConfigManager(registry: DependencyRegistry): ConfigManager {
        Log.d(TAG, "Providing ConfigManager")
        val manager = ConfigManager()
        manager.load()
        registry.register("configuration_manager", manager)
        return manager
    }

    @Provides
    @Singleton
    fun provideHealthMonitor(configManager: ConfigManager, registry: DependencyRegistry): HealthMonitor {
        Log.d(TAG, "Providing HealthMonitor")
        val monitor = HealthMonitor(configManager)
        registry.register("health_monitor", monitor, listOf("configuration_manager"))
        return monitor
    }

    @Provides
    @Singleton
    fun provideSecurityManager(configManager: ConfigManager, registry: DependencyRegistry): SecurityManager {
        Log.d(TAG, "Providing SecurityManager")
        val manager = SecurityManager(configManager)
        registry.register("security_manager", manager, listOf("configuration_manager"))
        return manager
    }

    @Provides
    @Singleton
    fun provideServiceRegistry(eventBus: EventBus, dependencyRegistry: DependencyRegistry): ServiceRegistry {
        Log.d(TAG, "Providing ServiceRegistry")
        val reg = ServiceRegistry(eventBus, dependencyRegistry)
        dependencyRegistry.register("service_registry", reg, listOf("event_bus", "dependency_registry"))
        return reg
    }

    @Provides
    @Singleton
    fun provideLifecycleManager(eventBus: EventBus, serviceRegistry: ServiceRegistry, registry: DependencyRegistry): LifecycleManager {
        Log.d(TAG, "Providing LifecycleManager")
        val manager = LifecycleManager(eventBus, serviceRegistry, registry)
        registry.register("lifecycle_manager", manager, listOf("event_bus", "service_registry"))
        return manager
    }

    @Provides
    @Singleton
    fun provideStateRegistry(eventBus: EventBus, lifecycleManager: LifecycleManager, serviceRegistry: ServiceRegistry, registry: DependencyRegistry): StateRegistry {
        Log.d(TAG, "Providing StateRegistry")
        val stateRegistry = StateRegistry(eventBus, lifecycleManager, serviceRegistry)
        registry.register("state_registry", stateRegistry, listOf("event_bus", "lifecycle_manager", "service_registry"))
        return stateRegistry
    }

    @Provides
    @Singleton
    fun provideRecoveryManager(eventBus: EventBus, serviceRegistry: ServiceRegistry, stateRegistry: StateRegistry, lifecycleManager: LifecycleManager, registry: DependencyRegistry): RecoveryManager {
        Log.d(TAG, "Providing RecoveryManager")
        val manager = RecoveryManager(eventBus, serviceRegistry, stateRegistry, lifecycleManager)
        registry.register("recovery_manager", manager, listOf("event_bus", "service_registry", "state_registry", "lifecycle_manager"))
        return manager
    }

    @Provides
    @Singleton
    fun provideSecureStorageManager(@ApplicationContext context: Context, cryptoManager: ke.ac.mku.authcore.contracts.crypto.ICryptoManager, auditLogger: ke.ac.mku.authcore.security.audit.SecurityAuditLogger, eventBus: EventBus, registry: DependencyRegistry): SecureStorageManager {
        Log.d(TAG, "Providing SecureStorageManager")
        val manager = SecureStorageManager(context, cryptoManager, auditLogger, eventBus)
        registry.register("secure_storage_manager", manager, listOf("configuration_manager", "security_manager", "crypto_manager"))
        return manager
    }

    @Provides
    @Singleton
    fun provideCertificateTrustManager(@ApplicationContext context: Context, cryptoManager: ke.ac.mku.authcore.contracts.crypto.ICryptoManager, secureStorage: SecureStorageManager, auditLogger: ke.ac.mku.authcore.security.audit.SecurityAuditLogger, eventBus: EventBus, registry: DependencyRegistry): CertificateTrustManager {
        Log.d(TAG, "Providing CertificateTrustManager")
        val manager = CertificateTrustManager(context, cryptoManager, secureStorage, auditLogger, eventBus)
        registry.register("certificate_trust_manager", manager, listOf("configuration_manager", "secure_storage_manager", "crypto_manager"))
        return manager
    }

    @Provides
    @Singleton
    fun provideSecurityMonitor(@ApplicationContext context: Context, eventBus: EventBus, threatMonitor: ke.ac.mku.authcore.security.monitor.ThreatMonitor, auditManager: ke.ac.mku.authcore.security.monitor.SecurityAuditManager, integrityMonitor: ke.ac.mku.authcore.security.monitor.IntegrityMonitor, incidentHandler: ke.ac.mku.authcore.security.monitor.SecurityIncidentHandler, riskEngine: ke.ac.mku.authcore.security.monitor.RiskEngine, registry: DependencyRegistry): SecurityMonitor {
        Log.d(TAG, "Providing SecurityMonitor")
        val manager = SecurityMonitor(context, eventBus, threatMonitor, auditManager, integrityMonitor, incidentHandler, riskEngine)
        registry.register("security_monitor", manager, listOf("configuration_manager", "secure_storage_manager", "certificate_trust_manager", "recovery_manager", "threat_detector"))
        return manager
    }

    @Provides
    @Singleton
    fun provideAuthenticationEventManager(secureStorageManager: SecureStorageManager, eventBus: EventBus, stateRegistry: StateRegistry, securityMonitor: SecurityMonitor, registry: DependencyRegistry): IAuthenticationEventManager {
        Log.d(TAG, "Providing AuthenticationEventManager")
        val manager = AuthenticationEventManager(secureStorageManager, eventBus, stateRegistry, securityMonitor, registry)
        registry.register("authentication_event_manager", manager, listOf("secure_storage_manager", "event_bus", "state_registry", "security_monitor"))
        return manager
    }

    @Provides
    @Singleton
    fun provideWebFormLoginHandlerAdapter(webFormLoginHandler: WebFormLoginHandler, registry: DependencyRegistry): IAuthNetworkService {
        Log.d(TAG, "Providing IAuthNetworkService")
        val adapter = WebFormLoginHandlerAdapter(webFormLoginHandler)
        registry.register("auth_network_service", adapter, emptyList())
        return adapter
    }

    @Provides
    @Singleton
    fun provideAuthenticationEngine(authNetworkService: IAuthNetworkService, securityMonitor: SecurityMonitor, sessionManager: ISessionManager, eventBus: EventBus, stateRegistry: StateRegistry, registry: DependencyRegistry, authEventManager: IAuthenticationEventManager): IAuthenticationEngine {
        Log.d(TAG, "Providing IAuthenticationEngine")
        val engine = AuthenticationEngine(authNetworkService, securityMonitor, sessionManager as SessionManager, eventBus, stateRegistry, registry, authEventManager)
        registry.register("authentication_engine", engine, listOf("security_monitor", "session_manager", "configuration_manager", "authentication_event_manager", "auth_network_service"))
        return engine
    }

    @Provides
    @Singleton
    fun provideAuthenticationStateManager(stateRegistry: StateRegistry, secureStorageManager: SecureStorageManager, recoveryManager: RecoveryManager, securityMonitor: SecurityMonitor, eventBus: EventBus, dependencyRegistry: DependencyRegistry, authEventManager: IAuthenticationEventManager): IAuthenticationStateManager {
        val manager = AuthenticationStateManager(stateRegistry, secureStorageManager, recoveryManager, securityMonitor, eventBus, dependencyRegistry, authEventManager)
        dependencyRegistry.register("authentication_state_manager", manager, listOf("state_registry", "secure_storage_manager", "recovery_manager", "security_monitor"))
        return manager
    }

    @Provides
    @Singleton
    fun provideSessionManager(@ApplicationContext context: Context, stateRegistry: StateRegistry, secureStorageManager: SecureStorageManager, recoveryManager: RecoveryManager, securityMonitor: SecurityMonitor, eventBus: EventBus, registry: DependencyRegistry, authEventManager: IAuthenticationEventManager, cryptoManager: ke.ac.mku.authcore.contracts.crypto.ICryptoManager): ISessionManager {
        Log.d(TAG, "Providing ISessionManager")
        val manager = SessionManager(context, stateRegistry, secureStorageManager, recoveryManager, securityMonitor, eventBus, registry, authEventManager, cryptoManager)
        registry.register("session_manager", manager, listOf("state_registry", "secure_storage_manager", "recovery_manager", "crypto_manager", "security_monitor"))
        return manager
    }

    @Provides
    @Singleton
    fun provideSessionValidator(@ApplicationContext context: Context, sessionManager: ISessionManager, secureStorageManager: SecureStorageManager, cryptoManager: ke.ac.mku.authcore.contracts.crypto.ICryptoManager, securityMonitor: SecurityMonitor, eventBus: EventBus, registry: DependencyRegistry, authEventManager: IAuthenticationEventManager): ISessionValidator {
        Log.d(TAG, "Providing ISessionValidator")
        val validator = SessionValidator(context, sessionManager, secureStorageManager, cryptoManager, securityMonitor, eventBus, registry, authEventManager)
        registry.register("session_validator", validator, listOf("session_manager", "secure_storage_manager", "crypto_manager", "security_monitor"))
        return validator
    }

    @Provides
    @Singleton
    fun provideSessionRecoveryManager(@ApplicationContext context: Context, sessionManager: ISessionManager, sessionValidator: ISessionValidator, authenticationEngineProvider: Provider<IAuthenticationEngine>, secureStorageManager: ISecureStorageManager, securityMonitor: ISecurityMonitor, eventBus: EventBus, dependencyRegistry: DependencyRegistry, authEventManager: IAuthenticationEventManager, cookieManagerProvider: Provider<ICookieManager>, portalConnector: IPortalConnector, recoveryManager: RecoveryManager, serviceRegistry: ServiceRegistry, cryptoManager: ke.ac.mku.authcore.contracts.crypto.ICryptoManager, authStateManager: IAuthenticationStateManager): ISessionRecoveryManager {
        val manager = SessionRecoveryManager(context, sessionManager, sessionValidator, authenticationEngineProvider, secureStorageManager, securityMonitor, eventBus, dependencyRegistry, authEventManager, cookieManagerProvider, portalConnector, recoveryManager, serviceRegistry, cryptoManager, authStateManager)
        dependencyRegistry.register("session_recovery_manager", manager, listOf("session_manager", "session_validator", "secure_storage_manager", "crypto_manager", "recovery_manager", "authentication_state_manager"))
        return manager
    }

    @Provides
    @Singleton
    fun provideCookieManager(sessionManager: ISessionManager, sessionValidatorProvider: Provider<ISessionValidator>, recoveryManagerProvider: Provider<ISessionRecoveryManager>, secureStorageManager: ISecureStorageManager, cryptoManager: ke.ac.mku.authcore.contracts.crypto.ICryptoManager, securityMonitor: ISecurityMonitor, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry, stateRegistry: StateRegistry): ICookieManager {
        Log.d(TAG, "Providing ICookieManager")
        val manager = CookieManager(sessionManager, sessionValidatorProvider, recoveryManagerProvider, secureStorageManager, cryptoManager, securityMonitor, authEventManager, stateRegistry)
        registry.register("cookie_manager", manager, listOf("session_manager", "secure_storage_manager", "crypto_manager", "security_monitor", "state_registry"))
        return manager
    }

    @Provides
    @Singleton
    fun provideCookieSynchronizationManager(cookieManager: ICookieManager, sessionManager: ISessionManager, sessionValidator: ISessionValidator, recoveryManagerProvider: Provider<ISessionRecoveryManager>, secureStorageManager: ISecureStorageManager, securityMonitor: ISecurityMonitor, authEventManager: IAuthenticationEventManager, serviceRegistry: ServiceRegistry, registry: DependencyRegistry): ICookieSynchronizationManager {
        Log.d(TAG, "Providing ICookieSynchronizationManager")
        val manager = CookieSynchronizationManager(cookieManager, sessionManager, sessionValidator, recoveryManagerProvider, secureStorageManager, securityMonitor, authEventManager, serviceRegistry)
        registry.register("cookie_synchronization_manager", manager, listOf("cookie_manager", "session_manager", "session_validator", "secure_storage_manager"))
        return manager
    }

    @Provides
    @Singleton
    fun provideCertificatePinningManager(impl: CertificatePinningService, registry: DependencyRegistry): ICertificatePinningManager {
        Log.d(TAG, "Providing ICertificatePinningManager")
        registry.register("certificate_pinning_manager", impl, emptyList())
        return impl
    }

    @Provides
    @Singleton
    fun provideNetworkManager(@ApplicationContext context: Context, cookieManager: ICookieManager, cookieSyncManager: ICookieSynchronizationManager, sessionManager: ISessionManager, securityMonitor: ISecurityMonitor, pinningManager: ICertificatePinningManager, authEventManager: IAuthenticationEventManager, recoveryManagerProvider: Provider<ISessionRecoveryManager>, sessionValidator: ISessionValidator, registry: DependencyRegistry): INetworkManager {
        Log.d(TAG, "Providing INetworkManager")
        val manager = ke.ac.mku.authcore.manager.NetworkManager(context, cookieManager, cookieSyncManager, sessionManager, securityMonitor, pinningManager, authEventManager, recoveryManagerProvider, sessionValidator)
        registry.register("network_manager", manager, listOf("cookie_manager", "session_manager", "security_monitor", "cookie_synchronization_manager", "certificate_pinning_manager"))
        return manager
    }

    @Provides
    @Singleton
    fun provideRequestPipelineManager(cookieManager: ICookieManager, sessionManager: ISessionManager, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry): IRequestPipelineManager {
        Log.d(TAG, "Providing IRequestPipelineManager")
        val manager = ke.ac.mku.authcore.manager.RequestPipelineManager(cookieManager, sessionManager, authEventManager)
        registry.register("request_pipeline_manager", manager, listOf("cookie_manager", "session_manager", "authentication_event_manager"))
        return manager
    }

    @Provides
    @Singleton
    fun provideResponseProcessingManager(cookieManager: ICookieManager, cookieSyncManager: ICookieSynchronizationManager, sessionManager: ISessionManager, sessionValidator: ISessionValidator, recoveryManager: ISessionRecoveryManager, securityMonitor: ISecurityMonitor, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry): IResponseProcessingManager {
        Log.d(TAG, "Providing IResponseProcessingManager")
        val manager = ke.ac.mku.authcore.manager.ResponseProcessingManager(cookieManager, cookieSyncManager, sessionManager, sessionValidator, recoveryManager, securityMonitor, authEventManager)
        registry.register("response_processing_manager", manager, listOf("cookie_manager", "cookie_synchronization_manager", "session_manager", "security_monitor"))
        return manager
    }

    @Provides
    @Singleton
    fun providePortalConnector(networkManagerProvider: Provider<INetworkManager>, networkService: IAuthNetworkService, responseProcessorProvider: Provider<IResponseProcessingManager>, sessionManager: ISessionManager, cookieManager: ICookieManager, securityMonitor: ISecurityMonitor, pinningManager: ICertificatePinningManager, authEventManager: IAuthenticationEventManager, serviceRegistry: ServiceRegistry, registry: DependencyRegistry): IPortalConnector {
        Log.d(TAG, "Providing IPortalConnector")
        val manager = ke.ac.mku.authcore.manager.PortalConnector(networkManagerProvider, networkService, responseProcessorProvider, sessionManager, cookieManager, securityMonitor, pinningManager, authEventManager, serviceRegistry)
        registry.register("portal_connector", manager, listOf("auth_network_service", "network_manager", "session_manager", "cookie_manager", "security_monitor"))
        return manager
    }

    @Provides
    @Singleton
    fun providePortalDiscoveryManager(portalConnector: IPortalConnector, crawler: ke.ac.mku.authcore.manager.PortalCrawler, mapBuilder: ke.ac.mku.authcore.manager.PortalMapBuilder, scanner: ke.ac.mku.authcore.manager.NavigationScanner, sessionManager: ISessionManager, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry, domAnalysisManager: IDomAnalysisManager): IPortalDiscoveryManager {
        Log.d(TAG, "Providing IPortalDiscoveryManager")
        val manager = PortalDiscoveryManager(portalConnector, crawler, mapBuilder, scanner, sessionManager, authEventManager, domAnalysisManager)
        registry.register("portal_discovery_core", manager, listOf("portal_connector", "session_manager"))
        return manager
    }

    @Provides
    @Singleton
    fun provideDomAnalysisManager(parser: ke.ac.mku.authcore.manager.HtmlDocumentParser, tableAnalyzer: ke.ac.mku.authcore.manager.TableAnalyzer, formAnalyzer: ke.ac.mku.authcore.manager.FormAnalyzer, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry): IDomAnalysisManager {
        Log.d(TAG, "Providing IDomAnalysisManager")
        val manager = ke.ac.mku.authcore.manager.DomAnalysisManager(parser, tableAnalyzer, formAnalyzer, authEventManager)
        registry.register("dom_analysis_engine", manager, listOf("authentication_event_manager"))
        return manager
    }

    @Provides
    @Singleton
    fun provideSemanticClassificationManager(classifier: ke.ac.mku.authcore.manager.EntityClassifier, contextAnalyzer: ke.ac.mku.authcore.manager.ContextAnalyzer, confidenceEngine: ke.ac.mku.authcore.manager.ConfidenceEngine, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry, domAnalysisProvider: Provider<IDomAnalysisManager>): ISemanticClassificationManager {
        Log.d(TAG, "Providing ISemanticClassificationManager")
        val manager = SemanticClassificationManager(classifier, contextAnalyzer, confidenceEngine, authEventManager, domAnalysisProvider)
        registry.register("semantic_classification_engine", manager, listOf("dom_analysis_engine"))
        return manager
    }

    @Provides
    @Singleton
    fun provideUniversalJsonManager(schemaBuilder: ke.ac.mku.authcore.manager.JsonSchemaBuilder, entitySerializer: ke.ac.mku.authcore.manager.EntitySerializer, datasetComposer: ke.ac.mku.authcore.manager.DatasetComposer, relSerializer: ke.ac.mku.authcore.manager.RelationshipSerializer, metadataGenerator: ke.ac.mku.authcore.manager.MetadataGenerator, validator: ke.ac.mku.authcore.manager.JsonValidator, cacheManager: ke.ac.mku.authcore.manager.JsonCacheManager, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry, classificationManager: Provider<ISemanticClassificationManager>): IUniversalJsonManager {
        Log.d(TAG, "Providing IUniversalJsonManager")
        val manager = UniversalJsonManager(schemaBuilder, entitySerializer, datasetComposer, relSerializer, metadataGenerator, validator, cacheManager, authEventManager, classificationManager)
        registry.register("universal_json_generator", manager, listOf("semantic_classification_engine"))
        return manager
    }

    @Provides
    @Singleton
    fun provideRelationshipManager(graphBuilder: ke.ac.mku.authcore.manager.EntityGraphBuilder, discoveryEngine: ke.ac.mku.authcore.manager.RelationshipDiscoveryEngine, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry, jsonManager: Provider<IUniversalJsonManager>): IRelationshipManager {
        Log.d(TAG, "Providing IRelationshipManager")
        val manager = RelationshipManager(graphBuilder, discoveryEngine, authEventManager, jsonManager)
        registry.register("relationship_engine", manager, listOf("universal_json_generator"))
        return manager
    }

    @Provides
    @Singleton
    fun provideKnowledgeGraphManager(db: ke.ac.mku.authcore.manager.GraphDatabase, reasoningEngine: ke.ac.mku.authcore.manager.ReasoningEngine, queryEngine: ke.ac.mku.authcore.manager.SemanticQueryEngine, relationshipManager: IRelationshipManager, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry): IKnowledgeGraphManager {
        Log.d(TAG, "Providing IKnowledgeGraphManager")
        val manager = ke.ac.mku.authcore.manager.KnowledgeGraphManager(db, reasoningEngine, queryEngine, relationshipManager, authEventManager)
        registry.register("knowledge_graph_manager", manager, listOf("relationship_engine"))
        return manager
    }

    @Provides
    @Singleton
    fun provideStudentContextManager(graphManager: IKnowledgeGraphManager, contextBuilder: ke.ac.mku.authcore.manager.StudentContextBuilder, priorityEngine: ke.ac.mku.authcore.manager.PriorityEngine, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry): IStudentContextManager {
        Log.d(TAG, "Providing IStudentContextManager")
        val manager = ke.ac.mku.authcore.manager.StudentContextManager(graphManager, contextBuilder, priorityEngine, authEventManager)
        registry.register("student_context_core", manager, listOf("knowledge_graph_manager"))
        return manager
    }

    @Provides
    @Singleton
    fun provideContextSynchronizationManager(studentContextManager: IStudentContextManager, changeDetector: ke.ac.mku.authcore.manager.ContextChangeDetector, deltaEngine: ke.ac.mku.authcore.manager.DeltaComputationEngine, merger: ke.ac.mku.authcore.manager.ContextMerger, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry): IContextSynchronizationManager {
        Log.d(TAG, "Providing IContextSynchronizationManager")
        val manager = ke.ac.mku.authcore.manager.ContextSynchronizationManager(studentContextManager, changeDetector, deltaEngine, merger, authEventManager)
        registry.register("context_synchronizer", manager, listOf("student_context_core"))
        return manager
    }

    @Provides
    @Singleton
    fun provideContextCacheManager(snapshotManager: ke.ac.mku.authcore.manager.SnapshotManager, cacheEngine: ke.ac.mku.authcore.manager.IncrementalCacheEngine, integrityValidator: ke.ac.mku.authcore.manager.CacheIntegrityValidator, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry): IContextCacheManager {
        Log.d(TAG, "Providing IContextCacheManager")
        val manager = ke.ac.mku.authcore.manager.ContextCacheManager(snapshotManager, cacheEngine, integrityValidator, authEventManager)
        registry.register("context_cache", manager, listOf("secure_storage_manager"))
        return manager
    }

    @Provides
    @Singleton
    fun provideContextEventManager(syncManager: IContextSynchronizationManager, activityDetector: ke.ac.mku.authcore.manager.StudentActivityDetector, refreshPlanner: ke.ac.mku.authcore.manager.DashboardRefreshPlanner, dispatcher: ke.ac.mku.authcore.manager.PriorityEventDispatcher, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry): IContextEventManager {
        Log.d(TAG, "Providing IContextEventManager")
        val manager = ke.ac.mku.authcore.manager.ContextEventManager(syncManager, activityDetector, refreshPlanner, dispatcher, authEventManager)
        registry.register("context_event_engine", manager, listOf("context_synchronizer"))
        return manager
    }

    @Provides
    @Singleton
    fun provideContextValidationManager(schemaValidator: ke.ac.mku.authcore.manager.SchemaValidator, integrityValidator: ke.ac.mku.authcore.manager.IntegrityValidator, repairEngine: ke.ac.mku.authcore.manager.ContextRepairEngine, readinessEvaluator: ke.ac.mku.authcore.manager.DashboardReadinessEvaluator, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry, contextManagerProvider: Provider<IStudentContextManager>): IContextValidationManager {
        Log.d(TAG, "Providing IContextValidationManager")
        val manager = ContextValidationManager(schemaValidator, integrityValidator, repairEngine, readinessEvaluator, authEventManager, contextManagerProvider)
        registry.register("context_validator", manager, listOf("student_context_core"))
        return manager
    }

    @Provides
    @Singleton
    fun provideWidgetRegistryManager(contextManager: IStudentContextManager, factory: ke.ac.mku.authcore.manager.ui.WidgetFactory, eligibilityEngine: ke.ac.mku.authcore.manager.ui.WidgetEligibilityEngine, priorityManager: ke.ac.mku.authcore.manager.ui.WidgetPriorityManager, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry): IWidgetRegistryManager {
        Log.d(TAG, "Providing IWidgetRegistryManager")
        val manager = ke.ac.mku.authcore.manager.ui.WidgetRegistryManager(contextManager, factory, eligibilityEngine, priorityManager, authEventManager)
        registry.register("widget_registry", manager, listOf("student_context_core"))
        return manager
    }

    @Provides
    @Singleton
    fun provideDashboardIntelligenceManager(contextManager: IStudentContextManager, widgetRegistry: IWidgetRegistryManager, decisionEngine: ke.ac.mku.authcore.manager.ui.DashboardDecisionEngine, placementEngine: ke.ac.mku.authcore.manager.ui.WidgetPlacementEngine, recommendationEngine: ke.ac.mku.authcore.manager.ui.RecommendationEngine, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry): IDashboardIntelligenceManager {
        Log.d(TAG, "Providing IDashboardIntelligenceManager")
        val manager = ke.ac.mku.authcore.manager.ui.DashboardIntelligenceManager(contextManager, widgetRegistry, decisionEngine, placementEngine, recommendationEngine, authEventManager)
        registry.register("dashboard_intelligence_engine", manager, listOf("widget_registry"))
        return manager
    }

    @Provides
    @Singleton
    fun provideAdaptiveLayoutManager(gridEngine: ke.ac.mku.authcore.manager.ui.GridGenerationEngine, optimizer: ke.ac.mku.authcore.manager.ui.WidgetPlacementOptimizer, treeBuilder: ke.ac.mku.authcore.manager.ui.RenderTreeBuilder, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry, intelligenceManager: Provider<IDashboardIntelligenceManager>): IAdaptiveLayoutManager {
        Log.d(TAG, "Providing IAdaptiveLayoutManager")
        val manager = AdaptiveLayoutManager(gridEngine, optimizer, treeBuilder, authEventManager, intelligenceManager)
        registry.register("adaptive_layout_engine", manager, listOf("dashboard_intelligence_engine"))
        return manager
    }

    @Provides
    @Singleton
    fun provideMotionEngine(transitionManager: ke.ac.mku.authcore.manager.ui.TransitionManager, physicsEngine: ke.ac.mku.authcore.manager.ui.PhysicsAnimationEngine, loadingManager: ke.ac.mku.authcore.manager.ui.LoadingExperienceManager, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry): IMotionEngine {
        Log.d(TAG, "Providing IMotionEngine")
        val manager = ke.ac.mku.authcore.manager.ui.MotionEngine(transitionManager, physicsEngine, loadingManager, authEventManager)
        registry.register("motion_engine", manager, listOf("adaptive_layout_engine"))
        return manager
    }

    @Provides
    @Singleton
    fun provideDashboardRenderManager(contextManager: IStudentContextManager, executor: ke.ac.mku.authcore.manager.ui.RenderTreeExecutor, binder: ke.ac.mku.authcore.manager.ui.StateBindingEngine, authEventManager: IAuthenticationEventManager, registry: DependencyRegistry, adaptiveLayoutProvider: Provider<IAdaptiveLayoutManager>, intelligenceManagerProvider: Provider<IDashboardIntelligenceManager>): IDashboardRenderManager {
        Log.d(TAG, "Providing IDashboardRenderManager")
        val manager = DashboardRenderManager(contextManager, executor, binder, authEventManager, adaptiveLayoutProvider, intelligenceManagerProvider)
        registry.register("dashboard_renderer", manager, listOf("adaptive_layout_engine", "motion_engine"))
        return manager
    }

    @Provides
    @Singleton
    fun provideAuthenticationCore(authRepository: AuthRepository, portalDiscovery: PortalDiscovery, endpointRegistry: EndpointRegistry, registry: DependencyRegistry): AuthenticationCore {
        Log.d(TAG, "Providing AuthenticationCore")
        val authCore = AuthenticationCore(authRepository, portalDiscovery, endpointRegistry)
        registry.register("authentication_core", authCore, listOf("authentication_manager", "portal_discovery", "endpoint_registry"))
        return authCore
    }

    @Provides
    @Singleton
    fun providePlatformBootstrap(registry: DependencyRegistry, eventBus: EventBus): PlatformBootstrap {
        Log.d(TAG, "Providing PlatformBootstrap")
        return PlatformBootstrap(registry, eventBus)
    }

    @Provides
    @Singleton
    fun providePlatformVerifier(eventBus: EventBus, dependencyRegistry: DependencyRegistry, sessionManager: ISessionManager, portalDiscovery: IPortalDiscoveryManager, domAnalysis: IDomAnalysisManager, knowledgeGraph: IKnowledgeGraphManager, studentContext: IStudentContextManager, contextValidation: IContextValidationManager, widgetRegistry: IWidgetRegistryManager, dashboardRender: IDashboardRenderManager): PlatformVerifier {
        Log.d(TAG, "Providing PlatformVerifier")
        return PlatformVerifier(eventBus, dependencyRegistry, sessionManager, portalDiscovery, domAnalysis, knowledgeGraph, studentContext, contextValidation, widgetRegistry, dashboardRender)
    }

    @Provides
    @Singleton
    fun provideBootstrapManager(configManager: ConfigManager, dependencyRegistry: DependencyRegistry, authCoreManager: AuthCoreManager, bootstrap: PlatformBootstrap, verifier: PlatformVerifier, eventBus: EventBus): BootstrapManager {
        Log.d(TAG, "Providing BootstrapManager")
        val manager = BootstrapManager(configManager, dependencyRegistry, authCoreManager, bootstrap, verifier, eventBus)
        dependencyRegistry.register("bootstrap_manager", manager, listOf("configuration_manager", "authentication_core", "dependency_registry"))
        return manager
    }

    @Provides
    @Singleton
    fun provideAuthenticationTransactionManager(
        webFormLoginHandler: WebFormLoginHandler,
        sessionManager: ISessionManager,
        cookieManager: ICookieManager,
        sessionValidator: ISessionValidator,
        recoveryManager: ISessionRecoveryManager,
        platformVerifier: PlatformVerifier,
        dashboardRenderer: IDashboardRenderManager,
        eventBus: EventBus,
        authEventManager: IAuthenticationEventManager,
        securityMonitor: SecurityMonitor,
        portalConnector: IPortalConnector,
        registry: DependencyRegistry
    ): ke.ac.mku.authcore.auth.transaction.AuthenticationTransactionManager {
        Log.d(TAG, "Providing AuthenticationTransactionManager")
        val manager = ke.ac.mku.authcore.auth.transaction.AuthenticationTransactionManager(
            webFormLoginHandler, sessionManager, cookieManager, sessionValidator, 
            recoveryManager, platformVerifier, dashboardRenderer, eventBus, authEventManager,
            securityMonitor, portalConnector
        )
        registry.register("authentication_transaction_manager", manager, 
            listOf("session_manager", "cookie_manager", "session_validator", "recovery_manager", "dashboard_renderer", "security_monitor", "portal_connector"))
        return manager
    }

    @Provides
    @Singleton
    fun provideAuthRepository(
        transactionManager: ke.ac.mku.authcore.auth.transaction.AuthenticationTransactionManager,
        sessionManager: ISessionManager,
        cookieManager: ICookieManager,
        registry: DependencyRegistry
    ): AuthRepository {
        Log.d(TAG, "Providing AuthRepository")
        val impl = AuthRepositoryImpl(transactionManager, sessionManager, cookieManager as CookieManager)
        registry.register("authentication_manager", impl, listOf("configuration_manager", "security_manager"))
        return impl
    }

    @Provides
    @Singleton
    fun providePortalDiscovery(registry: DependencyRegistry): PortalDiscovery {
        Log.d(TAG, "Providing PortalDiscovery")
        val discovery = PortalDiscovery()
        registry.register("portal_discovery", discovery, listOf("auth_network_service"))
        return discovery
    }

    @Provides
    @Singleton
    fun provideEndpointRegistry(configManager: ConfigManager, portalDiscovery: PortalDiscovery, registry: DependencyRegistry): EndpointRegistry {
        Log.d(TAG, "Providing EndpointRegistry")
        val endpointRegistry = EndpointRegistry(configManager, portalDiscovery)
        registry.register("endpoint_registry", endpointRegistry, listOf("portal_discovery"))
        return endpointRegistry
    }

    @Provides
    @Singleton
    fun provideAuthApiService(okHttpClient: OkHttpClient, configManager: ConfigManager, registry: DependencyRegistry): AuthApiService {
        Log.d(TAG, "Providing AuthApiService")
        val retrofit = Retrofit.Builder()
            .baseUrl(configManager.config.portal.baseUrl)
            .client(okHttpClient)
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
        val service = retrofit.create(AuthApiService::class.java)
        registry.register("auth_api_service", service, listOf("configuration_manager"))
        return service
    }

    @Provides
    @Singleton
    fun provideWebFormLoginHandler(authApiService: AuthApiService): WebFormLoginHandler {
        Log.d(TAG, "Providing WebFormLoginHandler")
        return WebFormLoginHandler(authApiService)
    }

    @Provides
    @Singleton
    fun provideAuthCoreManager(authRepository: AuthRepository, configManager: ConfigManager, healthMonitor: HealthMonitor): AuthCoreManager {
        Log.d(TAG, "Providing AuthCoreManager")
        return AuthCoreManager(authRepository, configManager, healthMonitor)
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(configManager: ConfigManager, cookieManager: ICookieManager, certificateTrustManager: CertificateTrustManager, requestDiscoveryInterceptor: ke.ac.mku.authcore.manager.NetworkInterceptorAnalyzer): OkHttpClient {
        Log.d(TAG, "Providing OkHttpClient")
        val config = configManager.config
        val loggingInterceptor = HttpLoggingInterceptor().apply {
            level = if (config.logging.logNetwork) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
        }
        val connectionSpec = ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions("TLSv1.3", "TLSv1.2").build()
        return OkHttpClient.Builder()
            .connectTimeout(config.network.connectionTimeout, TimeUnit.SECONDS)
            .readTimeout(config.network.readTimeout, TimeUnit.SECONDS)
            .writeTimeout(config.network.writeTimeout, TimeUnit.SECONDS)
            .cookieJar(cookieManager as okhttp3.CookieJar)
            .addInterceptor(loggingInterceptor)
            .addInterceptor(requestDiscoveryInterceptor)
            .connectionSpecs(listOf(connectionSpec))
            .sslSocketFactory(certificateTrustManager.getSSLSocketFactory(), certificateTrustManager.getTrustManager())
            .hostnameVerifier(certificateTrustManager.getHostnameVerifier())
            .followRedirects(config.portal.followRedirects)
            .followSslRedirects(config.portal.followRedirects)
            .build()
    }
}
