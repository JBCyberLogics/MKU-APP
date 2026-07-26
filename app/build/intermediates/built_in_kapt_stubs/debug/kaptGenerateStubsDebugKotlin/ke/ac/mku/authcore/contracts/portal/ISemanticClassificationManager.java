package ke.ac.mku.authcore.contracts.portal;

/**
 * ISemanticClassificationManager - PROGRAM-007
 *
 * Interface for the AI-driven semantic classification engine.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u000f\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/ISemanticClassificationManager;", "", "classify", "", "Lke/ac/mku/authcore/domain/model/portal/SemanticEntity;", "dom", "Lke/ac/mku/authcore/domain/model/portal/SemanticDom;", "getRegistry", "Lke/ac/mku/authcore/domain/model/portal/SemanticRegistry;", "getConfidenceScore", "", "entityId", "", "clearRegistry", "", "app"})
public abstract interface ISemanticClassificationManager {
    
    /**
     * Perform semantic classification on a normalized DOM.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.domain.model.portal.SemanticEntity> classify(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.SemanticDom dom);
    
    /**
     * Return the current semantic registry.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.SemanticRegistry getRegistry();
    
    /**
     * Return the confidence score for a specific classified entity.
     */
    public abstract float getConfidenceScore(@org.jetbrains.annotations.NotNull()
    java.lang.String entityId);
    
    /**
     * Clear all classification data.
     */
    public abstract void clearRegistry();
}