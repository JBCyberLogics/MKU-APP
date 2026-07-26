package ke.ac.mku.authcore.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0002\b\n\u00a2\u0006\u0004\b\b\u0010\tJ&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096@\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0017\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b\u001a\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/data/repository/AuthRepositoryImpl;", "Lke/ac/mku/authcore/domain/repository/AuthRepository;", "transactionManager", "Lke/ac/mku/authcore/auth/transaction/AuthenticationTransactionManager;", "sessionManager", "Lke/ac/mku/authcore/contracts/authentication/ISessionManager;", "cookieManager", "Lke/ac/mku/authcore/manager/CookieManager;", "<init>", "(Lke/ac/mku/authcore/auth/transaction/AuthenticationTransactionManager;Lke/ac/mku/authcore/contracts/authentication/ISessionManager;Lke/ac/mku/authcore/manager/CookieManager;)V", "Ljavax/inject/Inject;", "login", "Lke/ac/mku/authcore/domain/model/AuthResult;", "regNumber", "", "password", "portalType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentUser", "Lke/ac/mku/authcore/domain/model/User;", "isLoggedIn", "", "app", "Ljavax/inject/Singleton;"})
public final class AuthRepositoryImpl implements ke.ac.mku.authcore.domain.repository.AuthRepository {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.auth.transaction.AuthenticationTransactionManager transactionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.authentication.ISessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.CookieManager cookieManager = null;
    
    @javax.inject.Inject()
    public AuthRepositoryImpl(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.auth.transaction.AuthenticationTransactionManager transactionManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.ISessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.CookieManager cookieManager) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String regNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String portalType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.domain.model.AuthResult> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object logout(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.domain.model.User> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object isLoggedIn(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
}