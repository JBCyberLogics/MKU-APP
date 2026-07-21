package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.data.api.AuthApiService;
import retrofit2.Retrofit;

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
public final class AuthCoreModule_ProvideAuthApiServiceFactory implements Factory<AuthApiService> {
  private final Provider<Retrofit> retrofitProvider;

  private AuthCoreModule_ProvideAuthApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public AuthApiService get() {
    return provideAuthApiService(retrofitProvider.get());
  }

  public static AuthCoreModule_ProvideAuthApiServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new AuthCoreModule_ProvideAuthApiServiceFactory(retrofitProvider);
  }

  public static AuthApiService provideAuthApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideAuthApiService(retrofit));
  }
}
