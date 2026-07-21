package ke.ac.mku.authcore.security;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager;
import ke.ac.mku.authcore.security.audit.SecurityAuditLogger;
import ke.ac.mku.authcore.security.crypto.CryptoManager;
import ke.ac.mku.authcore.security.crypto.KeyRotationManager;
import ke.ac.mku.authcore.security.detection.ThreatDetector;
import ke.ac.mku.authcore.security.storage.EncryptedSessionStore;
import javax.inject.Singleton;

/**
 * SecurityModule - SECURITY-002
 *
 * Hilt dependency injection module for security components.
 * Provides singleton instances of all security services.
 */
@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007J\u0012\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/security/SecurityModule;", "", "()V", "provideCryptoManager", "Lke/ac/mku/authcore/contracts/crypto/ICryptoManager;", "context", "Landroid/content/Context;", "auditLogger", "Lke/ac/mku/authcore/security/audit/SecurityAuditLogger;", "provideEncryptedSessionStore", "Lke/ac/mku/authcore/security/storage/EncryptedSessionStore;", "cryptoManager", "provideKeyRotationManager", "Lke/ac/mku/authcore/security/crypto/KeyRotationManager;", "provideSecurityAuditLogger", "provideThreatDetector", "Lke/ac/mku/authcore/security/detection/ThreatDetector;", "app_debug"})
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
    android.content.Context context) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.crypto.ICryptoManager provideCryptoManager(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.security.audit.SecurityAuditLogger auditLogger) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.security.crypto.KeyRotationManager provideKeyRotationManager(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.ICryptoManager cryptoManager) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.security.detection.ThreatDetector provideThreatDetector(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.security.audit.SecurityAuditLogger auditLogger) {
        return null;
    }
    
    @dagger.Provides()
    @javax.inject.Singleton()
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.security.storage.EncryptedSessionStore provideEncryptedSessionStore(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.crypto.ICryptoManager cryptoManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.security.audit.SecurityAuditLogger auditLogger) {
        return null;
    }
}