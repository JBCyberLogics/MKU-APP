package ke.ac.mku.authcore.manager;

/**
 * NavigationGraphBuilder - PORTAL-002
 *
 * Creates graph relationships from discovered nodes.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\b\u0007\u001a\u0002\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b\u0011\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/manager/NavigationGraphBuilder;", "", "<init>", "()V", "Ljavax/inject/Inject;", "currentGraph", "Lke/ac/mku/authcore/domain/model/portal/NavigationGraph;", "addNode", "", "node", "Lke/ac/mku/authcore/domain/model/portal/NavigationNode;", "addEdge", "edge", "Lke/ac/mku/authcore/domain/model/portal/NavigationEdge;", "build", "reset", "app", "Ljavax/inject/Singleton;"})
public final class NavigationGraphBuilder {
    @org.jetbrains.annotations.NotNull()
    private ke.ac.mku.authcore.domain.model.portal.NavigationGraph currentGraph;
    
    @javax.inject.Inject()
    public NavigationGraphBuilder() {
        super();
    }
    
    public final void addNode(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.NavigationNode node) {
    }
    
    public final void addEdge(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.NavigationEdge edge) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.NavigationGraph build() {
        return null;
    }
    
    public final void reset() {
    }
}