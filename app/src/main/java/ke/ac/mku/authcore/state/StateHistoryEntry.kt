package ke.ac.mku.authcore.state

data class StateHistoryEntry(
    val timestamp: Long,
    val sourceModule: String,
    val previousState: RuntimeState,
    val newState: RuntimeState
)