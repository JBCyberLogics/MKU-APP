package ke.ac.mku.authcore.contracts.authentication;

import ke.ac.mku.authcore.config.ConfigModel;
import ke.ac.mku.authcore.domain.model.AuthResult;
import ke.ac.mku.authcore.domain.model.User;
import ke.ac.mku.authcore.domain.repository.AuthRepository;

/**
 * IAuthCoreManager - CORE-012
 *
 * Contract for AuthCoreManager.
 * Coordinates authentication with configuration.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u0004\u0018\u00010\tH\u00a6@\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH&J\u000e\u0010\r\u001a\u00020\fH\u00a6@\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u00a6@\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u000fH\u00a6@\u00a2\u0006\u0002\u0010\nR\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/contracts/authentication/IAuthCoreManager;", "", "authRepository", "Lke/ac/mku/authcore/domain/repository/AuthRepository;", "getAuthRepository", "()Lke/ac/mku/authcore/domain/repository/AuthRepository;", "getConfig", "Lke/ac/mku/authcore/config/ConfigModel;", "getCurrentUser", "Lke/ac/mku/authcore/domain/model/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConfigLoaded", "", "isLoggedIn", "login", "Lke/ac/mku/authcore/domain/model/AuthResult;", "registrationNumber", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "app_debug"})
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