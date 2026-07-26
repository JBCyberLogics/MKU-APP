package ke.ac.mku.authcore.contracts.portal;

/**
 * PORTAL-001: Portal Connector Contract
 *
 * Central gateway responsible for establishing, maintaining and terminating 
 * secure communication with the Student Portal.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0006\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&\u00a8\u0006\u000e\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IPortalConnector;", "", "connect", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disconnect", "reconnect", "isConnected", "", "getPortalState", "Lke/ac/mku/authcore/contracts/portal/PortalState;", "getPortalCapabilities", "", "", "app"})
public abstract interface IPortalConnector {
    
    /**
     * Establish secure connection to the portal.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object connect(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Terminate portal connection.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object disconnect(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Reconnect after connection failure.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object reconnect(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Determine portal connectivity.
     */
    public abstract boolean isConnected();
    
    /**
     * Return current portal state.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.portal.PortalState getPortalState();
    
    /**
     * Return supported portal capabilities.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getPortalCapabilities();
}