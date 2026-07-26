package ke.ac.mku.authcore.contracts.portal;

/**
 * IRelationshipManager - PROGRAM-009
 *
 * Interface for the dynamic entity relationship engine.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&\u00a8\u0006\u000e\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IRelationshipManager;", "", "buildGraph", "", "entities", "", "Lke/ac/mku/authcore/domain/model/portal/SemanticEntity;", "getGraph", "Lke/ac/mku/authcore/domain/model/portal/EntityRelationshipGraph;", "queryRelationships", "Lke/ac/mku/authcore/domain/model/portal/RelationshipEdge;", "entityId", "", "clear", "app"})
public abstract interface IRelationshipManager {
    
    /**
     * Build the relationship graph from a set of semantic entities.
     */
    public abstract void buildGraph(@org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.SemanticEntity> entities);
    
    /**
     * Return the current entity relationship graph.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract ke.ac.mku.authcore.domain.model.portal.EntityRelationshipGraph getGraph();
    
    /**
     * Query all relationships for a specific entity.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.domain.model.portal.RelationshipEdge> queryRelationships(@org.jetbrains.annotations.NotNull()
    java.lang.String entityId);
    
    /**
     * Clear the relationship registry.
     */
    public abstract void clear();
}