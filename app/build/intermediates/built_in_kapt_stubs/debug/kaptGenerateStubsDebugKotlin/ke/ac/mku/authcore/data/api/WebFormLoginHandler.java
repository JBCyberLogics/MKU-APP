package ke.ac.mku.authcore.data.api;

@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u0019B\u0015\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0002\b\u0006\u00a2\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lke/ac/mku/authcore/data/api/WebFormLoginHandler;", "", "authApiService", "Lke/ac/mku/authcore/data/api/AuthApiService;", "<init>", "(Lke/ac/mku/authcore/data/api/AuthApiService;)V", "Ljavax/inject/Inject;", "executeLogin", "Lke/ac/mku/authcore/data/api/WebFormLoginHandler$LoginResponse;", "regNumber", "", "password", "portalType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractValue", "html", "pattern", "Ljava/util/regex/Pattern;", "extractErrorMessage", "extractCookies", "", "response", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "Companion", "LoginResponse", "app"})
public final class WebFormLoginHandler {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.data.api.AuthApiService authApiService = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "WebFormLoginHandler";
    private static final java.util.regex.Pattern VIEWSTATE_PATTERN = null;
    private static final java.util.regex.Pattern VIEWSTATE_GENERATOR_PATTERN = null;
    private static final java.util.regex.Pattern EVENTVALIDATION_PATTERN = null;
    private static final java.util.regex.Pattern LOGIN_ERROR_PATTERN = null;
    private static final java.util.regex.Pattern LOGIN_TOKEN_PATTERN = null;
    private static final java.util.regex.Pattern MOODLE_ERROR_PATTERN = null;
    private static final java.util.regex.Pattern MOODLE_SUCCESS_PATTERN = null;
    private static final java.util.regex.Pattern ASPNET_SUCCESS_PATTERN = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String STUDENT_PORTAL_URL = "https://login.mku.ac.ke/";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String VLMS_PORTAL_URL = "https://vlms.mku.ac.ke/login/index.php";
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.data.api.WebFormLoginHandler.Companion Companion = null;
    
    @javax.inject.Inject()
    public WebFormLoginHandler(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.data.api.AuthApiService authApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object executeLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String regNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String portalType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.data.api.WebFormLoginHandler.LoginResponse> $completion) {
        return null;
    }
    
    private final java.lang.String extractValue(java.lang.String html, java.util.regex.Pattern pattern) {
        return null;
    }
    
    private final java.lang.String extractErrorMessage(java.lang.String html, java.util.regex.Pattern pattern) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.lang.String> extractCookies(retrofit2.Response<okhttp3.ResponseBody> response) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lke/ac/mku/authcore/data/api/WebFormLoginHandler$Companion;", "", "<init>", "()V", "TAG", "", "VIEWSTATE_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "VIEWSTATE_GENERATOR_PATTERN", "EVENTVALIDATION_PATTERN", "LOGIN_ERROR_PATTERN", "LOGIN_TOKEN_PATTERN", "MOODLE_ERROR_PATTERN", "MOODLE_SUCCESS_PATTERN", "ASPNET_SUCCESS_PATTERN", "STUDENT_PORTAL_URL", "VLMS_PORTAL_URL", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0014\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u00d6\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0006H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, d2 = {"Lke/ac/mku/authcore/data/api/WebFormLoginHandler$LoginResponse;", "", "isSuccess", "", "cookies", "", "", "errorMessage", "<init>", "(ZLjava/util/Map;Ljava/lang/String;)V", "()Z", "getCookies", "()Ljava/util/Map;", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app"})
    public static final class LoginResponse {
        private final boolean isSuccess = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, java.lang.String> cookies = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorMessage = null;
        
        public LoginResponse(boolean isSuccess, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> cookies, @org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage) {
            super();
        }
        
        public final boolean isSuccess() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.String> getCookies() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorMessage() {
            return null;
        }
        
        public final boolean component1() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.String> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.data.api.WebFormLoginHandler.LoginResponse copy(boolean isSuccess, @org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, java.lang.String> cookies, @org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}