package ke.ac.mku.authcore.feature

/**
 * Represents a feature in the Authentication Core.
 */
data class Feature(
    val id: String,
    val name: String,
    val description: String,
    val isRequired: Boolean,
    val isEnabled: Boolean = false,
    val dependencies: List<String> = emptyList(),
    val capabilities: List<String> = emptyList(),
    val registeredAt: Long = System.currentTimeMillis()
)