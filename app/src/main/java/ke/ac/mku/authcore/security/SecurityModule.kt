package ke.ac.mku.authcore.security

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ke.ac.mku.authcore.bootstrap.EventBus
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
 * Now integrated with dependency-driven PlatformBootstrap.
 */
@Module
@InstallIn(SingletonComponent::class)
object SecurityModule {

    @Provides
    @Singleton
    fun provideSecurityAuditLogger(
        @ApplicationContext context: Context,
        registry: DependencyRegistry
    ): SecurityAuditLogger {
        val logger = SecurityAuditLogger(context)
        registry.register(
            name = "security_audit_logger",
            instance = logger,
            dependencies = emptyList()
        )
        return logger
    }

    @Provides
    @Singleton
    fun provideCryptoManager(
        @ApplicationContext context: Context,
        auditLogger: SecurityAuditLogger,
        eventBus: EventBus,
        registry: DependencyRegistry
    ): ICryptoManager {
        val manager = CryptoManager(context, auditLogger, eventBus)
        registry.register(
            name = "crypto_manager",
            instance = manager,
            dependencies = listOf("security_audit_logger")
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideKeyRotationManager(
        @ApplicationContext context: Context,
        cryptoManager: ICryptoManager,
        registry: DependencyRegistry
    ): KeyRotationManager {
        val manager = KeyRotationManager(context, cryptoManager)
        registry.register(
            name = "key_rotation_manager",
            instance = manager,
            dependencies = listOf("crypto_manager")
        )
        return manager
    }

    @Provides
    @Singleton
    fun provideThreatDetector(
        @ApplicationContext context: Context,
        auditLogger: SecurityAuditLogger,
        eventBus: EventBus,
        registry: DependencyRegistry
    ): ThreatDetector {
        val detector = ThreatDetector(context, auditLogger, eventBus)
        registry.register(
            name = "threat_detector",
            instance = detector,
            dependencies = listOf("security_audit_logger")
        )
        return detector
    }

    @Provides
    @Singleton
    fun provideEncryptedSessionStore(
        @ApplicationContext context: Context,
        cryptoManager: ICryptoManager,
        auditLogger: SecurityAuditLogger,
        registry: DependencyRegistry
    ): EncryptedSessionStore {
        val store = EncryptedSessionStore(context, cryptoManager, auditLogger)
        registry.register(
            name = "encrypted_session_store",
            instance = store,
            dependencies = listOf("crypto_manager", "security_audit_logger")
        )
        return store
    }
}
