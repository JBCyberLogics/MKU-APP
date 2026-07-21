package ke.ac.mku.authcore.security.monitor

import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.contracts.security.IThreatMonitor
import ke.ac.mku.authcore.contracts.security.RiskLevel
import ke.ac.mku.authcore.contracts.security.ThreatCategory
import ke.ac.mku.authcore.contracts.security.ThreatReport
import ke.ac.mku.authcore.security.detection.ThreatDetector
import ke.ac.mku.authcore.security.detection.ThreatLevel
import ke.ac.mku.authcore.security.detection.ThreatType
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

/**
 * ThreatMonitor - SECURITY-005
 *
 * Wraps ThreatDetector and provides continuous threat monitoring.
 * Coordinates with RiskEngine for threat evaluation.
 */
@Singleton
class ThreatMonitor @Inject constructor(
    @ApplicationContext private val context: android.content.Context,
    private val threatDetector: ThreatDetector,
    private val riskEngine: RiskEngine,
    private val eventBus: EventBus
) : IThreatMonitor {

    companion object {
        private const val TAG = "ThreatMonitor"
        private const val DEFAULT_SCAN_INTERVAL_SECONDS = 60
    }

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private var monitoringJob: Job? = null

    @Volatile
    private var isMonitoring = false

    @Volatile
    private var monitoringIntervalSeconds = DEFAULT_SCAN_INTERVAL_SECONDS

    private var lastScanResults = emptyList<ThreatReport>()
    private var lastScanTime = 0L

    private val activeThreats = mutableListOf<ThreatReport>()

    override fun scanForThreats(): List<ThreatReport> {
        Log.d(TAG, "Starting security scan...")

        val threats = mutableListOf<ThreatReport>()

        // Run ThreatDetector assessment
        val assessment = threatDetector.assessThreats()

        // Convert ThreatDetector results to ThreatReports
        assessment.threats.forEach { threat ->
            val category = mapThreatTypeToCategory(threat.type)
            val report = ThreatReport(
                category = category,
                level = riskEngine.evaluateThreat(category),
                description = threat.description,
                source = "ThreatDetector",
                indicators = listOf(threat.description)
            )
            threats.add(report)
        }

        // Update state
        lastScanResults = threats
        lastScanTime = System.currentTimeMillis()
        activeThreats.clear()
        activeThreats.addAll(threats.filter { it.level.priority >= RiskLevel.MEDIUM.priority })

        // Publish events for detected threats
        threats.forEach { threat ->
            eventBus.publish(BootstrapEvent.ThreatDetected(threat.category.name, threat.level.name))
        }

        Log.i(TAG, "Security scan completed. Found ${threats.size} threats, ${activeThreats.size} active")
        eventBus.publish(BootstrapEvent.SecurityScanCompleted)

        return threats
    }

    /**
     * Map ThreatType to ThreatCategory.
     */
    private fun mapThreatTypeToCategory(type: ThreatType): ThreatCategory {
        return when (type) {
            ThreatType.ROOT_DETECTION -> ThreatCategory.ROOTED_DEVICE
            ThreatType.EMULATOR_DETECTION -> ThreatCategory.EMULATOR
            ThreatType.DEBUG_DETECTION -> ThreatCategory.DEBUGGER_ATTACHED
            ThreatType.HOOKING_DETECTION -> ThreatCategory.HOOK_FRAMEWORK
            ThreatType.TAMPERING_DETECTION -> ThreatCategory.APP_TAMPERING
            ThreatType.CERTIFICATE_BYPASS -> ThreatCategory.CERTIFICATE_BYPASS
            ThreatType.RUNTIME_INJECTION -> ThreatCategory.RUNTIME_INJECTION
            ThreatType.UNKNOWN_SOURCES -> ThreatCategory.UNKNOWN
            ThreatType.DEVELOPER_OPTIONS -> ThreatCategory.DEBUGGER_ATTACHED
            ThreatType.USB_DEBUGGING -> ThreatCategory.DEBUGGER_ATTACHED
            ThreatType.DEVICE_SPECIFICATION -> ThreatCategory.UNKNOWN
        }
    }

    override fun isThreatPresent(category: ThreatCategory): Boolean {
        // Quick check without full scan - use cached active threats
        val cached = activeThreats.find { it.category == category }
        if (cached != null) return true

        // Run targeted check using ThreatDetector assessment
        val assessment = threatDetector.assessThreats()
        val categoryToCheck = mapCategoryToThreatType(category)

        return assessment.threats.any { it.type == categoryToCheck }
    }

    /**
     * Map ThreatCategory to ThreatType for targeted checks.
     */
    private fun mapCategoryToThreatType(category: ThreatCategory): ThreatType {
        return when (category) {
            ThreatCategory.ROOTED_DEVICE -> ThreatType.ROOT_DETECTION
            ThreatCategory.EMULATOR -> ThreatType.EMULATOR_DETECTION
            ThreatCategory.DEBUGGER_ATTACHED -> ThreatType.DEBUG_DETECTION
            ThreatCategory.HOOK_FRAMEWORK -> ThreatType.HOOKING_DETECTION
            ThreatCategory.APP_TAMPERING -> ThreatType.TAMPERING_DETECTION
            ThreatCategory.CERTIFICATE_BYPASS -> ThreatType.CERTIFICATE_BYPASS
            ThreatCategory.RUNTIME_INJECTION -> ThreatType.RUNTIME_INJECTION
            ThreatCategory.SIGNATURE_MISMATCH -> ThreatType.TAMPERING_DETECTION
            ThreatCategory.MEMORY_MODIFICATION -> ThreatType.DEVICE_SPECIFICATION
            ThreatCategory.UNKNOWN -> ThreatType.DEVICE_SPECIFICATION
        }
    }

    override fun getLastScanResults(): List<ThreatReport> = lastScanResults

    override fun getLastScanTime(): Long = lastScanTime

    override fun startMonitoring() {
        if (isMonitoring) {
            Log.w(TAG, "Monitoring already active")
            return
        }

        isMonitoring = true
        monitoringJob = scope.launch {
            Log.i(TAG, "Starting continuous threat monitoring (interval: ${monitoringIntervalSeconds}s)")
            while (isActive && isMonitoring) {
                try {
                    scanForThreats()
                } catch (e: Exception) {
                    Log.e(TAG, "Error during monitoring scan: ${e.message}")
                }
                delay(monitoringIntervalSeconds * 1000L)
            }
        }
    }

    override fun stopMonitoring() {
        isMonitoring = false
        monitoringJob?.cancel()
        monitoringJob = null
        Log.i(TAG, "Threat monitoring stopped")
    }

    override fun isMonitoring(): Boolean = isMonitoring

    override fun getMonitoringInterval(): Int = monitoringIntervalSeconds

    override fun setMonitoringInterval(intervalSeconds: Int) {
        monitoringIntervalSeconds = intervalSeconds.coerceIn(10, 3600)
        Log.d(TAG, "Monitoring interval set to ${monitoringIntervalSeconds}s")
    }

    override fun getActiveThreatCount(): Int = activeThreats.size

    override fun getHighestActiveThreatLevel(): RiskLevel? {
        return activeThreats.maxByOrNull { it.level.priority }?.level
    }

    override fun clearThreatCache() {
        activeThreats.clear()
        lastScanResults = emptyList()
        lastScanTime = 0
    }

    private fun mapThreatLevelToCategory(threatLevel: ThreatLevel): ThreatCategory {
        return when (threatLevel) {
            ThreatLevel.CRITICAL -> ThreatCategory.APP_TAMPERING
            ThreatLevel.HIGH -> ThreatCategory.HOOK_FRAMEWORK
            ThreatLevel.MEDIUM -> ThreatCategory.DEBUGGER_ATTACHED
            ThreatLevel.LOW -> ThreatCategory.UNKNOWN
        }
    }
}