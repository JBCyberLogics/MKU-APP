package ke.ac.mku.authcore.state;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\rH\u00c6\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006)"}, d2 = {"Lke/ac/mku/authcore/state/RuntimeState;", "", "application", "Lke/ac/mku/authcore/state/ApplicationState;", "authentication", "Lke/ac/mku/authcore/state/AuthenticationState;", "network", "Lke/ac/mku/authcore/state/NetworkState;", "portal", "Lke/ac/mku/authcore/state/PortalState;", "session", "Lke/ac/mku/authcore/state/SessionState;", "lastUpdated", "", "(Lke/ac/mku/authcore/state/ApplicationState;Lke/ac/mku/authcore/state/AuthenticationState;Lke/ac/mku/authcore/state/NetworkState;Lke/ac/mku/authcore/state/PortalState;Lke/ac/mku/authcore/state/SessionState;J)V", "getApplication", "()Lke/ac/mku/authcore/state/ApplicationState;", "getAuthentication", "()Lke/ac/mku/authcore/state/AuthenticationState;", "getLastUpdated", "()J", "getNetwork", "()Lke/ac/mku/authcore/state/NetworkState;", "getPortal", "()Lke/ac/mku/authcore/state/PortalState;", "getSession", "()Lke/ac/mku/authcore/state/SessionState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class RuntimeState {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.state.ApplicationState application = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.state.AuthenticationState authentication = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.state.NetworkState network = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.state.PortalState portal = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.state.SessionState session = null;
    private final long lastUpdated = 0L;
    
    public RuntimeState(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.ApplicationState application, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.AuthenticationState authentication, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.NetworkState network, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.PortalState portal, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.SessionState session, long lastUpdated) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.state.ApplicationState getApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.state.AuthenticationState getAuthentication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.state.NetworkState getNetwork() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.state.PortalState getPortal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.state.SessionState getSession() {
        return null;
    }
    
    public final long getLastUpdated() {
        return 0L;
    }
    
    public RuntimeState() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.state.ApplicationState component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.state.AuthenticationState component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.state.NetworkState component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.state.PortalState component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.state.SessionState component5() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.state.RuntimeState copy(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.ApplicationState application, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.AuthenticationState authentication, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.NetworkState network, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.PortalState portal, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.state.SessionState session, long lastUpdated) {
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