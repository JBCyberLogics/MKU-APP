package ke.ac.mku.authcore.contracts.security;

/**
 * ISecurityAuditManager - SECURITY-005
 *
 * Centralized security audit logging interface.
 * Provides encrypted, integrity-protected audit logging with buffered persistence.
 *
 * Contract Reference: CORE-012, SECURITY-005
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0003H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0003H&J6\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH&\u00a8\u0006\u001d"}, d2 = {"Lke/ac/mku/authcore/contracts/security/ISecurityAuditManager;", "", "cleanupOldRecords", "", "retainDays", "clearAllRecords", "", "flushAuditBuffer", "getAuditCount", "getAuditRecords", "", "Lke/ac/mku/authcore/contracts/security/AuditRecord;", "filter", "Lke/ac/mku/authcore/contracts/security/AuditFilter;", "getBufferSize", "getMaxBufferSize", "getRecentRecords", "limit", "logEvent", "level", "Lke/ac/mku/authcore/contracts/security/RiskLevel;", "category", "", "message", "metadata", "", "logSecurityEvent", "event", "Lke/ac/mku/authcore/contracts/security/SecurityAuditEvent;", "app_debug"})
public abstract interface ISecurityAuditManager {
    
    /**
     * Log a security event to the audit buffer.
     * Events are buffered and periodically flushed to persistent storage.
     *
     * @param event The security event to log
     */
    public abstract void logSecurityEvent(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.SecurityAuditEvent event);
    
    /**
     * Log a security event with custom data.
     *
     * @param level Risk level of the event
     * @param category Event category
     * @param message Event message
     * @param metadata Additional metadata
     */
    public abstract void logEvent(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.RiskLevel level, @org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> metadata);
    
    /**
     * Force flush the audit buffer to persistent storage.
     * Should be called on app shutdown or critical events.
     */
    public abstract void flushAuditBuffer();
    
    /**
     * Get the current buffer size.
     *
     * @return Number of events in buffer
     */
    public abstract int getBufferSize();
    
    /**
     * Get the maximum buffer size.
     *
     * @return Maximum buffer capacity
     */
    public abstract int getMaxBufferSize();
    
    /**
     * Get audit records matching the filter criteria.
     *
     * @param filter Filter criteria
     * @return List of matching audit records
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.contracts.security.AuditRecord> getAuditRecords(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.AuditFilter filter);
    
    /**
     * Get the total count of audit records.
     *
     * @return Total number of audit records
     */
    public abstract int getAuditCount();
    
    /**
     * Get recent audit records.
     *
     * @param limit Maximum number to return
     * @return List of recent audit records
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<ke.ac.mku.authcore.contracts.security.AuditRecord> getRecentRecords(int limit);
    
    /**
     * Delete old audit records beyond retention period.
     *
     * @param retainDays Number of days to retain
     * @return Number of records deleted
     */
    public abstract int cleanupOldRecords(int retainDays);
    
    /**
     * Clear all audit records.
     */
    public abstract void clearAllRecords();
    
    /**
     * ISecurityAuditManager - SECURITY-005
     *
     * Centralized security audit logging interface.
     * Provides encrypted, integrity-protected audit logging with buffered persistence.
     *
     * Contract Reference: CORE-012, SECURITY-005
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}