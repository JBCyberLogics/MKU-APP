package ke.ac.mku.authcore.contracts.security

/**
 * RiskLevel - SECURITY-005
 *
 * Risk levels for threat evaluation with corresponding actions.
 */
enum class RiskLevel(
    val action: Action,
    val priority: Int
) {
    LOW(Action.LOG_ONLY, 0),
    MEDIUM(Action.LOG_AND_WARN, 1),
    HIGH(Action.AUDIT_AND_NOTIFY, 2),
    CRITICAL(Action.BLOCK_AND_RECOVER, 3);

    companion object {
        /**
         * Get the higher of two risk levels.
         */
        fun max(a: RiskLevel, b: RiskLevel): RiskLevel {
            return if (a.priority >= b.priority) a else b
        }

        /**
         * Get the lower of two risk levels.
         */
        fun min(a: RiskLevel, b: RiskLevel): RiskLevel {
            return if (a.priority <= b.priority) a else b
        }
    }
}

/**
 * Action - SECURITY-005
 *
 * Actions to take based on risk level.
 */
enum class Action {
    /** Log the event and continue execution */
    LOG_ONLY,

    /** Log the event and show warning to user */
    LOG_AND_WARN,

    /** Log, audit, and notify relevant systems */
    AUDIT_AND_NOTIFY,

    /** Block operation and invoke recovery workflow */
    BLOCK_AND_RECOVER
}