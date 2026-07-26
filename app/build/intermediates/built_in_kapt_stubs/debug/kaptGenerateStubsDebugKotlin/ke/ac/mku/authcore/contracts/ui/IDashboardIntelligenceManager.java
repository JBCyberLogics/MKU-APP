package ke.ac.mku.authcore.contracts.ui;

/**
 * IDashboardIntelligenceManager - PROGRAM-017
 *
 * Interface for the brain of the dashboard, responsible for automated composition.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/ui/IDashboardIntelligenceManager;", "", "generateDashboardPlan", "Lke/ac/mku/authcore/domain/model/ui/DashboardPlan;", "getLatestPlan", "getRecommendationModel", "Lke/ac/mku/authcore/domain/model/ui/RecommendationModel;", "getDashboardScore", "", "refreshIntelligence", "", "app"})
public abstract interface IDashboardIntelligenceManager {
    
    /**
     * Generate and return the optimal dashboard plan for the current student.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.ui.DashboardPlan generateDashboardPlan();
    
    /**
     * Return the last generated dashboard plan.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.ui.DashboardPlan getLatestPlan();
    
    /**
     * Return the current set of intelligent recommendations.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.ui.RecommendationModel getRecommendationModel();
    
    /**
     * Return an overall usability/relevance score for the current dashboard.
     */
    public abstract float getDashboardScore();
    
    /**
     * Trigger an immediate re-analysis of the dashboard structure.
     */
    public abstract void refreshIntelligence();
}