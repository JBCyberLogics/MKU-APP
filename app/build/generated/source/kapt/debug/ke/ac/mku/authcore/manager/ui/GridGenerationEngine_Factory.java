package ke.ac.mku.authcore.manager.ui;

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
public final class GridGenerationEngine_Factory implements Factory<GridGenerationEngine> {
  private final Provider<Context> contextProvider;

  private GridGenerationEngine_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public GridGenerationEngine get() {
    return newInstance(contextProvider.get());
  }

  public static GridGenerationEngine_Factory create(Provider<Context> contextProvider) {
    return new GridGenerationEngine_Factory(contextProvider);
  }

  public static GridGenerationEngine newInstance(Context context) {
    return new GridGenerationEngine(context);
  }
}
