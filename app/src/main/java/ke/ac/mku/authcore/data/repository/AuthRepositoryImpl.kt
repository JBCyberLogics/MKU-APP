package ke.ac.mku.authcore.data.repository

import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.domain.model.AuthResult
import ke.ac.mku.authcore.domain.model.User
import ke.ac.mku.authcore.domain.repository.AuthRepository
import ke.ac.mku.authcore.manager.CookieManager
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepositoryImpl @Inject constructor(
    private val transactionManager: ke.ac.mku.authcore.auth.transaction.AuthenticationTransactionManager,
    private val sessionManager: ISessionManager,
    private val cookieManager: CookieManager
) : AuthRepository {

    override suspend fun login(regNumber: String, password: String, portalType: String): AuthResult {
        android.util.Log.d("AuthRepository", "Forwarding login to Transaction Manager")
        return transactionManager.executeLoginTransaction(regNumber, password, portalType)
    }

    override suspend fun logout() {
        sessionManager.terminateSession()
        cookieManager.clearCookies()
    }

    override suspend fun getCurrentUser(): User? {
        return if (sessionManager.isSessionActive()) {
            User(
                registrationNumber = sessionManager.getRegNumber() ?: "",
                studentName = sessionManager.getStudentName()
            )
        } else {
            null
        }
    }

    override suspend fun isLoggedIn(): Boolean {
        // This is a general check, but we could make it portal-aware if needed
        return sessionManager.isSessionActive()
    }
}
