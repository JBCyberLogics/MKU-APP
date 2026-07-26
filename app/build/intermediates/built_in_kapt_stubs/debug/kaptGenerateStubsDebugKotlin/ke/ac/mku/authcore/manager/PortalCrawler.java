package ke.ac.mku.authcore.manager;

/**
 * PortalCrawler - PORTAL-001
 *
 * Traverses authenticated pages while maintaining session state.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0002\b\u0006\u00a2\u0006\u0004\b\u0004\u0010\u0005J@\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0086@\u00a2\u0006\u0002\u0010\u0010JH\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0082@\u00a2\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b\u001a\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/manager/PortalCrawler;", "", "authApiService", "Lke/ac/mku/authcore/data/api/AuthApiService;", "<init>", "(Lke/ac/mku/authcore/data/api/AuthApiService;)V", "Ljavax/inject/Inject;", "visitedUrls", "", "", "crawl", "", "baseUrl", "onPageDiscovered", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "crawlInternal", "url", "depth", "", "(Ljava/lang/String;ILkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isLogoutLink", "", "Companion", "app", "Ljavax/inject/Singleton;"})
public final class PortalCrawler {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.data.api.AuthApiService authApiService = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "PortalCrawler";
    private static final int MAX_DEPTH = 10;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> visitedUrls = null;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.manager.PortalCrawler.Companion Companion = null;
    
    @javax.inject.Inject()
    public PortalCrawler(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.data.api.AuthApiService authApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object crawl(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onPageDiscovered, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object crawlInternal(java.lang.String url, int depth, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onPageDiscovered, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final boolean isLogoutLink(java.lang.String url) {
        return false;
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lke/ac/mku/authcore/manager/PortalCrawler$Companion;", "", "<init>", "()V", "TAG", "", "MAX_DEPTH", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}