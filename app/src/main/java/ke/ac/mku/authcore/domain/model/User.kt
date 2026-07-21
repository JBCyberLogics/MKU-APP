package ke.ac.mku.authcore.domain.model

data class User(
    val registrationNumber: String,
    val studentName: String? = null
)