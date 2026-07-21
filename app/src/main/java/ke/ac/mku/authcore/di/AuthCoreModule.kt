package ke.ac.mku.authcore.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ke.ac.mku.authcore.auth.engine.AuthenticationEngine
import ke.ac.mku.authcore.auth.events.AuthenticationEventManager
import ke.ac.mku.authcore.auth.network.WebFormLoginHandlerAdapter
import ke.ac.mku.authcore.auth.portal.PortalConnectorImpl
import ke.ac.mku.authcore.auth.state.AuthenticationStateManager
import ke.ac.mku.authcore.auth.workflow.LoginOrchestrator
import ke.ac.mku.authcore.bootstrap.AuthenticationCore
import ke.ac.mku.authcore.bootstrap.BootstrapManager
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.config.ConfigManager
import ke.ac.mku.authcore.config.HealthMonitor
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationStateManager
import ke.ac.mku.authcore.contracts.cookie.ICookieManager
import ke.ac.mku.authcore.contracts.cookie.ICookieSynchronizationManager
import ke.ac.mku.authcore.contracts.network.INetworkManager
import ke.ac.mku.authcore.contracts.security.ICertificatePinningManager
import ke.ac.mku.authcore.contracts.authentication.ILoginOrchestrator
import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.contracts.session.ISessionValidator
import ke.ac.mku.authcore.contracts.network.IAuthNetworkService
import ke.ac.mku.authcore.contracts.portal.IPortalConnector
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.data.api.AuthApiService
import ke.ac.mku.authcore.data.api.WebFormLoginHandler
import ke.ac.mku.authcore.data.repository.AuthRepositoryImpl
import ke.ac.mku.authcore.domain.repository.AuthRepository
import ke.ac.mku.authcore.feature.FeatureRegistry
import ke.ac.mku.authcore.health.SystemHealthMonitor
import ke.ac.mku.authcore.lifecycle.LifecycleManager
import ke.ac.mku.authcore.manager.AuthCoreManager
import ke.ac.mku.authcore.manager.CookieManager
import ke.ac.mku.authcore.manager.CookieSynchronizationManager
import ke.ac.mku.authcore.manager.SessionManager
import ke.ac.mku.authcore.registry.DependencyRegistry
import ke.ac.mku.authcore.session.validation.SessionValidator
import ke.ac.mku.authcore.session.recovery.SessionRecoveryManager
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager
import ke.ac.mku.authcore.registry.EndpointRegistry
import ke.ac.mku.authcore.registry.PortalDiscovery
import ke.ac.mku.authcore.registry.PortalSDK
import ke.ac.mku.authcore.registry.SecurityManager
import ke.ac.mku.authcore.recovery.RecoveryManager
import ke.ac.mku.authcore.runtime.RuntimeEnvironment
import ke.ac.mku.authcore.security.cert.CertificateTrustManager
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

    @Provides
    @Singleton
    fun provideDependencyRegistry(): DependencyRegistry {
        val registry = DependencyRegistry()
        registry.initialize()
        registry.register(
            name = "dependency_registry",
            instance = registry,
            dependencies = emptyList(),
            startupOrder = 0,
            isRequired = true
        )
        return registry
    }

    @Provides
    @Singleton
    fun provideEventBus(registry: DependencyRegistry): EventBus {
        val bus = EventBus()
        registry.register(
            name = "event_bus",
            instance = bus,
            dependencies = emptyList(),
            startupOrder = 1,
            isRequired = true
        )
        return bus
    }

    @Provides
    @Singleton
    fun provideConfigManager(registry: DependencyRegistry): ConfigManager {
        val manager = ConfigManager()
        manager.load()
        registry.register(
            name = "configuration_manager",
            instance = manager,
            dependencies = emptyList(),
            startupOrder = 2,
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideSecurityManager(
        configManager: ConfigManager,
        registry: DependencyRegistry
    ): SecurityManager {
        val manager = SecurityManager(configManager)
        registry.register(
            name = "security_manager",
            instance = manager,
            dependencies = listOf("configuration_manager"),
            startupOrder = 3,
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideServiceRegistry(
        eventBus: EventBus,
        dependencyRegistry: DependencyRegistry
    ): ServiceRegistry {
        val registry = ServiceRegistry(eventBus, dependencyRegistry)
        dependencyRegistry.register(
            name = "service_registry",
            instance = registry,
            dependencies = listOf("event_bus", "dependency_registry"),
            startupOrder = 5,
            isRequired = true
        )
        return registry
    }

    @Provides
    @Singleton
    fun provideLifecycleManager(
        eventBus: EventBus,
        serviceRegistry: ServiceRegistry,
        dependencyRegistry: DependencyRegistry
    ): LifecycleManager {
        val manager = LifecycleManager(eventBus, serviceRegistry, dependencyRegistry)
        dependencyRegistry.register(
            name = "lifecycle_manager",
            instance = manager,
            dependencies = listOf("event_bus", "service_registry"),
            startupOrder = 14,
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideStateRegistry(
        eventBus: EventBus,
        lifecycleManager: LifecycleManager,
        serviceRegistry: ServiceRegistry,
        registry: DependencyRegistry
    ): StateRegistry {
        val stateRegistry = StateRegistry(eventBus, lifecycleManager, serviceRegistry)
        registry.register(
            name = "state_registry",
            instance = stateRegistry,
            dependencies = listOf("event_bus"),
            startupOrder = 15,
            isRequired = true
        )
        return stateRegistry
    }

    @Provides
    @Singleton
    fun provideRecoveryManager(
        eventBus: EventBus,
        serviceRegistry: ServiceRegistry,
        stateRegistry: StateRegistry,
        lifecycleManager: LifecycleManager,
        registry: DependencyRegistry
    ): RecoveryManager {
        val manager = RecoveryManager(eventBus, serviceRegistry, stateRegistry, lifecycleManager)
        registry.register(
            name = "recovery_manager",
            instance = manager,
            dependencies = listOf("event_bus", "service_registry", "state_registry"),
            startupOrder = 16,
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideSecureStorageManager(
        @ApplicationContext context: Context,
        cryptoManager: ke.ac.mku.authcore.contracts.crypto.ICryptoManager,
        auditLogger: ke.ac.mku.authcore.security.audit.SecurityAuditLogger,
        eventBus: EventBus,
        registry: DependencyRegistry
    ): SecureStorageManager {
        val manager = SecureStorageManager(context, cryptoManager, auditLogger, eventBus)
        registry.register(
            name = "secure_storage_manager",
            instance = manager,
            dependencies = listOf("configuration_manager", "security_manager", "crypto_manager"),
            startupOrder = 7,
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideCertificateTrustManager(
        @ApplicationContext context: Context,
        cryptoManager: ke.ac.mku.authcore.contracts.crypto.ICryptoManager,
        secureStorage: SecureStorageManager,
        auditLogger: ke.ac.mku.authcore.security.audit.SecurityAuditLogger,
        eventBus: EventBus,
        registry: DependencyRegistry
    ): CertificateTrustManager {
        val manager = CertificateTrustManager(context, cryptoManager, secureStorage, auditLogger, eventBus)
        registry.register(
            name = "certificate_trust_manager",
            instance = manager,
            dependencies = listOf("configuration_manager", "secure_storage_manager", "crypto_manager"),
            startupOrder = 17,
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideSecurityMonitor(
        @ApplicationContext context: Context,
        eventBus: EventBus,
        threatMonitor: ke.ac.mku.authcore.security.monitor.ThreatMonitor,
        auditManager: ke.ac.mku.authcore.security.monitor.SecurityAuditManager,
        integrityMonitor: ke.ac.mku.authcore.security.monitor.IntegrityMonitor,
        incidentHandler: ke.ac.mku.authcore.security.monitor.SecurityIncidentHandler,
        riskEngine: ke.ac.mku.authcore.security.monitor.RiskEngine,
        registry: DependencyRegistry
    ): SecurityMonitor {
        val manager = SecurityMonitor(context, eventBus, threatMonitor, auditManager, integrityMonitor, incidentHandler, riskEngine)
        registry.register(
            name = "security_monitor",
            instance = manager,
            dependencies = listOf(
                "configuration_manager",
                "secure_storage_manager",
                "certificate_trust_manager",
                "recovery_manager"
            ),
            startupOrder = 18,
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideAuthenticationEventManager(
        secureStorageManager: SecureStorageManager,
        eventBus: EventBus,
        stateRegistry: StateRegistry,
        securityMonitor: SecurityMonitor,
        dependencyRegistry: DependencyRegistry
    ): IAuthenticationEventManager {
        val manager = AuthenticationEventManager(
            secureStorageManager,
            eventBus,
            stateRegistry,
            securityMonitor,
            dependencyRegistry
        )
        dependencyRegistry.register(
            name = "authentication_event_manager",
            instance = manager,
            dependencies = listOf(
                "secure_storage_manager",
                "event_bus",
                "state_registry",
                "security_monitor"
            ),
            startupOrder = 19,
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideWebFormLoginHandlerAdapter(
        webFormLoginHandler: WebFormLoginHandler,
        registry: DependencyRegistry
    ): IAuthNetworkService {
        val adapter = WebFormLoginHandlerAdapter(webFormLoginHandler)
        registry.register(
            name = "network_manager",
            instance = adapter,
            dependencies = emptyList(),
            startupOrder = 6,
            isRequired = true
        )
        return adapter
    }

    @Provides
    @Singleton
    fun provideAuthenticationEngine(
        authNetworkService: IAuthNetworkService,
        securityMonitor: SecurityMonitor,
        sessionManager: ISessionManager,
        eventBus: EventBus,
        stateRegistry: StateRegistry,
        dependencyRegistry: DependencyRegistry,
        authEventManager: IAuthenticationEventManager
    ): IAuthenticationEngine {
        val engine = AuthenticationEngine(
            authNetworkService,
            securityMonitor,
            sessionManager as SessionManager,
            eventBus,
            stateRegistry,
            dependencyRegistry,
            authEventManager
        )
        dependencyRegistry.register(
            name = "authentication_engine",
            instance = engine,
            dependencies = listOf(
                "security_monitor",
                "session_manager",
                "configuration_manager"
            ),
            startupOrder = 20,
            isRequired = true
        )
        return engine
    }

    @Provides
    @Singleton
    fun provideLoginOrchestrator(
        authenticationEngine: IAuthenticationEngine,
        portalConnector: IPortalConnector,
        sessionManager: ISessionManager,
        cookieManager: ICookieManager,
        securityMonitor: SecurityMonitor,
        eventBus: EventBus,
        stateRegistry: StateRegistry,
        dependencyRegistry: DependencyRegistry,
        authEventManager: IAuthenticationEventManager
    ): ILoginOrchestrator {
        val orchestrator = LoginOrchestrator(
            authenticationEngine,
            portalConnector,
            sessionManager,
            cookieManager,
            securityMonitor,
            eventBus,
            stateRegistry,
            dependencyRegistry,
            authEventManager
        )
        dependencyRegistry.register(
            name = "login_orchestrator",
            instance = orchestrator,
            dependencies = listOf(
                "authentication_engine",
                "portal_connector",
                "session_manager",
                "cookie_manager",
                "security_monitor"
            ),
            startupOrder = 21,
            isRequired = true
        )
        return orchestrator
    }

    @Provides
    @Singleton
    fun provideAuthenticationStateManager(
        stateRegistry: StateRegistry,
        secureStorageManager: SecureStorageManager,
        recoveryManager: RecoveryManager,
        securityMonitor: SecurityMonitor,
        eventBus: EventBus,
        dependencyRegistry: DependencyRegistry,
        authEventManager: IAuthenticationEventManager
    ): IAuthenticationStateManager {
        val manager = AuthenticationStateManager(
            stateRegistry,
            secureStorageManager,
            recoveryManager,
            securityMonitor,
            eventBus,
            dependencyRegistry,
            authEventManager
        )
        dependencyRegistry.register(
            name = "authentication_state_manager",
            instance = manager,
            dependencies = listOf(
                "state_registry",
                "secure_storage_manager",
                "recovery_manager",
                "security_monitor"
            ),
            startupOrder = 22,
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideSessionManager(
        @ApplicationContext context: Context,
        stateRegistry: StateRegistry,
        secureStorageManager: SecureStorageManager,
        recoveryManager: RecoveryManager,
        securityMonitor: SecurityMonitor,
        eventBus: EventBus,
        dependencyRegistry: DependencyRegistry,
        authEventManager: IAuthenticationEventManager,
        cryptoManager: ke.ac.mku.authcore.contracts.crypto.ICryptoManager
    ): ISessionManager {
        val manager = SessionManager(
            context,
            stateRegistry,
            secureStorageManager,
            recoveryManager,
            securityMonitor,
            eventBus,
            dependencyRegistry,
            authEventManager,
            cryptoManager
        )
        dependencyRegistry.register(
            name = "session_manager",
            instance = manager,
            dependencies = listOf(
                "state_registry",
                "secure_storage_manager",
                "recovery_manager",
                "security_monitor"
            ),
            startupOrder = 23,
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideSessionValidator(
        @ApplicationContext context: Context,
        sessionManager: ISessionManager,
        secureStorageManager: SecureStorageManager,
        cryptoManager: ke.ac.mku.authcore.contracts.crypto.ICryptoManager,
        securityMonitor: SecurityMonitor,
        eventBus: EventBus,
        dependencyRegistry: DependencyRegistry,
        authEventManager: IAuthenticationEventManager
    ): ISessionValidator {
        val validator = SessionValidator(
            context,
            sessionManager,
            secureStorageManager,
            cryptoManager,
            securityMonitor,
            eventBus,
            dependencyRegistry,
            authEventManager
        )
        return validator
    }

    @Provides
    @Singleton
    fun provideSessionRecoveryManager(
        @ApplicationContext context: Context,
        sessionManager: ISessionManager,
        sessionValidator: ISessionValidator,
        authenticationEngineProvider: Provider<IAuthenticationEngine>,
        secureStorageManager: ISecureStorageManager,
        securityMonitor: ISecurityMonitor,
        eventBus: EventBus,
        dependencyRegistry: DependencyRegistry,
        authEventManager: IAuthenticationEventManager,
        cookieManagerProvider: Provider<ICookieManager>,
        portalConnector: IPortalConnector,
        recoveryManager: RecoveryManager,
        serviceRegistry: ServiceRegistry,
        cryptoManager: ke.ac.mku.authcore.contracts.crypto.ICryptoManager,
        authStateManager: IAuthenticationStateManager
    ): ISessionRecoveryManager {
        val manager = SessionRecoveryManager(
            context,
            sessionManager,
            sessionValidator,
            authenticationEngineProvider,
            secureStorageManager,
            securityMonitor,
            eventBus,
            dependencyRegistry,
            authEventManager,
            cookieManagerProvider,
            portalConnector,
            recoveryManager,
            serviceRegistry,
            cryptoManager,
            authStateManager
        )
        dependencyRegistry.register(
            name = "session_recovery_manager",
            instance = manager,
            dependencies = listOf(
                "session_manager",
                "session_validator",
                "authentication_engine",
                "secure_storage_manager",
                "security_monitor",
                "recovery_manager",
                "service_registry",
                "crypto_manager",
                "authentication_state_manager"
            ),
            startupOrder = 25,
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideCookieManager(
        sessionManager: ISessionManager,
        sessionValidatorProvider: Provider<ISessionValidator>,
        recoveryManagerProvider: Provider<ISessionRecoveryManager>,
        secureStorageManager: ISecureStorageManager,
        cryptoManager: ke.ac.mku.authcore.contracts.crypto.ICryptoManager,
        securityMonitor: ISecurityMonitor,
        authEventManager: IAuthenticationEventManager,
        registry: DependencyRegistry
    ): ICookieManager {
        val manager = CookieManager(
            sessionManager,
            sessionValidatorProvider,
            recoveryManagerProvider,
            secureStorageManager,
            cryptoManager,
            securityMonitor,
            authEventManager
        )
        registry.register(
            name = "cookie_manager",
            instance = manager,
            dependencies = listOf(
                "session_manager",
                "session_validator",
                "session_recovery_manager",
                "secure_storage_manager",
                "crypto_manager",
                "security_monitor"
            ),
            startupOrder = 26,
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideCookieSynchronizationManager(
        cookieManager: ICookieManager,
        sessionManager: ISessionManager,
        sessionValidator: ISessionValidator,
        recoveryManager: ISessionRecoveryManager,
        secureStorageManager: ISecureStorageManager,
        securityMonitor: ISecurityMonitor,
        authEventManager: IAuthenticationEventManager,
        serviceRegistry: ServiceRegistry,
        registry: DependencyRegistry
    ): ICookieSynchronizationManager {
        val manager = CookieSynchronizationManager(
            cookieManager,
            sessionManager,
            sessionValidator,
            recoveryManager,
            secureStorageManager,
            securityMonitor,
            authEventManager,
            serviceRegistry
        )
        registry.register(
            name = "cookie_synchronization_manager",
            instance = manager,
            dependencies = listOf(
                "cookie_manager",
                "session_manager",
                "session_validator",
                "session_recovery_manager",
                "secure_storage_manager",
                "security_monitor"
            ),
            startupOrder = 27,
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideCertificatePinningManager(
        impl: ke.ac.mku.authcore.security.cert.CertificatePinningService,
        registry: DependencyRegistry
    ): ICertificatePinningManager {
        registry.register(
            name = "certificate_pinning_manager",
            instance = impl,
            dependencies = emptyList(),
            startupOrder = 8,
            isRequired = true
        )
        return impl
    }

    @Provides
    @Singleton
    fun provideNetworkManager(
        @ApplicationContext context: Context,
        cookieManager: ICookieManager,
        cookieSyncManager: ICookieSynchronizationManager,
        sessionManager: ISessionManager,
        securityMonitor: ISecurityMonitor,
        pinningManager: ICertificatePinningManager,
        authEventManager: IAuthenticationEventManager,
        recoveryManager: ISessionRecoveryManager,
        sessionValidator: ISessionValidator,
        registry: DependencyRegistry
    ): INetworkManager {
        val manager = ke.ac.mku.authcore.manager.NetworkManager(
            context,
            cookieManager,
            cookieSyncManager,
            sessionManager,
            securityMonitor,
            pinningManager,
            authEventManager,
            recoveryManager,
            sessionValidator
        )
        registry.register(
            name = "network_manager",
            instance = manager,
            dependencies = listOf(
                "cookie_manager",
                "cookie_synchronization_manager",
                "session_manager",
                "security_monitor",
                "certificate_pinning_manager"
            ),
            startupOrder = 28, // After CookieSyncManager (27)
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(
        configManager: ConfigManager,
        cookieManager: ICookieManager,
        certificateTrustManager: CertificateTrustManager
    ): OkHttpClient {
        val config = configManager.config
        val loggingInterceptor = HttpLoggingInterceptor().apply {
            level = if (config.logging.logNetwork) {
                HttpLoggingInterceptor.Level.BODY
            } else {
                HttpLoggingInterceptor.Level.NONE
            }
        }

        val connectionSpec = ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
            .tlsVersions("TLSv1.3", "TLSv1.2")
            .build()

        return OkHttpClient.Builder()
            .connectTimeout(config.network.connectionTimeout, TimeUnit.SECONDS)
            .readTimeout(config.network.readTimeout, TimeUnit.SECONDS)
            .writeTimeout(config.network.writeTimeout, TimeUnit.SECONDS)
            .cookieJar(cookieManager as okhttp3.CookieJar)
            .addInterceptor(loggingInterceptor)
            .connectionSpecs(listOf(connectionSpec))
            .sslSocketFactory(
                certificateTrustManager.getSSLSocketFactory(),
                certificateTrustManager.getTrustManager()
            )
            .hostnameVerifier(certificateTrustManager.getHostnameVerifier())
            .followRedirects(config.portal.followRedirects)
            .followSslRedirects(config.portal.followRedirects)
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        configManager: ConfigManager
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(configManager.config.portal.baseUrl)
            .client(okHttpClient)
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideAuthApiService(retrofit: Retrofit): AuthApiService {
        return retrofit.create(AuthApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideAuthRepository(
        authRepositoryImpl: AuthRepositoryImpl,
        registry: DependencyRegistry
    ): AuthRepository {
        registry.register(
            name = "authentication_manager",
            instance = authRepositoryImpl,
            dependencies = listOf("configuration_manager", "security_manager"),
            startupOrder = 11,
            isRequired = true
        )
        return authRepositoryImpl
    }

    @Provides
    @Singleton
    fun provideAuthCoreManager(
        authRepository: AuthRepository,
        configManager: ConfigManager,
        healthMonitor: HealthMonitor
    ): AuthCoreManager {
        return AuthCoreManager(authRepository, configManager, healthMonitor)
    }

    @Provides
    @Singleton
    fun providePortalDiscovery(registry: DependencyRegistry): PortalDiscovery {
        val discovery = PortalDiscovery()
        registry.register(
            name = "portal_discovery",
            instance = discovery,
            dependencies = listOf("network_manager"),
            startupOrder = 8,
            isRequired = true
        )
        return discovery
    }

    @Provides
    @Singleton
    fun provideEndpointRegistry(
        configManager: ConfigManager,
        portalDiscovery: PortalDiscovery,
        registry: DependencyRegistry
    ): EndpointRegistry {
        val endpointRegistry = EndpointRegistry(configManager, portalDiscovery)
        registry.register(
            name = "endpoint_registry",
            instance = endpointRegistry,
            dependencies = listOf("portal_discovery"),
            startupOrder = 9,
            isRequired = true
        )
        return endpointRegistry
    }

    @Provides
    @Singleton
    fun providePortalSDK(
        authCoreManager: AuthCoreManager,
        endpointRegistry: EndpointRegistry,
        portalDiscovery: PortalDiscovery,
        securityManager: SecurityManager,
        registry: DependencyRegistry
    ): PortalSDK {
        val sdk = PortalSDK(authCoreManager, endpointRegistry, portalDiscovery, securityManager)
        registry.register(
            name = "portal_sdk",
            instance = sdk,
            dependencies = listOf("endpoint_registry"),
            startupOrder = 10,
            isRequired = true
        )
        return sdk
    }

    @Provides
    @Singleton
    fun providePortalConnector(
        portalSDK: PortalSDK,
        portalDiscovery: PortalDiscovery,
        endpointRegistry: EndpointRegistry
    ): IPortalConnector {
        return PortalConnectorImpl(portalSDK, portalDiscovery, endpointRegistry)
    }

    @Provides
    @Singleton
    fun provideAuthenticationCore(
        authRepository: AuthRepository,
        portalDiscovery: PortalDiscovery,
        endpointRegistry: EndpointRegistry,
        registry: DependencyRegistry
    ): AuthenticationCore {
        val authCore = AuthenticationCore(authRepository, portalDiscovery, endpointRegistry)
        registry.register(
            name = "authentication_core",
            instance = authCore,
            dependencies = listOf("authentication_manager", "portal_discovery", "endpoint_registry"),
            startupOrder = 12,
            isRequired = true
        )
        return authCore
    }

    @Provides
    @Singleton
    fun provideBootstrapManager(
        configManager: ConfigManager,
        dependencyRegistry: DependencyRegistry,
        authCoreManager: AuthCoreManager,
        eventBus: EventBus,
        registry: DependencyRegistry
    ): BootstrapManager {
        val bootstrapManager = BootstrapManager(configManager, dependencyRegistry, authCoreManager, eventBus)
        registry.register(
            name = "bootstrap_manager",
            instance = bootstrapManager,
            dependencies = listOf("configuration_manager", "authentication_core", "dependency_registry"),
            startupOrder = 13,
            isRequired = true
        )
        return bootstrapManager
    }

    @Provides
    @Singleton
    fun provideFeatureRegistry(
        eventBus: EventBus,
        stateRegistry: StateRegistry,
        serviceRegistry: ServiceRegistry
    ): FeatureRegistry {
        return FeatureRegistry(eventBus, stateRegistry, serviceRegistry)
    }

    @Provides
    @Singleton
    fun provideRuntimeEnvironment(
        @ApplicationContext context: Context,
        eventBus: EventBus,
        configManager: ConfigManager,
        featureRegistry: FeatureRegistry
    ): RuntimeEnvironment {
        return RuntimeEnvironment(context, eventBus, configManager, featureRegistry)
    }

    @Provides
    @Singleton
    fun provideSystemHealthMonitor(
        eventBus: EventBus,
        runtimeEnvironment: RuntimeEnvironment,
        stateRegistry: StateRegistry,
        lifecycleManager: LifecycleManager,
        serviceRegistry: ServiceRegistry
    ): SystemHealthMonitor {
        return SystemHealthMonitor(eventBus, runtimeEnvironment, stateRegistry, lifecycleManager, serviceRegistry)
    }
}
