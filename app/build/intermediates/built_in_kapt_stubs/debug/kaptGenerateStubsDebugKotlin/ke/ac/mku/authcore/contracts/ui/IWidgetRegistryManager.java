package ke.ac.mku.authcore.contracts.ui;

/**
 * IWidgetRegistryManager - PROGRAM-016
 *
 * Interface for the dynamic dashboard widget registry.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&\u00a8\u0006\r\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/ui/IWidgetRegistryManager;", "", "registerWidget", "", "definition", "Lke/ac/mku/authcore/domain/model/ui/WidgetDefinition;", "getDashboardBlueprint", "Lke/ac/mku/authcore/domain/model/ui/DashboardBlueprint;", "isWidgetActive", "", "widgetId", "", "resetRegistry", "app"})
public abstract interface IWidgetRegistryManager {
    
    /**
     * Register a new widget definition in the catalog.
     */
    public abstract void registerWidget(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.ui.WidgetDefinition definition);
    
    /**
     * Build and return a layout blueprint based on context.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.ui.DashboardBlueprint getDashboardBlueprint();
    
    /**
     * Check if a specific widget is currently active.
     */
    public abstract boolean isWidgetActive(@org.jetbrains.annotations.NotNull()
    java.lang.String widgetId);
    
    /**
     * Reset the registry to default state.
     */
    public abstract void resetRegistry();
}