package ke.ac.mku.authcore.contracts.authentication

import ke.ac.mku.authcore.config.ConfigModel
import ke.ac.mku.authcore.domain.model.AuthResult
import ke.ac.mku.authcore.domain.model.User
import ke.ac.mku.authcore.domain.repository.AuthRepository

/**
 * IAuthCoreManager - CORE-012
 *
 * Contract for AuthCoreManager.
 * Coordinates authentication with configuration.
 */
interface IAuthCoreManager {
    /**
     * The authentication repository used.
     */
    val authRepository: AuthRepository

    /**
     * Check if currently logged in.
     */
    suspend fun isLoggedIn(): Boolean

    /**
     * Get the current user.
     */
    suspend fun getCurrentUser(): User?

    /**
     * Login with credentials.
     */
    suspend fun login(registrationNumber: String, password: String): AuthResult

    /**
     * Logout.
     */
    suspend fun logout(): AuthResult

    /**
     * Get the configuration model.
     */
    fun getConfig(): ConfigModel

    /**
     * Check if configuration is loaded.
     */
    fun isConfigLoaded(): Boolean
}