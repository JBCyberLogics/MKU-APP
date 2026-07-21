package ke.ac.mku.authcore.di;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager;
import ke.ac.mku.authcore.security.monitor.SecurityMonitor;
import ke.ac.mku.authcore.security.storage.SecureStorageManager;
import javax.inject.Singleton;

/**
 * AuthBindingsModule - SESSION-001
 *
 * Provides explicit interface bindings for Hilt.
 * Maps interface types to their implementations.
 */
@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lke/ac/mku/authcore/di/AuthBindingsModule;", "", "()V", "bindSecureStorageManager", "Lke/ac/mku/authcore/contracts/storage/ISecureStorageManager;", "impl", "Lke/ac/mku/authcore/security/storage/SecureStorageManager;", "bindSecurityMonitor", "Lke/ac/mku/authcore/contracts/security/ISecurityMonitor;", "Lke/ac/mku/authcore/security/monitor/SecurityMonitor;", "app_debug"})
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