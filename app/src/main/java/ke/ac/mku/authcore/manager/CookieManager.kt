package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.contracts.cookie.CookieType
import ke.ac.mku.authcore.contracts.cookie.ICookieManager
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager
import ke.ac.mku.authcore.contracts.session.ISessionValidator
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.contracts.storage.StorageDomain
import okhttp3.Cookie
import okhttp3.CookieJar
import okhttp3.HttpUrl
import okhttp3.HttpUrl.Companion.toHttpUrlOrNull
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

/**
 * COOKIE-001: Cookie Manager Implementation
 *
 * Central authority for secure HTTP cookie lifecycle management.
 * Integrates with Session, Security, and Network layers.
 */
@Singleton
class CookieManager @Inject constructor(
    private val sessionManager: ISessionManager,
    private val sessionValidatorProvider: Provider<ISessionValidator>,
    private val recoveryManagerProvider: Provider<ISessionRecoveryManager>,
    private val secureStorage: ISecureStorageManager,
    private val cryptoManager: ICryptoManager,
    private val securityMonitor: ISecurityMonitor,
    private val authEventManager: IAuthenticationEventManager
) : CookieJar, ICookieManager, BootstrapObserver {

    /**
     * Module Metadata (COOKIE-001)
     */
    private val moduleId = "COOKIE-001"
    private val moduleName = "Cookie Manager"
    private val moduleType = "Secure HTTP Cookie Lifecycle Manager"
    private val moduleVersion = "1.0.0"

    companion object {
        private const val TAG = "CookieManager"
        private const val COOKIE_PREFIX = "cookie_"
    }

    // In-memory cache for fast access
    private val cookieStore = mutableMapOf<String, Cookie>()

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId) v$moduleVersion")
    }

    // ==================== ICookieManager Implementation ====================

    override fun storeCookie(name: String, value: String, type: CookieType, domain: String?, path: String?) {
        val cookie = Cookie.Builder()
            .name(name)
            .value(value)
            .domain(domain ?: "mku.ac.ke") // Default domain if not provided
            .path(path ?: "/")
            .build()
        storeCookie(cookie, type)
    }

    override fun storeCookie(cookie: Cookie, type: CookieType) {
        val name = cookie.name
        Log.d(TAG, "Storing cookie: $name (type: $type)")

        // 1. Encrypt and persist to SecureStorage (Domain: COOKIES)
        persistCookie(cookie)

        // 2. Update in-memory cache
        cookieStore[name] = cookie

        // 3. Publish event
        authEventManager.publish(BootstrapEvent.CookieCreated(name))
    }

    override fun getCookie(name: String): String? {
        // 1. Check in-memory cache
        var cookie = cookieStore[name]

        // 2. If not found, try to restore from SecureStorage
        if (cookie == null) {
            cookie = restoreCookie(name)
            if (cookie != null) {
                cookieStore[name] = cookie
            }
        }

        // 3. Validate before return
        if (cookie != null && validateCookie(name)) {
            return cookie.value
        }

        return null
    }

    override fun updateCookie(name: String, value: String) {
        val existing = cookieStore[name] ?: restoreCookie(name)
        if (existing != null) {
            val updated = Cookie.Builder()
                .name(name)
                .value(value)
                .domain(existing.domain)
                .path(existing.path)
                // Preserving other attributes if needed
                .build()
            
            storeCookie(updated, CookieType.SESSION_COOKIE) // Default type for update
            authEventManager.publish(BootstrapEvent.CookieUpdated(name))
        }
    }

    override fun deleteCookie(name: String) {
        cookieStore.remove(name)
        secureStorage.delete(StorageDomain.COOKIES, "$COOKIE_PREFIX$name")
        authEventManager.publish(BootstrapEvent.CookieDeleted(name))
    }

    override fun clearCookies() {
        cookieStore.clear()
        secureStorage.clear(StorageDomain.COOKIES)
        authEventManager.publish(BootstrapEvent.CookieStoreCleared)
    }

    override fun validateCookie(name: String): Boolean {
        val cookie = cookieStore[name] ?: return false
        authEventManager.publish(BootstrapEvent.CookieValidationStarted(name))

        // Implementation of validation logic
        // 1. Expiration check
        if (cookie.expiresAt < System.currentTimeMillis()) {
            Log.w(TAG, "Cookie expired: $name")
            handleCookieFailure(name, "Expired")
            return false
        }

        // 2. Session binding check (per policy)
        if (!sessionManager.isSessionActive()) {
            Log.w(TAG, "Cookie validation failed: No active session for $name")
            handleCookieFailure(name, "Session inactive")
            return false
        }

        authEventManager.publish(BootstrapEvent.CookieValidationPassed(name))
        return true
    }

    private fun handleCookieFailure(name: String, reason: String) {
        // JSON: delete_invalid_cookie: true
        deleteCookie(name)
        
        authEventManager.publish(BootstrapEvent.CookieValidationFailed(name, reason))
        
        // JSON: notify_security_monitor: true
        securityMonitor.processThreat(
            ke.ac.mku.authcore.contracts.security.ThreatReport(
                category = ke.ac.mku.authcore.contracts.security.ThreatCategory.UNKNOWN,
                level = ke.ac.mku.authcore.contracts.security.RiskLevel.MEDIUM,
                description = "Cookie validation failed for $name: $reason",
                source = TAG
            )
        )

        // JSON: request_session_validation: true
        sessionValidatorProvider.get().validateSession()

        // JSON: invoke_session_recovery_if_required: true
        if (reason == "Session inactive") {
            recoveryManagerProvider.get().recoverSession()
        }
    }

    override fun getAllCookies(): Map<String, String> {
        return cookieStore.mapValues { it.value.value }
    }

    override fun saveCookies(cookies: Map<String, String>) {
        // Legacy support/Batch update
        cookies.forEach { (name, value) ->
            storeCookie(name, value, CookieType.SESSION_COOKIE)
        }
    }

    // ==================== CookieJar (OkHttp) Implementation ====================

    override fun saveFromResponse(url: HttpUrl, cookies: List<Cookie>) {
        cookies.forEach { storeCookie(it, CookieType.SESSION_COOKIE) }
    }

    override fun saveFromResponse(url: String, cookies: List<Cookie>) {
        saveFromResponse(url.toHttpUrlOrNull() ?: return, cookies)
    }

    override fun loadForRequest(url: HttpUrl): List<Cookie> {
        // Return valid cookies for this URL
        return cookieStore.values.filter { it.matches(url) && validateCookie(it.name) }
    }

    override fun loadForRequest(url: String): List<Cookie> {
        return loadForRequest(url.toHttpUrlOrNull() ?: return emptyList())
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.SessionPlatformReady -> {
                // startup_sequence: trigger: session_platform_ready
                initializeCookieManager()
            }
            is BootstrapEvent.SessionTerminated,
            is BootstrapEvent.LogoutCompleted -> {
                // automatic_cleanup policy
                Log.i(TAG, "Session terminated/Logout. Clearing cookies.")
                clearCookies()
            }
            is BootstrapEvent.SessionCreated,
            is BootstrapEvent.SessionRestored,
            is BootstrapEvent.SessionRecoveryCompleted -> {
                // JSON: automatic_restore: true
                Log.i(TAG, "Session restored/created. Syncing cookies.")
                // In a real implementation, we might reload from storage
            }
            else -> {}
        }
    }

    private fun initializeCookieManager() {
        Log.i(TAG, "Initializing Cookie Manager (Step-by-step)...")
        // 1. Restore persistent cookies
        // 2. Register in ServiceRegistry (Handled by DI)
        authEventManager.publish(BootstrapEvent.CookieManagerReady)
    }

    // ==================== Private Helpers ====================

    private fun persistCookie(cookie: Cookie) {
        // Value would be encrypted by SecureStorageManager anyway if domain is encrypted
        val cookieJson = serializeCookie(cookie)
        secureStorage.store(StorageDomain.COOKIES, "$COOKIE_PREFIX${cookie.name}", cookieJson)
    }

    private fun restoreCookie(name: String): Cookie? {
        val result = secureStorage.retrieve(StorageDomain.COOKIES, "$COOKIE_PREFIX$name")
        return if (result.success) {
            result.getOrNull()?.let { deserializeCookie(it) }
        } else null
    }

    private fun serializeCookie(cookie: Cookie): String {
        // Simple serialization (in production use Gson or similar)
        return "${cookie.name}|${cookie.value}|${cookie.domain}|${cookie.path}|${cookie.expiresAt}|${cookie.secure}|${cookie.httpOnly}"
    }

    private fun deserializeCookie(data: String): Cookie? {
        return try {
            val parts = data.split("|")
            if (parts.size >= 7) {
                Cookie.Builder()
                    .name(parts[0])
                    .value(parts[1])
                    .domain(parts[2])
                    .path(parts[3])
                    .expiresAt(parts[4].toLong())
                    .apply { if (parts[5].toBoolean()) secure() }
                    .apply { if (parts[6].toBoolean()) httpOnly() }
                    .build()
            } else null
        } catch (e: Exception) {
            null
        }
    }
}
