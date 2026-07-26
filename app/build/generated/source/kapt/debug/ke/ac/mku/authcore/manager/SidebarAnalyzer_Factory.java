package ke.ac.mku.authcore.manager;

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
public final class SidebarAnalyzer_Factory implements Factory<SidebarAnalyzer> {
  @Override
  public SidebarAnalyzer get() {
    return newInstance();
  }

  public static SidebarAnalyzer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SidebarAnalyzer newInstance() {
    return new SidebarAnalyzer();
  }

  private static final class InstanceHolder {
    static final SidebarAnalyzer_Factory INSTANCE = new SidebarAnalyzer_Factory();
  }
}
