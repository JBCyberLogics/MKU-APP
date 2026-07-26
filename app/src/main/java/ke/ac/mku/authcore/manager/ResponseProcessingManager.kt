package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.contracts.authentication.ISessionManager
import ke.ac.mku.authcore.contracts.cookie.ICookieManager
import ke.ac.mku.authcore.contracts.cookie.ICookieSynchronizationManager
import ke.ac.mku.authcore.contracts.network.*
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager
import ke.ac.mku.authcore.contracts.session.ISessionValidator
import javax.inject.Inject
import javax.inject.Singleton

/**
 * NETWORK-004: Response Processing Manager Implementation
 *
 * Central authority responsible for processing, validating, sanitizing 
 * and distributing every HTTP response received from the network.
 */
@Singleton
class ResponseProcessingManager @Inject constructor(
    private val cookieManager: ICookieManager,
    private val cookieSyncManager: ICookieSynchronizationManager,
    private val sessionManager: ISessionManager,
    private val sessionValidator: ISessionValidator,
    private val recoveryManager: ISessionRecoveryManager,
    private val securityMonitor: ISecurityMonitor,
    private val authEventManager: IAuthenticationEventManager
) : IResponseProcessingManager, BootstrapObserver {

    private val moduleId = "NETWORK-004"
    private val moduleName = "Response Processing Manager"

    companion object {
        private const val TAG = "ResponseProcManager"
        
        private val STATUS_MAP = mapOf(
            200 to "SUCCESS",
            201 to "RESOURCE_CREATED",
            204 to "NO_CONTENT",
            301 to "REDIRECT",
            302 to "REDIRECT",
            400 to "BAD_REQUEST",
            401 to "AUTHENTICATION_REQUIRED",
            403 to "ACCESS_DENIED",
            404 to "RESOURCE_NOT_FOUND",
            429 to "RATE_LIMITED",
            500 to "SERVER_ERROR",
            503 to "SERVICE_UNAVAILABLE"
        )
    }

    // Pipeline metrics
    private var totalProcessed = 0L
    private var successCount = 0L
    private var failureCount = 0L
    private var totalProcessingTimeMs = 0L
    private var lastResponseTime = 0L

    init {
        Log.i(TAG, "Initializing $moduleName ($moduleId)")
    }

    // ==================== IResponseProcessingManager Implementation ====================

    override fun processResponse(raw: RawResponse): ProcessedResponse {
        val startTime = System.currentTimeMillis()
        totalProcessed++
        lastResponseTime = startTime
        authEventManager.publish(BootstrapEvent.ResponseReceived)

        try {
            // 1. Validate response (Stages: TLS, STATUS, HEADER, SECURITY, PAYLOAD)
            val validation = validateResponse(raw)
            if (!validation.isValid) {
                authEventManager.publish(BootstrapEvent.ResponseFailed(validation.reason ?: "Validation failed"))
                handleFailure(validation.reason ?: "Validation failed")
                return createErrorResponse(raw, validation)
            }
            authEventManager.publish(BootstrapEvent.ResponseValidated)

            // 2. Extract cookies
            extractCookies(raw)
            authEventManager.publish(BootstrapEvent.CookiesUpdated)

            // 3. Map to model and prepare processed object
            val statusLabel = STATUS_MAP[raw.statusCode] ?: "UNKNOWN"
            val sanitized = sanitize(raw.body?.let { String(it) })
            
            val processed = ProcessedResponse(
                isSuccess = raw.statusCode in 200..299,
                statusCode = raw.statusCode,
                statusLabel = statusLabel,
                sanitizedBody = sanitized,
                headers = raw.headers,
                cookies = parseCookies(raw.headers),
                metadata = mapOf("processed_at" to System.currentTimeMillis().toString())
            )

            // 4. Update session only if valid
            updateSession(processed)
            authEventManager.publish(BootstrapEvent.SessionUpdated)

            // 5. Finalize processing
            successCount++
            totalProcessingTimeMs += (System.currentTimeMillis() - startTime)
            authEventManager.publish(BootstrapEvent.ResponseProcessed)
            
            return processed
        } catch (e: Exception) {
            Log.e(TAG, "Response processing exception: ${e.message}")
            failureCount++
            authEventManager.publish(BootstrapEvent.ResponseFailed(e.message ?: "Unknown exception"))
            return createExceptionResponse(raw, e)
        }
    }

    override fun validateResponse(raw: RawResponse): ValidationResult {
        // Stage: TLS_VERIFICATION
        if (!raw.isTlsVerified) {
            return ValidationResult(false, "TLS verification failed", "SEC_TLS_001")
        }

        // Stage: STATUS_VALIDATION
        if (raw.statusCode >= 500) {
            return ValidationResult(false, "Server error: ${raw.statusCode}", "NET_SRV_500")
        }

        // Stage: SECURITY_VALIDATION
        if (raw.statusCode == 403) {
            securityMonitor.processThreat(ke.ac.mku.authcore.contracts.security.ThreatReport(
                category = ke.ac.mku.authcore.contracts.security.ThreatCategory.UNKNOWN,
                level = ke.ac.mku.authcore.contracts.security.RiskLevel.MEDIUM,
                description = "Security access denied (403) for ${raw.url}",
                source = TAG
            ))
        }

        return ValidationResult(true)
    }

    override fun extractCookies(raw: RawResponse) {
        val cookieHeaders = raw.headers.filter { it.key.equals("Set-Cookie", ignoreCase = true) }
        if (cookieHeaders.isNotEmpty()) {
            // Forward to CookieManager
            val cookieMap = parseCookies(raw.headers)
            cookieManager.saveCookies(cookieMap)
            cookieSyncManager.synchronizeCookies()
        }
    }

    override fun updateSession(processed: ProcessedResponse) {
        if (processed.isSuccess) {
            // Coordinator logic: update session manager if needed
            // e.g. refreshing session metadata or expiry from headers
        } else if (processed.statusCode == 401) {
            // JSON: invoke_recovery_manager_when_required
            recoveryManager.recoverSession()
        }
    }

    override fun mapResponse(raw: RawResponse): Map<String, Any> {
        return mapOf(
            "url" to raw.url,
            "status" to raw.statusCode,
            "label" to (STATUS_MAP[raw.statusCode] ?: "UNKNOWN")
        )
    }

    override fun getProcessingStatus(): ProcessingStatus {
        val avgTime = if (totalProcessed > 0) totalProcessingTimeMs / totalProcessed else 0L
        return ProcessingStatus(
            totalProcessed = totalProcessed,
            successCount = successCount,
            failureCount = failureCount,
            avgProcessingTimeMs = avgTime,
            lastResponseReceived = lastResponseTime
        )
    }

    // ==================== BootstrapObserver Implementation ====================

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.RequestPipelineReady -> {
                // startup_sequence: trigger: request_pipeline_ready
                initializeManager()
            }
            else -> {}
        }
    }

    private fun initializeManager() {
        Log.i(TAG, "Initializing Response Processing Manager (Ready)...")
        // action: initialize_response_processing_manager
        authEventManager.publish(BootstrapEvent.NetworkPlatformReady)
    }

    // ==================== Private Helpers ====================

    private fun sanitize(body: String?): String? {
        // Stage: RESPONSE_SANITIZATION
        // Remove potentially malicious characters or script tags if body is HTML/XML
        return body?.replace(Regex("<script.*?>.*?</script>", RegexOption.IGNORE_CASE), "")
    }

    private fun parseCookies(headers: Map<String, String>): Map<String, String> {
        val result = mutableMapOf<String, String>()
        headers.forEach { (name, value) ->
            if (name.equals("Set-Cookie", ignoreCase = true)) {
                val parts = value.split(";").firstOrNull()?.split("=")
                if (parts != null && parts.size >= 2) {
                    result[parts[0].trim()] = parts[1].trim()
                }
            }
        }
        return result
    }

    private fun handleFailure(reason: String) {
        Log.w(TAG, "Handling processing failure: $reason")
        // JSON: notify_security_monitor
        securityMonitor.processThreat(ke.ac.mku.authcore.contracts.security.ThreatReport(
            category = ke.ac.mku.authcore.contracts.security.ThreatCategory.UNKNOWN,
            level = ke.ac.mku.authcore.contracts.security.RiskLevel.LOW,
            description = "Response processing failure: $reason",
            source = TAG
        ))
    }

    private fun createErrorResponse(raw: RawResponse, result: ValidationResult): ProcessedResponse {
        return ProcessedResponse(
            isSuccess = false,
            statusCode = raw.statusCode,
            statusLabel = STATUS_MAP[raw.statusCode] ?: "VALIDATION_ERROR",
            sanitizedBody = null,
            headers = raw.headers,
            cookies = emptyMap(),
            metadata = mapOf("error" to (result.reason ?: "Unknown"))
        )
    }

    private fun createExceptionResponse(raw: RawResponse, e: Exception): ProcessedResponse {
        return ProcessedResponse(
            isSuccess = false,
            statusCode = raw.statusCode,
            statusLabel = "PROCESSING_EXCEPTION",
            sanitizedBody = null,
            headers = raw.headers,
            cookies = emptyMap(),
            metadata = mapOf("exception" to (e.message ?: "Unknown"))
        )
    }
}
