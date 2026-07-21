package ke.ac.mku.authcore.security

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager
import ke.ac.mku.authcore.registry.DependencyRegistry
import ke.ac.mku.authcore.security.audit.SecurityAuditLogger
import ke.ac.mku.authcore.security.crypto.CryptoManager
import ke.ac.mku.authcore.security.crypto.KeyRotationManager
import ke.ac.mku.authcore.security.detection.ThreatDetector
import ke.ac.mku.authcore.security.storage.EncryptedSessionStore
import javax.inject.Singleton

/**
 * SecurityModule - SECURITY-002
 *
 * Hilt dependency injection module for security components.
 * Provides singleton instances of all security services.
 */
@Module
@InstallIn(SingletonComponent::class)
object SecurityModule {

    @Provides
    @Singleton
    fun provideSecurityAuditLogger(
        @ApplicationContext context: Context
    ): SecurityAuditLogger {
        return SecurityAuditLogger(context)
    }

    @Provides
    @Singleton
    fun provideCryptoManager(
        @ApplicationContext context: Context,
        auditLogger: SecurityAuditLogger,
        registry: DependencyRegistry
    ): ICryptoManager {
        val manager = CryptoManager(context, auditLogger)
        registry.register(
            name = "crypto_manager",
            instance = manager,
            dependencies = emptyList(),
            startupOrder = 4,
            isRequired = true
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideKeyRotationManager(
        @ApplicationContext context: Context,
        cryptoManager: ICryptoManager
    ): KeyRotationManager {
        return KeyRotationManager(context, cryptoManager)
    }

    @Provides
    @Singleton
    fun provideThreatDetector(
        @ApplicationContext context: Context,
        auditLogger: SecurityAuditLogger
    ): ThreatDetector {
        return ThreatDetector(context, auditLogger)
    }

    @Provides
    @Singleton
    fun provideEncryptedSessionStore(
        @ApplicationContext context: Context,
        cryptoManager: ICryptoManager,
        auditLogger: SecurityAuditLogger
    ): EncryptedSessionStore {
        return EncryptedSessionStore(context, cryptoManager, auditLogger)
    }
}