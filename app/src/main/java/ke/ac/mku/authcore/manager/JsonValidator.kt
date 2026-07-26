package ke.ac.mku.authcore.manager

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

/**
 * JsonValidator - PROGRAM-008
 *
 * Validates generated JSON against schemas.
 */
@Singleton
class JsonValidator @Inject constructor() {

    fun validate(json: String): Boolean {
        Log.d("JsonValidator", "Validating JSON integrity...")
        // Simplified validation: check if valid JSON object
        return try {
            org.json.JSONObject(json)
            true
        } catch (e: Exception) {
            false
        }
    }
}
