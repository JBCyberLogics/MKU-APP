package ke.ac.mku.authcore.domain.model.ui;

/**
 * AdaptiveLayoutModels - PROGRAM-018
 *
 * Models for the dynamic and responsive dashboard layout generation.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\fH\u00c6\u0003JA\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\"\u001a\u00020#H\u00d6\u0081\u0004J\n\u0010$\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006%"}, d2 = {"Lke/ac/mku/authcore/domain/model/ui/LayoutBlueprint;", "", "blueprintId", "", "timestamp", "", "grid", "Lke/ac/mku/authcore/domain/model/ui/ResponsiveGrid;", "widgetPositions", "", "Lke/ac/mku/authcore/domain/model/ui/WidgetPosition;", "mode", "Lke/ac/mku/authcore/domain/model/ui/LayoutMode;", "<init>", "(Ljava/lang/String;JLke/ac/mku/authcore/domain/model/ui/ResponsiveGrid;Ljava/util/List;Lke/ac/mku/authcore/domain/model/ui/LayoutMode;)V", "getBlueprintId", "()Ljava/lang/String;", "getTimestamp", "()J", "getGrid", "()Lke/ac/mku/authcore/domain/model/ui/ResponsiveGrid;", "getWidgetPositions", "()Ljava/util/List;", "getMode", "()Lke/ac/mku/authcore/domain/model/ui/LayoutMode;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
public final class LayoutBlueprint {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String blueprintId = null;
    private final long timestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.domain.model.ui.ResponsiveGrid grid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ke.ac.mku.authcore.domain.model.ui.WidgetPosition> widgetPositions = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.domain.model.ui.LayoutMode mode = null;
    
    public LayoutBlueprint(@org.jetbrains.annotations.NotNull()
    java.lang.String blueprintId, long timestamp, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.ui.ResponsiveGrid grid, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.ui.WidgetPosition> widgetPositions, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.ui.LayoutMode mode) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBlueprintId() {
        return null;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.ui.ResponsiveGrid getGrid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.domain.model.ui.WidgetPosition> getWidgetPositions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.ui.LayoutMode getMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.ui.ResponsiveGrid component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.domain.model.ui.WidgetPosition> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.ui.LayoutMode component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.ui.LayoutBlueprint copy(@org.jetbrains.annotations.NotNull()
    java.lang.String blueprintId, long timestamp, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.ui.ResponsiveGrid grid, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.ui.WidgetPosition> widgetPositions, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.ui.LayoutMode mode) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}