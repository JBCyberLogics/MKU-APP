package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.contracts.cookie.ICookieManager
import ke.ac.mku.authcore.contracts.network.IRequestPipelineManager
import ke.ac.mku.authcore.contracts.network.OutboundRequest
import ke.ac.mku.authcore.contracts.network.ProcessedRequest
import ke.ac.mku.authcore.contracts.network.PriorityLevel
import ke.ac.mku.authcore.contracts.network.PipelineStatus
import javax.inject.Inject
import javax.inject.Singleton

/**
 * NETWORK-003: Request Pipeline Manager Implementation
 *
 * Central request orchestration engine responsible for validating, enriching, prioritizing 
 * and preparing every outbound request before execution by the Authentication Network Service.
 */
@Singleton
class RequestPipelineManager @Inject constructor(
    private val cookieManager: ICookieManager,
    private val sessionManager: ISessionManager,
    private val authEventManager: IAuthenticationEventManager
) : IRequestPipelineManager, BootstrapObserver {

    private val moduleId = "NETWORK-003"
    private val moduleName = "Request Pipeline Manager"

    companion object {
        private const val TAG = "RequestPipelineManager"
        private val MAX_RETRIES = 3
    }

    // Pipeline metrics
    private var totalProcessed = 0
    private var validationFailures = 0
    private var totalLatencyMs = 0L
    private val priorityCounts = mutableMapOf<PriorityLevel, Int>()
    private var securityRejections = 0

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IRequestPipelineManager Implementation ====================

    override fun processRequest(request: OutboundRequest): ProcessedRequest? {
        val startTime = System.currentTimeMillis()
        totalProcessed++

        try {
            // 1. Validate request
            val validated = validateRequest(request)
            if (!validated.isValid) {
                validationFailures++
                return null
            }

            // 2. Enrich with headers and cookies
            val enriched = enrichRequest(request)

            // 3. Assign priority
            val prioritized = assignPriority(request)

            // 4. Prepare for execution
            val executionReady = prepareExecution(request)

            // 5. Assemble processed request
            val processed = ProcessedRequest(
                original = request,
                validated = validated,
                enriched = enriched,
                prioritized = prioritized,
                executionReady
            )

            // Update metrics
            val elapsed = System.currentTimeMillis() - startTime
            totalLatencyMs += elapsed
            val currentCount = priorityCounts[prioritized.priority] ?: 0
            priorityCounts[prioritized.priority] = currentCount + 1

            return processed
        } catch (e: Exception) {
            Log.e(TAG, "Request processing failed: ${e.message}")
            return null
        }
    }

    override fun validateRequest(request: OutboundRequest): ValidatedRequest {
        val errors = mutableListOf<String>()

        // Basic validation
        if (request.url.isBlank()) {
            errors.add("URL is required")
        }
        if (!request.url.startsWith("https://")) {
            errors.add("Only HTTPS URLs are allowed")
        }
        if (request.method.isBlank()) {
            errors.add("HTTP method is required")
        }

        return ValidatedRequest(
            original = request,
            isValid = errors.isEmpty(),
            validationErrors = errors.toList()
        )
    }

    override fun enrichRequest(request: OutboundRequest): EnrichedRequest {
        // Get current cookies from CookieManager
        val cookies = cookieManager.getAllCookies()

        // Get session info for headers
        val sessionId = sessionManager.getSessionId() ?: ""
        val userAgent = "MKU-AuthClient/1.0"

        val headers = mutableMapOf<String, String>()
        headers["User-Agent"] = userAgent
        if (sessionId.isNotEmpty()) {
            headers["X-Session-ID"] = sessionId
        }
        headers["X-Request-Timestamp"] = request.timestamp.toString()

        return EnrichedRequest(
            original = request,
            headers = headers.toMap(),
            cookies = cookies,
            metadata = mapOf(
                "processed_at" to System.currentTimeMillis().toString(),
                "pipeline_version" to "1.0.0"
            )
        )
    }

    override fun assignPriority(request: OutboundRequest): PrioritizedRequest {
        // Simple priority logic based on endpoint
        val priority = when {
            request.url.contains("/auth/login") -> PriorityLevel.CRITICAL
            request.url.contains("/token/refresh") -> PriorityLevel.HIGH
            request.url.contains("/session/validate") -> PriorityLevel.NORMAL
            request.url.contains("/logout") -> PriorityLevel.LOW
            else -> PriorityLevel.BACKGROUND
        }
        return PrioritizedRequest(original = request, priority = priority)
    }

    override fun prepareExecution(request: OutboundRequest): ExecutionReadyRequest {
        // In a real implementation, this would add signatures, timestamps, etc.
        return ExecutionReadyRequest(
            original = request,
            finalUrl = request.url,
            finalHeaders = emptyMap(), // Would be populated from enrichment in practice
            finalBody = request.body,
            signatures = emptyMap()
        )
    }

    override fun getPipelineStatus(): PipelineStatus {
        val avgLatency = if (totalProcessed > 0) totalLatencyMs / totalProcessed else 0L
        return PipelineStatus(
            totalProcessed = totalProcessed,
            validationFailures = validationFailures,
            averageLatencyMs = avgLatency,
            priorityDistribution = priorityCounts.toMap(),
            securityRejections = securityRejections
        )
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.SessionPlatformReady -> {
                // Pipeline initializes after session platform is ready
                // No specific initialization needed for this stateless pipeline
            }
            else -> {}
        }
    }
}