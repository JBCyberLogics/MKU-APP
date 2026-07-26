package ke.ac.mku.authcore.contracts.ui;

/**
 * IAdaptiveLayoutManager - PROGRAM-018
 *
 * Interface for the dynamic UI layout generation engine.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H&\u00a8\u0006\t\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/ui/IAdaptiveLayoutManager;", "", "generateLayout", "Lke/ac/mku/authcore/domain/model/ui/LayoutBlueprint;", "plan", "Lke/ac/mku/authcore/domain/model/ui/DashboardPlan;", "getRenderTree", "Lke/ac/mku/authcore/domain/model/ui/RenderTree;", "getActiveLayout", "app"})
public abstract interface IAdaptiveLayoutManager {
    
    /**
     * Generate an adaptive layout blueprint from a dashboard plan.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.ui.LayoutBlueprint generateLayout(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.ui.DashboardPlan plan);
    
    /**
     * Return the latest generated render tree.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.ui.RenderTree getRenderTree();
    
    /**
     * Return the current active layout blueprint.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.ui.LayoutBlueprint getActiveLayout();
}