package ke.ac.mku.authcore.contracts.security

/**
 * ThreatReport - SECURITY-005
 *
 * Report of a detected security threat with risk assessment.
 */
data class ThreatReport(
    val category: ThreatCategory,
    val level: RiskLevel,
    val description: String,
    val detectedAt: Long = System.currentTimeMillis(),
    val source: String,
    val indicators: List<String> = emptyList(),
    val requiresImmediateAction: Boolean = level.action == Action.BLOCK_AND_RECOVER
) {
    val id: String
        get() = "${category.name}_${detectedAt}"

    companion object {
        /**
         * Create a threat report from a threat category.
         */
        fun fromCategory(
            category: ThreatCategory,
            source: String,
            indicators: List<String> = emptyList()
        ): ThreatReport {
            return ThreatReport(
                category = category,
                level = category.defaultRiskLevel,
                description = "${category.displayName}: ${indicators.firstOrNull() ?: "No additional details"}",
                source = source,
                indicators = indicators
            )
        }
    }
}