package ke.ac.mku.authcore.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieSynchronizationManager;
import ke.ac.mku.authcore.contracts.network.INetworkManager;
import ke.ac.mku.authcore.contracts.security.ICertificatePinningManager;
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager;
import ke.ac.mku.authcore.contracts.session.ISessionValidator;
import ke.ac.mku.authcore.registry.DependencyRegistry;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast",
    "deprecation",
    "nullness:initialization.field.uninitialized"
})
public final class AuthCoreModule_ProvideNetworkManagerFactory implements Factory<INetworkManager> {
  private final Provider<Context> contextProvider;

  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<ICookieSynchronizationManager> cookieSyncManagerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ISecurityMonitor> securityMonitorProvider;

  private final Provider<ICertificatePinningManager> pinningManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<ISessionRecoveryManager> recoveryManagerProvider;

  private final Provider<ISessionValidator> sessionValidatorProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideNetworkManagerFactory(Provider<Context> contextProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<ICookieSynchronizationManager> cookieSyncManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<ICertificatePinningManager> pinningManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.contextProvider = contextProvider;
    this.cookieManagerProvider = cookieManagerProvider;
    this.cookieSyncManagerProvider = cookieSyncManagerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.securityMonitorProvider = securityMonitorProvider;
    this.pinningManagerProvider = pinningManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.recoveryManagerProvider = recoveryManagerProvider;
    this.sessionValidatorProvider = sessionValidatorProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public INetworkManager get() {
    return provideNetworkManager(contextProvider.get(), cookieManagerProvider.get(), cookieSyncManagerProvider.get(), sessionManagerProvider.get(), securityMonitorProvider.get(), pinningManagerProvider.get(), authEventManagerProvider.get(), recoveryManagerProvider, sessionValidatorProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideNetworkManagerFactory create(
      Provider<Context> contextProvider, Provider<ICookieManager> cookieManagerProvider,
      Provider<ICookieSynchronizationManager> cookieSyncManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ISecurityMonitor> securityMonitorProvider,
      Provider<ICertificatePinningManager> pinningManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ISessionRecoveryManager> recoveryManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideNetworkManagerFactory(contextProvider, cookieManagerProvider, cookieSyncManagerProvider, sessionManagerProvider, securityMonitorProvider, pinningManagerProvider, authEventManagerProvider, recoveryManagerProvider, sessionValidatorProvider, registryProvider);
  }

  public static INetworkManager provideNetworkManager(Context context, ICookieManager cookieManager,
      ICookieSynchronizationManager cookieSyncManager, ISessionManager sessionManager,
      ISecurityMonitor securityMonitor, ICertificatePinningManager pinningManager,
      IAuthenticationEventManager authEventManager,
      javax.inject.Provider<ISessionRecoveryManager> recoveryManagerProvider,
      ISessionValidator sessionValidator, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideNetworkManager(context, cookieManager, cookieSyncManager, sessionManager, securityMonitor, pinningManager, authEventManager, recoveryManagerProvider, sessionValidator, registry));
  }
}
