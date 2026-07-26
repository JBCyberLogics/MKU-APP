package ke.ac.mku.authcore.manager

import android.util.Base64
import ke.ac.mku.authcore.domain.model.portal.ParameterMetadata
import java.security.MessageDigest
import javax.inject.Inject
import javax.inject.Singleton

/**
 * RequestFingerprintEngine - PORTAL-004
 *
 * Creates unique signatures for requests to identify and track them at runtime.
 */
@Singleton
class RequestFingerprintEngine @Inject constructor() {

    /**
     * Generate a SHA-256 fingerprint for a request.
     */
    fun generateFingerprint(
        method: String,
        url: String,
        parameters: List<ParameterMetadata>
    ): String {
        val paramSignature = parameters.sortedBy { it.name }
            .joinToString(",") { "${it.name}:${it.type}" }
        
        val rawString = "$method|$url|$paramSignature"
        
        return try {
            val digest = MessageDigest.getInstance("SHA-256")
            val hash = digest.digest(rawString.toByteArray(Charsets.UTF_8))
            Base64.encodeToString(hash, Base64.NO_WRAP)
        } catch (e: Exception) {
            "error_generating_fingerprint"
        }
    }
}
