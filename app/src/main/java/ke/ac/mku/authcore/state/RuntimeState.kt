package ke.ac.mku.authcore.state

data class RuntimeState(
    val application: ApplicationState = ApplicationState.BOOTING,
    val authentication: AuthenticationState = AuthenticationState.UNAUTHENTICATED,
    val network: NetworkState = NetworkState.DISCONNECTED,
    val portal: PortalState = PortalState.UNKNOWN,
    val session: SessionState = SessionState.NONE,
    val lastUpdated: Long = System.currentTimeMillis()
)