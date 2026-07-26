package ke.ac.mku.authcore.security.diagnostic

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import javax.inject.Inject
import javax.inject.Singleton

/**
 * SECURITY-DIAG-001: Security Diagnostic Engine
 *
 * Singleton engine responsible for monitoring and analyzing security-related
 * platform events, specifically focusing on TLS/SSL handshake integrity.
 */
@Singleton
class SecurityDiagnosticEngine @Inject constructor(
    private val eventBus: EventBus
) : BootstrapObserver {

    companion object {
        private const val TAG = "SecurityDiagnostics"
    }

    init {
        eventBus.subscribe(this)
        Log.i(TAG, "Security Diagnostic Engine Initialized")
    }

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.CertificateVerified -> {
                Log.i(TAG, "TLS Diagnostic: Certificate verified for ${event.host}")
                Log.d(TAG, "Fingerprint: ${event.fingerprint}")
            }
            is BootstrapEvent.CertificateValidationFailed -> {
                Log.e(TAG, "TLS Diagnostic failure at ${event.host}")
                Log.e(TAG, "Reason: ${event.error} (Status: ${event.status})")
            }
            is BootstrapEvent.CertificatePinVerified -> {
                Log.i(TAG, "TLS Diagnostic: Pin matched for ${event.host}")
            }
            is BootstrapEvent.CertificatePinFailed -> {
                Log.e(TAG, "CRITICAL: Pin mismatch for ${event.host}")
                Log.e(TAG, "Expected: ${event.expectedPin}, Actual: ${event.actualPin}")
            }
            is BootstrapEvent.TlsHandshakeCompleted -> {
                val status = if (event.success) "SUCCESS" else "FAILED"
                Log.i(TAG, "Handshake analysis: $status for ${event.host} in ${event.durationMs}ms")
            }
            else -> {}
        }
    }

    fun generateReport(): String {
        return "Security Diagnostic Report v1.0.0 - All systems monitored."
    }
}
