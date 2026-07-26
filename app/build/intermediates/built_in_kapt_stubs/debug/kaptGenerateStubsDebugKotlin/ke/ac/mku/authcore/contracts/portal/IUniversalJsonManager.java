package ke.ac.mku.authcore.contracts.portal;

/**
 * IUniversalJsonManager - PROGRAM-008
 *
 * Interface for the universal translation layer between portal data and UI models.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000e\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IUniversalJsonManager;", "", "generateUniversalJson", "Lke/ac/mku/authcore/domain/model/portal/UniversalPortalJson;", "entities", "", "Lke/ac/mku/authcore/domain/model/portal/SemanticEntity;", "getLatestUniversalJson", "getDashboardDataset", "Lke/ac/mku/authcore/domain/model/portal/DashboardDataset;", "validateUniversalJson", "", "json", "", "app"})
public abstract interface IUniversalJsonManager {
    
    /**
     * Generate a universal JSON model from semantic entities.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.UniversalPortalJson generateUniversalJson(@org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.SemanticEntity> entities);
    
    /**
     * Return the latest universal JSON model.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.portal.UniversalPortalJson getLatestUniversalJson();
    
    /**
     * Return a dashboard-optimized dataset.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.portal.DashboardDataset getDashboardDataset();
    
    /**
     * Validate a JSON string against the universal schema.
     */
    public abstract boolean validateUniversalJson(@org.jetbrains.annotations.NotNull()
    java.lang.String json);
}