package ke.ac.mku.authcore.contracts.session

import ke.ac.mku.authcore.state.SessionState

/**
 * SessionTransition - SESSION-001
 *
 * Record of a session state transition.
 *
 * @property fromState The state before transition
 * @property toState The state after transition
 * @property timestamp When the transition occurred
 * @property success Whether the transition was successful
 * @property reason Reason for failure (if applicable)
 * @property correlationId Unique identifier for correlating events
 */
data class SessionTransition(
    val fromState: SessionState,
    val toState: SessionState,
    val timestamp: Long,
    val success: Boolean,
    val reason: String? = null,
    val correlationId: String
)