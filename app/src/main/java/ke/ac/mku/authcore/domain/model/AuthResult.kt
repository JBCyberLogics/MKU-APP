package ke.ac.mku.authcore.domain.model

sealed class AuthResult {
    data class Success(
        val user: User,
        val cookies: Map<String, String> = emptyMap()
    ) : AuthResult()
    data class Failure(val message: String) : AuthResult()
}