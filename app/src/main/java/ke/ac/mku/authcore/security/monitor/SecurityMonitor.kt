package ke.ac.mku.authcore.security.monitor

import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.contracts.security.Action
import ke.ac.mku.authcore.contracts.security.ISecurityAuditManager
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor
import ke.ac.mku.authcore.contracts.security.IThreatMonitor
import ke.ac.mku.authcore.contracts.security.RiskLevel
import ke.ac.mku.authcore.contracts.security.SecurityAuditEvent
import ke.ac.mku.authcore.contracts.security.SecurityIncident
import ke.ac.mku.authcore.contracts.security.SecurityMetrics
import ke.ac.mku.authcore.contracts.security.ThreatCategory
import ke.ac.mku.authcore.contracts.security.ThreatReport
import ke.ac.mku.authcore.contracts.security.ThreatCategory.APP_TAMPERING
import ke.ac.mku.authcore.contracts.security.ThreatCategory.CERTIFICATE_BYPASS
import ke.ac.mku.authcore.contracts.security.ThreatCategory.DEBUGGER_ATTACHED
import ke.ac.mku.authcore.contracts.security.ThreatCategory.EMULATOR
import ke.ac.mku.authcore.contracts.security.ThreatCategory.HOOK_FRAMEWORK
import ke.ac.mku.authcore.contracts.security.ThreatCategory.ROOTED_DEVICE
import ke.ac.mku.authcore.contracts.security.ThreatCategory.RUNTIME_INJECTION
import ke.ac.mku.authcore.contracts.security.ThreatCategory.SIGNATURE_MISMATCH
import ke.ac.mku.authcore.contracts.security.ThreatCategory.UNKNOWN
import javax.inject.Inject
import javax.inject.Singleton

/**
 * SecurityMonitor - SECURITY-005
 *
 * Main security orchestrator for the Authentication Platform.
 * Coordinates all security services and provides unified security monitoring.
 */
@Singleton
class SecurityMonitor @Inject constructor(
    @ApplicationContext private val context: android.content.Context,
    private val eventBus: EventBus,
    private val threatMonitor: ThreatMonitor,
    private val auditManager: SecurityAuditManager,
    private val integrityMonitor: IntegrityMonitor,
    private val incidentHandler: SecurityIncidentHandler,
    private val riskEngine: RiskEngine
) : ISecurityMonitor, BootstrapObserver {

    companion object {
        private const val TAG = "SecurityMonitor"
    }

    @Volatile
    private var isInitialized = false

    @Volatile
    private var platformReady = false

    private var totalScans = 0
    private var totalThreatsDetected = 0
    private var totalThreatsBlocked = 0
    private var totalIncidentsCreated = 0

    private val moduleReadyStatus = mutableMapOf(
        "CryptoManager" to false,
        "SecureStorageManager" to false,
        "CertificateTrustManager" to false,
        "ThreatDetector" to false
    )

    init {
        eventBus.subscribe(this)
    }

    override fun isInitialized(): Boolean = isInitialized

    override fun initialize(): Boolean {
        if (isInitialized) return true

        Log.i(TAG, "Initializing SecurityMonitor...")

        // Log initialization event
        auditManager.logEvent(
            level = RiskLevel.LOW,
            category = "SecurityMonitor",
            message = "SecurityMonitor initializing"
        )

        isInitialized = true
        eventBus.publish(BootstrapEvent.SecurityMonitorReady)

        Log.i(TAG, "SecurityMonitor initialized")
        return true
    }

    override fun performSecurityScan(): List<ThreatReport> {
        val threats = mutableListOf<ThreatReport>()

        // Run threat detection scan
        threats.addAll(threatMonitor.scanForThreats())

        // Run integrity verification
        val integrityIssues = integrityMonitor.verifyApplicationIntegrity()
        threats.addAll(integrityIssues)

        totalScans++
        totalThreatsDetected += threats.size

        // Process each threat
        threats.forEach { threat ->
            processThreat(threat)
        }

        // Update metrics
        updateMetrics()

        return threats
    }

    override fun isPlatformSecure(): Boolean {
        // Quick check without full scan
        return !incidentHandler.hasCriticalIncidents() &&
                integrityMonitor.isIntegrityIntact() &&
                areAllModulesReady()
    }

    override fun evaluateThreat(category: ThreatCategory): RiskLevel {
        return riskEngine.evaluateThreat(category)
    }

    override fun processThreat(report: ThreatReport): Action {
        val level = riskEngine.evaluateThreat(report)
        val action = level.action

        // Log the threat
        auditManager.logEvent(
            level = level,
            category = "ThreatDetected",
            message = "${report.category.displayName}: ${report.description}",
            metadata = mapOf(
                "source" to report.source,
                "indicators" to report.indicators.joinToString(",")
            )
        )

        // Handle based on action
        when (action) {
            Action.LOG_ONLY -> {
                Log.d(TAG, "LOW threat logged: ${report.category.name}")
            }
            Action.LOG_AND_WARN -> {
                Log.w(TAG, "MEDIUM threat detected: ${report.category.name}")
                eventBus.publish(BootstrapEvent.SecurityWarning(report.description, level.name))
            }
            Action.AUDIT_AND_NOTIFY -> {
                Log.w(TAG, "HIGH threat detected: ${report.category.name}")
                eventBus.publish(BootstrapEvent.SecurityWarning(report.description, level.name))
                incidentHandler.handleThreat(report)
                totalIncidentsCreated++
            }
            Action.BLOCK_AND_RECOVER -> {
                Log.e(TAG, "CRITICAL threat detected: ${report.category.name}")
                eventBus.publish(BootstrapEvent.SecurityWarning(report.description, level.name))
                incidentHandler.handleThreat(report)
                totalIncidentsCreated++
                totalThreatsBlocked++
            }
        }

        return action
    }

    override fun getActiveIncidents(): List<SecurityIncident> {
        return incidentHandler.getActiveIncidents()
    }

    override fun getAllIncidents(limit: Int): List<SecurityIncident> {
        return incidentHandler.getAllIncidents(limit)
    }

    override fun resolveIncident(incidentId: String, resolution: String): Boolean {
        return incidentHandler.resolveIncident(incidentId, resolution)
    }

    override fun getMetrics(): SecurityMetrics {
        return SecurityMetrics(
            totalScans = totalScans,
            threatsDetected = totalThreatsDetected,
            threatsBlocked = totalThreatsBlocked,
            incidentsCreated = totalIncidentsCreated,
            incidentsResolved = incidentHandler.getResolvedIncidents().size,
            auditRecordsWritten = auditManager.getAuditCount(),
            lastScanTime = threatMonitor.getLastScanTime(),
            lastThreatDetectionTime = if (totalThreatsDetected > 0) System.currentTimeMillis() else 0,
            platformHealthScore = calculateHealthScore(),
            securityEventsByLevel = getSecurityEventCounts(),
            isPlatformSecure = isPlatformSecure()
        )
    }

    override fun resetMetrics() {
        totalScans = 0
        totalThreatsDetected = 0
        totalThreatsBlocked = 0
        totalIncidentsCreated = 0
    }

    override fun areAllModulesReady(): Boolean {
        return moduleReadyStatus.values.all { it }
    }

    override fun getUnreadyModules(): List<String> {
        return moduleReadyStatus.filter { !it.value }.keys.toList()
    }

    override fun getPlatformStatus(): String {
        return buildString {
            appendLine("Security Platform Status")
            appendLine("========================")
            appendLine("Initialized: $isInitialized")
            appendLine("Platform Ready: $platformReady")
            appendLine("Modules Ready: ${moduleReadyStatus.values.count { it }}/${moduleReadyStatus.size}")
            appendLine("Active Incidents: ${incidentHandler.getActiveIncidentCount()}")
            appendLine("Critical Incidents: ${incidentHandler.getCriticalIncidentCount()}")
            appendLine("Threat Monitoring: ${if (threatMonitor.isMonitoring()) "Active" else "Inactive"}")
            appendLine("Health Score: ${"%.1f".format(calculateHealthScore() * 100)}%")
        }
    }

    // BootstrapObserver implementation
    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.TrustManagerReady -> {
                moduleReadyStatus["CertificateTrustManager"] = true
                checkAndPublishPlatformReady()
            }
            is BootstrapEvent.SecureStorageReady -> {
                moduleReadyStatus["SecureStorageManager"] = true
                checkAndPublishPlatformReady()
            }
            is BootstrapEvent.CryptoManagerReady -> {
                moduleReadyStatus["CryptoManager"] = true
                checkAndPublishPlatformReady()
            }
            is BootstrapEvent.ThreatDetectorReady -> {
                moduleReadyStatus["ThreatDetector"] = true
                checkAndPublishPlatformReady()
            }
            is BootstrapEvent.SecurityMonitorReady -> {
                // Our own initialization event
            }
            else -> { /* Ignore other events */ }
        }
    }

    private fun checkAndPublishPlatformReady() {
        if (!platformReady && areAllModulesReady()) {
            // Perform initial security scan
            val threats = performSecurityScan()

            if (threats.none { it.level == RiskLevel.CRITICAL }) {
                platformReady = true
                eventBus.publish(BootstrapEvent.SecurityPlatformReady)
                Log.i(TAG, "SECURITY PLATFORM READY - All modules verified")

                auditManager.logEvent(
                    level = RiskLevel.LOW,
                    category = "SecurityPlatform",
                    message = "Security platform ready - ${threats.size} threats detected in initial scan"
                )
            } else {
                Log.w(TAG, "Platform not ready - critical threats detected")
            }
        }
    }

    private fun updateMetrics() {
        // Metrics are updated incrementally in processThreat
    }

    private fun calculateHealthScore(): Float {
        val baseScore = 1.0f
        val incidentPenalty = (incidentHandler.getActiveIncidentCount() * 0.05f).coerceAtMost(0.3f)
        val criticalPenalty = if (incidentHandler.hasCriticalIncidents()) 0.5f else 0f
        val unreadyPenalty = (getUnreadyModules().size * 0.1f).coerceAtMost(0.2f)

        return (baseScore - incidentPenalty - criticalPenalty - unreadyPenalty).coerceIn(0f, 1f)
    }

    private fun getSecurityEventCounts(): Map<RiskLevel, Int> {
        val counts = mutableMapOf<RiskLevel, Int>()
        RiskLevel.entries.forEach { level ->
            counts[level] = 0
        }
        return counts
    }
}