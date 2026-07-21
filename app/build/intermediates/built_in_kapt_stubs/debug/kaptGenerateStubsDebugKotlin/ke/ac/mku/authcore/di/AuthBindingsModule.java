package ke.ac.mku.authcore.di;

/**
 * AuthBindingsModule - SESSION-001
 *
 * Provides explicit interface bindings for Hilt.
 * Maps interface types to their implementations.
 */
@dagger.Module()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\'\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'b\u0002\b\bb\u0002\b\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\fH\'b\u0002\b\bb\u0002\b\t\u00ca\u0001\u0002\b\u000e\u00ca\u0001\u0010\b\u000f\u0012\f\b\u0010\u0012\b\b\fJ\u0004\b\t0\u0011\u00a8\u0006\r"}, d2 = {"Lke/ac/mku/authcore/di/AuthBindingsModule;", "", "<init>", "()V", "bindSecureStorageManager", "Lke/ac/mku/authcore/contracts/storage/ISecureStorageManager;", "impl", "Lke/ac/mku/authcore/security/storage/SecureStorageManager;", "Ldagger/Binds;", "Ljavax/inject/Singleton;", "bindSecurityMonitor", "Lke/ac/mku/authcore/contracts/security/ISecurityMonitor;", "Lke/ac/mku/authcore/security/monitor/SecurityMonitor;", "app", "Ldagger/Module;", "Ldagger/hilt/InstallIn;", "value", "Ldagger/hilt/components/SingletonComponent;"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class AuthBindingsModule {
    
    public AuthBindingsModule() {
        super();
    }
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.storage.ISecureStorageManager bindSecureStorageManager(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.security.storage.SecureStorageManager impl);
    
    @dagger.Binds()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.security.ISecurityMonitor bindSecurityMonitor(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.security.monitor.SecurityMonitor impl);
}