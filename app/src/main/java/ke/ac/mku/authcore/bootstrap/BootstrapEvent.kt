package ke.ac.mku.authcore.bootstrap

import ke.ac.mku.authcore.contracts.session.SessionWarning
import ke.ac.mku.authcore.recovery.CircuitBreakerState
import ke.ac.mku.authcore.recovery.RecoveryStrategy
import ke.ac.mku.authcore.state.AuthenticationState
import ke.ac.mku.authcore.state.RuntimeState

sealed class BootstrapEvent {
    object BootstrapStarted : BootstrapEvent()
    object ConfigurationLoaded : BootstrapEvent()
    object ConfigurationValidated : BootstrapEvent()
    object AuthenticationCoreInitialized : BootstrapEvent()
    object DependenciesResolved : BootstrapEvent()
    object BootstrapCompleted : BootstrapEvent()
    data class BootstrapFailed(val error: String) : BootstrapEvent()

    // CORE-005: Service Registry Events
    object RegistryReady : BootstrapEvent()
    data class ServiceRegistered(val serviceName: String) : BootstrapEvent()
    data class ServiceResolved(val serviceName: String) : BootstrapEvent()
    data class ServiceRegistrationFailed(val serviceName: String, val error: String) : BootstrapEvent()

    // CORE-007: State Registry Events
    object StateInitialized : BootstrapEvent()
    data class StateChanged(val previous: RuntimeState, val current: RuntimeState) : BootstrapEvent()
    object StateRestored : BootstrapEvent()
    object StateReset : BootstrapEvent()
    data class StateValidationFailed(val reason: String) : BootstrapEvent()

    // CORE-008: Feature Registry Events
    data class FeatureRegistered(val featureId: String) : BootstrapEvent()
    data class FeatureEnabled(val featureId: String) : BootstrapEvent()
    data class FeatureDisabled(val featureId: String) : BootstrapEvent()
    object FeatureRegistryReady : BootstrapEvent()
    data class FeatureValidationFailed(val featureId: String, val reason: String) : BootstrapEvent()

    // CORE-009: Runtime Environment Events
    object RuntimeInitialized : BootstrapEvent()
    object RuntimeReady : BootstrapEvent()
    object RuntimeShutdown : BootstrapEvent()
    data class ResourceWarning(val message: String) : BootstrapEvent()
    object MemoryPressureDetected : BootstrapEvent()
    data class RuntimeFailure(val error: String) : BootstrapEvent()

    // CORE-010: Health Monitor Events
    object HealthMonitorReady : BootstrapEvent()
    object HealthStatusChanged : BootstrapEvent()
    data class ComponentFailed(val component: String) : BootstrapEvent()
    data class ComponentRecovered(val component: String) : BootstrapEvent()
    object MemoryWarning : BootstrapEvent()
    object CpuWarning : BootstrapEvent()
    object NetworkWarning : BootstrapEvent()
    object AuthenticationWarning : BootstrapEvent()
    object RuntimeWarning : BootstrapEvent()
    object CriticalFailure : BootstrapEvent()
    object DiagnosticReportGenerated : BootstrapEvent()

    // CORE-011: Recovery Manager Events
    object RecoveryManagerReady : BootstrapEvent()
    data class RecoveryStarted(val serviceName: String, val strategy: RecoveryStrategy, val attempt: Int) : BootstrapEvent()
    data class RecoveryCompleted(val serviceName: String, val strategy: RecoveryStrategy, val durationMs: Long) : BootstrapEvent()
    data class RecoveryFailed(val serviceName: String, val strategy: RecoveryStrategy, val error: String, val attempts: Int) : BootstrapEvent()
    data class ServiceRestartRequested(val serviceName: String) : BootstrapEvent()
    data class ServiceRestarted(val serviceName: String) : BootstrapEvent()
    data class ReinitializeServiceRequested(val serviceName: String) : BootstrapEvent()
    data class RollbackRequested(val serviceName: String) : BootstrapEvent()
    object RollbackCompleted : BootstrapEvent()
    data class RetryStarted(val serviceName: String, val attempt: Int, val maxAttempts: Int) : BootstrapEvent()
    data class RetryFailed(val serviceName: String, val error: String, val attempts: Int) : BootstrapEvent()
    data class CircuitOpened(val serviceName: String) : BootstrapEvent()
    data class CircuitClosed(val serviceName: String) : BootstrapEvent()
    object SystemRecovered : BootstrapEvent()
    data class CircuitStateChanged(val serviceName: String, val previousState: CircuitBreakerState, val newState: CircuitBreakerState) : BootstrapEvent()

    // SECURITY-003: Secure Storage Events
    object SecureStorageReady : BootstrapEvent()
    data class StorageInitialized(val domain: String) : BootstrapEvent()
    data class DataStored(val domain: String, val key: String) : BootstrapEvent()
    data class DataRetrieved(val domain: String, val key: String, val success: Boolean) : BootstrapEvent()
    data class DataDeleted(val domain: String, val key: String) : BootstrapEvent()
    data class StorageCleared(val domain: String, val count: Int) : BootstrapEvent()
    data class IntegrityVerified(val domain: String, val key: String) : BootstrapEvent()
    data class IntegrityFailed(val domain: String, val key: String) : BootstrapEvent()
    data class StorageFailure(val domain: String, val error: String) : BootstrapEvent()
    data class CacheExpired(val key: String, val ttlMs: Long) : BootstrapEvent()

    // SECURITY-004: Certificate & Trust Events
    object TrustManagerReady : BootstrapEvent()
    data class CertificateVerified(val host: String, val fingerprint: String) : BootstrapEvent()
    data class CertificateValidationFailed(val host: String, val error: String, val status: String) : BootstrapEvent()
    data class CertificatePinVerified(val host: String) : BootstrapEvent()
    data class CertificatePinFailed(val host: String, val expectedPin: String, val actualPin: String) : BootstrapEvent()
    data class CertificateExpiring(val host: String, val daysRemaining: Int) : BootstrapEvent()
    data class TrustViolationDetected(val host: String, val violation: String) : BootstrapEvent()
    data class SecureConnectionEstablished(val host: String, val tlsVersion: String) : BootstrapEvent()
    data class TlsHandshakeCompleted(val host: String, val success: Boolean, val durationMs: Long) : BootstrapEvent()

    // SECURITY-005: Security Monitoring Events
    object SecurityMonitorReady : BootstrapEvent()
    data class ThreatDetected(val category: String, val level: String) : BootstrapEvent()
    data class SecurityWarning(val message: String, val level: String) : BootstrapEvent()
    data class SecurityIncidentCreated(val incidentId: String, val level: String, val description: String) : BootstrapEvent()
    object PlatformIntegrityVerified : BootstrapEvent()
    data class IntegrityFailure(val details: String) : BootstrapEvent()
    data class AuditRecorded(val count: Int) : BootstrapEvent()
    object SecurityScanCompleted : BootstrapEvent()
    data class SecurityReportGenerated(val healthScore: Float, val threatCount: Int) : BootstrapEvent()
    /** Security platform is ready */
    object SecurityPlatformReady : BootstrapEvent()
    /** Security validation has completed */
    object SecurityValidationCompleted : BootstrapEvent()

    // AUTH-001: Authentication Events
    /** Authentication process has started */
    object AuthenticationStarted : BootstrapEvent()
    /** Authentication is processing a specific step */
    data class AuthenticationProcessing(val step: String) : BootstrapEvent()
    /** Authentication completed successfully */
    data class AuthenticationSuccess(val regNumber: String, val studentName: String?) : BootstrapEvent()
    /** Authentication failed */
    data class AuthenticationFailed(val reason: String, val errorCode: String?) : BootstrapEvent()
    /** Authentication was cancelled */
    object AuthenticationCancelled : BootstrapEvent()
    /** Authentication is being retried */
    data class AuthenticationRetrying(val attemptNumber: Int, val maxAttempts: Int) : BootstrapEvent()
    /** Authentication process completed (success or failure) */
    object AuthenticationCompleted : BootstrapEvent()

    // AUTH-002: Login Workflow Events
    /** Login workflow has started */
    object LoginWorkflowStarted : BootstrapEvent()
    /** Login workflow is processing a specific step */
    data class LoginWorkflowProcessing(val step: String) : BootstrapEvent()
    /** User successfully authenticated via login workflow */
    data class LoginAuthenticated(val regNumber: String) : BootstrapEvent()
    /** Session created for authenticated user */
    data class LoginSessionCreated(val regNumber: String) : BootstrapEvent()
    /** Connected to student portal */
    data class LoginPortalConnected(val portalUrl: String) : BootstrapEvent()
    /** Portal connection established */
    object PortalConnected : BootstrapEvent()
    /** Login workflow completed successfully */
    data class LoginCompleted(val regNumber: String) : BootstrapEvent()
    /** Login workflow failed */
    data class LoginFailed(val reason: String, val errorCode: String?) : BootstrapEvent()
    /** Login workflow was cancelled */
    object LoginCancelled : BootstrapEvent()
    /** Logout process has completed successfully */
    object LogoutCompleted : BootstrapEvent()

    // AUTH-003: Authentication State Manager Events
    /** Authentication state manager has been initialized */
    object AuthenticationStateInitialized : BootstrapEvent()
    /** Authentication state transitioned from one state to another */
    data class AuthenticationStateChanged(val previous: AuthenticationState, val current: AuthenticationState) : BootstrapEvent()
    /** Authentication state restored from persistent storage */
    data class AuthenticationStateRestored(val state: AuthenticationState) : BootstrapEvent()
    /** Authentication state persisted to storage */
    data class AuthenticationStatePersisted(val state: AuthenticationState) : BootstrapEvent()
    /** Authentication session or token has expired */
    data class AuthenticationStateExpired(val previousState: AuthenticationState) : BootstrapEvent()
    /** Authentication operation failed */
    data class AuthenticationStateFailed(val reason: String) : BootstrapEvent()
    /** Successfully recovered from an authentication failure */
    data class AuthenticationStateRecovered(val recoveredState: AuthenticationState) : BootstrapEvent()
    /** Authentication infrastructure is ready to process requests */
    object AuthenticationReady : BootstrapEvent()

    // SESSION-001: Session Manager Events
    /** Session creation has started */
    object SessionCreating : BootstrapEvent()
    /** Session was successfully created */
    object SessionCreated : BootstrapEvent()
    /** Session restoration from storage has started */
    object SessionRestoring : BootstrapEvent()
    /** Session was successfully restored from storage */
    object SessionRestored : BootstrapEvent()
    /** Session refresh has started */
    object SessionRefreshing : BootstrapEvent()
    /** Session was successfully refreshed */
    object SessionRefreshed : BootstrapEvent()
    /** Session validation is in progress */
    object SessionValidating : BootstrapEvent()
    /** Session expiry process has started */
    object SessionExpiring : BootstrapEvent()
    /** Session has expired */
    object SessionExpired : BootstrapEvent()
    /** Session termination has started */
    object SessionTerminating : BootstrapEvent()
    /** Session was successfully terminated */
    object SessionTerminated : BootstrapEvent()
    /** Session operation failed */
    data class SessionFailed(val reason: String) : BootstrapEvent()
    /** Session was successfully recovered from failure */
    object SessionRecovered : BootstrapEvent()

    // SESSION-002: Session Validator Events
    /** Session validation has started */
    object SessionValidationStarted : BootstrapEvent()
    /** Session validation passed (Valid or Warning) */
    object SessionValidationPassed : BootstrapEvent()
    /** Session validation produced warnings */
    data class SessionValidationWarning(val warnings: List<SessionWarning>) : BootstrapEvent()
    /** Session validation failed */
    data class SessionValidationFailed(val reason: String) : BootstrapEvent()
    /** Session integrity verified successfully */
    object SessionIntegrityVerified : BootstrapEvent()
    /** Session integrity check failed (tampered or corrupted) */
    data class SessionIntegrityFailed(val reason: String) : BootstrapEvent()
    /** Session expiration detected */
    object SessionExpiredDetected : BootstrapEvent()
    /** Session requires recovery */
    object SessionRecoveryRequired : BootstrapEvent()
    /** Session validator is ready */
    object SessionValidatorReady : BootstrapEvent()
    /** Application was restarted */
    object ApplicationRestarted : BootstrapEvent()
    /** Network connection recovered */
    object NetworkRecovered : BootstrapEvent()
    /** Device was unlocked */
    object DeviceUnlocked : BootstrapEvent()
    /** Application crashed (handled via restart) */
    object ApplicationCrashed : BootstrapEvent()
    /** Process was recreated by system */
    object ProcessRecreated : BootstrapEvent()
    /** Manual recovery was requested */
    object RecoveryRequested : BootstrapEvent()

    // SESSION-003: Session Recovery Manager Events
    /** Session recovery process has started */
    object SessionRecoveryStarted : BootstrapEvent()
    /** Session backup has been loaded from storage */
    object SessionBackupLoaded : BootstrapEvent()
    /** Session restoration from backup has started */
    object SessionRestorationStarted : BootstrapEvent()
    /** Session was successfully restored from backup */
    object SessionRestoredFromBackup : BootstrapEvent()
    /** Session was successfully re-authenticated */
    object SessionReauthenticated : BootstrapEvent()
    /** Session recovery completed successfully */
    object SessionRecoveryCompleted : BootstrapEvent()
    /** Session recovery failed after all retry attempts */
    data class SessionRecoveryFailed(val reason: String, val attempts: Int) : BootstrapEvent()
    /** Session was recreated from stored credentials */
    object SessionRecreated : BootstrapEvent()
    /** Session recovery was aborted */
    object SessionRecoveryAborted : BootstrapEvent()
    /** Session platform is ready after recovery */
    object SessionPlatformReady : BootstrapEvent()

    // COOKIE-001: Cookie Manager Events
    /** Cookie was successfully created and stored */
    data class CookieCreated(val name: String) : BootstrapEvent()
    /** Existing cookie was updated */
    data class CookieUpdated(val name: String) : BootstrapEvent()
    /** Cookie was deleted from storage */
    data class CookieDeleted(val name: String) : BootstrapEvent()
    /** Cookie has expired and was removed */
    data class CookieExpired(val name: String) : BootstrapEvent()
    /** Cookie validation process has started */
    data class CookieValidationStarted(val name: String) : BootstrapEvent()
    /** Cookie validation passed successfully */
    data class CookieValidationPassed(val name: String) : BootstrapEvent()
    /** Cookie validation failed */
    data class CookieValidationFailed(val name: String, val reason: String) : BootstrapEvent()
    /** Complete cookie store has been cleared */
    object CookieStoreCleared : BootstrapEvent()
    /** Cookie Manager is initialized and ready */
    object CookieManagerReady : BootstrapEvent()

    // COOKIE-002: Cookie Synchronization Manager Events
    /** Cookie synchronization process has started */
    object CookieSynchronizationStarted : BootstrapEvent()
    /** Cookie synchronization completed successfully */
    object CookieSynchronizationCompleted : BootstrapEvent()
    /** Cookie synchronization failed */
    data class CookieSynchronizationFailed(val reason: String) : BootstrapEvent()
    /** Inconsistent cookie states detected */
    data class CookieConflictDetected(val conflicts: Int) : BootstrapEvent()
    /** Cookie conflicts resolved according to policy */
    object CookieConflictResolved : BootstrapEvent()
    /** Cookie consistency verified across all layers */
    object CookieConsistencyVerified : BootstrapEvent()
    /** Cookie platform is ready for next module */
    object CookiePlatformReady : BootstrapEvent()

    /** Network connection established */
    object NetworkConnected : BootstrapEvent()

    // NETWORK-001: Network Manager Events
    /** Network layer is initializing */
    object NetworkInitializing : BootstrapEvent()
    /** Network layer is ready for operations */
    object NetworkReady : BootstrapEvent()
    /** Device is currently online */
    object NetworkOnline : BootstrapEvent()
    /** Device is currently offline */
    object NetworkOffline : BootstrapEvent()
    /** Network is attempting to connect */
    object NetworkConnecting : BootstrapEvent()
    /** Network connection was lost */
    object NetworkDisconnected : BootstrapEvent()
    /** Network recovery process has started */
    object NetworkRecoveryStarted : BootstrapEvent()
    /** Network recovery completed successfully */
    object NetworkRecoveryCompleted : BootstrapEvent()
    /** Critical network failure detected */
    data class NetworkFailed(val reason: String) : BootstrapEvent()

    /** Application state resumed */
    object ApplicationResumed : BootstrapEvent()
}
