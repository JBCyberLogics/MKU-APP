package ke.ac.mku.authcore.bootstrap;

import ke.ac.mku.authcore.contracts.session.SessionWarning;
import ke.ac.mku.authcore.recovery.CircuitBreakerState;
import ke.ac.mku.authcore.recovery.RecoveryStrategy;
import ke.ac.mku.authcore.state.AuthenticationState;
import ke.ac.mku.authcore.state.RuntimeState;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u00af\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0003\b\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0094\u0001\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrsttuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0092\u0002\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001\u00a0\u0001\u00a1\u0001\u00a2\u0001\u00a3\u0001\u00a4\u0001\u00a5\u0001\u00a6\u0001\u00a7\u0001\u00a8\u0001\u00a9\u0001\u00aa\u0001\u00ab\u0001\u00ac\u0001\u00ad\u0001\u00ae\u0001\u00af\u0001\u00b0\u0001\u00b1\u0001\u00b2\u0001\u00b3\u0001\u00b4\u0001\u00b5\u0001\u00b6\u0001\u00b7\u0001\u00b8\u0001\u00b9\u0001\u00ba\u0001\u00bb\u0001\u00bc\u0001\u00bd\u0001\u00be\u0001\u00bf\u0001\u00c0\u0001\u00c1\u0001\u00c2\u0001\u00c3\u0001\u00c4\u0001\u00c5\u0001\u00c6\u0001\u00c7\u0001\u00c8\u0001\u00c9\u0001\u00ca\u0001\u00cb\u0001\u00cc\u0001\u00cd\u0001\u00ce\u0001\u00cf\u0001\u00d0\u0001\u00d1\u0001\u00d2\u0001\u00d3\u0001\u00d4\u0001\u00d5\u0001\u00d6\u0001\u00d7\u0001\u00d8\u0001\u00d9\u0001\u00da\u0001\u00db\u0001\u00dc\u0001\u00dd\u0001\u00de\u0001\u00df\u0001\u00e0\u0001\u00e1\u0001\u00e2\u0001\u00e3\u0001\u00e4\u0001\u00e5\u0001\u00e6\u0001\u00e7\u0001\u00e8\u0001\u00e9\u0001\u00ea\u0001\u00eb\u0001\u00ec\u0001\u00ed\u0001\u00ee\u0001\u00ef\u0001\u00f0\u0001\u00f1\u0001\u00f2\u0001\u00f3\u0001\u00f4\u0001\u00f5\u0001\u00f6\u0001\u00f7\u0001\u00f8\u0001\u00f9\u0001\u00fa\u0001\u00fb\u0001\u00fc\u0001\u00fc\u0001\u00fd\u0001\u00fe\u0001\u00ff\u0001\u0080\u0002\u0081\u0002\u0082\u0002\u0083\u0002\u0084\u0002\u0085\u0002\u0086\u0002\u0087\u0002\u0088\u0002\u0089\u0002\u008a\u0002\u008b\u0002\u008c\u0002\u008d\u0002\u008e\u0002\u008f\u0002\u0090\u0002\u0091\u0002\u0092\u0002\u00a8\u0006\u0093\u0002"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "", "()V", "AuditRecorded", "AuthenticationCancelled", "AuthenticationCompleted", "AuthenticationCoreInitialized", "AuthenticationFailed", "AuthenticationProcessing", "AuthenticationReady", "AuthenticationRetrying", "AuthenticationStarted", "AuthenticationStateChanged", "AuthenticationStateExpired", "AuthenticationStateFailed", "AuthenticationStateInitialized", "AuthenticationStatePersisted", "AuthenticationStateRecovered", "AuthenticationStateRestored", "AuthenticationSuccess", "AuthenticationWarning", "BootstrapCompleted", "BootstrapFailed", "BootstrapStarted", "CacheExpired", "CertificateExpiring", "CertificatePinFailed", "CertificatePinVerified", "CertificateValidationFailed", "CertificateVerified", "CircuitClosed", "CircuitOpened", "CircuitStateChanged", "ComponentFailed", "ComponentRecovered", "ConfigurationLoaded", "ConfigurationValidated", "CpuWarning", "CriticalFailure", "DataDeleted", "DataRetrieved", "DataStored", "DependenciesResolved", "DiagnosticReportGenerated", "FeatureDisabled", "FeatureEnabled", "FeatureRegistered", "FeatureRegistryReady", "FeatureValidationFailed", "HealthMonitorReady", "HealthStatusChanged", "IntegrityFailed", "IntegrityFailure", "IntegrityVerified", "LoginAuthenticated", "LoginCancelled", "LoginCompleted", "LoginFailed", "LoginPortalConnected", "LoginSessionCreated", "LoginWorkflowProcessing", "LoginWorkflowStarted", "MemoryPressureDetected", "MemoryWarning", "NetworkWarning", "PlatformIntegrityVerified", "RecoveryCompleted", "RecoveryFailed", "RecoveryManagerReady", "RecoveryStarted", "RegistryReady", "ReinitializeServiceRequested", "ResourceWarning", "RetryFailed", "RetryStarted", "RollbackCompleted", "RollbackRequested", "RuntimeFailure", "RuntimeInitialized", "RuntimeReady", "RuntimeShutdown", "RuntimeWarning", "SecureConnectionEstablished", "SecureStorageReady", "SecurityIncidentCreated", "SecurityMonitorReady", "SecurityPlatformReady", "SecurityReportGenerated", "SecurityScanCompleted", "SecurityWarning", "ServiceRegistered", "ServiceRegistrationFailed", "ServiceResolved", "ServiceRestartRequested", "ServiceRestarted", "SessionBackupLoaded", "SessionCreated", "SessionCreating", "SessionExpired", "SessionExpiredDetected", "SessionExpiring", "SessionFailed", "SessionIntegrityFailed", "SessionIntegrityVerified", "SessionPlatformReady", "SessionReauthenticated", "SessionRecovered", "SessionRecoveryAborted", "SessionRecoveryCompleted", "SessionRecoveryFailed", "SessionRecoveryRequired", "SessionRecoveryStarted", "SessionRecreated", "SessionRefreshed", "SessionRefreshing", "SessionRestorationStarted", "SessionRestored", "SessionRestoring", "SessionTerminated", "SessionTerminating", "SessionValidating", "SessionValidationFailed", "SessionValidationPassed", "SessionValidationStarted", "SessionValidationWarning", "SessionValidatorReady", "StateChanged", "StateInitialized", "StateReset", "StateRestored", "StateValidationFailed", "StorageCleared", "StorageFailure", "StorageInitialized", "SystemRecovered", "ThreatDetected", "TlsHandshakeCompleted", "TrustManagerReady", "TrustViolationDetected", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuditRecorded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationCancelled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationCoreInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationProcessing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationRetrying;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateExpired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStatePersisted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationSuccess;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$BootstrapCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$BootstrapFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$BootstrapStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CacheExpired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificateExpiring;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificatePinFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificatePinVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificateValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificateVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CircuitClosed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CircuitOpened;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CircuitStateChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ComponentFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ComponentRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ConfigurationLoaded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ConfigurationValidated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CpuWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CriticalFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DataDeleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DataRetrieved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DataStored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DependenciesResolved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DiagnosticReportGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureDisabled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureEnabled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureRegistered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureRegistryReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$HealthMonitorReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$HealthStatusChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$IntegrityFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$IntegrityFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$IntegrityVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginAuthenticated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginCancelled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginPortalConnected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginSessionCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginWorkflowProcessing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginWorkflowStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MemoryPressureDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MemoryWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PlatformIntegrityVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryManagerReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RegistryReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ReinitializeServiceRequested;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ResourceWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RetryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RetryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RollbackCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RollbackRequested;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeShutdown;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecureConnectionEstablished;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecureStorageReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityIncidentCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityMonitorReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityPlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityReportGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityScanCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRegistered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRegistrationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceResolved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRestartRequested;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRestarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionBackupLoaded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionCreating;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionExpired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionExpiredDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionExpiring;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionIntegrityFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionIntegrityVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionPlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionReauthenticated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryAborted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryRequired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRefreshed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRefreshing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestorationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestoring;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionTerminated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionTerminating;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidating;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationPassed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidatorReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateReset;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StorageCleared;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StorageFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StorageInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SystemRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ThreatDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TlsHandshakeCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TrustManagerReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TrustViolationDetected;", "app_debug"})
public abstract class BootstrapEvent {
    
    private BootstrapEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuditRecorded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "count", "", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class AuditRecorded extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final int count = 0;
        
        public AuditRecorded(int count) {
        }
        
        public final int getCount() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuditRecorded copy(int count) {
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
     * Authentication was cancelled
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationCancelled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class AuthenticationCancelled extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationCancelled INSTANCE = null;
        
        private AuthenticationCancelled() {
        }
    }
    
    /**
     * Authentication process completed (success or failure)
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class AuthenticationCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationCompleted INSTANCE = null;
        
        private AuthenticationCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationCoreInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class AuthenticationCoreInitialized extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationCoreInitialized INSTANCE = null;
        
        private AuthenticationCoreInitialized() {
        }
    }
    
    /**
     * Authentication failed
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "errorCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class AuthenticationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorCode = null;
        
        public AuthenticationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, @org.jetbrains.annotations.Nullable()
        java.lang.String errorCode) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, @org.jetbrains.annotations.Nullable()
        java.lang.String errorCode) {
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
     * Authentication is processing a specific step
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationProcessing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "step", "", "(Ljava/lang/String;)V", "getStep", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class AuthenticationProcessing extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String step = null;
        
        public AuthenticationProcessing(@org.jetbrains.annotations.NotNull()
        java.lang.String step) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStep() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationProcessing copy(@org.jetbrains.annotations.NotNull()
        java.lang.String step) {
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
     * Authentication infrastructure is ready to process requests
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class AuthenticationReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationReady INSTANCE = null;
        
        private AuthenticationReady() {
        }
    }
    
    /**
     * Authentication is being retried
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationRetrying;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "attemptNumber", "", "maxAttempts", "(II)V", "getAttemptNumber", "()I", "getMaxAttempts", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class AuthenticationRetrying extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final int attemptNumber = 0;
        private final int maxAttempts = 0;
        
        public AuthenticationRetrying(int attemptNumber, int maxAttempts) {
        }
        
        public final int getAttemptNumber() {
            return 0;
        }
        
        public final int getMaxAttempts() {
            return 0;
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationRetrying copy(int attemptNumber, int maxAttempts) {
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
     * Authentication process has started
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class AuthenticationStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStarted INSTANCE = null;
        
        private AuthenticationStarted() {
        }
    }
    
    /**
     * Authentication state transitioned from one state to another
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "previous", "Lke/ac/mku/authcore/state/AuthenticationState;", "current", "(Lke/ac/mku/authcore/state/AuthenticationState;Lke/ac/mku/authcore/state/AuthenticationState;)V", "getCurrent", "()Lke/ac/mku/authcore/state/AuthenticationState;", "getPrevious", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class AuthenticationStateChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.AuthenticationState previous = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.AuthenticationState current = null;
        
        public AuthenticationStateChanged(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState previous, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState current) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState getPrevious() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState getCurrent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStateChanged copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState previous, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState current) {
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
     * Authentication session or token has expired
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateExpired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "previousState", "Lke/ac/mku/authcore/state/AuthenticationState;", "(Lke/ac/mku/authcore/state/AuthenticationState;)V", "getPreviousState", "()Lke/ac/mku/authcore/state/AuthenticationState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class AuthenticationStateExpired extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.AuthenticationState previousState = null;
        
        public AuthenticationStateExpired(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState previousState) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState getPreviousState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStateExpired copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState previousState) {
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
     * Authentication operation failed
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class AuthenticationStateFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public AuthenticationStateFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStateFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
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
     * Authentication state manager has been initialized
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class AuthenticationStateInitialized extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStateInitialized INSTANCE = null;
        
        private AuthenticationStateInitialized() {
        }
    }
    
    /**
     * Authentication state persisted to storage
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStatePersisted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "state", "Lke/ac/mku/authcore/state/AuthenticationState;", "(Lke/ac/mku/authcore/state/AuthenticationState;)V", "getState", "()Lke/ac/mku/authcore/state/AuthenticationState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class AuthenticationStatePersisted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.AuthenticationState state = null;
        
        public AuthenticationStatePersisted(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState state) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState getState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStatePersisted copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState state) {
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
     * Successfully recovered from an authentication failure
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "recoveredState", "Lke/ac/mku/authcore/state/AuthenticationState;", "(Lke/ac/mku/authcore/state/AuthenticationState;)V", "getRecoveredState", "()Lke/ac/mku/authcore/state/AuthenticationState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class AuthenticationStateRecovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.AuthenticationState recoveredState = null;
        
        public AuthenticationStateRecovered(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState recoveredState) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState getRecoveredState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStateRecovered copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState recoveredState) {
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
     * Authentication state restored from persistent storage
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationStateRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "state", "Lke/ac/mku/authcore/state/AuthenticationState;", "(Lke/ac/mku/authcore/state/AuthenticationState;)V", "getState", "()Lke/ac/mku/authcore/state/AuthenticationState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class AuthenticationStateRestored extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.AuthenticationState state = null;
        
        public AuthenticationStateRestored(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState state) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState getState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.AuthenticationState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationStateRestored copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.AuthenticationState state) {
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
     * Authentication completed successfully
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationSuccess;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "regNumber", "", "studentName", "(Ljava/lang/String;Ljava/lang/String;)V", "getRegNumber", "()Ljava/lang/String;", "getStudentName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class AuthenticationSuccess extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String regNumber = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String studentName = null;
        
        public AuthenticationSuccess(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber, @org.jetbrains.annotations.Nullable()
        java.lang.String studentName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRegNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStudentName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationSuccess copy(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber, @org.jetbrains.annotations.Nullable()
        java.lang.String studentName) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$AuthenticationWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class AuthenticationWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.AuthenticationWarning INSTANCE = null;
        
        private AuthenticationWarning() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$BootstrapCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class BootstrapCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.BootstrapCompleted INSTANCE = null;
        
        private BootstrapCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$BootstrapFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class BootstrapFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        
        public BootstrapFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.BootstrapFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$BootstrapStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class BootstrapStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.BootstrapStarted INSTANCE = null;
        
        private BootstrapStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CacheExpired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "key", "", "ttlMs", "", "(Ljava/lang/String;J)V", "getKey", "()Ljava/lang/String;", "getTtlMs", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class CacheExpired extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        private final long ttlMs = 0L;
        
        public CacheExpired(@org.jetbrains.annotations.NotNull()
        java.lang.String key, long ttlMs) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        public final long getTtlMs() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final long component2() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CacheExpired copy(@org.jetbrains.annotations.NotNull()
        java.lang.String key, long ttlMs) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificateExpiring;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "daysRemaining", "", "(Ljava/lang/String;I)V", "getDaysRemaining", "()I", "getHost", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class CertificateExpiring extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        private final int daysRemaining = 0;
        
        public CertificateExpiring(@org.jetbrains.annotations.NotNull()
        java.lang.String host, int daysRemaining) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        public final int getDaysRemaining() {
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
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CertificateExpiring copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host, int daysRemaining) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificatePinFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "expectedPin", "actualPin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActualPin", "()Ljava/lang/String;", "getExpectedPin", "getHost", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class CertificatePinFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String expectedPin = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String actualPin = null;
        
        public CertificatePinFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String expectedPin, @org.jetbrains.annotations.NotNull()
        java.lang.String actualPin) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getExpectedPin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getActualPin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CertificatePinFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String expectedPin, @org.jetbrains.annotations.NotNull()
        java.lang.String actualPin) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificatePinVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "(Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class CertificatePinVerified extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        
        public CertificatePinVerified(@org.jetbrains.annotations.NotNull()
        java.lang.String host) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CertificatePinVerified copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificateValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "error", "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getHost", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class CertificateValidationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String status = null;
        
        public CertificateValidationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String error, @org.jetbrains.annotations.NotNull()
        java.lang.String status) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStatus() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CertificateValidationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String error, @org.jetbrains.annotations.NotNull()
        java.lang.String status) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CertificateVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "fingerprint", "(Ljava/lang/String;Ljava/lang/String;)V", "getFingerprint", "()Ljava/lang/String;", "getHost", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class CertificateVerified extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fingerprint = null;
        
        public CertificateVerified(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String fingerprint) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFingerprint() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CertificateVerified copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String fingerprint) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CircuitClosed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class CircuitClosed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public CircuitClosed(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CircuitClosed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CircuitOpened;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class CircuitOpened extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public CircuitOpened(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CircuitOpened copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CircuitStateChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "previousState", "Lke/ac/mku/authcore/recovery/CircuitBreakerState;", "newState", "(Ljava/lang/String;Lke/ac/mku/authcore/recovery/CircuitBreakerState;Lke/ac/mku/authcore/recovery/CircuitBreakerState;)V", "getNewState", "()Lke/ac/mku/authcore/recovery/CircuitBreakerState;", "getPreviousState", "getServiceName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class CircuitStateChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.CircuitBreakerState previousState = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.CircuitBreakerState newState = null;
        
        public CircuitStateChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.CircuitBreakerState previousState, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.CircuitBreakerState newState) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.CircuitBreakerState getPreviousState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.CircuitBreakerState getNewState() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.CircuitBreakerState component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.CircuitBreakerState component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CircuitStateChanged copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.CircuitBreakerState previousState, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.CircuitBreakerState newState) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ComponentFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "component", "", "(Ljava/lang/String;)V", "getComponent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ComponentFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String component = null;
        
        public ComponentFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String component) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getComponent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ComponentFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String component) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ComponentRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "component", "", "(Ljava/lang/String;)V", "getComponent", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ComponentRecovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String component = null;
        
        public ComponentRecovered(@org.jetbrains.annotations.NotNull()
        java.lang.String component) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getComponent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ComponentRecovered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String component) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ConfigurationLoaded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class ConfigurationLoaded extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ConfigurationLoaded INSTANCE = null;
        
        private ConfigurationLoaded() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ConfigurationValidated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class ConfigurationValidated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ConfigurationValidated INSTANCE = null;
        
        private ConfigurationValidated() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CpuWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class CpuWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CpuWarning INSTANCE = null;
        
        private CpuWarning() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$CriticalFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class CriticalFailure extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.CriticalFailure INSTANCE = null;
        
        private CriticalFailure() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DataDeleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "key", "(Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class DataDeleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        
        public DataDeleted(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DataDeleted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DataRetrieved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "key", "success", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getDomain", "()Ljava/lang/String;", "getKey", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class DataRetrieved extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        private final boolean success = false;
        
        public DataRetrieved(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key, boolean success) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        public final boolean getSuccess() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DataRetrieved copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key, boolean success) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DataStored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "key", "(Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class DataStored extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        
        public DataStored(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DataStored copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DependenciesResolved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class DependenciesResolved extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DependenciesResolved INSTANCE = null;
        
        private DependenciesResolved() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$DiagnosticReportGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class DiagnosticReportGenerated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.DiagnosticReportGenerated INSTANCE = null;
        
        private DiagnosticReportGenerated() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureDisabled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "featureId", "", "(Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class FeatureDisabled extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String featureId = null;
        
        public FeatureDisabled(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeatureId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.FeatureDisabled copy(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureEnabled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "featureId", "", "(Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class FeatureEnabled extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String featureId = null;
        
        public FeatureEnabled(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeatureId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.FeatureEnabled copy(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureRegistered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "featureId", "", "(Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class FeatureRegistered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String featureId = null;
        
        public FeatureRegistered(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeatureId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.FeatureRegistered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureRegistryReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class FeatureRegistryReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.FeatureRegistryReady INSTANCE = null;
        
        private FeatureRegistryReady() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$FeatureValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "featureId", "", "reason", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class FeatureValidationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String featureId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public FeatureValidationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFeatureId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.FeatureValidationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String featureId, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$HealthMonitorReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class HealthMonitorReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.HealthMonitorReady INSTANCE = null;
        
        private HealthMonitorReady() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$HealthStatusChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class HealthStatusChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.HealthStatusChanged INSTANCE = null;
        
        private HealthStatusChanged() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$IntegrityFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "key", "(Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class IntegrityFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        
        public IntegrityFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.IntegrityFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$IntegrityFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "details", "", "(Ljava/lang/String;)V", "getDetails", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class IntegrityFailure extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String details = null;
        
        public IntegrityFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String details) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDetails() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.IntegrityFailure copy(@org.jetbrains.annotations.NotNull()
        java.lang.String details) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$IntegrityVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "key", "(Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getKey", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class IntegrityVerified extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String key = null;
        
        public IntegrityVerified(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKey() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.IntegrityVerified copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String key) {
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
     * User successfully authenticated via login workflow
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginAuthenticated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "regNumber", "", "(Ljava/lang/String;)V", "getRegNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class LoginAuthenticated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String regNumber = null;
        
        public LoginAuthenticated(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRegNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginAuthenticated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber) {
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
     * Login workflow was cancelled
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginCancelled;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class LoginCancelled extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginCancelled INSTANCE = null;
        
        private LoginCancelled() {
        }
    }
    
    /**
     * Login workflow completed successfully
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "regNumber", "", "(Ljava/lang/String;)V", "getRegNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class LoginCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String regNumber = null;
        
        public LoginCompleted(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRegNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginCompleted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber) {
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
     * Login workflow failed
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "errorCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class LoginFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorCode = null;
        
        public LoginFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, @org.jetbrains.annotations.Nullable()
        java.lang.String errorCode) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorCode() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, @org.jetbrains.annotations.Nullable()
        java.lang.String errorCode) {
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
     * Connected to student portal
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginPortalConnected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "portalUrl", "", "(Ljava/lang/String;)V", "getPortalUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class LoginPortalConnected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String portalUrl = null;
        
        public LoginPortalConnected(@org.jetbrains.annotations.NotNull()
        java.lang.String portalUrl) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPortalUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginPortalConnected copy(@org.jetbrains.annotations.NotNull()
        java.lang.String portalUrl) {
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
     * Session created for authenticated user
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginSessionCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "regNumber", "", "(Ljava/lang/String;)V", "getRegNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class LoginSessionCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String regNumber = null;
        
        public LoginSessionCreated(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRegNumber() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginSessionCreated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String regNumber) {
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
     * Login workflow is processing a specific step
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginWorkflowProcessing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "step", "", "(Ljava/lang/String;)V", "getStep", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class LoginWorkflowProcessing extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String step = null;
        
        public LoginWorkflowProcessing(@org.jetbrains.annotations.NotNull()
        java.lang.String step) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStep() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginWorkflowProcessing copy(@org.jetbrains.annotations.NotNull()
        java.lang.String step) {
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
     * Login workflow has started
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$LoginWorkflowStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class LoginWorkflowStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.LoginWorkflowStarted INSTANCE = null;
        
        private LoginWorkflowStarted() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MemoryPressureDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class MemoryPressureDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.MemoryPressureDetected INSTANCE = null;
        
        private MemoryPressureDetected() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$MemoryWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class MemoryWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.MemoryWarning INSTANCE = null;
        
        private MemoryWarning() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$NetworkWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class NetworkWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.NetworkWarning INSTANCE = null;
        
        private NetworkWarning() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$PlatformIntegrityVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class PlatformIntegrityVerified extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.PlatformIntegrityVerified INSTANCE = null;
        
        private PlatformIntegrityVerified() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "strategy", "Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "durationMs", "", "(Ljava/lang/String;Lke/ac/mku/authcore/recovery/RecoveryStrategy;J)V", "getDurationMs", "()J", "getServiceName", "()Ljava/lang/String;", "getStrategy", "()Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class RecoveryCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.RecoveryStrategy strategy = null;
        private final long durationMs = 0L;
        
        public RecoveryCompleted(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, long durationMs) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy getStrategy() {
            return null;
        }
        
        public final long getDurationMs() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy component2() {
            return null;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RecoveryCompleted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, long durationMs) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "strategy", "Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "error", "attempts", "", "(Ljava/lang/String;Lke/ac/mku/authcore/recovery/RecoveryStrategy;Ljava/lang/String;I)V", "getAttempts", "()I", "getError", "()Ljava/lang/String;", "getServiceName", "getStrategy", "()Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class RecoveryFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.RecoveryStrategy strategy = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        private final int attempts = 0;
        
        public RecoveryFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, @org.jetbrains.annotations.NotNull()
        java.lang.String error, int attempts) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy getStrategy() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        public final int getAttempts() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        public final int component4() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RecoveryFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, @org.jetbrains.annotations.NotNull()
        java.lang.String error, int attempts) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryManagerReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class RecoveryManagerReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RecoveryManagerReady INSTANCE = null;
        
        private RecoveryManagerReady() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RecoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "strategy", "Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "attempt", "", "(Ljava/lang/String;Lke/ac/mku/authcore/recovery/RecoveryStrategy;I)V", "getAttempt", "()I", "getServiceName", "()Ljava/lang/String;", "getStrategy", "()Lke/ac/mku/authcore/recovery/RecoveryStrategy;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class RecoveryStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.recovery.RecoveryStrategy strategy = null;
        private final int attempt = 0;
        
        public RecoveryStarted(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, int attempt) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy getStrategy() {
            return null;
        }
        
        public final int getAttempt() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.recovery.RecoveryStrategy component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RecoveryStarted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.recovery.RecoveryStrategy strategy, int attempt) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RegistryReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class RegistryReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RegistryReady INSTANCE = null;
        
        private RegistryReady() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ReinitializeServiceRequested;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ReinitializeServiceRequested extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public ReinitializeServiceRequested(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ReinitializeServiceRequested copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ResourceWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ResourceWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        public ResourceWarning(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ResourceWarning copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RetryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "error", "attempts", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getAttempts", "()I", "getError", "()Ljava/lang/String;", "getServiceName", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class RetryFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        private final int attempts = 0;
        
        public RetryFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        java.lang.String error, int attempts) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        public final int getAttempts() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RetryFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        java.lang.String error, int attempts) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RetryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "attempt", "", "maxAttempts", "(Ljava/lang/String;II)V", "getAttempt", "()I", "getMaxAttempts", "getServiceName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class RetryStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        private final int attempt = 0;
        private final int maxAttempts = 0;
        
        public RetryStarted(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, int attempt, int maxAttempts) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        public final int getAttempt() {
            return 0;
        }
        
        public final int getMaxAttempts() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int component3() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RetryStarted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, int attempt, int maxAttempts) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RollbackCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class RollbackCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RollbackCompleted INSTANCE = null;
        
        private RollbackCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RollbackRequested;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class RollbackRequested extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public RollbackRequested(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RollbackRequested copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class RuntimeFailure extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        
        public RuntimeFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RuntimeFailure copy(@org.jetbrains.annotations.NotNull()
        java.lang.String error) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class RuntimeInitialized extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RuntimeInitialized INSTANCE = null;
        
        private RuntimeInitialized() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class RuntimeReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RuntimeReady INSTANCE = null;
        
        private RuntimeReady() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeShutdown;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class RuntimeShutdown extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RuntimeShutdown INSTANCE = null;
        
        private RuntimeShutdown() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$RuntimeWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class RuntimeWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.RuntimeWarning INSTANCE = null;
        
        private RuntimeWarning() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecureConnectionEstablished;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "tlsVersion", "(Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getTlsVersion", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class SecureConnectionEstablished extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tlsVersion = null;
        
        public SecureConnectionEstablished(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String tlsVersion) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTlsVersion() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecureConnectionEstablished copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String tlsVersion) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecureStorageReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SecureStorageReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecureStorageReady INSTANCE = null;
        
        private SecureStorageReady() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityIncidentCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "incidentId", "", "level", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getIncidentId", "getLevel", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class SecurityIncidentCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String incidentId = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String level = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String description = null;
        
        public SecurityIncidentCreated(@org.jetbrains.annotations.NotNull()
        java.lang.String incidentId, @org.jetbrains.annotations.NotNull()
        java.lang.String level, @org.jetbrains.annotations.NotNull()
        java.lang.String description) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getIncidentId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecurityIncidentCreated copy(@org.jetbrains.annotations.NotNull()
        java.lang.String incidentId, @org.jetbrains.annotations.NotNull()
        java.lang.String level, @org.jetbrains.annotations.NotNull()
        java.lang.String description) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityMonitorReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SecurityMonitorReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecurityMonitorReady INSTANCE = null;
        
        private SecurityMonitorReady() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityPlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SecurityPlatformReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecurityPlatformReady INSTANCE = null;
        
        private SecurityPlatformReady() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityReportGenerated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "healthScore", "", "threatCount", "", "(FI)V", "getHealthScore", "()F", "getThreatCount", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class SecurityReportGenerated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        private final float healthScore = 0.0F;
        private final int threatCount = 0;
        
        public SecurityReportGenerated(float healthScore, int threatCount) {
        }
        
        public final float getHealthScore() {
            return 0.0F;
        }
        
        public final int getThreatCount() {
            return 0;
        }
        
        public final float component1() {
            return 0.0F;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecurityReportGenerated copy(float healthScore, int threatCount) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityScanCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SecurityScanCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecurityScanCompleted INSTANCE = null;
        
        private SecurityScanCompleted() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SecurityWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "message", "", "level", "(Ljava/lang/String;Ljava/lang/String;)V", "getLevel", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class SecurityWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String level = null;
        
        public SecurityWarning(@org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.String level) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SecurityWarning copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.NotNull()
        java.lang.String level) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRegistered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ServiceRegistered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public ServiceRegistered(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ServiceRegistered copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRegistrationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "error", "(Ljava/lang/String;Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "getServiceName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ServiceRegistrationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        
        public ServiceRegistrationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        java.lang.String error) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ServiceRegistrationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
        java.lang.String error) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceResolved;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ServiceResolved extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public ServiceResolved(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ServiceResolved copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRestartRequested;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ServiceRestartRequested extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public ServiceRestartRequested(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ServiceRestartRequested copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ServiceRestarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "serviceName", "", "(Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ServiceRestarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serviceName = null;
        
        public ServiceRestarted(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServiceName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ServiceRestarted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String serviceName) {
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
     * Session backup has been loaded from storage
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionBackupLoaded;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionBackupLoaded extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionBackupLoaded INSTANCE = null;
        
        private SessionBackupLoaded() {
        }
    }
    
    /**
     * Session was successfully created
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionCreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionCreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionCreated INSTANCE = null;
        
        private SessionCreated() {
        }
    }
    
    /**
     * Session creation has started
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionCreating;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionCreating extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionCreating INSTANCE = null;
        
        private SessionCreating() {
        }
    }
    
    /**
     * Session has expired
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionExpired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionExpired extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionExpired INSTANCE = null;
        
        private SessionExpired() {
        }
    }
    
    /**
     * Session expiration detected
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionExpiredDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionExpiredDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionExpiredDetected INSTANCE = null;
        
        private SessionExpiredDetected() {
        }
    }
    
    /**
     * Session expiry process has started
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionExpiring;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionExpiring extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionExpiring INSTANCE = null;
        
        private SessionExpiring() {
        }
    }
    
    /**
     * Session operation failed
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class SessionFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public SessionFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
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
     * Session integrity check failed (tampered or corrupted)
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionIntegrityFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class SessionIntegrityFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public SessionIntegrityFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionIntegrityFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
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
     * Session integrity verified successfully
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionIntegrityVerified;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionIntegrityVerified extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionIntegrityVerified INSTANCE = null;
        
        private SessionIntegrityVerified() {
        }
    }
    
    /**
     * Session platform is ready after recovery
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionPlatformReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionPlatformReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionPlatformReady INSTANCE = null;
        
        private SessionPlatformReady() {
        }
    }
    
    /**
     * Session was successfully re-authenticated
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionReauthenticated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionReauthenticated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionReauthenticated INSTANCE = null;
        
        private SessionReauthenticated() {
        }
    }
    
    /**
     * Session was successfully recovered from failure
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionRecovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRecovered INSTANCE = null;
        
        private SessionRecovered() {
        }
    }
    
    /**
     * Session recovery was aborted
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryAborted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionRecoveryAborted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRecoveryAborted INSTANCE = null;
        
        private SessionRecoveryAborted() {
        }
    }
    
    /**
     * Session recovery completed successfully
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionRecoveryCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRecoveryCompleted INSTANCE = null;
        
        private SessionRecoveryCompleted() {
        }
    }
    
    /**
     * Session recovery failed after all retry attempts
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "attempts", "", "(Ljava/lang/String;I)V", "getAttempts", "()I", "getReason", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class SessionRecoveryFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        private final int attempts = 0;
        
        public SessionRecoveryFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, int attempts) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final int getAttempts() {
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
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRecoveryFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, int attempts) {
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
     * Session requires recovery
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryRequired;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionRecoveryRequired extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRecoveryRequired INSTANCE = null;
        
        private SessionRecoveryRequired() {
        }
    }
    
    /**
     * Session recovery process has started
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecoveryStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionRecoveryStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRecoveryStarted INSTANCE = null;
        
        private SessionRecoveryStarted() {
        }
    }
    
    /**
     * Session was recreated from stored credentials
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRecreated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionRecreated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRecreated INSTANCE = null;
        
        private SessionRecreated() {
        }
    }
    
    /**
     * Session was successfully refreshed
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRefreshed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionRefreshed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRefreshed INSTANCE = null;
        
        private SessionRefreshed() {
        }
    }
    
    /**
     * Session refresh has started
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRefreshing;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionRefreshing extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRefreshing INSTANCE = null;
        
        private SessionRefreshing() {
        }
    }
    
    /**
     * Session restoration from backup has started
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestorationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionRestorationStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRestorationStarted INSTANCE = null;
        
        private SessionRestorationStarted() {
        }
    }
    
    /**
     * Session was successfully restored from backup
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionRestored extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRestored INSTANCE = null;
        
        private SessionRestored() {
        }
    }
    
    /**
     * Session was successfully restored from backup
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionRestored extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRestored INSTANCE = null;
        
        private SessionRestored() {
        }
    }
    
    /**
     * Session restoration from storage has started
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionRestoring;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionRestoring extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionRestoring INSTANCE = null;
        
        private SessionRestoring() {
        }
    }
    
    /**
     * Session was successfully terminated
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionTerminated;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionTerminated extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionTerminated INSTANCE = null;
        
        private SessionTerminated() {
        }
    }
    
    /**
     * Session termination has started
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionTerminating;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionTerminating extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionTerminating INSTANCE = null;
        
        private SessionTerminating() {
        }
    }
    
    /**
     * Session validation is in progress
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidating;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionValidating extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionValidating INSTANCE = null;
        
        private SessionValidating() {
        }
    }
    
    /**
     * Session validation failed
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class SessionValidationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public SessionValidationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionValidationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
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
     * Session validation passed (Valid or Warning)
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationPassed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionValidationPassed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionValidationPassed INSTANCE = null;
        
        private SessionValidationPassed() {
        }
    }
    
    /**
     * Session validation has started
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationStarted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionValidationStarted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionValidationStarted INSTANCE = null;
        
        private SessionValidationStarted() {
        }
    }
    
    /**
     * Session validation produced warnings
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidationWarning;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "warnings", "", "Lke/ac/mku/authcore/contracts/session/SessionWarning;", "(Ljava/util/List;)V", "getWarnings", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SessionValidationWarning extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> warnings = null;
        
        public SessionValidationWarning(@org.jetbrains.annotations.NotNull()
        java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> warnings) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> getWarnings() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionValidationWarning copy(@org.jetbrains.annotations.NotNull()
        java.util.List<ke.ac.mku.authcore.contracts.session.SessionWarning> warnings) {
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
     * Session validator is ready
     */
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SessionValidatorReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SessionValidatorReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SessionValidatorReady INSTANCE = null;
        
        private SessionValidatorReady() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateChanged;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "previous", "Lke/ac/mku/authcore/state/RuntimeState;", "current", "(Lke/ac/mku/authcore/state/RuntimeState;Lke/ac/mku/authcore/state/RuntimeState;)V", "getCurrent", "()Lke/ac/mku/authcore/state/RuntimeState;", "getPrevious", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class StateChanged extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.RuntimeState previous = null;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.state.RuntimeState current = null;
        
        public StateChanged(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.RuntimeState previous, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.RuntimeState current) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.RuntimeState getPrevious() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.RuntimeState getCurrent() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.RuntimeState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.state.RuntimeState component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StateChanged copy(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.RuntimeState previous, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.state.RuntimeState current) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class StateInitialized extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StateInitialized INSTANCE = null;
        
        private StateInitialized() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateReset;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class StateReset extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StateReset INSTANCE = null;
        
        private StateReset() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateRestored;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class StateRestored extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StateRestored INSTANCE = null;
        
        private StateRestored() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StateValidationFailed;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class StateValidationFailed extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        
        public StateValidationFailed(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StateValidationFailed copy(@org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StorageCleared;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "count", "", "(Ljava/lang/String;I)V", "getCount", "()I", "getDomain", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class StorageCleared extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        private final int count = 0;
        
        public StorageCleared(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, int count) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        public final int getCount() {
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
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StorageCleared copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, int count) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StorageFailure;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "error", "(Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getError", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class StorageFailure extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String error = null;
        
        public StorageFailure(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String error) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getError() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StorageFailure copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain, @org.jetbrains.annotations.NotNull()
        java.lang.String error) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$StorageInitialized;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "domain", "", "(Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class StorageInitialized extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String domain = null;
        
        public StorageInitialized(@org.jetbrains.annotations.NotNull()
        java.lang.String domain) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.StorageInitialized copy(@org.jetbrains.annotations.NotNull()
        java.lang.String domain) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$SystemRecovered;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class SystemRecovered extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.SystemRecovered INSTANCE = null;
        
        private SystemRecovered() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$ThreatDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "category", "", "level", "(Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getLevel", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ThreatDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String category = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String level = null;
        
        public ThreatDetected(@org.jetbrains.annotations.NotNull()
        java.lang.String category, @org.jetbrains.annotations.NotNull()
        java.lang.String level) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCategory() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.ThreatDetected copy(@org.jetbrains.annotations.NotNull()
        java.lang.String category, @org.jetbrains.annotations.NotNull()
        java.lang.String level) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TlsHandshakeCompleted;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "success", "", "durationMs", "", "(Ljava/lang/String;ZJ)V", "getDurationMs", "()J", "getHost", "()Ljava/lang/String;", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class TlsHandshakeCompleted extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        private final boolean success = false;
        private final long durationMs = 0L;
        
        public TlsHandshakeCompleted(@org.jetbrains.annotations.NotNull()
        java.lang.String host, boolean success, long durationMs) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        public final boolean getSuccess() {
            return false;
        }
        
        public final long getDurationMs() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final long component3() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.TlsHandshakeCompleted copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host, boolean success, long durationMs) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TrustManagerReady;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "()V", "app_debug"})
    public static final class TrustManagerReady extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        public static final ke.ac.mku.authcore.bootstrap.BootstrapEvent.TrustManagerReady INSTANCE = null;
        
        private TrustManagerReady() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapEvent$TrustViolationDetected;", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "host", "", "violation", "(Ljava/lang/String;Ljava/lang/String;)V", "getHost", "()Ljava/lang/String;", "getViolation", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class TrustViolationDetected extends ke.ac.mku.authcore.bootstrap.BootstrapEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String host = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String violation = null;
        
        public TrustViolationDetected(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String violation) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHost() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getViolation() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.bootstrap.BootstrapEvent.TrustViolationDetected copy(@org.jetbrains.annotations.NotNull()
        java.lang.String host, @org.jetbrains.annotations.NotNull()
        java.lang.String violation) {
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