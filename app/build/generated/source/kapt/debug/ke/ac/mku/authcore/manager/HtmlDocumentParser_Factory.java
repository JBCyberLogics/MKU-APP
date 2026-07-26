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
public final class HtmlDocumentParser_Factory implements Factory<HtmlDocumentParser> {
  @Override
  public HtmlDocumentParser get() {
    return newInstance();
  }

  public static HtmlDocumentParser_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HtmlDocumentParser newInstance() {
    return new HtmlDocumentParser();
  }

  private static final class InstanceHolder {
    static final HtmlDocumentParser_Factory INSTANCE = new HtmlDocumentParser_Factory();
  }
}
