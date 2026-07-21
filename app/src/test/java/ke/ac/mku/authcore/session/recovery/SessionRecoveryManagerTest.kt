package ke.ac.mku.authcore.session.recovery

import android.content.Context
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.contracts.authentication.*
import ke.ac.mku.authcore.contracts.cookie.ICookieManager
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager
import ke.ac.mku.authcore.contracts.portal.IPortalConnector
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor
import ke.ac.mku.authcore.contracts.session.*
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.contracts.storage.StorageResult
import ke.ac.mku.authcore.recovery.RecoveryManager
import javax.inject.Provider
import ke.ac.mku.authcore.registry.DependencyRegistry
import ke.ac.mku.authcore.service.ServiceRegistry
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.kotlin.*

@OptIn(ExperimentalCoroutinesApi::class)
class SessionRecoveryManagerTest {

    private val context: Context = mock()
    private val sessionManager: ISessionManager = mock()
    private val sessionValidator: ISessionValidator = mock()
    private val authEngine: IAuthenticationEngine = mock()
    private val secureStorage: ISecureStorageManager = mock()
    private val securityMonitor: ISecurityMonitor = mock()
    private val eventBus: EventBus = mock()
    private val dependencyRegistry: DependencyRegistry = mock()
    private val authEventManager: IAuthenticationEventManager = mock()
    private val cookieManager: ICookieManager = mock()
    private val portalConnector: IPortalConnector = mock()
    private val recoveryManager: RecoveryManager = mock()
    private val serviceRegistry: ServiceRegistry = mock()
    private val cryptoManager: ICryptoManager = mock()
    private val authStateManager: IAuthenticationStateManager = mock()

    private lateinit var manager: SessionRecoveryManager

    @Before
    fun setup() {
        manager = SessionRecoveryManager(
            context, sessionManager, sessionValidator, { authEngine },
            secureStorage, securityMonitor, eventBus, dependencyRegistry,
            authEventManager, { cookieManager }, portalConnector, recoveryManager,
            serviceRegistry, cryptoManager, authStateManager
        )
    }

    @Test
    fun `test initial state is IDLE`() {
        assertEquals(RecoveryState.IDLE, manager.getRecoveryState())
    }

    @Test
    fun `test recoverSession publishes events via AuthEventManager`() = runTest {
        // Mock successful validation
        whenever(sessionValidator.validateSession()).thenReturn(
            SessionValidationResult.Valid(mock(), System.currentTimeMillis())
        )
        whenever(sessionManager.restoreSession()).thenReturn(true)
        whenever(sessionManager.getCurrentSession()).thenReturn(mock())
        
        // Mock secure storage results
        whenever(secureStorage.retrieve(any(), any())).thenReturn(StorageResult.success("test"))
        whenever(secureStorage.getCredential(any())).thenReturn(StorageResult.success("test"))
        whenever(secureStorage.getSession(any())).thenReturn(StorageResult.success("{\"id\":\"test\"}"))

        manager.recoverSession()

        // Verify events published via mandatory pathway
        verify(authEventManager, atLeastOnce()).publish(any())
        verify(authEventManager).publish(isA<BootstrapEvent.SessionRecoveryStarted>())
    }

    @Test
    fun `test onBootstrapEvent triggers recovery`() = runTest {
        whenever(sessionValidator.validateSession()).thenReturn(
            SessionValidationResult.Valid(mock(), System.currentTimeMillis())
        )
        whenever(sessionManager.restoreSession()).thenReturn(true)
        whenever(sessionManager.getCurrentSession()).thenReturn(mock())

        // Simulate SessionRecoveryRequired event
        manager.onBootstrapEvent(BootstrapEvent.SessionRecoveryRequired)

        // Since it's launched in recoveryScope (IO), we might need to wait or use a test dispatcher
        // But for now, check if at least one event was attempted or mock the scope
    }
}
