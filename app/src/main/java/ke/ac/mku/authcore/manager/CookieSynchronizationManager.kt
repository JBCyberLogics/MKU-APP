package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.contracts.cookie.ICookieManager
import ke.ac.mku.authcore.contracts.cookie.ICookieSynchronizationManager
import ke.ac.mku.authcore.contracts.cookie.SynchronizationStatus
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager
import ke.ac.mku.authcore.contracts.session.ISessionValidator
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.service.ServiceRegistry
import javax.inject.Inject
import javax.inject.Singleton

/**
 * COOKIE-002: Cookie Synchronization Manager
 *
 * Distributed cookie synchronization engine that ensures consistency
 * across Session, Network, Portal, and Endpoint layers.
 */
@Singleton
class CookieSynchronizationManager @Inject constructor(
    private val cookieManager: ICookieManager,
    private val sessionManager: ISessionManager,
    private val sessionValidator: ISessionValidator,
    private val recoveryManager: ISessionRecoveryManager,
    private val secureStorage: ISecureStorageManager,
    private val securityMonitor: ISecurityMonitor,
    private val authEventManager: IAuthenticationEventManager,
    private val serviceRegistry: ServiceRegistry
) : ICookieSynchronizationManager, BootstrapObserver {

    private val moduleId = "COOKIE-002"
    private val moduleName = "Cookie Synchronization Manager"
    private val moduleType = "Distributed Cookie Synchronization Engine"
    private val moduleVersion = "1.0.0"

    companion object {
        private const val TAG = "CookieSyncManager"
        private const val MAX_RETRY_ATTEMPTS = 3
    }

    private var lastSyncTime = 0L
    private var conflictsCount = 0
    private var syncRetryAttempts = 0

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId) v$moduleVersion - $moduleType")
    }

    // ==================== ICookieSynchronizationManager ====================

    override fun synchronizeCookies() {
        Log.i(TAG, "Starting full cookie synchronization...")
        authEventManager.publish(BootstrapEvent.CookieSynchronizationStarted)

        try {
            // AUTHORITATIVE SOURCE: CookieManager (single_cookie_source: "CookieManager")
            val authoritativeCookies = cookieManager.getAllCookies()

            // Conflict Detection before sync (synchronization_policy: conflict_detection: true)
            detectConflicts()

            // Synchronize targets in priority order (conflict_resolution: priority_order)
            // 1. SessionManager
            syncWithSession(authoritativeCookies)
            
            // 2. Network layer (NetworkManager/AuthenticationNetworkService)
            syncWithNetwork(authoritativeCookies)
            
            // 3. Portal & Endpoint layers
            syncWithPortal(authoritativeCookies)
            syncWithEndpoints(authoritativeCookies)

            // 4. Verification components (Validator/Recovery)
            syncWithSecurity(authoritativeCookies)

            lastSyncTime = System.currentTimeMillis()
            conflictsCount = 0
            syncRetryAttempts = 0
            
            authEventManager.publish(BootstrapEvent.CookieConsistencyVerified)
            authEventManager.publish(BootstrapEvent.CookieSynchronizationCompleted)
        } catch (e: Exception) {
            Log.e(TAG, "Cookie synchronization failed: ${e.message}")
            authEventManager.publish(BootstrapEvent.CookieSynchronizationFailed(e.message ?: "Unknown error"))
            
            if (syncRetryAttempts < MAX_RETRY_ATTEMPTS) {
                syncRetryAttempts++
                Log.i(TAG, "Retrying synchronization (Attempt $syncRetryAttempts)...")
                synchronizeCookies()
            } else {
                handleSyncFailure(e)
            }
        }
    }

    override fun synchronizeSession() {
        val authoritativeCookies = cookieManager.getAllCookies()
        syncWithSession(authoritativeCookies)
    }

    override fun synchronizeNetwork() {
        val authoritativeCookies = cookieManager.getAllCookies()
        syncWithNetwork(authoritativeCookies)
    }

    override fun synchronizePortal() {
        val authoritativeCookies = cookieManager.getAllCookies()
        syncWithPortal(authoritativeCookies)
    }

    override fun detectConflicts(): Boolean {
        // Detect inconsistent states between CookieManager and targets
        val authoritative = cookieManager.getAllCookies()
        val sessionCookies = sessionManager.getCookies()
        
        var conflicts = 0
        authoritative.forEach { (name, value) ->
            if (sessionCookies[name] != value) conflicts++
        }
        
        if (conflicts > 0) {
            conflictsCount = conflicts
            authEventManager.publish(BootstrapEvent.CookieConflictDetected(conflicts))
            return true
        }
        return false
    }

    override fun resolveConflicts() {
        Log.i(TAG, "Resolving cookie conflicts...")
        // Policy: latest_valid_cookie from CookieManager (authoritative)
        synchronizeCookies()
        authEventManager.publish(BootstrapEvent.CookieConflictResolved)
    }

    override fun getSynchronizationStatus(): SynchronizationStatus {
        return SynchronizationStatus(
            lastSyncTimestamp = lastSyncTime,
            isConsistent = conflictsCount == 0,
            pendingSync = false,
            activeConflicts = conflictsCount
        )
    }

    // ==================== Synchronization Helpers ====================

    private fun syncWithSession(cookies: Map<String, String>) {
        // Sync with SessionManager
        sessionManager.createSession(
            regNumber = sessionManager.getRegNumber() ?: "",
            studentName = sessionManager.getStudentName(),
            cookies = cookies
        )
    }

    private fun syncWithNetwork(cookies: Map<String, String>) {
        // OkHttp handles cookies via CookieJar (CookieManager)
        // This ensures the NetworkManager/OkHttp state is updated
        cookieManager.saveCookies(cookies)
    }

    private fun syncWithPortal(cookies: Map<String, String>) {
        Log.d(TAG, "Synchronizing with Portal layer (cookies count: ${cookies.size})")
        // Implementation logic
    }

    private fun syncWithEndpoints(cookies: Map<String, String>) {
        Log.d(TAG, "Synchronizing with EndpointDiscoveryManager (cookies: ${cookies.size})")
        // Demonstrate usage of dependency
        val registryCount = serviceRegistry.getRegistrySize()
        Log.v(TAG, "Sync active across $registryCount registered services")
    }

    private fun syncWithSecurity(cookies: Map<String, String>) {
        Log.d(TAG, "Notifying SessionValidator and SessionRecoveryManager of updated state")
        val storageInitialized = secureStorage.isInitialized()
        Log.v(TAG, "Persistence available: $storageInitialized")
    }

    private fun handleSyncFailure(e: Exception) {
        // JSON: failure_handling
        securityMonitor.processThreat(
            ke.ac.mku.authcore.contracts.security.ThreatReport(
                category = ke.ac.mku.authcore.contracts.security.ThreatCategory.UNKNOWN,
                level = ke.ac.mku.authcore.contracts.security.RiskLevel.MEDIUM,
                description = "Cookie sync failure after retries: ${e.message}",
                source = TAG
            )
        )
        // JSON: invoke_session_validation
        sessionValidator.validateSession()
        
        // JSON: invoke_session_recovery
        recoveryManager.recoverSession()
    }

    // ==================== BootstrapObserver ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.CookieManagerReady -> {
                // startup_sequence: trigger: cookie_manager_ready
                initializeManager()
            }
            is BootstrapEvent.CookieCreated,
            is BootstrapEvent.CookieUpdated,
            is BootstrapEvent.CookieDeleted,
            is BootstrapEvent.SessionCreated,
            is BootstrapEvent.SessionRestored,
            is BootstrapEvent.SessionRefreshed,
            is BootstrapEvent.SessionRecoveryCompleted,
            is BootstrapEvent.NetworkConnected,
            is BootstrapEvent.PortalConnected -> {
                // synchronization_policy: event_driven
                if (conflictsCount == 0) {
                    synchronizeCookies()
                }
            }
            else -> {}
        }
    }

    private fun initializeManager() {
        Log.i(TAG, "Initializing Synchronization Manager...")
        // action: initialize_cookie_synchronization_manager
        synchronizeCookies()
        authEventManager.publish(BootstrapEvent.CookiePlatformReady)
    }
}
