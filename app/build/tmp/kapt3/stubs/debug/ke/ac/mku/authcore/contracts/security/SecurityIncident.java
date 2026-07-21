package ke.ac.mku.authcore.contracts.security;

import java.util.UUID;

/**
 * SecurityIncident - SECURITY-005
 *
 * Represents a security incident that requires tracking and resolution.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0012J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\nH\u00c6\u0003J\t\u0010-\u001a\u00020\fH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u00c6\u0003J|\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\u000e\u00107\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0003J\t\u00108\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&\u00a8\u0006:"}, d2 = {"Lke/ac/mku/authcore/contracts/security/SecurityIncident;", "", "id", "", "level", "Lke/ac/mku/authcore/contracts/security/RiskLevel;", "category", "Lke/ac/mku/authcore/contracts/security/ThreatCategory;", "description", "timestamp", "", "resolved", "", "resolution", "resolvedAt", "recoveryActions", "", "source", "(Ljava/lang/String;Lke/ac/mku/authcore/contracts/security/RiskLevel;Lke/ac/mku/authcore/contracts/security/ThreatCategory;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;)V", "getCategory", "()Lke/ac/mku/authcore/contracts/security/ThreatCategory;", "getDescription", "()Ljava/lang/String;", "getId", "getLevel", "()Lke/ac/mku/authcore/contracts/security/RiskLevel;", "getRecoveryActions", "()Ljava/util/List;", "requiresImmediateAction", "getRequiresImmediateAction", "()Z", "getResolution", "getResolved", "getResolvedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSource", "getTimestamp", "()J", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lke/ac/mku/authcore/contracts/security/RiskLevel;Lke/ac/mku/authcore/contracts/security/ThreatCategory;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;)Lke/ac/mku/authcore/contracts/security/SecurityIncident;", "equals", "other", "hashCode", "", "resolve", "toString", "Companion", "app_debug"})
public final class SecurityIncident {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.security.RiskLevel level = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.contracts.security.ThreatCategory category = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    private final long timestamp = 0L;
    private final boolean resolved = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String resolution = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long resolvedAt = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> recoveryActions = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String source = null;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.contracts.security.SecurityIncident.Companion Companion = null;
    
    public SecurityIncident(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.RiskLevel level, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.ThreatCategory category, @org.jetbrains.annotations.NotNull()
    java.lang.String description, long timestamp, boolean resolved, @org.jetbrains.annotations.Nullable()
    java.lang.String resolution, @org.jetbrains.annotations.Nullable()
    java.lang.Long resolvedAt, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> recoveryActions, @org.jetbrains.annotations.NotNull()
    java.lang.String source) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.RiskLevel getLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.ThreatCategory getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    public final boolean getResolved() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResolution() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getResolvedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getRecoveryActions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSource() {
        return null;
    }
    
    /**
     * Mark the incident as resolved.
     */
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.SecurityIncident resolve(@org.jetbrains.annotations.NotNull()
    java.lang.String resolution) {
        return null;
    }
    
    public final boolean getRequiresImmediateAction() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.RiskLevel component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.ThreatCategory component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.contracts.security.SecurityIncident copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.RiskLevel level, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.security.ThreatCategory category, @org.jetbrains.annotations.NotNull()
    java.lang.String description, long timestamp, boolean resolved, @org.jetbrains.annotations.Nullable()
    java.lang.String resolution, @org.jetbrains.annotations.Nullable()
    java.lang.Long resolvedAt, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> recoveryActions, @org.jetbrains.annotations.NotNull()
    java.lang.String source) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lke/ac/mku/authcore/contracts/security/SecurityIncident$Companion;", "", "()V", "fromThreatReport", "Lke/ac/mku/authcore/contracts/security/SecurityIncident;", "report", "Lke/ac/mku/authcore/contracts/security/ThreatReport;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create a new incident from a threat report.
         */
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.contracts.security.SecurityIncident fromThreatReport(@org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.contracts.security.ThreatReport report) {
            return null;
        }
    }
}