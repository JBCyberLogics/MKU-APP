package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.contracts.storage.StorageDomain
import javax.inject.Inject
import javax.inject.Singleton

/**
 * IncrementalCacheEngine - PROGRAM-013
 *
 * Optimizes storage by persisting context data securely.
 */
@Singleton
class IncrementalCacheEngine @Inject constructor(
    private val secureStorage: ISecureStorageManager
) {
    companion object {
        private const val CACHE_PREFIX = "ctx_frag_"
    }

    fun storeFragment(key: String, data: String) {
        Log.d("CacheEngine", "Storing context fragment: $key")
        secureStorage.store(StorageDomain.SESSIONS, "$CACHE_PREFIX$key", data)
    }

    fun retrieveFragment(key: String): String? {
        val result = secureStorage.retrieve(StorageDomain.SESSIONS, "$CACHE_PREFIX$key")
        return if (result.success) result.data else null
    }

    fun deleteFragment(key: String) {
        secureStorage.delete(StorageDomain.SESSIONS, "$CACHE_PREFIX$key")
    }
}
