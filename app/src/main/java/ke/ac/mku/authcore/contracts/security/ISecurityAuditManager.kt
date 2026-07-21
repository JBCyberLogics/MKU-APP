package ke.ac.mku.authcore.contracts.security

/**
 * ISecurityAuditManager - SECURITY-005
 *
 * Centralized security audit logging interface.
 * Provides encrypted, integrity-protected audit logging with buffered persistence.
 *
 * Contract Reference: CORE-012, SECURITY-005
 */
interface ISecurityAuditManager {

    // ==================== LOGGING ====================

    /**
     * Log a security event to the audit buffer.
     * Events are buffered and periodically flushed to persistent storage.
     *
     * @param event The security event to log
     */
    fun logSecurityEvent(event: SecurityAuditEvent)

    /**
     * Log a security event with custom data.
     *
     * @param level Risk level of the event
     * @param category Event category
     * @param message Event message
     * @param metadata Additional metadata
     */
    fun logEvent(
        level: RiskLevel,
        category: String,
        message: String,
        metadata: Map<String, String> = emptyMap()
    )

    // ==================== PERSISTENCE ====================

    /**
     * Force flush the audit buffer to persistent storage.
     * Should be called on app shutdown or critical events.
     */
    fun flushAuditBuffer()

    /**
     * Get the current buffer size.
     *
     * @return Number of events in buffer
     */
    fun getBufferSize(): Int

    /**
     * Get the maximum buffer size.
     *
     * @return Maximum buffer capacity
     */
    fun getMaxBufferSize(): Int

    // ==================== QUERYING ====================

    /**
     * Get audit records matching the filter criteria.
     *
     * @param filter Filter criteria
     * @return List of matching audit records
     */
    fun getAuditRecords(filter: AuditFilter): List<AuditRecord>

    /**
     * Get the total count of audit records.
     *
     * @return Total number of audit records
     */
    fun getAuditCount(): Int

    /**
     * Get recent audit records.
     *
     * @param limit Maximum number to return
     * @return List of recent audit records
     */
    fun getRecentRecords(limit: Int = 50): List<AuditRecord>

    // ==================== MAINTENANCE ====================

    /**
     * Delete old audit records beyond retention period.
     *
     * @param retainDays Number of days to retain
     * @return Number of records deleted
     */
    fun cleanupOldRecords(retainDays: Int = 90): Int

    /**
     * Clear all audit records.
     */
    fun clearAllRecords()
}

/**
 * SecurityAuditEvent - SECURITY-005
 *
 * A security audit event to be logged.
 */
data class SecurityAuditEvent(
    val timestamp: Long = System.currentTimeMillis(),
    val level: RiskLevel,
    val category: String,
    val message: String,
    val source: String,
    val metadata: Map<String, String> = emptyMap()
)

/**
 * AuditRecord - SECURITY-005
 *
 * A persisted audit record.
 */
data class AuditRecord(
    val id: String,
    val timestamp: Long,
    val level: RiskLevel,
    val category: String,
    val message: String,
    val source: String,
    val integrityHash: String,
    val metadata: Map<String, String> = emptyMap()
)