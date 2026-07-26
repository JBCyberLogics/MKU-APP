package ke.ac.mku.authcore.domain.repository

import ke.ac.mku.authcore.domain.model.AuthResult
import ke.ac.mku.authcore.domain.model.User

interface AuthRepository {
    suspend fun login(regNumber: String, password: String, portalType: String = "student"): AuthResult
    suspend fun logout()
    suspend fun getCurrentUser(): User?
    suspend fun isLoggedIn(): Boolean
}
