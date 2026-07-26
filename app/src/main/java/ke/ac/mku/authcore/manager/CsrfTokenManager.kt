package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.domain.model.portal.CsrfTokenEntry
import java.util.concurrent.ConcurrentHashMap
import javax.inject.Inject
import javax.inject.Singleton

/**
 * CsrfTokenManager - PORTAL-004
 *
 * Tracks CSRF token lifecycle and associations.
 */
@Singleton
class CsrfTokenManager @Inject constructor(
    private val authEventManager: IAuthenticationEventManager
) {
    companion object {
        private const val TAG = "CsrfTokenManager"
    }

    private val tokenStore = ConcurrentHashMap<String, CsrfTokenEntry>()

    fun updateToken(name: String, value: String, url: String? = null) {
        val entry = CsrfTokenEntry(
            name = name,
            value = value,
            expiry = System.currentTimeMillis() + 3600000, // 1 hour default
            associatedUrl = url
        )
        tokenStore[name] = entry
        Log.d(TAG, "CSRF token discovered: $name")
        authEventManager.publish(BootstrapEvent.CsrfTokenDiscovered(name))
    }

    fun getToken(name: String): String? {
        return tokenStore[name]?.value
    }
}
