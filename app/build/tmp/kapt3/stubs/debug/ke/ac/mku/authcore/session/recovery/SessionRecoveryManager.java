package ke.ac.mku.authcore.session.recovery;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import kotlinx.coroutines.*;
import kotlinx.coroutines.flow.StateFlow;
import ke.ac.mku.authcore.bootstrap.BootstrapEvent;
import ke.ac.mku.authcore.bootstrap.BootstrapObserver;
import ke.ac.mku.authcore.bootstrap.EventBus;
import ke.ac.mku.authcore.contracts.authentication.AuthRequest;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine;
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager;
import ke.ac.mku.authcore.contracts.authentication.ISessionManager;
import ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager;
import ke.ac.mku.authcore.contracts.session.ISessionValidator;
import ke.ac.mku.authcore.contracts.session.RecoveryMethod;
import ke.ac.mku.authcore.contracts.session.RecoveryResult;
import ke.ac.mku.authcore.contracts.session.RecoveryState;
import ke.ac.mku.authcore.contracts.session.SessionRecoveryMetrics;
import ke.ac.mku.authcore.contracts.session.SessionValidationResult;
import ke.ac.mku.authcore.contracts.storage.ISecureStorageManager;
import ke.ac.mku.authcore.contracts.storage.StorageDomain;
import ke.ac.mku.authcore.registry.DependencyRegistry;
import ke.ac.mku.authcore.domain.model.Session;
import ke.ac.mku.authcore.recovery.CircuitBreaker;
import ke.ac.mku.authcore.recovery.CircuitBreakerState;
import ke.ac.mku.authcore.contracts.security.ISecurityMonitor;

/**
 * SESSION-003: Session Recovery Manager Implementation
 *
 * Orchestrates recovery of session state after failures.
 * Implements hybrid recovery strategy (event-driven + periodic).
 *
 * Recovery Pipeline (10 steps):
 * 1. Detect recovery trigger (event or periodic check)
 * 2. Set RECOVERY_PENDING state
 * 3. Load credentials from CREDENTIALS domain (if needed)
 * 4. Load backup from SESSIONS domain
 * 5. Validate backup via SessionValidator
 * 6. Restore via SessionManager.restoreSession()
 * 7. Verify restored session
 * 8. Re-authenticate if verification failed
 * 9. Restore cookies, portal state, sync with SessionManager
 * 10. Publish SessionRecoveryCompleted
 *
 * @param context Application context
 * @param sessionManager Session manager for restore operations
 * @param sessionValidator Session validator for integrity checks
 * @param authEngine Authentication engine for re-authentication
 * @param secureStorage Secure storage for credentials backup
 * @param securityMonitor Security monitoring for incident reporting
 * @param eventBus Event bus for publishing/receiving events
 * @param dependencyRegistry Dependency registry for DI
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00d4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 b2\u00020\u00012\u00020\u0002:\u0001bBM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\b\u0010*\u001a\u00020\u0018H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002J\u000e\u0010.\u001a\u00020/H\u0082@\u00a2\u0006\u0002\u00100J\"\u00101\u001a\u00020/2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,03H\u0082@\u00a2\u0006\u0002\u00104J\u000e\u00105\u001a\u00020/H\u0082@\u00a2\u0006\u0002\u00100J\u000e\u00106\u001a\u00020/H\u0082@\u00a2\u0006\u0002\u00100J\b\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u00020,H\u0002J\b\u0010:\u001a\u00020 H\u0016J\b\u0010;\u001a\u00020\u001aH\u0016J\u0018\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u000208H\u0002J\u0010\u0010@\u001a\u00020=2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010C\u001a\u00020=2\u0006\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020\u0018H\u0002J\u001d\u0010G\u001a\u00020=2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0IH\u0082\bJ\b\u0010J\u001a\u00020\u0018H\u0016J\u0010\u0010K\u001a\u0004\u0018\u00010,H\u0082@\u00a2\u0006\u0002\u00100J\u001c\u0010L\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,\u0018\u000103H\u0082@\u00a2\u0006\u0002\u00100J\u0010\u0010M\u001a\u00020=2\u0006\u0010N\u001a\u00020OH\u0016J\u001e\u0010P\u001a\u0010\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,\u0018\u0001032\u0006\u0010Q\u001a\u00020,H\u0002J\b\u0010R\u001a\u00020=H\u0002J\u000e\u0010S\u001a\u00020/H\u0082@\u00a2\u0006\u0002\u00100J\b\u0010T\u001a\u00020/H\u0016J\b\u0010U\u001a\u00020/H\u0016J\u0006\u0010V\u001a\u00020=J\b\u0010W\u001a\u00020/H\u0016J\u0010\u0010X\u001a\u00020=2\u0006\u0010Y\u001a\u00020ZH\u0002J\u0006\u0010[\u001a\u00020=J\b\u0010\\\u001a\u00020=H\u0002J\b\u0010]\u001a\u00020=H\u0002J\u0006\u0010^\u001a\u00020=J\u001d\u0010_\u001a\u00020=2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0IH\u0082\bJ\u0010\u0010`\u001a\u00020=2\u0006\u0010a\u001a\u00020\u001aH\u0002R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u00060$j\u0002`%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006c"}, d2 = {"Lke/ac/mku/authcore/session/recovery/SessionRecoveryManager;", "Lke/ac/mku/authcore/contracts/session/ISessionRecoveryManager;", "Lke/ac/mku/authcore/bootstrap/BootstrapObserver;", "context", "Landroid/content/Context;", "sessionManager", "Lke/ac/mku/authcore/contracts/authentication/ISessionManager;", "sessionValidator", "Lke/ac/mku/authcore/contracts/session/ISessionValidator;", "authEngine", "Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEngine;", "secureStorage", "Lke/ac/mku/authcore/contracts/storage/ISecureStorageManager;", "securityMonitor", "Lke/ac/mku/authcore/contracts/security/ISecurityMonitor;", "eventBus", "Lke/ac/mku/authcore/bootstrap/EventBus;", "dependencyRegistry", "Lke/ac/mku/authcore/registry/DependencyRegistry;", "authEventManager", "Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;", "(Landroid/content/Context;Lke/ac/mku/authcore/contracts/authentication/ISessionManager;Lke/ac/mku/authcore/contracts/session/ISessionValidator;Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEngine;Lke/ac/mku/authcore/contracts/storage/ISecureStorageManager;Lke/ac/mku/authcore/contracts/security/ISecurityMonitor;Lke/ac/mku/authcore/bootstrap/EventBus;Lke/ac/mku/authcore/registry/DependencyRegistry;Lke/ac/mku/authcore/contracts/authentication/IAuthenticationEventManager;)V", "_isRecoveryRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_recoveryState", "Lke/ac/mku/authcore/contracts/session/RecoveryState;", "credentialsAccessed", "handler", "Landroid/os/Handler;", "isSubscribed", "metrics", "Lke/ac/mku/authcore/contracts/session/SessionRecoveryMetrics;", "metricsLock", "", "periodicCheckRunnable", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "recoveryCircuitBreaker", "Lke/ac/mku/authcore/recovery/CircuitBreaker;", "recoveryScope", "Lkotlinx/coroutines/CoroutineScope;", "abortRecovery", "decryptCredentials", "", "encryptedData", "executeBackupRestore", "Lke/ac/mku/authcore/contracts/session/RecoveryResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeReauthentication", "credentials", "Lkotlin/Pair;", "(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRecoveryPipeline", "executeSessionRecreation", "getCurrentStep", "", "getDeviceId", "getMetrics", "getRecoveryState", "handleFailedRecovery", "", "lastError", "attempts", "handleRecoveryException", "throwable", "", "handleSuccessfulRecovery", "result", "Lke/ac/mku/authcore/contracts/session/RecoveryResult$Success;", "hasCredentialsBeenAccessed", "incrementMetric", "update", "Lkotlin/Function1;", "isRecoveryRunning", "loadBackupSessionJson", "loadCredentials", "onBootstrapEvent", "event", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "parseCredentials", "data", "performPeriodicHealthCheck", "performRecoveryStepByStep", "recoverSession", "recreateSession", "registerForEvents", "restoreBackup", "restoreCompleteContext", "session", "Lke/ac/mku/authcore/domain/model/Session;", "shutdown", "startPeriodicHealthCheck", "stopPeriodicHealthCheck", "unregisterFromEvents", "updateMetric", "updateState", "newState", "Companion", "app_debug"})
public final class SessionRecoveryManager implements ke.ac.mku.authcore.contracts.session.ISessionRecoveryManager, ke.ac.mku.authcore.bootstrap.BootstrapObserver {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.authentication.ISessionManager sessionManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.session.ISessionValidator sessionValidator = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine authEngine = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.storage.ISecureStorageManager secureStorage = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.security.ISecurityMonitor securityMonitor = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.bootstrap.EventBus eventBus = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.registry.DependencyRegistry dependencyRegistry = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager authEventManager = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "SessionRecoveryManager";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String CREDENTIALS_KEY = "session_credentials";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BACKUP_SESSION_KEY = "backup_session";
    private static final int MAX_RECOVERY_ATTEMPTS = 3;
    private static final int CIRCUIT_BREAKER_THRESHOLD = 3;
    private static final long PERIODIC_CHECK_INTERVAL_MS = 300000L;
    private static final long BACKOFF_BASE_MS = 1000L;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<ke.ac.mku.authcore.contracts.session.RecoveryState> _recoveryState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isRecoveryRunning = null;
    @org.jetbrains.annotations.NotNull()
    private ke.ac.mku.authcore.contracts.session.SessionRecoveryMetrics metrics;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object metricsLock = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.recovery.CircuitBreaker recoveryCircuitBreaker = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope recoveryScope = null;
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Runnable periodicCheckRunnable = null;
    private boolean isSubscribed = false;
    private boolean credentialsAccessed = false;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.session.recovery.SessionRecoveryManager.Companion Companion = null;
    
    public SessionRecoveryManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.ISessionManager sessionManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.session.ISessionValidator sessionValidator, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.IAuthenticationEngine authEngine, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.storage.ISecureStorageManager secureStorage, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.ISecurityMonitor securityMonitor, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.EventBus eventBus, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.DependencyRegistry dependencyRegistry, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager authEventManager) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public ke.ac.mku.authcore.contracts.session.RecoveryState getRecoveryState() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isRecoveryRunning() {
        return false;
    }
    
    /**
     * Registers for event notifications.
     * Called after BootstrapCompleted.
     */
    public final void registerForEvents() {
    }
    
    /**
     * Unregisters from event notifications.
     */
    public final void unregisterFromEvents() {
    }
    
    @java.lang.Override()
    public void onBootstrapEvent(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.BootstrapEvent event) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public ke.ac.mku.authcore.contracts.session.RecoveryResult recoverSession() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public ke.ac.mku.authcore.contracts.session.RecoveryResult restoreBackup() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public ke.ac.mku.authcore.contracts.session.RecoveryResult recreateSession() {
        return null;
    }
    
    @java.lang.Override()
    public boolean abortRecovery() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public ke.ac.mku.authcore.contracts.session.SessionRecoveryMetrics getMetrics() {
        return null;
    }
    
    private final java.lang.Object executeRecoveryPipeline(kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.contracts.session.RecoveryResult> $completion) {
        return null;
    }
    
    private final java.lang.Object performRecoveryStepByStep(kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.contracts.session.RecoveryResult> $completion) {
        return null;
    }
    
    private final java.lang.Object executeBackupRestore(kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.contracts.session.RecoveryResult> $completion) {
        return null;
    }
    
    private final java.lang.Object executeSessionRecreation(kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.contracts.session.RecoveryResult> $completion) {
        return null;
    }
    
    private final java.lang.Object executeReauthentication(kotlin.Pair<java.lang.String, java.lang.String> credentials, kotlin.coroutines.Continuation<? super ke.ac.mku.authcore.contracts.session.RecoveryResult> $completion) {
        return null;
    }
    
    private final java.lang.Object loadCredentials(kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.String, java.lang.String>> $completion) {
        return null;
    }
    
    private final java.lang.String decryptCredentials(java.lang.String encryptedData) {
        return null;
    }
    
    private final kotlin.Pair<java.lang.String, java.lang.String> parseCredentials(java.lang.String data) {
        return null;
    }
    
    private final java.lang.Object loadBackupSessionJson(kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    private final java.lang.String getDeviceId() {
        return null;
    }
    
    private final void restoreCompleteContext(ke.ac.mku.authcore.domain.model.Session session) {
    }
    
    private final boolean hasCredentialsBeenAccessed() {
        return false;
    }
    
    private final void updateState(ke.ac.mku.authcore.contracts.session.RecoveryState newState) {
    }
    
    private final int getCurrentStep() {
        return 0;
    }
    
    private final void handleSuccessfulRecovery(ke.ac.mku.authcore.contracts.session.RecoveryResult.Success result) {
    }
    
    private final void handleFailedRecovery(java.lang.String lastError, int attempts) {
    }
    
    private final void handleRecoveryException(java.lang.Throwable throwable) {
    }
    
    private final void incrementMetric(kotlin.jvm.functions.Function1<? super ke.ac.mku.authcore.contracts.session.SessionRecoveryMetrics, ke.ac.mku.authcore.contracts.session.SessionRecoveryMetrics> update) {
    }
    
    private final void updateMetric(kotlin.jvm.functions.Function1<? super ke.ac.mku.authcore.contracts.session.SessionRecoveryMetrics, ke.ac.mku.authcore.contracts.session.SessionRecoveryMetrics> update) {
    }
    
    private final void startPeriodicHealthCheck() {
    }
    
    private final void stopPeriodicHealthCheck() {
    }
    
    private final void performPeriodicHealthCheck() {
    }
    
    public final void shutdown() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lke/ac/mku/authcore/session/recovery/SessionRecoveryManager$Companion;", "", "()V", "BACKOFF_BASE_MS", "", "BACKUP_SESSION_KEY", "", "CIRCUIT_BREAKER_THRESHOLD", "", "CREDENTIALS_KEY", "MAX_RECOVERY_ATTEMPTS", "PERIODIC_CHECK_INTERVAL_MS", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}