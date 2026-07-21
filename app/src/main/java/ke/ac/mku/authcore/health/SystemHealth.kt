package ke.ac.mku.authcore.health

/**
 * Aggregated system health status.
 */
data class SystemHealth(
    val overall: HealthLevel,
    val components: Map<String, ComponentHealth>,
    val memoryUsagePercent: Int,
    val cpuUsagePercent: Int,
    val lastUpdated: Long = System.currentTimeMillis(),
    val metrics: HealthMetrics
) {
    companion object {
        /**
         * Create initial/uninitialized system health.
         */
        fun initial(): SystemHealth {
            return SystemHealth(
                overall = HealthLevel.OFFLINE,
                components = emptyMap(),
                memoryUsagePercent = 0,
                cpuUsagePercent = 0,
                metrics = HealthMetrics.initial()
            )
        }

        /**
         * Create operational system health.
         */
        fun operational(
            components: Map<String, ComponentHealth>,
            memoryUsagePercent: Int,
            cpuUsagePercent: Int
        ): SystemHealth {
            val metrics = HealthMetrics.fromComponents(components.values.toList())
            val overall = calculateOverallHealth(components, memoryUsagePercent, cpuUsagePercent)

            return SystemHealth(
                overall = overall,
                components = components,
                memoryUsagePercent = memoryUsagePercent,
                cpuUsagePercent = cpuUsagePercent,
                metrics = metrics
            )
        }

        private fun calculateOverallHealth(
            components: Map<String, ComponentHealth>,
            memoryPercent: Int,
            cpuPercent: Int
        ): HealthLevel {
            // Check for offline/critical components
            if (components.values.any { it.level == HealthLevel.OFFLINE }) {
                return HealthLevel.CRITICAL
            }

            if (components.values.any { it.level == HealthLevel.CRITICAL }) {
                return HealthLevel.CRITICAL
            }

            // Check memory/cpu thresholds
            if (memoryPercent >= 90 || cpuPercent >= 95) {
                return HealthLevel.CRITICAL
            }

            // Check for degraded
            if (components.values.any { it.level == HealthLevel.DEGRADED }) {
                return HealthLevel.DEGRADED
            }

            // Check for warnings
            if (components.values.any { it.level == HealthLevel.WARNING } ||
                memoryPercent >= 75 || cpuPercent >= 80) {
                return HealthLevel.WARNING
            }

            // Check if all components are healthy
            if (components.values.all { it.level == HealthLevel.HEALTHY }) {
                return HealthLevel.HEALTHY
            }

            return HealthLevel.WARNING
        }
    }
}

/**
 * Health metrics summary.
 */
data class HealthMetrics(
    val totalComponents: Int,
    val healthyComponents: Int,
    val warningComponents: Int,
    val degradedComponents: Int,
    val criticalComponents: Int,
    val offlineComponents: Int
) {
    companion object {
        fun initial(): HealthMetrics {
            return HealthMetrics(
                totalComponents = 0,
                healthyComponents = 0,
                warningComponents = 0,
                degradedComponents = 0,
                criticalComponents = 0,
                offlineComponents = 0
            )
        }

        fun fromComponents(components: List<ComponentHealth>): HealthMetrics {
            return HealthMetrics(
                totalComponents = components.size,
                healthyComponents = components.count { it.level == HealthLevel.HEALTHY },
                warningComponents = components.count { it.level == HealthLevel.WARNING },
                degradedComponents = components.count { it.level == HealthLevel.DEGRADED },
                criticalComponents = components.count { it.level == HealthLevel.CRITICAL },
                offlineComponents = components.count { it.level == HealthLevel.OFFLINE }
            )
        }
    }
}