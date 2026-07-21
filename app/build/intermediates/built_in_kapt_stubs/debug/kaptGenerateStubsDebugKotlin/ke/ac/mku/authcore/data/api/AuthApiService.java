package ke.ac.mku.authcore.data.api;

@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\b\u0003\u0010\u0005\u001a\u00020\u0006:\u0002\b\u0007H\u00a7@b\u0002\b\t\u00a2\u0006\u0002\u0010\bJD\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\b\u0003\u0010\u0005\u001a\u00020\u0006:\u0002\b\u00072\u0018\b\u0001\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\f:\u0002\b\rH\u00a7@b\u0002\b\u000fb\u0002\b\u0010\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u0011\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/data/api/AuthApiService;", "", "getLoginPage", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "url", "", "Lretrofit2/http/Url;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/http/GET;", "submitLogin", "fields", "", "Lretrofit2/http/FieldMap;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/http/FormUrlEncoded;", "Lretrofit2/http/POST;", "app"})
public abstract interface AuthApiService {
    
    @retrofit2.http.GET()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLoginPage(@retrofit2.http.Url()
    @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object submitLogin(@retrofit2.http.Url()
    @org.jetbrains.annotations.NotNull()
    java.lang.String url, @retrofit2.http.FieldMap()
    @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> fields, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<okhttp3.ResponseBody>> $completion);
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}