package ke.ac.mku.authcore.feature

/**
 * Internal feature events (not published through EventBus).
 * Used for internal FeatureRegistry tracking and listener notifications.
 */
sealed class FeatureEvent {
    data class FeatureRegistered(val featureId: String) : FeatureEvent()
    data class FeatureEnabled(val featureId: String) : FeatureEvent()
    data class FeatureDisabled(val featureId: String) : FeatureEvent()
    data class FeatureUpdated(val featureId: String) : FeatureEvent()
    data class FeatureValidationFailed(val featureId: String, val reason: String) : FeatureEvent()
    object FeatureRegistryReady : FeatureEvent()
    object AllFeaturesDiscovered : FeatureEvent()
}