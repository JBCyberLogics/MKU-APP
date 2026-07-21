package ke.ac.mku.authcore.session.recovery

import ke.ac.mku.authcore.contracts.session.SessionRecoveryMetrics

/**
 * SESSION-003: Session Recovery Manager Metrics Implementation
 *
 * Provides metrics tracking for recovery operations.
 */
class SessionRecoveryManagerImpl(
    private val delegate: SessionRecoveryManager
) : ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager by delegate {

    fun getRecoveryMetrics(): SessionRecoveryMetrics {
        return delegate.getMetrics()
    }

    fun isCircuitBreakerOpen(): Boolean {
        return delegate.getMetrics().circuitBreakerOpen
    }

    fun getSuccessRate(): Float {
        return delegate.getMetrics().successRate
    }

    fun canAttemptRecovery(): Boolean {
        return delegate.getMetrics().canRecover
    }
}