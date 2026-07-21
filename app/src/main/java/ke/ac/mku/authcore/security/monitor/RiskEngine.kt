package ke.ac.mku.authcore.security.monitor

import android.util.Log
import ke.ac.mku.authcore.contracts.security.Action
import ke.ac.mku.authcore.contracts.security.RiskLevel
import ke.ac.mku.authcore.contracts.security.ThreatCategory
import ke.ac.mku.authcore.contracts.security.ThreatReport
import javax.inject.Inject
import javax.inject.Singleton

/**
 * RiskEngine - SECURITY-005
 *
 * Evaluates threats and determines appropriate actions based on risk levels.
 * Implements the hybrid threat enforcement policy.
 */
@Singleton
class RiskEngine @Inject constructor() {

    companion object {
        private const val TAG = "RiskEngine"
    }

    // Custom risk level overrides per threat category
    private val riskOverrides = mutableMapOf<ThreatCategory, RiskLevel>()

    /**
     * Evaluate a threat category and determine its risk level.
     *
     * @param category The threat category
     * @return The evaluated risk level
     */
    fun evaluateThreat(category: ThreatCategory): RiskLevel {
        return riskOverrides[category] ?: category.defaultRiskLevel
    }

    /**
     * Evaluate a threat report and determine its risk level.
     *
     * @param report The threat report
     * @return The evaluated risk level
     */
    fun evaluateThreat(report: ThreatReport): RiskLevel {
        return evaluateThreat(report.category)
    }

    /**
     * Determine the action to take based on risk level.
     *
     * @param level The risk level
     * @return The action to take
     */
    fun getAction(level: RiskLevel): Action {
        return level.action
    }

    /**
     * Process a threat report and determine what action to take.
     *
     * @param report The threat report
     * @return The action to take
     */
    fun processThreat(report: ThreatReport): Action {
        val level = evaluateThreat(report)
        val action = level.action

        Log.d(TAG, "Processing threat ${report.category.name}: level=$level, action=$action")

        return action
    }

    /**
     * Check if a threat level requires immediate blocking.
     *
     * @param level The risk level
     * @return true if operation should be blocked
     */
    fun shouldBlock(level: RiskLevel): Boolean {
        return level.action == Action.BLOCK_AND_RECOVER
    }

    /**
     * Check if a threat level requires notification.
     *
     * @param level The risk level
     * @return true if notification should be sent
     */
    fun shouldNotify(level: RiskLevel): Boolean {
        return level.action in listOf(Action.AUDIT_AND_NOTIFY, Action.BLOCK_AND_RECOVER)
    }

    /**
     * Check if a threat level requires warning.
     *
     * @param level The risk level
     * @return true if warning should be shown
     */
    fun shouldWarn(level: RiskLevel): Boolean {
        return level.action in listOf(Action.LOG_AND_WARN, Action.AUDIT_AND_NOTIFY, Action.BLOCK_AND_RECOVER)
    }

    /**
     * Override the default risk level for a threat category.
     *
     * @param category The threat category
     * @param level The custom risk level
     */
    fun setRiskOverride(category: ThreatCategory, level: RiskLevel) {
        riskOverrides[category] = level
        Log.i(TAG, "Set risk override for ${category.name}: $level")
    }

    /**
     * Remove risk override for a threat category.
     *
     * @param category The threat category
     */
    fun clearRiskOverride(category: ThreatCategory) {
        riskOverrides.remove(category)
    }

    /**
     * Clear all risk overrides.
     */
    fun clearAllOverrides() {
        riskOverrides.clear()
    }

    /**
     * Get the current risk override for a category.
     *
     * @param category The threat category
     * @return The override level or null if not overridden
     */
    fun getRiskOverride(category: ThreatCategory): RiskLevel? {
        return riskOverrides[category]
    }

    /**
     * Get the highest risk level from a list of threats.
     *
     * @param threats List of threat reports
     * @return The highest risk level
     */
    fun getHighestLevel(threats: List<ThreatReport>): RiskLevel {
        return threats.fold(RiskLevel.LOW) { highest, report ->
            RiskLevel.max(highest, evaluateThreat(report))
        }
    }

    /**
     * Filter threats by minimum risk level.
     *
     * @param threats List of threat reports
     * @param minimumLevel Minimum level to include
     * @return Filtered list
     */
    fun filterByMinimumLevel(threats: List<ThreatReport>, minimumLevel: RiskLevel): List<ThreatReport> {
        return threats.filter { evaluateThreat(it).priority >= minimumLevel.priority }
    }
}