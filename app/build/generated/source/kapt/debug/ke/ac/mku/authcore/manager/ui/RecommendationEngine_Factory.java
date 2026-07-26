package ke.ac.mku.authcore.manager.ui;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class RecommendationEngine_Factory implements Factory<RecommendationEngine> {
  @Override
  public RecommendationEngine get() {
    return newInstance();
  }

  public static RecommendationEngine_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static RecommendationEngine newInstance() {
    return new RecommendationEngine();
  }

  private static final class InstanceHolder {
    static final RecommendationEngine_Factory INSTANCE = new RecommendationEngine_Factory();
  }
}
