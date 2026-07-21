package ke.ac.mku.authcore.data.repository

import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.data.api.WebFormLoginHandler
import ke.ac.mku.authcore.domain.model.AuthResult
import ke.ac.mku.authcore.domain.model.User
import ke.ac.mku.authcore.domain.repository.AuthRepository
import ke.ac.mku.authcore.manager.CookieManager
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepositoryImpl @Inject constructor(
    private val webFormLoginHandler: WebFormLoginHandler,
    private val sessionManager: ISessionManager,
    private val cookieManager: CookieManager
) : AuthRepository {

    override suspend fun login(regNumber: String, password: String): AuthResult {
        val response = webFormLoginHandler.executeLogin(regNumber, password)

        return if (response.isSuccess) {
            // Save session
            sessionManager.createSession(
                regNumber = regNumber,
                studentName = null,
                cookies = response.cookies
            )
            // Save cookies for HTTP requests
            cookieManager.saveCookies(response.cookies)

            AuthResult.Success(
                User(registrationNumber = regNumber)
            )
        } else {
            AuthResult.Failure(response.errorMessage ?: "Login failed")
        }
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
        return sessionManager.isSessionActive()
    }
}