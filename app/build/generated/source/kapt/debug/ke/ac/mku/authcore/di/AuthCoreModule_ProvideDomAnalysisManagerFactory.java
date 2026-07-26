package ke.ac.mku.authcore.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.portal.IDomAnalysisManager;
import ke.ac.mku.authcore.manager.FormAnalyzer;
import ke.ac.mku.authcore.manager.HtmlDocumentParser;
import ke.ac.mku.authcore.manager.TableAnalyzer;
import ke.ac.mku.authcore.registry.DependencyRegistry;

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
public final class AuthCoreModule_ProvideDomAnalysisManagerFactory implements Factory<IDomAnalysisManager> {
  private final Provider<HtmlDocumentParser> parserProvider;

  private final Provider<TableAnalyzer> tableAnalyzerProvider;

  private final Provider<FormAnalyzer> formAnalyzerProvider;

  private final Provider<IAuthenticationEventManager> authEventManagerProvider;

  private final Provider<DependencyRegistry> registryProvider;

  private AuthCoreModule_ProvideDomAnalysisManagerFactory(
      Provider<HtmlDocumentParser> parserProvider, Provider<TableAnalyzer> tableAnalyzerProvider,
      Provider<FormAnalyzer> formAnalyzerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    this.parserProvider = parserProvider;
    this.tableAnalyzerProvider = tableAnalyzerProvider;
    this.formAnalyzerProvider = formAnalyzerProvider;
    this.authEventManagerProvider = authEventManagerProvider;
    this.registryProvider = registryProvider;
  }

  @Override
  public IDomAnalysisManager get() {
    return provideDomAnalysisManager(parserProvider.get(), tableAnalyzerProvider.get(), formAnalyzerProvider.get(), authEventManagerProvider.get(), registryProvider.get());
  }

  public static AuthCoreModule_ProvideDomAnalysisManagerFactory create(
      Provider<HtmlDocumentParser> parserProvider, Provider<TableAnalyzer> tableAnalyzerProvider,
      Provider<FormAnalyzer> formAnalyzerProvider,
      Provider<IAuthenticationEventManager> authEventManagerProvider,
      Provider<DependencyRegistry> registryProvider) {
    return new AuthCoreModule_ProvideDomAnalysisManagerFactory(parserProvider, tableAnalyzerProvider, formAnalyzerProvider, authEventManagerProvider, registryProvider);
  }

  public static IDomAnalysisManager provideDomAnalysisManager(HtmlDocumentParser parser,
      TableAnalyzer tableAnalyzer, FormAnalyzer formAnalyzer,
      IAuthenticationEventManager authEventManager, DependencyRegistry registry) {
    return Preconditions.checkNotNullFromProvides(AuthCoreModule.INSTANCE.provideDomAnalysisManager(parser, tableAnalyzer, formAnalyzer, authEventManager, registry));
  }
}
