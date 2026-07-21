interface ISessionRecoveryManager {
    fun recoverSession(): SessionRecoveryResult
    fun restoreBackup(): SessionRecoveryResult
    fun recreateSession(): SessionRecoveryResult
    fun abortRecovery(): Boolean
    fun getRecoveryState(): RecoveryState
    fun isRecoveryRunning(): Boolean
}