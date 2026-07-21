package ke.ac.mku.authcore.contracts.cookie

import okhttp3.Cookie

/**
 * COOKIE-001: Cookie Manager Contract
 *
 * Central authority for secure HTTP cookie lifecycle management.
 * Provides a single source of truth for cookie creation, storage, retrieval,
 * validation, update, and deletion.
 */
interface ICookieManager {

    /**
     * Stores a secure cookie.
     *
     * @param name The name of the cookie.
     * @param value The value of the cookie.
     * @param type The type of cookie (from [CookieType]).
     * @param domain The domain for which the cookie is valid.
     * @param path The path for which the cookie is valid.
     */
    fun storeCookie(
        name: String,
        value: String,
        type: CookieType,
        domain: String? = null,
        path: String? = "/"
    )

    /**
     * Stores an OkHttp [Cookie] object.
     *
     * @param cookie The cookie to store.
     * @param type The type of cookie.
     */
    fun storeCookie(cookie: Cookie, type: CookieType)

    /**
     * Retrieves a specific cookie value.
     *
     * @param name The name of the cookie.
     * @return The cookie value or null if not found or invalid.
     */
    fun getCookie(name: String): String?

    /**
     * Updates an existing cookie's value.
     *
     * @param name The name of the cookie.
     * @param value The new value.
     */
    fun updateCookie(name: String, value: String)

    /**
     * Deletes a specific cookie.
     *
     * @param name The name of the cookie to delete.
     */
    fun deleteCookie(name: String)

    /**
     * Removes all authentication cookies from storage.
     */
    fun clearCookies()

    /**
     * Validates a cookie before use (integrity, expiration, session binding).
     *
     * @param name The name of the cookie to validate.
     * @return true if the cookie is valid.
     */
    fun validateCookie(name: String): Boolean

    /**
     * Returns all active cookies as a map.
     *
     * @return Map of cookie names to values.
     */
    fun getAllCookies(): Map<String, String>

    /**
     * Synchronizes cookies with external storage (legacy support).
     */
    fun saveCookies(cookies: Map<String, String>)

    /**
     * Load cookies for a specific request URL (OkHttp compatibility).
     */
    fun loadForRequest(url: String): List<Cookie>

    /**
     * Save cookies from a response (OkHttp compatibility).
     */
    fun saveFromResponse(url: String, cookies: List<Cookie>)
}

/**
 * Represents the different types of cookies used by the platform.
 */
enum class CookieType {
    SESSION_COOKIE,
    AUTH_COOKIE,
    CSRF_COOKIE,
    REMEMBER_ME_COOKIE,
    PORTAL_COOKIE,
    SECURITY_COOKIE
}
