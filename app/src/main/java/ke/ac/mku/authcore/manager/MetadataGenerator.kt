package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.JsonMetadata
import javax.inject.Inject
import javax.inject.Singleton

/**
 * MetadataGenerator - PROGRAM-008
 *
 * Generates metadata and provenance for universal JSON.
 */
@Singleton
class MetadataGenerator @Inject constructor() {

    fun generateMetadata(sessionInfo: String, confidence: Float): JsonMetadata {
        return JsonMetadata(
            portalVersion = "1.0",
            schemaVersion = "1.0",
            generatedAt = System.currentTimeMillis(),
            studentSession = sessionInfo,
            confidence = confidence
        )
    }
}
