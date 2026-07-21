package ke.ac.mku.authcore.feature

/**
 * Source of a feature flag.
 */
enum class FlagSource {
    /** Feature flag is mandatory and cannot be disabled */
    MANDATORY,

    /** Feature flag set at runtime */
    RUNTIME,

    /** Feature flag from remote configuration (future) */
    REMOTE
}

/**
 * Runtime feature flag for controlling feature enablement.
 */
data class FeatureFlag(
    val featureId: String,
    val enabled: Boolean,
    val source: FlagSource,
    val lastModified: Long = System.currentTimeMillis()
)