package ke.ac.mku.authcore.contracts.portal;

/**
 * IKnowledgeGraphManager - PROGRAM-010
 *
 * Interface for the portal knowledge graph and reasoning engine.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&\u00a8\u0006\r\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IKnowledgeGraphManager;", "", "getKnowledgeGraph", "Lke/ac/mku/authcore/domain/model/portal/KnowledgeGraph;", "query", "", "Lke/ac/mku/authcore/domain/model/portal/KnowledgeNode;", "Lke/ac/mku/authcore/domain/model/portal/GraphQuery;", "getStudentContextSeed", "Lke/ac/mku/authcore/domain/model/portal/StudentContextSeed;", "triggerReasoning", "", "clear", "app"})
public abstract interface IKnowledgeGraphManager {
    
    /**
     * Return the complete living knowledge graph.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.KnowledgeGraph getKnowledgeGraph();
    
    /**
     * Execute a semantic query against the knowledge graph.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.domain.model.portal.KnowledgeNode> query(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.GraphQuery query);
    
    /**
     * Return the student context seed for Layer 3 initialization.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.StudentContextSeed getStudentContextSeed();
    
    /**
     * Force a reasoning cycle to infer new relationships.
     */
    public abstract void triggerReasoning();
    
    /**
     * Clear the knowledge base.
     */
    public abstract void clear();
}