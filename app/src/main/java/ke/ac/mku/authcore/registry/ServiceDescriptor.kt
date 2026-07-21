package ke.ac.mku.authcore.registry

data class ServiceDescriptor(
    val name: String,
    val instance: Any,
    val dependencies: List<String>,
    val startupOrder: Int,
    val isRequired: Boolean
) {
    val state: ServiceState
        get() = _state

    private var _state: ServiceState = ServiceState.REGISTERED

    fun markResolved() {
        _state = ServiceState.RESOLVED
    }

    fun markValidated() {
        _state = ServiceState.VALIDATED
    }

    fun markFailed() {
        _state = ServiceState.FAILED
    }
}

enum class ServiceState {
    REGISTERED,
    RESOLVED,
    VALIDATED,
    FAILED
}