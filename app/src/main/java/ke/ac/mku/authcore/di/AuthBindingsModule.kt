package ke.ac.mku.authcore.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.security.monitor.SecurityMonitor
import ke.ac.mku.authcore.security.storage.SecureStorageManager
import javax.inject.Singleton

/**
 * AuthBindingsModule - SESSION-001
 *
 * Provides explicit interface bindings for Hilt.
 * Maps interface types to their implementations.
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class AuthBindingsModule {

    @Binds
    @Singleton
    abstract fun bindSecureStorageManager(
        impl: SecureStorageManager
    ): ISecureStorageManager

    @Binds
    @Singleton
    abstract fun bindSecurityMonitor(
        impl: SecurityMonitor
    ): ISecurityMonitor
}