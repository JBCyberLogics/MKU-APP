package ke.ac.mku.authcore.contracts.authentication;

/**
 * IAuthCoreManager - CORE-012
 *
 * Contract for AuthCoreManager.
 * Coordinates authentication with configuration.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\nH\u00a6@\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u00a6@\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\fH\u00a6@\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0015\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/authentication/IAuthCoreManager;", "", "authRepository", "Lke/ac/mku/authcore/domain/repository/AuthRepository;", "getAuthRepository", "()Lke/ac/mku/authcore/domain/repository/AuthRepository;", "isLoggedIn", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentUser", "Lke/ac/mku/authcore/domain/model/User;", "login", "Lke/ac/mku/authcore/domain/model/AuthResult;", "registrationNumber", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "getConfig", "Lke/ac/mku/authcore/config/ConfigModel;", "isConfigLoaded", "app"})
public abstract interface IAuthCoreManager {
    
    /**
     * The authentication repository used.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.repository.AuthRepository getAuthRepository();
    
    /**
     * Check if currently logged in.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isLoggedIn(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    /**
     * Get the current user.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.domain.model.User> $completion);
    
    /**
     * Login with credentials.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String registrationNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.domain.model.AuthResult> $completion);
    
    /**
     * Logout.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object logout(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.domain.model.AuthResult> $completion);
    
    /**
     * Get the configuration model.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.config.ConfigModel getConfig();
    
    /**
     * Check if configuration is loaded.
     */
    public abstract boolean isConfigLoaded();
}