package ke.ac.mku.authcore.security.monitor

import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.contracts.crypto.ICryptoManager
import ke.ac.mku.authcore.contracts.crypto.KeyAlias
import ke.ac.mku.authcore.contracts.security.Action
import ke.ac.mku.authcore.contracts.security.AuditFilter
import ke.ac.mku.authcore.contracts.security.AuditRecord
import ke.ac.mku.authcore.contracts.security.ISecurityAuditManager
import ke.ac.mku.authcore.contracts.security.RiskLevel
import ke.ac.mku.authcore.contracts.security.SecurityAuditEvent
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager
import ke.ac.mku.authcore.security.audit.SecurityAuditLogger
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.UUID
import java.util.concurrent.ConcurrentLinkedQueue
import javax.inject.Inject
import javax.inject.Singleton

/**
 * SecurityAuditManager - SECURITY-005
 *
 * Centralized security audit logging with buffered persistence.
 * Events are buffered in memory and periodically flushed to SecureStorageManager.
 */
@Singleton
class SecurityAuditManager @Inject constructor(
    @ApplicationContext private val context: android.content.Context,
    private val cryptoManager: ICryptoManager,
    private val secureStorage: ISecureStorageManager,
    private val auditLogger: SecurityAuditLogger,
    private val eventBus: EventBus
) : ISecurityAuditManager {

    companion object {
        private const val TAG = "SecurityAuditManager"
        private const val AUDIT_STORAGE_KEY = "security_audit_logs"
        private const val MAX_BUFFER_SIZE = 1000
        private const val FLUSH_INTERVAL_MS = 30_000L // 30 seconds
    }

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private val auditBuffer = ConcurrentLinkedQueue<SecurityAuditEvent>()
    private val persistedRecords = mutableListOf<AuditRecord>()

    @Volatile
    private var isInitialized = false

    private var totalRecordsWritten = 0

    init {
        initialize()
    }

    private fun initialize() {
        if (isInitialized) return

        // Load existing records from storage
        loadPersistedRecords()

        // Start periodic flush
        startPeriodicFlush()

        isInitialized = true
        Log.i(TAG, "SecurityAuditManager initialized with ${persistedRecords.size} existing records")
    }

    override fun logSecurityEvent(event: SecurityAuditEvent) {
        auditBuffer.add(event)
        auditLogger.logSecurityEvent(
            ke.ac.mku.authcore.security.audit.SecurityEvent.SecurityWarning(
                warning = "[${event.level.name}] ${event.category}: ${event.message}",
                source = event.source
            )
        )

        // Flush immediately for CRITICAL events
        if (event.level.action == Action.BLOCK_AND_RECOVER) {
            scope.launch {
                flushAuditBuffer()
            }
        }

        // Check buffer size
        if (auditBuffer.size >= MAX_BUFFER_SIZE) {
            scope.launch {
                flushAuditBuffer()
            }
        }
    }

    override fun logEvent(
        level: RiskLevel,
        category: String,
        message: String,
        metadata: Map<String, String>
    ) {
        val event = SecurityAuditEvent(
            level = level,
            category = category,
            message = message,
            source = "SecurityMonitor",
            metadata = metadata
        )
        logSecurityEvent(event)
    }

    override fun flushAuditBuffer() {
        if (auditBuffer.isEmpty()) return

        val eventsToFlush = mutableListOf<SecurityAuditEvent>()
        while (auditBuffer.isNotEmpty()) {
            auditBuffer.poll()?.let { eventsToFlush.add(it) }
        }

        if (eventsToFlush.isEmpty()) return

        // Convert to audit records with integrity hash
        val records = eventsToFlush.map { event ->
            val recordId = UUID.randomUUID().toString()
            val integrityData = "${event.timestamp}|${event.level.name}|${event.category}|${event.message}|${event.source}"
            val integrityHash = cryptoManager.hash(integrityData, ke.ac.mku.authcore.contracts.crypto.HashAlgorithm.SHA256)

            AuditRecord(
                id = recordId,
                timestamp = event.timestamp,
                level = event.level,
                category = event.category,
                message = event.message,
                source = event.source,
                integrityHash = integrityHash,
                metadata = event.metadata
            )
        }

        // Encrypt and persist
        persistRecords(records)

        totalRecordsWritten += records.size
        Log.d(TAG, "Flushed ${records.size} audit records. Total: $totalRecordsWritten")

        eventBus.publish(BootstrapEvent.AuditRecorded(totalRecordsWritten))
    }

    override fun getBufferSize(): Int = auditBuffer.size

    override fun getMaxBufferSize(): Int = MAX_BUFFER_SIZE

    override fun getAuditRecords(filter: AuditFilter): List<AuditRecord> {
        return persistedRecords
            .filter { record ->
                val timeMatch = (filter.startTime == null || record.timestamp >= filter.startTime) &&
                        (filter.endTime == null || record.timestamp <= filter.endTime)
                val levelMatch = filter.levels == null || filter.levels.contains(record.level)
                timeMatch && levelMatch
            }
            .take(filter.limit)
    }

    override fun getAuditCount(): Int = persistedRecords.size

    override fun getRecentRecords(limit: Int): List<AuditRecord> {
        return persistedRecords
            .sortedByDescending { it.timestamp }
            .take(limit)
    }

    override fun cleanupOldRecords(retainDays: Int): Int {
        val cutoffTime = System.currentTimeMillis() - (retainDays * 24 * 60 * 60 * 1000L)
        val initialSize = persistedRecords.size
        persistedRecords.removeAll { it.timestamp < cutoffTime }
        val removed = initialSize - persistedRecords.size

        if (removed > 0) {
            Log.i(TAG, "Cleaned up $removed old audit records")
            saveRecordsToStorage()
        }

        return removed
    }

    override fun clearAllRecords() {
        persistedRecords.clear()
        auditBuffer.clear()
        totalRecordsWritten = 0
        Log.i(TAG, "All audit records cleared")
    }

    private fun startPeriodicFlush() {
        scope.launch {
            while (true) {
                delay(FLUSH_INTERVAL_MS)
                flushAuditBuffer()
            }
        }
    }

    private fun persistRecords(records: List<AuditRecord>) {
        persistedRecords.addAll(records)

        // Keep only last 10000 records in memory
        while (persistedRecords.size > 10000) {
            persistedRecords.removeAt(0)
        }

        saveRecordsToStorage()
    }

    private fun saveRecordsToStorage() {
        try {
            // Serialize records to JSON
            val json = serializeRecords(persistedRecords)
            // Encrypt and store
            val encrypted = cryptoManager.encryptString(json, KeyAlias.STORAGE)
            secureStorage.storeToken(AUDIT_STORAGE_KEY, encrypted)
        } catch (e: Exception) {
            Log.e(TAG, "Failed to persist audit records: ${e.message}")
        }
    }

    private fun loadPersistedRecords() {
        try {
            val result = secureStorage.getToken(AUDIT_STORAGE_KEY)
            if (result.success && result.data != null) {
                val decrypted = cryptoManager.decryptString(result.data, KeyAlias.STORAGE)
                persistedRecords.clear()
                persistedRecords.addAll(deserializeRecords(decrypted))
                totalRecordsWritten = persistedRecords.size
                Log.d(TAG, "Loaded ${persistedRecords.size} audit records from storage")
            }
        } catch (e: Exception) {
            Log.w(TAG, "No existing audit records found or failed to load: ${e.message}")
        }
    }

    private fun serializeRecords(records: List<AuditRecord>): String {
        return records.joinToString("\n") { record ->
            "${record.id}|${record.timestamp}|${record.level.name}|${record.category}|${record.message}|${record.source}|${record.integrityHash}"
        }
    }

    private fun deserializeRecords(data: String): List<AuditRecord> {
        if (data.isBlank()) return emptyList()

        return data.split("\n").mapNotNull { line ->
            val parts = line.split("|")
            if (parts.size >= 7) {
                try {
                    AuditRecord(
                        id = parts[0],
                        timestamp = parts[1].toLong(),
                        level = RiskLevel.valueOf(parts[2]),
                        category = parts[3],
                        message = parts[4],
                        source = parts[5],
                        integrityHash = parts[6]
                    )
                } catch (e: Exception) {
                    null
                }
            } else null
        }
    }
}