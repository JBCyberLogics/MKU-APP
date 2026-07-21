package ke.ac.mku.authcore.bootstrap;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationStateManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieSynchronizationManager;
import ke.ac.mku.authcore.contracts.network.INetworkManager;
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager;
import ke.ac.mku.authcore.contracts.session.ISessionValidator;
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.registry.SecurityManager;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
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
public final class CoreInitializer_Factory implements Factory<CoreInitializer> {
  private final Provider<DependencyRegistry> dependencyRegistryProvider;

  private final Provider<EventBus> eventBusProvider;

  private final Provider<SecurityManager> securityManagerProvider;

  private final Provider<ISecureStorageManager> secureStorageManagerProvider;

  private final Provider<ISessionManager> sessionManagerProvider;

  private final Provider<ICookieManager> cookieManagerProvider;

  private final Provider<IAuthenticationEngine> authEngineProvider;

  private final Provider<IAuthenticationStateManager> authStateManagerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<ISessionValidator> sessionValidatorProvider;

  private final Provider<ISessionRecoveryManager> sessionRecoveryManagerProvider;

  private final Provider<ICookieSynchronizationManager> cookieSyncManagerProvider;

  private final Provider<INetworkManager> networkManagerProvider;

  private CoreInitializer_Factory(Provider<DependencyRegistry> dependencyRegistryProvider,
      Provider<EventBus> eventBusProvider, Provider<SecurityManager> securityManagerProvider,
      Provider<ISecureStorageManager> secureStorageManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<IAuthenticationEngine> authEngineProvider,
      Provider<IAuthenticationStateManager> authStateManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> sessionRecoveryManagerProvider,
      Provider<ICookieSynchronizationManager> cookieSyncManagerProvider,
      Provider<INetworkManager> networkManagerProvider) {
    this.dependencyRegistryProvider = dependencyRegistryProvider;
    this.eventBusProvider = eventBusProvider;
    this.securityManagerProvider = securityManagerProvider;
    this.secureStorageManagerProvider = secureStorageManagerProvider;
    this.sessionManagerProvider = sessionManagerProvider;
    this.cookieManagerProvider = cookieManagerProvider;
    this.authEngineProvider = authEngineProvider;
    this.authStateManagerProvider = authStateManagerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.sessionValidatorProvider = sessionValidatorProvider;
    this.sessionRecoveryManagerProvider = sessionRecoveryManagerProvider;
    this.cookieSyncManagerProvider = cookieSyncManagerProvider;
    this.networkManagerProvider = networkManagerProvider;
  }

  @Override
  public CoreInitializer get() {
    return newInstance(dependencyRegistryProvider.get(), eventBusProvider.get(), securityManagerProvider.get(), secureStorageManagerProvider.get(), sessionManagerProvider.get(), cookieManagerProvider.get(), authEngineProvider.get(), authStateManagerProvider.get(), authEventManagerProvider.get(), sessionValidatorProvider.get(), sessionRecoveryManagerProvider.get(), cookieSyncManagerProvider.get(), networkManagerProvider.get());
  }

  public static CoreInitializer_Factory create(
      Provider<DependencyRegistry> dependencyRegistryProvider, Provider<EventBus> eventBusProvider,
      Provider<SecurityManager> securityManagerProvider,
      Provider<ISecureStorageManager> secureStorageManagerProvider,
      Provider<ISessionManager> sessionManagerProvider,
      Provider<ICookieManager> cookieManagerProvider,
      Provider<IAuthenticationEngine> authEngineProvider,
      Provider<IAuthenticationStateManager> authStateManagerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<ISessionValidator> sessionValidatorProvider,
      Provider<ISessionRecoveryManager> sessionRecoveryManagerProvider,
      Provider<ICookieSynchronizationManager> cookieSyncManagerProvider,
      Provider<INetworkManager> networkManagerProvider) {
    return new CoreInitializer_Factory(dependencyRegistryProvider, eventBusProvider, securityManagerProvider, secureStorageManagerProvider, sessionManagerProvider, cookieManagerProvider, authEngineProvider, authStateManagerProvider, authEventManagerProvider, sessionValidatorProvider, sessionRecoveryManagerProvider, cookieSyncManagerProvider, networkManagerProvider);
  }

  public static CoreInitializer newInstance(DependencyRegistry dependencyRegistry,
      EventBus eventBus, SecurityManager securityManager,
      ISecureStorageManager secureStorageManager, ISessionManager sessionManager,
      ICookieManager cookieManager, IAuthenticationEngine authEngine,
      IAuthenticationStateManager authStateManager, IAuthenticationEventManager authEventManager,
      ISessionValidator sessionValidator, ISessionRecoveryManager sessionRecoveryManager,
      ICookieSynchronizationManager cookieSyncManager, INetworkManager networkManager) {
    return new CoreInitializer(dependencyRegistry, eventBus, securityManager, secureStorageManager, sessionManager, cookieManager, authEngine, authStateManager, authEventManager, sessionValidator, sessionRecoveryManager, cookieSyncManager, networkManager);
  }
}
