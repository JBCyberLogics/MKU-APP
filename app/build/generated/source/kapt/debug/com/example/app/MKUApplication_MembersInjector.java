package com.example.app;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.bootstrap.BootstrapManager;
import ke.ac.mku.authcore.bootstrap.CoreInitializer;

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
public final class MKUApplication_MembersInjector implements MembersInjector<MKUApplication> {
  private final Provider<BootstrapManager> bootstrapManagerProvider;

  private final Provider<CoreInitializer> coreInitializerProvider;

  private MKUApplication_MembersInjector(Provider<BootstrapManager> bootstrapManagerProvider,
      Provider<CoreInitializer> coreInitializerProvider) {
    this.bootstrapManagerProvider = bootstrapManagerProvider;
    this.coreInitializerProvider = coreInitializerProvider;
  }

  @Override
  public void injectMembers(MKUApplication instance) {
    injectBootstrapManager(instance, bootstrapManagerProvider.get());
    injectCoreInitializer(instance, coreInitializerProvider.get());
  }

  public static MembersInjector<MKUApplication> create(
      Provider<BootstrapManager> bootstrapManagerProvider,
      Provider<CoreInitializer> coreInitializerProvider) {
    return new MKUApplication_MembersInjector(bootstrapManagerProvider, coreInitializerProvider);
  }

  @InjectedFieldSignature("com.example.app.MKUApplication.bootstrapManager")
  public static void injectBootstrapManager(MKUApplication instance,
      BootstrapManager bootstrapManager) {
    instance.bootstrapManager = bootstrapManager;
  }

  @InjectedFieldSignature("com.example.app.MKUApplication.coreInitializer")
  public static void injectCoreInitializer(MKUApplication instance,
      CoreInitializer coreInitializer) {
    instance.coreInitializer = coreInitializer;
  }
}
