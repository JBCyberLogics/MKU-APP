package ke.ac.mku.authcore.contracts.ui;

/**
 * IDashboardRenderManager - PROGRAM-020
 *
 * Interface for the dynamic dashboard rendering engine.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\fH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\fH&\u00a8\u0006\u0010\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/ui/IDashboardRenderManager;", "", "renderDashboard", "", "plan", "Lke/ac/mku/authcore/domain/model/ui/DashboardPlan;", "layout", "Lke/ac/mku/authcore/domain/model/ui/LayoutBlueprint;", "applyIncrementalUpdate", "updateType", "", "isRendering", "", "isDashboardReady", "setEnabled", "enabled", "app"})
public abstract interface IDashboardRenderManager {
    
    /**
     * Start the rendering process for a new dashboard plan.
     */
    public abstract void renderDashboard(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.ui.DashboardPlan plan, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.ui.LayoutBlueprint layout);
    
    /**
     * Apply an incremental update to the currently rendered dashboard.
     */
    public abstract void applyIncrementalUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.String updateType);
    
    /**
     * Check if the dashboard is currently rendering.
     */
    public abstract boolean isRendering();
    
    /**
     * Determine if the dashboard is ready for user interaction.
     */
    public abstract boolean isDashboardReady();
    
    public abstract void setEnabled(boolean enabled);
}