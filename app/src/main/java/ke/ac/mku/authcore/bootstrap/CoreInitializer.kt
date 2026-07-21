package ke.ac.mku.authcore.bootstrap

import android.util.Log
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationStateManager
import ke.ac.mku.authcore.contracts.cookie.ICookieSynchronizationManager
import ke.ac.mku.authcore.contracts.cookie.ICookieManager
import ke.ac.mku.authcore.contracts.network.INetworkManager
import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager
import ke.ac.mku.authcore.contracts.session.ISessionValidator
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor
import ke.ac.mku.authcore.registry.DependencyRegistry
import ke.ac.mku.authcore.registry.SecurityManager
import javax.inject.Inject
import javax.inject.Singleton

/**
 * CoreInitializer - Forces initialization of all core services.
 * This ensures they register themselves with the DependencyRegistry.
 */
@Singleton
class CoreInitializer @Inject constructor(
    private val dependencyRegistry: DependencyRegistry,
    private val eventBus: EventBus,
    private val securityManager: SecurityManager,
    private val secureStorageManager: ISecureStorageManager,
    private val sessionManager: ISessionManager,
    private val cookieManager: ICookieManager,
    private val authEngine: IAuthenticationEngine,
    private val authStateManager: IAuthenticationStateManager,
    private val authEventManager: IAuthenticationEventManager,
    private val sessionValidator: ISessionValidator,
    private val sessionRecoveryManager: ISessionRecoveryManager,
    private val cookieSyncManager: ICookieSynchronizationManager,
    private val networkManager: INetworkManager
) {
    fun initialize() {
        Log.i("CoreInitializer", "Forcing initialization of all core services...")
        Log.d("CoreInitializer", "  - Registry: ${dependencyRegistry.list().size} services")
        Log.d("CoreInitializer", "  - EventBus: ready")
        Log.d("CoreInitializer", "  - Security: ${securityManager.javaClass.simpleName}")
        Log.d("CoreInitializer", "  - Storage: ${secureStorageManager.javaClass.simpleName}")
        Log.d("CoreInitializer", "  - Session: ${sessionManager.javaClass.simpleName}")
        Log.d("CoreInitializer", "  - Cookies: ${cookieManager.javaClass.simpleName}")
        Log.d("CoreInitializer", "  - Engine: ${authEngine.javaClass.simpleName}")
        Log.d("CoreInitializer", "  - State: ${authStateManager.javaClass.simpleName}")
        Log.d("CoreInitializer", "  - Events: ${authEventManager.javaClass.simpleName}")
        Log.d("CoreInitializer", "  - Validator: ${sessionValidator.javaClass.simpleName}")
        Log.d("CoreInitializer", "  - Recovery: ${sessionRecoveryManager.javaClass.simpleName}")
        Log.d("CoreInitializer", "  - Sync: ${cookieSyncManager.javaClass.simpleName}")
        Log.d("CoreInitializer", "  - Network: ${networkManager.javaClass.simpleName}")
    }
}
