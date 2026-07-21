package ke.ac.mku.authcore.contracts.session;

/**
 * SESSION-003: Session Recovery Result
 *
 * Represents the outcome of a session recovery attempt.
 * Five result types cover all recovery scenarios.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lke/ac/mku/authcore/contracts/session/RecoveryResult;", "", "<init>", "()V", "Success", "FallbackAuth", "Failed", "Aborted", "InProgress", "Lke/ac/mku/authcore/contracts/session/RecoveryResult$Aborted;", "Lke/ac/mku/authcore/contracts/session/RecoveryResult$Failed;", "Lke/ac/mku/authcore/contracts/session/RecoveryResult$FallbackAuth;", "Lke/ac/mku/authcore/contracts/session/RecoveryResult$InProgress;", "Lke/ac/mku/authcore/contracts/session/RecoveryResult$Success;", "app"})
public abstract class RecoveryResult {
    
    private RecoveryResult() {
        super();
    }
    
    /**
     * Recovery was aborted by caller or system.
     *
     * @param reason Why recovery was aborted
     * @param completedSteps Number of recovery steps completed before abort
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/contracts/session/RecoveryResult$Aborted;", "Lke/ac/mku/authcore/contracts/session/RecoveryResult;", "reason", "", "completedSteps", "", "<init>", "(Ljava/lang/String;I)V", "getReason", "()Ljava/lang/String;", "getCompletedSteps", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app"})
    public static final class Aborted extends ke.ac.mku.authcore.contracts.session.RecoveryResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        private final int completedSteps = 0;
        
        public Aborted(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, int completedSteps) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final int getCompletedSteps() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.RecoveryResult.Aborted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, int completedSteps) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * Recovery failed after all retry attempts.
     *
     * @param reason Why recovery failed
     * @param attempts Number of recovery attempts made
     * @param lastError The error from the last attempt
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lke/ac/mku/authcore/contracts/session/RecoveryResult$Failed;", "Lke/ac/mku/authcore/contracts/session/RecoveryResult;", "reason", "", "attempts", "", "lastError", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getAttempts", "()I", "getLastError", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app"})
    public static final class Failed extends ke.ac.mku.authcore.contracts.session.RecoveryResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        private final int attempts = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String lastError = null;
        
        public Failed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, int attempts, @org.jetbrains.annotations.NotNull()
        java.lang.String lastError) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final int getAttempts() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLastError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.RecoveryResult.Failed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, int attempts, @org.jetbrains.annotations.NotNull()
        java.lang.String lastError) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * Recovery failed but user can attempt interactive authentication.
     *
     * @param reason Why recovery failed
     * @param requiresInteraction True if user must provide credentials
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u00d6\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/contracts/session/RecoveryResult$FallbackAuth;", "Lke/ac/mku/authcore/contracts/session/RecoveryResult;", "reason", "", "requiresInteraction", "", "<init>", "(Ljava/lang/String;Z)V", "getReason", "()Ljava/lang/String;", "getRequiresInteraction", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "app"})
    public static final class FallbackAuth extends ke.ac.mku.authcore.contracts.session.RecoveryResult {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        private final boolean requiresInteraction = false;
        
        public FallbackAuth(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, boolean requiresInteraction) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final boolean getRequiresInteraction() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.RecoveryResult.FallbackAuth copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, boolean requiresInteraction) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * Recovery is already in progress.
     *
     * @param currentStep Current step in recovery pipeline
     * @param totalSteps Total steps in recovery pipeline
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/contracts/session/RecoveryResult$InProgress;", "Lke/ac/mku/authcore/contracts/session/RecoveryResult;", "currentStep", "", "totalSteps", "<init>", "(II)V", "getCurrentStep", "()I", "getTotalSteps", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app"})
    public static final class InProgress extends ke.ac.mku.authcore.contracts.session.RecoveryResult {
        private final int currentStep = 0;
        private final int totalSteps = 0;
        
        public InProgress(int currentStep, int totalSteps) {
        }
        
        public final int getCurrentStep() {
            return 0;
        }
        
        public final int getTotalSteps() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.RecoveryResult.InProgress copy(int currentStep, int totalSteps) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * Recovery completed successfully.
     * Session has been restored and validated.
     *
     * @param session The restored session
     * @param restoredAt Timestamp when restoration completed
     * @param method How recovery was accomplished
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019H\u00d6\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2 = {"Lke/ac/mku/authcore/contracts/session/RecoveryResult$Success;", "Lke/ac/mku/authcore/contracts/session/RecoveryResult;", "session", "Lke/ac/mku/authcore/domain/model/Session;", "restoredAt", "", "method", "Lke/ac/mku/authcore/contracts/session/RecoveryMethod;", "<init>", "(Lke/ac/mku/authcore/domain/model/Session;JLke/ac/mku/authcore/contracts/session/RecoveryMethod;)V", "getSession", "()Lke/ac/mku/authcore/domain/model/Session;", "getRestoredAt", "()J", "getMethod", "()Lke/ac/mku/authcore/contracts/session/RecoveryMethod;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app"})
    public static final class Success extends ke.ac.mku.authcore.contracts.session.RecoveryResult {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.domain.model.Session session = null;
        private final long restoredAt = 0L;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.contracts.session.RecoveryMethod method = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.domain.model.Session session, long restoredAt, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.contracts.session.RecoveryMethod method) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.domain.model.Session getSession() {
            return null;
        }
        
        public final long getRestoredAt() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.RecoveryMethod getMethod() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.domain.model.Session component1() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.RecoveryMethod component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.session.RecoveryResult.Success copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.domain.model.Session session, long restoredAt, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.contracts.session.RecoveryMethod method) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}