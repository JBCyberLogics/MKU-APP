package ke.ac.mku.authcore.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;

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
public final class DomAnalysisManager_Factory implements Factory<DomAnalysisManager> {
  private final Provider<HtmlDocumentParser> parserProvider;

  private final Provider<TableAnalyzer> tableAnalyzerProvider;

  private final Provider<FormAnalyzer> formAnalyzerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private DomAnalysisManager_Factory(Provider<HtmlDocumentParser> parserProvider,
      Provider<TableAnalyzer> tableAnalyzerProvider, Provider<FormAnalyzer> formAnalyzerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    this.parserProvider = parserProvider;
    this.tableAnalyzerProvider = tableAnalyzerProvider;
    this.formAnalyzerProvider = formAnalyzerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
  }

  @Override
  public DomAnalysisManager get() {
    return newInstance(parserProvider.get(), tableAnalyzerProvider.get(), formAnalyzerProvider.get(), authEventManagerProvider.get());
  }

  public static DomAnalysisManager_Factory create(Provider<HtmlDocumentParser> parserProvider,
      Provider<TableAnalyzer> tableAnalyzerProvider, Provider<FormAnalyzer> formAnalyzerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider) {
    return new DomAnalysisManager_Factory(parserProvider, tableAnalyzerProvider, formAnalyzerProvider, authEventManagerProvider);
  }

  public static DomAnalysisManager newInstance(HtmlDocumentParser parser,
      TableAnalyzer tableAnalyzer, FormAnalyzer formAnalyzer,
      IAuthenticationEventManager authEventManager) {
    return new DomAnalysisManager(parser, tableAnalyzer, formAnalyzer, authEventManager);
  }
}
