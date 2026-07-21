package ke.ac.mku.authcore.health

/**
 * Health status for an individual component.
 */
data class ComponentHealth(
    val name: String,
    val level: HealthLevel,
    val message: String,
    val isAvailable: Boolean,
    val lastCheck: Long = System.currentTimeMillis(),
    val responseTimeMs: Long = 0,
    val failureCount: Int = 0,
    val recoveryCount: Int = 0
) {
    companion object {
        /**
         * Create a healthy component status.
         */
        fun healthy(name: String, message: String = "Operational"): ComponentHealth {
            return ComponentHealth(
                name = name,
                level = HealthLevel.HEALTHY,
                message = message,
                isAvailable = true
            )
        }

        /**
         * Create an offline component status.
         */
        fun offline(name: String, message: String): ComponentHealth {
            return ComponentHealth(
                name = name,
                level = HealthLevel.OFFLINE,
                message = message,
                isAvailable = false
            )
        }

        /**
         * Create a warning component status.
         */
        fun warning(name: String, message: String): ComponentHealth {
            return ComponentHealth(
                name = name,
                level = HealthLevel.WARNING,
                message = message,
                isAvailable = true
            )
        }

        /**
         * Create a critical component status.
         */
        fun critical(name: String, message: String): ComponentHealth {
            return ComponentHealth(
                name = name,
                level = HealthLevel.CRITICAL,
                message = message,
                isAvailable = false
            )
        }
    }
}