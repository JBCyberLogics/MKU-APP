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
public final class TableAnalyzer_Factory implements Factory<TableAnalyzer> {
  @Override
  public TableAnalyzer get() {
    return newInstance();
  }

  public static TableAnalyzer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static TableAnalyzer newInstance() {
    return new TableAnalyzer();
  }

  private static final class InstanceHolder {
    static final TableAnalyzer_Factory INSTANCE = new TableAnalyzer_Factory();
  }
}
