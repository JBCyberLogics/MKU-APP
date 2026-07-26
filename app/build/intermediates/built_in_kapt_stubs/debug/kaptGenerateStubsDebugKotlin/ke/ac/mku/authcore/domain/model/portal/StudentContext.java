package ke.ac.mku.authcore.domain.model.portal;

/**
 * StudentContextModels - PROGRAM-011
 *
 * Models for the unified intelligent representation of a student.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\tH\u00c6\u0003J\t\u0010-\u001a\u00020\u000bH\u00c6\u0003J\t\u0010.\u001a\u00020\rH\u00c6\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003J\t\u00100\u001a\u00020\u0012H\u00c6\u0003J\t\u00101\u001a\u00020\u0014H\u00c6\u0003Ji\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u00c6\u0001J\u0014\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u00106\u001a\u000207H\u00d6\u0081\u0004J\n\u00108\u001a\u000209H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u0006:"}, d2 = {"Lke/ac/mku/authcore/domain/model/portal/StudentContext;", "", "student", "Lke/ac/mku/authcore/domain/model/portal/StudentProfileContext;", "academic", "Lke/ac/mku/authcore/domain/model/portal/AcademicContext;", "finance", "Lke/ac/mku/authcore/domain/model/portal/FinancialContext;", "learning", "Lke/ac/mku/authcore/domain/model/portal/LearningContext;", "campus", "Lke/ac/mku/authcore/domain/model/portal/CampusContext;", "activity", "Lke/ac/mku/authcore/domain/model/portal/ActivityContext;", "priorities", "", "Lke/ac/mku/authcore/domain/model/portal/ContextPriority;", "healthScore", "", "generatedAt", "", "<init>", "(Lke/ac/mku/authcore/domain/model/portal/StudentProfileContext;Lke/ac/mku/authcore/domain/model/portal/AcademicContext;Lke/ac/mku/authcore/domain/model/portal/FinancialContext;Lke/ac/mku/authcore/domain/model/portal/LearningContext;Lke/ac/mku/authcore/domain/model/portal/CampusContext;Lke/ac/mku/authcore/domain/model/portal/ActivityContext;Ljava/util/List;FJ)V", "getStudent", "()Lke/ac/mku/authcore/domain/model/portal/StudentProfileContext;", "getAcademic", "()Lke/ac/mku/authcore/domain/model/portal/AcademicContext;", "getFinance", "()Lke/ac/mku/authcore/domain/model/portal/FinancialContext;", "getLearning", "()Lke/ac/mku/authcore/domain/model/portal/LearningContext;", "getCampus", "()Lke/ac/mku/authcore/domain/model/portal/CampusContext;", "getActivity", "()Lke/ac/mku/authcore/domain/model/portal/ActivityContext;", "getPriorities", "()Ljava/util/List;", "getHealthScore", "()F", "getGeneratedAt", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"})
public final class StudentContext {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.domain.model.portal.StudentProfileContext student = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.domain.model.portal.AcademicContext academic = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.domain.model.portal.FinancialContext finance = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.domain.model.portal.LearningContext learning = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.domain.model.portal.CampusContext campus = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.domain.model.portal.ActivityContext activity = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ke.ac.mku.authcore.domain.model.portal.ContextPriority> priorities = null;
    private final float healthScore = 0.0F;
    private final long generatedAt = 0L;
    
    public StudentContext(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.StudentProfileContext student, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.AcademicContext academic, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.FinancialContext finance, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.LearningContext learning, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.CampusContext campus, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.ActivityContext activity, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.ContextPriority> priorities, float healthScore, long generatedAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.StudentProfileContext getStudent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.AcademicContext getAcademic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.FinancialContext getFinance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.LearningContext getLearning() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.CampusContext getCampus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.ActivityContext getActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.domain.model.portal.ContextPriority> getPriorities() {
        return null;
    }
    
    public final float getHealthScore() {
        return 0.0F;
    }
    
    public final long getGeneratedAt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.StudentProfileContext component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.AcademicContext component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.FinancialContext component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.LearningContext component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.CampusContext component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.ActivityContext component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.domain.model.portal.ContextPriority> component7() {
        return null;
    }
    
    public final float component8() {
        return 0.0F;
    }
    
    public final long component9() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.StudentContext copy(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.StudentProfileContext student, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.AcademicContext academic, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.FinancialContext finance, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.LearningContext learning, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.CampusContext campus, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.ActivityContext activity, @org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.ContextPriority> priorities, float healthScore, long generatedAt) {
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