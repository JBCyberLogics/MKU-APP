package ke.ac.mku.authcore.contracts.authentication;

/**
 * ICookieManager - CORE-012
 *
 * Contract for CookieManager.
 * OkHttp CookieJar implementation for web form authentication.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000bH&J\u001e\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\r"}, d2 = {"Lke/ac/mku/authcore/contracts/authentication/ICookieManager;", "", "clearCookies", "", "loadForRequest", "", "Lokhttp3/Cookie;", "url", "", "saveCookies", "cookies", "", "saveFromResponse", "app_debug"})
public abstract interface ICookieManager {
    
    /**
     * Save cookies from a response.
     */
    public abstract void saveFromResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.util.List<okhttp3.Cookie> cookies);
    
    /**
     * Load cookies for a request.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<okhttp3.Cookie> loadForRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    /**
     * Save cookies to session storage.
     */
    public abstract void saveCookies(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> cookies);
    
    /**
     * Clear all cookies.
     */
    public abstract void clearCookies();
}