package ke.ac.mku.authcore.contracts.session;

import ke.ac.mku.authcore.domain.model.Session;

/**
 * How the session was recovered.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lke/ac/mku/authcore/contracts/session/RecoveryMethod;", "", "(Ljava/lang/String;I)V", "BACKUP_RESTORE", "REAUTHENTICATION", "CREDENTIAL_RECREATE", "NETWORK_RECOVERY", "RESTART_RECOVERY", "app_debug"})
public enum RecoveryMethod {
    /*public static final*/ BACKUP_RESTORE /* = new BACKUP_RESTORE() */,
    /*public static final*/ REAUTHENTICATION /* = new REAUTHENTICATION() */,
    /*public static final*/ CREDENTIAL_RECREATE /* = new CREDENTIAL_RECREATE() */,
    /*public static final*/ NETWORK_RECOVERY /* = new NETWORK_RECOVERY() */,
    /*public static final*/ RESTART_RECOVERY /* = new RESTART_RECOVERY() */;
    
    RecoveryMethod() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.contracts.session.RecoveryMethod> getEntries() {
        return null;
    }
}