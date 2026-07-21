package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.contracts.cookie.ICookieManager
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager
import ke.ac.mku.authcore.contracts.session.ISessionValidator
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.service.ServiceRegistry
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.kotlin.*

class CookieSynchronizationManagerTest {

    private val cookieManager: ICookieManager = mock()
    private val sessionManager: ISessionManager = mock()
    private val sessionValidator: ISessionValidator = mock()
    private val recoveryManager: ISessionRecoveryManager = mock()
    private val secureStorage: ISecureStorageManager = mock()
    private val securityMonitor: ISecurityMonitor = mock()
    private val authEventManager: IAuthenticationEventManager = mock()
    private val serviceRegistry: ServiceRegistry = mock()

    private lateinit var syncManager: CookieSynchronizationManager

    @Before
    fun setup() {
        syncManager = CookieSynchronizationManager(
            cookieManager, sessionManager, sessionValidator,
            recoveryManager, secureStorage, securityMonitor,
            authEventManager, serviceRegistry
        )
    }

    @Test
    fun `test synchronizeCookies uses CookieManager as authoritative source`() {
        val cookies = mapOf("test" to "value")
        whenever(cookieManager.getAllCookies()).thenReturn(cookies)
        whenever(sessionManager.getRegNumber()).thenReturn("123")

        syncManager.synchronizeCookies()

        // Verify it pushes to SessionManager
        verify(sessionManager).createSession(eq("123"), anyOrNull(), eq(cookies))
        
        // Verify it publishes events
        verify(authEventManager).publish(isA<BootstrapEvent.CookieSynchronizationStarted>())
        verify(authEventManager).publish(isA<BootstrapEvent.CookieSynchronizationCompleted>())
    }

    @Test
    fun `test detectConflicts finds inconsistencies`() {
        val authoritative = mapOf("c1" to "v1")
        val session = mapOf("c1" to "v2") // Inconsistent
        
        whenever(cookieManager.getAllCookies()).thenReturn(authoritative)
        whenever(sessionManager.getCookies()).thenReturn(session)

        assertTrue(syncManager.detectConflicts())
        verify(authEventManager).publish(isA<BootstrapEvent.CookieConflictDetected>())
    }
}
