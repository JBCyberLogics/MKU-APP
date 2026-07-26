package ke.ac.mku.authcore.domain.model.portal;

/**
 * ContextValidationModels - PROGRAM-015
 *
 * Models for Student Context validation results and repair actions.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u00c6\u0003J\t\u0010(\u001a\u00020\u000fH\u00c6\u0003J\t\u0010)\u001a\u00020\u0011H\u00c6\u0003Jk\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0014\u0010+\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010-\u001a\u00020.H\u00d6\u0081\u0004J\n\u0010/\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!\u00a8\u00060"}, d2 = {"Lke/ac/mku/authcore/domain/model/portal/ValidationResult;", "", "validationId", "", "status", "Lke/ac/mku/authcore/domain/model/portal/ValidationStatus;", "overallConfidence", "", "issues", "", "Lke/ac/mku/authcore/domain/model/portal/ValidationIssue;", "warnings", "repairs", "Lke/ac/mku/authcore/domain/model/portal/RepairAction;", "dashboardReady", "", "validatedAt", "", "<init>", "(Ljava/lang/String;Lke/ac/mku/authcore/domain/model/portal/ValidationStatus;FLjava/util/List;Ljava/util/List;Ljava/util/List;ZJ)V", "getValidationId", "()Ljava/lang/String;", "getStatus", "()Lke/ac/mku/authcore/domain/model/portal/ValidationStatus;", "getOverallConfidence", "()F", "getIssues", "()Ljava/util/List;", "getWarnings", "getRepairs", "getDashboardReady", "()Z", "getValidatedAt", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app"})
public final class ValidationResult {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String validationId = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.domain.model.portal.ValidationStatus status = null;
    private final float overallConfidence = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ke.ac.mku.authcore.domain.model.portal.ValidationIssue> issues = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> warnings = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ke.ac.mku.authcore.domain.model.portal.RepairAction> repairs = null;
    private final boolean dashboardReady = false;
    private final long validatedAt = 0L;
    
    public ValidationResult(@org.jetbrains.annotations.NotNull()
    java.lang.String validationId, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.ValidationStatus status, float overallConfidence, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.ValidationIssue> issues, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> warnings, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.RepairAction> repairs, boolean dashboardReady, long validatedAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getValidationId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.ValidationStatus getStatus() {
        return null;
    }
    
    public final float getOverallConfidence() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.domain.model.portal.ValidationIssue> getIssues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getWarnings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.domain.model.portal.RepairAction> getRepairs() {
        return null;
    }
    
    public final boolean getDashboardReady() {
        return false;
    }
    
    public final long getValidatedAt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.ValidationStatus component2() {
        return null;
    }
    
    public final float component3() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.domain.model.portal.ValidationIssue> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.domain.model.portal.RepairAction> component6() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final long component8() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.ValidationResult copy(@org.jetbrains.annotations.NotNull()
    java.lang.String validationId, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.ValidationStatus status, float overallConfidence, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.ValidationIssue> issues, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> warnings, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.RepairAction> repairs, boolean dashboardReady, long validatedAt) {
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