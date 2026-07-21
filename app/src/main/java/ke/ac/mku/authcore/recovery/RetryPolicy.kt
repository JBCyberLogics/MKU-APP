package ke.ac.mku.authcore.recovery

/**
 * RetryPolicy - CORE-011
 *
 * Configures retry behavior with exponential backoff and jitter.
 */
data class RetryPolicy(
    val initialDelayMs: Long = DEFAULT_INITIAL_DELAY,
    val maximumDelayMs: Long = DEFAULT_MAXIMUM_DELAY,
    val maximumAttempts: Int = DEFAULT_MAX_ATTEMPTS,
    val jitterEnabled: Boolean = DEFAULT_JITTER_ENABLED
) {
    companion object {
        const val DEFAULT_INITIAL_DELAY = 1000L
        const val DEFAULT_MAXIMUM_DELAY = 30000L
        const val DEFAULT_MAX_ATTEMPTS = 3
        const val DEFAULT_JITTER_ENABLED = true
    }

    /**
     * Calculate delay for a given attempt (1-indexed).
     */
    fun calculateDelay(attempt: Int): Long {
        // Exponential backoff: initialDelay * 2^(attempt-1)
        val exponentialDelay = initialDelayMs * (1 shl (attempt - 1))
        val cappedDelay = minOf(exponentialDelay, maximumDelayMs)

        return if (jitterEnabled) {
            // Add jitter: ±25% of the delay
            val jitterRange = cappedDelay / 4
            cappedDelay + (-jitterRange..jitterRange).random()
        } else {
            cappedDelay
        }
    }

    /**
     * Check if more attempts are allowed.
     */
    fun canRetry(attempt: Int): Boolean = attempt < maximumAttempts

    /**
     * Get delay for next attempt.
     */
    fun getNextDelay(currentAttempt: Int): Long = calculateDelay(currentAttempt + 1)
}

/**
 * Result of a retry operation.
 */
sealed class RetryResult<out T> {
    data class Success<T>(val value: T) : RetryResult<T>()
    data class Failure(val error: String, val attempts: Int) : RetryResult<Nothing>()
    object Retrying : RetryResult<Nothing>()
}

/**
 * Execute an operation with retry policy.
 */
class RetryManager(
    private val policy: RetryPolicy = RetryPolicy()
) {
    /**
     * Execute an operation with automatic retries.
     */
    suspend fun <T> execute(
        operation: suspend () -> T,
        onRetry: (suspend (attempt: Int, error: Throwable) -> Unit)? = null
    ): RetryResult<T> {
        var lastError: Throwable? = null

        repeat(policy.maximumAttempts) { attempt ->
            try {
                val result = operation()
                return RetryResult.Success(result)
            } catch (e: Throwable) {
                lastError = e

                if (!policy.canRetry(attempt + 1)) {
                    return RetryResult.Failure(
                        error = lastError?.message ?: "Unknown error",
                        attempts = attempt + 1
                    )
                }

                onRetry?.invoke(attempt + 1, e)

                // Delay before next attempt
                val delay = policy.calculateDelay(attempt + 1)
                kotlinx.coroutines.delay(delay)
            }
        }

        return RetryResult.Failure(
            error = lastError?.message ?: "Unknown error",
            attempts = policy.maximumAttempts
        )
    }
}