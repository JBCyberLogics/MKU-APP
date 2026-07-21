package com.example.app;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.ViewModelLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DelegateFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.LazyClassKeyMap;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.BootstrapManager;
import ke.ac.mku.authcore.bootstrap.CoreInitializer;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.config.ConfigManager;
import ke.ac.mku.authcore.config.HealthMonitor;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationStateManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieManager;
import ke.ac.mku.authcore.contracts.cookie.ICookieSynchronizationManager;
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager;
import ke.ac.mku.authcore.contracts.network.IAuthNetworkService;
import ke.ac.mku.authcore.contracts.network.INetworkManager;
import ke.ac.mku.authcore.contracts.portal.IPortalConnector;
import ke.ac.mku.authcore.contracts.security.ICertificatePinningManager;
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager;
import ke.ac.mku.authcore.contracts.session.ISessionValidator;
import ke.ac.mku.authcore.data.api.AuthApiService;
import ke.ac.mku.authcore.data.api.WebFormLoginHandler;
import ke.ac.mku.authcore.data.repository.AuthRepositoryImpl;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideAuthApiServiceFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideAuthCoreManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideAuthRepositoryFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideAuthenticationEngineFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideAuthenticationEventManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideAuthenticationStateManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideBootstrapManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideCertificatePinningManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideCertificateTrustManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideConfigManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideCookieManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideCookieSynchronizationManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideDependencyRegistryFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideEndpointRegistryFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideEventBusFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideLifecycleManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideNetworkManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideOkHttpClientFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvidePortalConnectorFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvidePortalDiscoveryFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvidePortalSDKFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideRecoveryManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideRetrofitFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideSecureStorageManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideSecurityManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideSecurityMonitorFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideServiceRegistryFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideSessionManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideSessionRecoveryManagerFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideSessionValidatorFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideStateRegistryFactory;
import ke.ac.mku.authcore.di.AuthCoreModule_ProvideWebFormLoginHandlerAdapterFactory;
import ke.ac.mku.authcore.domain.repository.AuthRepository;
import ke.ac.mku.authcore.lifecycle.LifecycleManager;
import ke.ac.mku.authcore.manager.AuthCoreManager;
import ke.ac.mku.authcore.manager.CookieManager;
import ke.ac.mku.authcore.recovery.RecoveryManager;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.registry.EndpointRegistry;
import ke.ac.mku.authcore.registry.PortalDiscovery;
import ke.ac.mku.authcore.registry.PortalSDK;
import ke.ac.mku.authcore.registry.SecurityManager;
import ke.ac.mku.authcore.security.SecurityModule_ProvideCryptoManagerFactory;
import ke.ac.mku.authcore.security.SecurityModule_ProvideSecurityAuditLoggerFactory;
import ke.ac.mku.authcore.security.SecurityModule_ProvideThreatDetectorFactory;
import ke.ac.mku.authcore.security.audit.SecurityAuditLogger;
import ke.ac.mku.authcore.security.cert.CertificatePinningService;
import ke.ac.mku.authcore.security.cert.CertificateTrustManager;
import ke.ac.mku.authcore.security.detection.ThreatDetector;
import ke.ac.mku.authcore.security.monitor.IntegrityMonitor;
import ke.ac.mku.authcore.security.monitor.RiskEngine;
import ke.ac.mku.authcore.security.monitor.SecurityAuditManager;
import ke.ac.mku.authcore.security.monitor.SecurityIncidentHandler;
import ke.ac.mku.authcore.security.monitor.SecurityMonitor;
import ke.ac.mku.authcore.security.monitor.ThreatMonitor;
import ke.ac.mku.authcore.security.storage.SecureStorageManager;
import ke.ac.mku.authcore.service.ServiceRegistry;
import ke.ac.mku.authcore.state.StateRegistry;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

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
public final class DaggerMKUApplication_HiltComponents_SingletonC {
  private DaggerMKUApplication_HiltComponents_SingletonC() {
  }

  public static Builder builder() {
    return new Builder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public MKUApplication_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new SingletonCImpl(applicationContextModule);
    }
  }

  private static final class ActivityRetainedCBuilder implements MKUApplication_HiltComponents.ActivityRetainedC.Builder {
    private final SingletonCImpl singletonCImpl;

    private SavedStateHandleHolder savedStateHandleHolder;

    private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ActivityRetainedCBuilder savedStateHandleHolder(
        SavedStateHandleHolder savedStateHandleHolder) {
      this.savedStateHandleHolder = Preconditions.checkNotNull(savedStateHandleHolder);
      return this;
    }

    @Override
    public MKUApplication_HiltComponents.ActivityRetainedC build() {
      Preconditions.checkBuilderRequirement(savedStateHandleHolder, SavedStateHandleHolder.class);
      return new ActivityRetainedCImpl(singletonCImpl, savedStateHandleHolder);
    }
  }

  private static final class ActivityCBuilder implements MKUApplication_HiltComponents.ActivityC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private Activity activity;

    private ActivityCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ActivityCBuilder activity(Activity activity) {
      this.activity = Preconditions.checkNotNull(activity);
      return this;
    }

    @Override
    public MKUApplication_HiltComponents.ActivityC build() {
      Preconditions.checkBuilderRequirement(activity, Activity.class);
      return new ActivityCImpl(singletonCImpl, activityRetainedCImpl, activity);
    }
  }

  private static final class FragmentCBuilder implements MKUApplication_HiltComponents.FragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private Fragment fragment;

    private FragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public FragmentCBuilder fragment(Fragment fragment) {
      this.fragment = Preconditions.checkNotNull(fragment);
      return this;
    }

    @Override
    public MKUApplication_HiltComponents.FragmentC build() {
      Preconditions.checkBuilderRequirement(fragment, Fragment.class);
      return new FragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragment);
    }
  }

  private static final class ViewWithFragmentCBuilder implements MKUApplication_HiltComponents.ViewWithFragmentC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private View view;

    private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;
    }

    @Override
    public ViewWithFragmentCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MKUApplication_HiltComponents.ViewWithFragmentC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewWithFragmentCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl, view);
    }
  }

  private static final class ViewCBuilder implements MKUApplication_HiltComponents.ViewC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private View view;

    private ViewCBuilder(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
    }

    @Override
    public ViewCBuilder view(View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public MKUApplication_HiltComponents.ViewC build() {
      Preconditions.checkBuilderRequirement(view, View.class);
      return new ViewCImpl(singletonCImpl, activityRetainedCImpl, activityCImpl, view);
    }
  }

  private static final class ViewModelCBuilder implements MKUApplication_HiltComponents.ViewModelC.Builder {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private SavedStateHandle savedStateHandle;

    private ViewModelLifecycle viewModelLifecycle;

    private ViewModelCBuilder(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
    }

    @Override
    public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
      this.savedStateHandle = Preconditions.checkNotNull(handle);
      return this;
    }

    @Override
    public ViewModelCBuilder viewModelLifecycle(ViewModelLifecycle viewModelLifecycle) {
      this.viewModelLifecycle = Preconditions.checkNotNull(viewModelLifecycle);
      return this;
    }

    @Override
    public MKUApplication_HiltComponents.ViewModelC build() {
      Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
      Preconditions.checkBuilderRequirement(viewModelLifecycle, ViewModelLifecycle.class);
      return new ViewModelCImpl(singletonCImpl, activityRetainedCImpl, savedStateHandle, viewModelLifecycle);
    }
  }

  private static final class ServiceCBuilder implements MKUApplication_HiltComponents.ServiceC.Builder {
    private final SingletonCImpl singletonCImpl;

    private Service service;

    private ServiceCBuilder(SingletonCImpl singletonCImpl) {
      this.singletonCImpl = singletonCImpl;
    }

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MKUApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(singletonCImpl, service);
    }
  }

  private static final class ViewWithFragmentCImpl extends MKUApplication_HiltComponents.ViewWithFragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl;

    private final ViewWithFragmentCImpl viewWithFragmentCImpl = this;

    ViewWithFragmentCImpl(SingletonCImpl singletonCImpl,
        ActivityRetainedCImpl activityRetainedCImpl, ActivityCImpl activityCImpl,
        FragmentCImpl fragmentCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;
      this.fragmentCImpl = fragmentCImpl;


    }
  }

  private static final class FragmentCImpl extends MKUApplication_HiltComponents.FragmentC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final FragmentCImpl fragmentCImpl = this;

    FragmentCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, Fragment fragmentParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return activityCImpl.getHiltInternalFactoryFactory();
    }

    @Override
    public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
      return new ViewWithFragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl, fragmentCImpl);
    }
  }

  private static final class ViewCImpl extends MKUApplication_HiltComponents.ViewC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl;

    private final ViewCImpl viewCImpl = this;

    ViewCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        ActivityCImpl activityCImpl, View viewParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;
      this.activityCImpl = activityCImpl;


    }
  }

  private static final class ActivityCImpl extends MKUApplication_HiltComponents.ActivityC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ActivityCImpl activityCImpl = this;

    ActivityCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        Activity activityParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;


    }

    @Override
    public void injectMainActivity(MainActivity arg0) {
    }

    @Override
    public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
      return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(getViewModelKeys(), new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl));
    }

    @Override
    public Map<Class<?>, Boolean> getViewModelKeys() {
      return LazyClassKeyMap.<Boolean>of(Collections.<String, Boolean>singletonMap(AuthViewModel_HiltModules_KeyModule_Provide_LazyMapKey.lazyClassKeyName, AuthViewModel_HiltModules.KeyModule.provide()));
    }

    @Override
    public ViewModelComponentBuilder getViewModelComponentBuilder() {
      return new ViewModelCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public FragmentComponentBuilder fragmentComponentBuilder() {
      return new FragmentCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }

    @Override
    public ViewComponentBuilder viewComponentBuilder() {
      return new ViewCBuilder(singletonCImpl, activityRetainedCImpl, activityCImpl);
    }
  }

  private static final class ViewModelCImpl extends MKUApplication_HiltComponents.ViewModelC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl;

    private final ViewModelCImpl viewModelCImpl = this;

    Provider<AuthViewModel> authViewModelProvider;

    ViewModelCImpl(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
        SavedStateHandle savedStateHandleParam, ViewModelLifecycle viewModelLifecycleParam) {
      this.singletonCImpl = singletonCImpl;
      this.activityRetainedCImpl = activityRetainedCImpl;

      initialize(savedStateHandleParam, viewModelLifecycleParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandle savedStateHandleParam,
        final ViewModelLifecycle viewModelLifecycleParam) {
      this.authViewModelProvider = new SwitchingProvider<>(singletonCImpl, activityRetainedCImpl, viewModelCImpl, 0);
    }

    @Override
    public Map<Class<?>, javax.inject.Provider<ViewModel>> getHiltViewModelMap() {
      return LazyClassKeyMap.<javax.inject.Provider<ViewModel>>of(Collections.<String, javax.inject.Provider<ViewModel>>singletonMap(AuthViewModel_HiltModules_BindsModule_Binds_LazyMapKey.lazyClassKeyName, ((Provider) (authViewModelProvider))));
    }

    @Override
    public Map<Class<?>, Object> getHiltViewModelAssistedMap() {
      return Collections.<Class<?>, Object>emptyMap();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final ViewModelCImpl viewModelCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          ViewModelCImpl viewModelCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.viewModelCImpl = viewModelCImpl;
        this.id = id;
      }

      @Override
      @SuppressWarnings("unchecked")
      public T get() {
        switch (id) {
          case 0: // com.example.app.AuthViewModel
          return (T) new AuthViewModel(singletonCImpl.provideAuthCoreManagerProvider.get());

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ActivityRetainedCImpl extends MKUApplication_HiltComponents.ActivityRetainedC {
    private final SingletonCImpl singletonCImpl;

    private final ActivityRetainedCImpl activityRetainedCImpl = this;

    Provider<ActivityRetainedLifecycle> provideActivityRetainedLifecycleProvider;

    ActivityRetainedCImpl(SingletonCImpl singletonCImpl,
        SavedStateHandleHolder savedStateHandleHolderParam) {
      this.singletonCImpl = singletonCImpl;

      initialize(savedStateHandleHolderParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final SavedStateHandleHolder savedStateHandleHolderParam) {
      this.provideActivityRetainedLifecycleProvider = DoubleCheck.provider(new SwitchingProvider<ActivityRetainedLifecycle>(singletonCImpl, activityRetainedCImpl, 0));
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder(singletonCImpl, activityRetainedCImpl);
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return provideActivityRetainedLifecycleProvider.get();
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final ActivityRetainedCImpl activityRetainedCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, ActivityRetainedCImpl activityRetainedCImpl,
          int id) {
        this.singletonCImpl = singletonCImpl;
        this.activityRetainedCImpl = activityRetainedCImpl;
        this.id = id;
      }

      @Override
      @SuppressWarnings("unchecked")
      public T get() {
        switch (id) {
          case 0: // dagger.hilt.android.ActivityRetainedLifecycle
          return (T) ActivityRetainedComponentManager_LifecycleModule_ProvideActivityRetainedLifecycleFactory.provideActivityRetainedLifecycle();

          default: throw new AssertionError(id);
        }
      }
    }
  }

  private static final class ServiceCImpl extends MKUApplication_HiltComponents.ServiceC {
    private final SingletonCImpl singletonCImpl;

    private final ServiceCImpl serviceCImpl = this;

    ServiceCImpl(SingletonCImpl singletonCImpl, Service serviceParam) {
      this.singletonCImpl = singletonCImpl;


    }
  }

  private static final class SingletonCImpl extends MKUApplication_HiltComponents.SingletonC {
    private final ApplicationContextModule applicationContextModule;

    private final SingletonCImpl singletonCImpl = this;

    Provider<DependencyRegistry> provideDependencyRegistryProvider;

    Provider<ConfigManager> provideConfigManagerProvider;

    Provider<EventBus> provideEventBusProvider;

    Provider<ServiceRegistry> provideServiceRegistryProvider;

    Provider<LifecycleManager> provideLifecycleManagerProvider;

    Provider<StateRegistry> provideStateRegistryProvider;

    Provider<SecurityAuditLogger> provideSecurityAuditLoggerProvider;

    Provider<ICryptoManager> provideCryptoManagerProvider;

    Provider<SecureStorageManager> provideSecureStorageManagerProvider;

    Provider<RecoveryManager> provideRecoveryManagerProvider;

    Provider<ThreatDetector> provideThreatDetectorProvider;

    Provider<RiskEngine> riskEngineProvider;

    Provider<ThreatMonitor> threatMonitorProvider;

    Provider<SecurityAuditManager> securityAuditManagerProvider;

    Provider<IntegrityMonitor> integrityMonitorProvider;

    Provider<SecurityIncidentHandler> securityIncidentHandlerProvider;

    Provider<SecurityMonitor> provideSecurityMonitorProvider;

    Provider<IAuthenticationEventManager> provideAuthenticationEventManagerProvider;

    Provider<ISessionManager> provideSessionManagerProvider;

    Provider<ISessionValidator> provideSessionValidatorProvider;

    Provider<IAuthNetworkService> provideWebFormLoginHandlerAdapterProvider;

    Provider<IAuthenticationEngine> provideAuthenticationEngineProvider;

    Provider<ICookieManager> provideCookieManagerProvider;

    Provider<AuthCoreManager> provideAuthCoreManagerProvider;

    Provider<PortalDiscovery> providePortalDiscoveryProvider;

    Provider<EndpointRegistry> provideEndpointRegistryProvider;

    Provider<SecurityManager> provideSecurityManagerProvider;

    Provider<PortalSDK> providePortalSDKProvider;

    Provider<IPortalConnector> providePortalConnectorProvider;

    Provider<IAuthenticationStateManager> provideAuthenticationStateManagerProvider;

    Provider<ISessionRecoveryManager> provideSessionRecoveryManagerProvider;

    Provider<CertificateTrustManager> provideCertificateTrustManagerProvider;

    Provider<OkHttpClient> provideOkHttpClientProvider;

    Provider<Retrofit> provideRetrofitProvider;

    Provider<AuthApiService> provideAuthApiServiceProvider;

    Provider<CookieManager> cookieManagerProvider;

    Provider<AuthRepositoryImpl> authRepositoryImplProvider;

    Provider<AuthRepository> provideAuthRepositoryProvider;

    Provider<HealthMonitor> healthMonitorProvider;

    Provider<BootstrapManager> provideBootstrapManagerProvider;

    Provider<ICookieSynchronizationManager> provideCookieSynchronizationManagerProvider;

    Provider<CertificatePinningService> certificatePinningServiceProvider;

    Provider<ICertificatePinningManager> provideCertificatePinningManagerProvider;

    Provider<INetworkManager> provideNetworkManagerProvider;

    Provider<CoreInitializer> coreInitializerProvider;

    SingletonCImpl(ApplicationContextModule applicationContextModuleParam) {
      this.applicationContextModule = applicationContextModuleParam;
      initialize(applicationContextModuleParam);
      initialize2(applicationContextModuleParam);

    }

    WebFormLoginHandler webFormLoginHandler() {
      return new WebFormLoginHandler(provideAuthApiServiceProvider.get());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ApplicationContextModule applicationContextModuleParam) {
      this.provideDependencyRegistryProvider = DoubleCheck.provider(new SwitchingProvider<DependencyRegistry>(singletonCImpl, 2));
      this.provideConfigManagerProvider = DoubleCheck.provider(new SwitchingProvider<ConfigManager>(singletonCImpl, 1));
      this.provideEventBusProvider = DoubleCheck.provider(new SwitchingProvider<EventBus>(singletonCImpl, 12));
      this.provideServiceRegistryProvider = DoubleCheck.provider(new SwitchingProvider<ServiceRegistry>(singletonCImpl, 14));
      this.provideLifecycleManagerProvider = DoubleCheck.provider(new SwitchingProvider<LifecycleManager>(singletonCImpl, 13));
      this.provideStateRegistryProvider = DoubleCheck.provider(new SwitchingProvider<StateRegistry>(singletonCImpl, 11));
      this.provideSecurityAuditLoggerProvider = DoubleCheck.provider(new SwitchingProvider<SecurityAuditLogger>(singletonCImpl, 17));
      this.provideCryptoManagerProvider = DoubleCheck.provider(new SwitchingProvider<ICryptoManager>(singletonCImpl, 16));
      this.provideSecureStorageManagerProvider = DoubleCheck.provider(new SwitchingProvider<SecureStorageManager>(singletonCImpl, 15));
      this.provideRecoveryManagerProvider = DoubleCheck.provider(new SwitchingProvider<RecoveryManager>(singletonCImpl, 18));
      this.provideThreatDetectorProvider = DoubleCheck.provider(new SwitchingProvider<ThreatDetector>(singletonCImpl, 21));
      this.riskEngineProvider = DoubleCheck.provider(new SwitchingProvider<RiskEngine>(singletonCImpl, 22));
      this.threatMonitorProvider = DoubleCheck.provider(new SwitchingProvider<ThreatMonitor>(singletonCImpl, 20));
      this.securityAuditManagerProvider = DoubleCheck.provider(new SwitchingProvider<SecurityAuditManager>(singletonCImpl, 23));
      this.integrityMonitorProvider = DoubleCheck.provider(new SwitchingProvider<IntegrityMonitor>(singletonCImpl, 24));
      this.securityIncidentHandlerProvider = DoubleCheck.provider(new SwitchingProvider<SecurityIncidentHandler>(singletonCImpl, 25));
      this.provideSecurityMonitorProvider = DoubleCheck.provider(new SwitchingProvider<SecurityMonitor>(singletonCImpl, 19));
      this.provideAuthenticationEventManagerProvider = DoubleCheck.provider(new SwitchingProvider<IAuthenticationEventManager>(singletonCImpl, 26));
      this.provideSessionManagerProvider = DoubleCheck.provider(new SwitchingProvider<ISessionManager>(singletonCImpl, 10));
      this.provideSessionValidatorProvider = DoubleCheck.provider(new SwitchingProvider<ISessionValidator>(singletonCImpl, 27));
      this.provideWebFormLoginHandlerAdapterProvider = DoubleCheck.provider(new SwitchingProvider<IAuthNetworkService>(singletonCImpl, 30));
      this.provideAuthenticationEngineProvider = DoubleCheck.provider(new SwitchingProvider<IAuthenticationEngine>(singletonCImpl, 29));
      this.provideCookieManagerProvider = new DelegateFactory<>();
      this.provideAuthCoreManagerProvider = new DelegateFactory<>();
      this.providePortalDiscoveryProvider = DoubleCheck.provider(new SwitchingProvider<PortalDiscovery>(singletonCImpl, 34));
    }

    @SuppressWarnings("unchecked")
    private void initialize2(final ApplicationContextModule applicationContextModuleParam) {
      this.provideEndpointRegistryProvider = DoubleCheck.provider(new SwitchingProvider<EndpointRegistry>(singletonCImpl, 33));
      this.provideSecurityManagerProvider = DoubleCheck.provider(new SwitchingProvider<SecurityManager>(singletonCImpl, 35));
      this.providePortalSDKProvider = DoubleCheck.provider(new SwitchingProvider<PortalSDK>(singletonCImpl, 32));
      this.providePortalConnectorProvider = DoubleCheck.provider(new SwitchingProvider<IPortalConnector>(singletonCImpl, 31));
      this.provideAuthenticationStateManagerProvider = DoubleCheck.provider(new SwitchingProvider<IAuthenticationStateManager>(singletonCImpl, 36));
      this.provideSessionRecoveryManagerProvider = DoubleCheck.provider(new SwitchingProvider<ISessionRecoveryManager>(singletonCImpl, 28));
      DelegateFactory.setDelegate(provideCookieManagerProvider, DoubleCheck.provider(new SwitchingProvider<ICookieManager>(singletonCImpl, 9)));
      this.provideCertificateTrustManagerProvider = DoubleCheck.provider(new SwitchingProvider<CertificateTrustManager>(singletonCImpl, 37));
      this.provideOkHttpClientProvider = DoubleCheck.provider(new SwitchingProvider<OkHttpClient>(singletonCImpl, 8));
      this.provideRetrofitProvider = DoubleCheck.provider(new SwitchingProvider<Retrofit>(singletonCImpl, 7));
      this.provideAuthApiServiceProvider = DoubleCheck.provider(new SwitchingProvider<AuthApiService>(singletonCImpl, 6));
      this.cookieManagerProvider = DoubleCheck.provider(new SwitchingProvider<CookieManager>(singletonCImpl, 38));
      this.authRepositoryImplProvider = DoubleCheck.provider(new SwitchingProvider<AuthRepositoryImpl>(singletonCImpl, 5));
      this.provideAuthRepositoryProvider = DoubleCheck.provider(new SwitchingProvider<AuthRepository>(singletonCImpl, 4));
      this.healthMonitorProvider = DoubleCheck.provider(new SwitchingProvider<HealthMonitor>(singletonCImpl, 39));
      DelegateFactory.setDelegate(provideAuthCoreManagerProvider, DoubleCheck.provider(new SwitchingProvider<AuthCoreManager>(singletonCImpl, 3)));
      this.provideBootstrapManagerProvider = DoubleCheck.provider(new SwitchingProvider<BootstrapManager>(singletonCImpl, 0));
      this.provideCookieSynchronizationManagerProvider = DoubleCheck.provider(new SwitchingProvider<ICookieSynchronizationManager>(singletonCImpl, 41));
      this.certificatePinningServiceProvider = DoubleCheck.provider(new SwitchingProvider<CertificatePinningService>(singletonCImpl, 44));
      this.provideCertificatePinningManagerProvider = DoubleCheck.provider(new SwitchingProvider<ICertificatePinningManager>(singletonCImpl, 43));
      this.provideNetworkManagerProvider = DoubleCheck.provider(new SwitchingProvider<INetworkManager>(singletonCImpl, 42));
      this.coreInitializerProvider = DoubleCheck.provider(new SwitchingProvider<CoreInitializer>(singletonCImpl, 40));
    }

    @Override
    public void injectMKUApplication(MKUApplication mKUApplication) {
      injectMKUApplication2(mKUApplication);
    }

    @Override
    public Set<Boolean> getDisableFragmentGetContextFix() {
      return Collections.<Boolean>emptySet();
    }

    @Override
    public ActivityRetainedComponentBuilder retainedComponentBuilder() {
      return new ActivityRetainedCBuilder(singletonCImpl);
    }

    @Override
    public ServiceComponentBuilder serviceComponentBuilder() {
      return new ServiceCBuilder(singletonCImpl);
    }

    private MKUApplication injectMKUApplication2(MKUApplication instance) {
      MKUApplication_MembersInjector.injectBootstrapManager(instance, provideBootstrapManagerProvider.get());
      MKUApplication_MembersInjector.injectCoreInitializer(instance, coreInitializerProvider.get());
      return instance;
    }

    private static final class SwitchingProvider<T> implements Provider<T> {
      private final SingletonCImpl singletonCImpl;

      private final int id;

      SwitchingProvider(SingletonCImpl singletonCImpl, int id) {
        this.singletonCImpl = singletonCImpl;
        this.id = id;
      }

      @Override
      @SuppressWarnings("unchecked")
      public T get() {
        switch (id) {
          case 0: // ke.ac.mku.authcore.bootstrap.BootstrapManager
          return (T) AuthCoreModule_ProvideBootstrapManagerFactory.provideBootstrapManager(singletonCImpl.provideConfigManagerProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get(), singletonCImpl.provideAuthCoreManagerProvider.get(), singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 1: // ke.ac.mku.authcore.config.ConfigManager
          return (T) AuthCoreModule_ProvideConfigManagerFactory.provideConfigManager(singletonCImpl.provideDependencyRegistryProvider.get());

          case 2: // ke.ac.mku.authcore.registry.DependencyRegistry
          return (T) AuthCoreModule_ProvideDependencyRegistryFactory.provideDependencyRegistry();

          case 3: // ke.ac.mku.authcore.manager.AuthCoreManager
          return (T) AuthCoreModule_ProvideAuthCoreManagerFactory.provideAuthCoreManager(singletonCImpl.provideAuthRepositoryProvider.get(), singletonCImpl.provideConfigManagerProvider.get(), singletonCImpl.healthMonitorProvider.get());

          case 4: // ke.ac.mku.authcore.domain.repository.AuthRepository
          return (T) AuthCoreModule_ProvideAuthRepositoryFactory.provideAuthRepository(singletonCImpl.authRepositoryImplProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 5: // ke.ac.mku.authcore.data.repository.AuthRepositoryImpl
          return (T) new AuthRepositoryImpl(singletonCImpl.webFormLoginHandler(), singletonCImpl.provideSessionManagerProvider.get(), singletonCImpl.cookieManagerProvider.get());

          case 6: // ke.ac.mku.authcore.data.api.AuthApiService
          return (T) AuthCoreModule_ProvideAuthApiServiceFactory.provideAuthApiService(singletonCImpl.provideRetrofitProvider.get());

          case 7: // retrofit2.Retrofit
          return (T) AuthCoreModule_ProvideRetrofitFactory.provideRetrofit(singletonCImpl.provideOkHttpClientProvider.get(), singletonCImpl.provideConfigManagerProvider.get());

          case 8: // okhttp3.OkHttpClient
          return (T) AuthCoreModule_ProvideOkHttpClientFactory.provideOkHttpClient(singletonCImpl.provideConfigManagerProvider.get(), singletonCImpl.provideCookieManagerProvider.get(), singletonCImpl.provideCertificateTrustManagerProvider.get());

          case 9: // ke.ac.mku.authcore.contracts.cookie.ICookieManager
          return (T) AuthCoreModule_ProvideCookieManagerFactory.provideCookieManager(singletonCImpl.provideSessionManagerProvider.get(), singletonCImpl.provideSessionValidatorProvider, singletonCImpl.provideSessionRecoveryManagerProvider, singletonCImpl.provideSecureStorageManagerProvider.get(), singletonCImpl.provideCryptoManagerProvider.get(), singletonCImpl.provideSecurityMonitorProvider.get(), singletonCImpl.provideAuthenticationEventManagerProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 10: // ke.ac.mku.authcore.contracts.authentication.ISessionManager
          return (T) AuthCoreModule_ProvideSessionManagerFactory.provideSessionManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideStateRegistryProvider.get(), singletonCImpl.provideSecureStorageManagerProvider.get(), singletonCImpl.provideRecoveryManagerProvider.get(), singletonCImpl.provideSecurityMonitorProvider.get(), singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get(), singletonCImpl.provideAuthenticationEventManagerProvider.get(), singletonCImpl.provideCryptoManagerProvider.get());

          case 11: // ke.ac.mku.authcore.state.StateRegistry
          return (T) AuthCoreModule_ProvideStateRegistryFactory.provideStateRegistry(singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideLifecycleManagerProvider.get(), singletonCImpl.provideServiceRegistryProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 12: // ke.ac.mku.authcore.bootstrap.EventBus
          return (T) AuthCoreModule_ProvideEventBusFactory.provideEventBus(singletonCImpl.provideDependencyRegistryProvider.get());

          case 13: // ke.ac.mku.authcore.lifecycle.LifecycleManager
          return (T) AuthCoreModule_ProvideLifecycleManagerFactory.provideLifecycleManager(singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideServiceRegistryProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 14: // ke.ac.mku.authcore.service.ServiceRegistry
          return (T) AuthCoreModule_ProvideServiceRegistryFactory.provideServiceRegistry(singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 15: // ke.ac.mku.authcore.security.storage.SecureStorageManager
          return (T) AuthCoreModule_ProvideSecureStorageManagerFactory.provideSecureStorageManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideCryptoManagerProvider.get(), singletonCImpl.provideSecurityAuditLoggerProvider.get(), singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 16: // ke.ac.mku.authcore.contracts.crypto.ICryptoManager
          return (T) SecurityModule_ProvideCryptoManagerFactory.provideCryptoManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideSecurityAuditLoggerProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 17: // ke.ac.mku.authcore.security.audit.SecurityAuditLogger
          return (T) SecurityModule_ProvideSecurityAuditLoggerFactory.provideSecurityAuditLogger(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule));

          case 18: // ke.ac.mku.authcore.recovery.RecoveryManager
          return (T) AuthCoreModule_ProvideRecoveryManagerFactory.provideRecoveryManager(singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideServiceRegistryProvider.get(), singletonCImpl.provideStateRegistryProvider.get(), singletonCImpl.provideLifecycleManagerProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 19: // ke.ac.mku.authcore.security.monitor.SecurityMonitor
          return (T) AuthCoreModule_ProvideSecurityMonitorFactory.provideSecurityMonitor(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideEventBusProvider.get(), singletonCImpl.threatMonitorProvider.get(), singletonCImpl.securityAuditManagerProvider.get(), singletonCImpl.integrityMonitorProvider.get(), singletonCImpl.securityIncidentHandlerProvider.get(), singletonCImpl.riskEngineProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 20: // ke.ac.mku.authcore.security.monitor.ThreatMonitor
          return (T) new ThreatMonitor(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideThreatDetectorProvider.get(), singletonCImpl.riskEngineProvider.get(), singletonCImpl.provideEventBusProvider.get());

          case 21: // ke.ac.mku.authcore.security.detection.ThreatDetector
          return (T) SecurityModule_ProvideThreatDetectorFactory.provideThreatDetector(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideSecurityAuditLoggerProvider.get());

          case 22: // ke.ac.mku.authcore.security.monitor.RiskEngine
          return (T) new RiskEngine();

          case 23: // ke.ac.mku.authcore.security.monitor.SecurityAuditManager
          return (T) new SecurityAuditManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideCryptoManagerProvider.get(), singletonCImpl.provideSecureStorageManagerProvider.get(), singletonCImpl.provideSecurityAuditLoggerProvider.get(), singletonCImpl.provideEventBusProvider.get());

          case 24: // ke.ac.mku.authcore.security.monitor.IntegrityMonitor
          return (T) new IntegrityMonitor(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideSecureStorageManagerProvider.get(), singletonCImpl.provideEventBusProvider.get());

          case 25: // ke.ac.mku.authcore.security.monitor.SecurityIncidentHandler
          return (T) new SecurityIncidentHandler(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideRecoveryManagerProvider.get());

          case 26: // ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
          return (T) AuthCoreModule_ProvideAuthenticationEventManagerFactory.provideAuthenticationEventManager(singletonCImpl.provideSecureStorageManagerProvider.get(), singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideStateRegistryProvider.get(), singletonCImpl.provideSecurityMonitorProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 27: // ke.ac.mku.authcore.contracts.session.ISessionValidator
          return (T) AuthCoreModule_ProvideSessionValidatorFactory.provideSessionValidator(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideSessionManagerProvider.get(), singletonCImpl.provideSecureStorageManagerProvider.get(), singletonCImpl.provideCryptoManagerProvider.get(), singletonCImpl.provideSecurityMonitorProvider.get(), singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get(), singletonCImpl.provideAuthenticationEventManagerProvider.get());

          case 28: // ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager
          return (T) AuthCoreModule_ProvideSessionRecoveryManagerFactory.provideSessionRecoveryManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideSessionManagerProvider.get(), singletonCImpl.provideSessionValidatorProvider.get(), singletonCImpl.provideAuthenticationEngineProvider, singletonCImpl.provideSecureStorageManagerProvider.get(), singletonCImpl.provideSecurityMonitorProvider.get(), singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get(), singletonCImpl.provideAuthenticationEventManagerProvider.get(), singletonCImpl.provideCookieManagerProvider, singletonCImpl.providePortalConnectorProvider.get(), singletonCImpl.provideRecoveryManagerProvider.get(), singletonCImpl.provideServiceRegistryProvider.get(), singletonCImpl.provideCryptoManagerProvider.get(), singletonCImpl.provideAuthenticationStateManagerProvider.get());

          case 29: // ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine
          return (T) AuthCoreModule_ProvideAuthenticationEngineFactory.provideAuthenticationEngine(singletonCImpl.provideWebFormLoginHandlerAdapterProvider.get(), singletonCImpl.provideSecurityMonitorProvider.get(), singletonCImpl.provideSessionManagerProvider.get(), singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideStateRegistryProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get(), singletonCImpl.provideAuthenticationEventManagerProvider.get());

          case 30: // ke.ac.mku.authcore.contracts.network.IAuthNetworkService
          return (T) AuthCoreModule_ProvideWebFormLoginHandlerAdapterFactory.provideWebFormLoginHandlerAdapter(singletonCImpl.webFormLoginHandler(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 31: // ke.ac.mku.authcore.contracts.portal.IPortalConnector
          return (T) AuthCoreModule_ProvidePortalConnectorFactory.providePortalConnector(singletonCImpl.providePortalSDKProvider.get(), singletonCImpl.providePortalDiscoveryProvider.get(), singletonCImpl.provideEndpointRegistryProvider.get());

          case 32: // ke.ac.mku.authcore.registry.PortalSDK
          return (T) AuthCoreModule_ProvidePortalSDKFactory.providePortalSDK(singletonCImpl.provideAuthCoreManagerProvider.get(), singletonCImpl.provideEndpointRegistryProvider.get(), singletonCImpl.providePortalDiscoveryProvider.get(), singletonCImpl.provideSecurityManagerProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 33: // ke.ac.mku.authcore.registry.EndpointRegistry
          return (T) AuthCoreModule_ProvideEndpointRegistryFactory.provideEndpointRegistry(singletonCImpl.provideConfigManagerProvider.get(), singletonCImpl.providePortalDiscoveryProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 34: // ke.ac.mku.authcore.registry.PortalDiscovery
          return (T) AuthCoreModule_ProvidePortalDiscoveryFactory.providePortalDiscovery(singletonCImpl.provideDependencyRegistryProvider.get());

          case 35: // ke.ac.mku.authcore.registry.SecurityManager
          return (T) AuthCoreModule_ProvideSecurityManagerFactory.provideSecurityManager(singletonCImpl.provideConfigManagerProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 36: // ke.ac.mku.authcore.contracts.authentication.IAuthenticationStateManager
          return (T) AuthCoreModule_ProvideAuthenticationStateManagerFactory.provideAuthenticationStateManager(singletonCImpl.provideStateRegistryProvider.get(), singletonCImpl.provideSecureStorageManagerProvider.get(), singletonCImpl.provideRecoveryManagerProvider.get(), singletonCImpl.provideSecurityMonitorProvider.get(), singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get(), singletonCImpl.provideAuthenticationEventManagerProvider.get());

          case 37: // ke.ac.mku.authcore.security.cert.CertificateTrustManager
          return (T) AuthCoreModule_ProvideCertificateTrustManagerFactory.provideCertificateTrustManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideCryptoManagerProvider.get(), singletonCImpl.provideSecureStorageManagerProvider.get(), singletonCImpl.provideSecurityAuditLoggerProvider.get(), singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 38: // ke.ac.mku.authcore.manager.CookieManager
          return (T) new CookieManager(singletonCImpl.provideSessionManagerProvider.get(), singletonCImpl.provideSessionValidatorProvider, singletonCImpl.provideSessionRecoveryManagerProvider, singletonCImpl.provideSecureStorageManagerProvider.get(), singletonCImpl.provideCryptoManagerProvider.get(), singletonCImpl.provideSecurityMonitorProvider.get(), singletonCImpl.provideAuthenticationEventManagerProvider.get());

          case 39: // ke.ac.mku.authcore.config.HealthMonitor
          return (T) new HealthMonitor(singletonCImpl.provideConfigManagerProvider.get());

          case 40: // ke.ac.mku.authcore.bootstrap.CoreInitializer
          return (T) new CoreInitializer(singletonCImpl.provideDependencyRegistryProvider.get(), singletonCImpl.provideEventBusProvider.get(), singletonCImpl.provideSecurityManagerProvider.get(), singletonCImpl.provideSecureStorageManagerProvider.get(), singletonCImpl.provideSessionManagerProvider.get(), singletonCImpl.provideCookieManagerProvider.get(), singletonCImpl.provideAuthenticationEngineProvider.get(), singletonCImpl.provideAuthenticationStateManagerProvider.get(), singletonCImpl.provideAuthenticationEventManagerProvider.get(), singletonCImpl.provideSessionValidatorProvider.get(), singletonCImpl.provideSessionRecoveryManagerProvider.get(), singletonCImpl.provideCookieSynchronizationManagerProvider.get(), singletonCImpl.provideNetworkManagerProvider.get());

          case 41: // ke.ac.mku.authcore.contracts.cookie.ICookieSynchronizationManager
          return (T) AuthCoreModule_ProvideCookieSynchronizationManagerFactory.provideCookieSynchronizationManager(singletonCImpl.provideCookieManagerProvider.get(), singletonCImpl.provideSessionManagerProvider.get(), singletonCImpl.provideSessionValidatorProvider.get(), singletonCImpl.provideSessionRecoveryManagerProvider.get(), singletonCImpl.provideSecureStorageManagerProvider.get(), singletonCImpl.provideSecurityMonitorProvider.get(), singletonCImpl.provideAuthenticationEventManagerProvider.get(), singletonCImpl.provideServiceRegistryProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 42: // ke.ac.mku.authcore.contracts.network.INetworkManager
          return (T) AuthCoreModule_ProvideNetworkManagerFactory.provideNetworkManager(ApplicationContextModule_ProvideContextFactory.provideContext(singletonCImpl.applicationContextModule), singletonCImpl.provideCookieManagerProvider.get(), singletonCImpl.provideCookieSynchronizationManagerProvider.get(), singletonCImpl.provideSessionManagerProvider.get(), singletonCImpl.provideSecurityMonitorProvider.get(), singletonCImpl.provideCertificatePinningManagerProvider.get(), singletonCImpl.provideAuthenticationEventManagerProvider.get(), singletonCImpl.provideSessionRecoveryManagerProvider.get(), singletonCImpl.provideSessionValidatorProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 43: // ke.ac.mku.authcore.contracts.security.ICertificatePinningManager
          return (T) AuthCoreModule_ProvideCertificatePinningManagerFactory.provideCertificatePinningManager(singletonCImpl.certificatePinningServiceProvider.get(), singletonCImpl.provideDependencyRegistryProvider.get());

          case 44: // ke.ac.mku.authcore.security.cert.CertificatePinningService
          return (T) new CertificatePinningService();

          default: throw new AssertionError(id);
        }
      }
    }
  }
}
