package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.contracts.storage.StorageDomain
import javax.inject.Inject
import javax.inject.Singleton

/**
 * JsonCacheManager - PROGRAM-008
 *
 * Handles encrypted caching of generated JSON.
 */
@Singleton
class JsonCacheManager @Inject constructor(
    private val secureStorage: ISecureStorageManager
) {
    companion object {
        private const val CACHE_KEY = "universal_portal_json"
    }

    fun cacheJson(json: String) {
        Log.d("JsonCache", "Caching universal JSON...")
        secureStorage.store(StorageDomain.SESSIONS, CACHE_KEY, json)
    }

    fun getCachedJson(): String? {
        val result = secureStorage.retrieve(StorageDomain.SESSIONS, CACHE_KEY)
        return if (result.success) result.data else null
    }

    fun clearCache() {
        secureStorage.delete(StorageDomain.SESSIONS, CACHE_KEY)
    }
}
