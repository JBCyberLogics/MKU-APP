package ke.ac.mku.authcore.runtime;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class EnvironmentInfo_Factory implements Factory<EnvironmentInfo> {
  private final Provider<Context> contextProvider;

  private EnvironmentInfo_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public EnvironmentInfo get() {
    return newInstance(contextProvider.get());
  }

  public static EnvironmentInfo_Factory create(Provider<Context> contextProvider) {
    return new EnvironmentInfo_Factory(contextProvider);
  }

  public static EnvironmentInfo newInstance(Context context) {
    return new EnvironmentInfo(context);
  }
}
