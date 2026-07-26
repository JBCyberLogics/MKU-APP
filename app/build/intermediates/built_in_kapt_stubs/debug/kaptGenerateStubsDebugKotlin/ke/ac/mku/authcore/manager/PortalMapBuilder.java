package ke.ac.mku.authcore.manager;

/**
 * PortalMapBuilder - PORTAL-001
 *
 * Constructs a complete map of discovered resources.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\b\u0007\u001a\u0002\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b\u0016\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/manager/PortalMapBuilder;", "", "<init>", "()V", "Ljavax/inject/Inject;", "currentMap", "Lke/ac/mku/authcore/domain/model/portal/PortalMap;", "addPage", "", "page", "Lke/ac/mku/authcore/domain/model/portal/PortalPage;", "addNavigation", "items", "", "Lke/ac/mku/authcore/domain/model/portal/PortalNavigation;", "updateMetadata", "name", "", "version", "build", "reset", "app", "Ljavax/inject/Singleton;"})
public final class PortalMapBuilder {
    @org.jetbrains.annotations.NotNull()
    private ke.ac.mku.authcore.domain.model.portal.PortalMap currentMap;
    
    @javax.inject.Inject()
    public PortalMapBuilder() {
        super();
    }
    
    public final void addPage(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.PortalPage page) {
    }
    
    public final void addNavigation(@org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.PortalNavigation> items) {
    }
    
    public final void updateMetadata(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String version) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.PortalMap build() {
        return null;
    }
    
    public final void reset() {
    }
}