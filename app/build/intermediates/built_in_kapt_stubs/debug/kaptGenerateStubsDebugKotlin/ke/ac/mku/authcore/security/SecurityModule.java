package ke.ac.mku.authcore.security;

/**
 * SecurityModule - SECURITY-002
 *
 * Hilt dependency injection module for security components.
 * Provides singleton instances of all security services.
 * Now integrated with dependency-driven PlatformBootstrap.
 */
@dagger.Module()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\f\b\u0001\u0010\u0006\u001a\u00020\u0007:\u0002\b\b2\u0006\u0010\t\u001a\u00020\nH\u0007b\u0002\b\u000bb\u0002\b\fJ6\u0010\r\u001a\u00020\u000e2\f\b\u0001\u0010\u0006\u001a\u00020\u0007:\u0002\b\b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0007b\u0002\b\u000bb\u0002\b\fJ.\u0010\u0012\u001a\u00020\u00132\f\b\u0001\u0010\u0006\u001a\u00020\u0007:\u0002\b\b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0007b\u0002\b\u000bb\u0002\b\fJ6\u0010\u0015\u001a\u00020\u00162\f\b\u0001\u0010\u0006\u001a\u00020\u0007:\u0002\b\b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0007b\u0002\b\u000bb\u0002\b\fJ6\u0010\u0017\u001a\u00020\u00182\f\b\u0001\u0010\u0006\u001a\u00020\u0007:\u0002\b\b2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007b\u0002\b\u000bb\u0002\b\f\u00ca\u0001\u0002\b\u001a\u00ca\u0001\u0010\b\u001b\u0012\f\b\u001c\u0012\b\b\fJ\u0004\b\t0\u001d\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/security/SecurityModule;", "", "<init>", "()V", "provideSecurityAuditLogger", "Lke/ac/mku/authcore/security/audit/SecurityAuditLogger;", "context", "Landroid/content/Context;", "Ldagger/hilt/android/qualifiers/ApplicationContext;", "registry", "Lke/ac/mku/authcore/registry/DependencyRegistry;", "Ldagger/Provides;", "Ljavax/inject/Singleton;", "provideCryptoManager", "Lke/ac/mku/authcore/contracts/crypto/ICryptoManager;", "auditLogger", "eventBus", "Lke/ac/mku/authcore/bootstrap/EventBus;", "provideKeyRotationManager", "Lke/ac/mku/authcore/security/crypto/KeyRotationManager;", "cryptoManager", "provideThreatDetector", "Lke/ac/mku/authcore/security/detection/ThreatDetector;", "provideEncryptedSessionStore", "Lke/ac/mku/authcore/security/storage/EncryptedSessionStore;", "app", "Ldagger/Module;", "Ldagger/hilt/InstallIn;", "value", "Ldagger/hilt/components/SingletonComponent;"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class SecurityModule {
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.security.SecurityModule INSTANCE = null;
    
    private SecurityModule() {
        super();
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.security.audit.SecurityAuditLogger provideSecurityAuditLogger(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.DependencyRegistry registry) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.crypto.ICryptoManager provideCryptoManager(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.security.audit.SecurityAuditLogger auditLogger, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.EventBus eventBus, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.DependencyRegistry registry) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.security.crypto.KeyRotationManager provideKeyRotationManager(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.ICryptoManager cryptoManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.DependencyRegistry registry) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.security.detection.ThreatDetector provideThreatDetector(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.security.audit.SecurityAuditLogger auditLogger, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.EventBus eventBus, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.DependencyRegistry registry) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.security.storage.EncryptedSessionStore provideEncryptedSessionStore(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.ICryptoManager cryptoManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.security.audit.SecurityAuditLogger auditLogger, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.DependencyRegistry registry) {
        return null;
    }
}