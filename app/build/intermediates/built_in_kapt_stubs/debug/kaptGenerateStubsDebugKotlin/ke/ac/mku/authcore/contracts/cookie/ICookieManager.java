package ke.ac.mku.authcore.contracts.cookie;

/**
 * COOKIE-001: Cookie Manager Contract
 *
 * Central authority for secure HTTP cookie lifecycle management.
 * Provides a single source of truth for cookie creation, storage, retrieval,
 * validation, update, and deletion.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0003H&J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0014H&J\u001c\u0010\u0015\u001a\u00020\u00032\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0014H&J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0006\u0010\u0019\u001a\u00020\u0005H&J\u001e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0012H&\u00a8\u0006\u001d\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/cookie/ICookieManager;", "", "storeCookie", "", "name", "", "value", "type", "Lke/ac/mku/authcore/contracts/cookie/CookieType;", "domain", "path", "cookie", "Lokhttp3/Cookie;", "getCookie", "updateCookie", "deleteCookie", "clearCookies", "validateCookie", "", "getAllCookies", "", "saveCookies", "cookies", "loadForRequest", "", "url", "saveFromResponse", "setTransactionLock", "locked", "app"})
public abstract interface ICookieManager {
    
    /**
     * Stores a secure cookie.
     *
     * @param name The name of the cookie.
     * @param value The value of the cookie.
     * @param type The type of cookie (from [CookieType]).
     * @param domain The domain for which the cookie is valid.
     * @param path The path for which the cookie is valid.
     */
    public abstract void storeCookie(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.cookie.CookieType type, @org.jetbrains.annotations.Nullable()
    java.lang.String domain, @org.jetbrains.annotations.Nullable()
    java.lang.String path);
    
    /**
     * Stores an OkHttp [Cookie] object.
     *
     * @param cookie The cookie to store.
     * @param type The type of cookie.
     */
    public abstract void storeCookie(@org.jetbrains.annotations.NotNull()
    okhttp3.Cookie cookie, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.cookie.CookieType type);
    
    /**
     * Retrieves a specific cookie value.
     *
     * @param name The name of the cookie.
     * @return The cookie value or null if not found or invalid.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String getCookie(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    /**
     * Updates an existing cookie's value.
     *
     * @param name The name of the cookie.
     * @param value The new value.
     */
    public abstract void updateCookie(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String value);
    
    /**
     * Deletes a specific cookie.
     *
     * @param name The name of the cookie to delete.
     */
    public abstract void deleteCookie(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    /**
     * Removes all authentication cookies from storage.
     */
    public abstract void clearCookies();
    
    /**
     * Validates a cookie before use (integrity, expiration, session binding).
     *
     * @param name The name of the cookie to validate.
     * @return true if the cookie is valid.
     */
    public abstract boolean validateCookie(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    /**
     * Returns all active cookies as a map.
     *
     * @return Map of cookie names to values.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, java.lang.String> getAllCookies();
    
    /**
     * Synchronizes cookies with external storage (legacy support).
     */
    public abstract void saveCookies(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> cookies);
    
    /**
     * Load cookies for a specific request URL (OkHttp compatibility).
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<okhttp3.Cookie> loadForRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    /**
     * Save cookies from a response (OkHttp compatibility).
     */
    public abstract void saveFromResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.util.List<okhttp3.Cookie> cookies);
    
    /**
     * AUTH-TXN-001: Transaction Lock
     * When locked, delete and validation operations are restricted.
     */
    public abstract void setTransactionLock(boolean locked);
    
    /**
     * COOKIE-001: Cookie Manager Contract
     *
     * Central authority for secure HTTP cookie lifecycle management.
     * Provides a single source of truth for cookie creation, storage, retrieval,
     * validation, update, and deletion.
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}