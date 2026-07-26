package ke.ac.mku.authcore.manager;

/**
 * DeltaComputationEngine - PROGRAM-012
 *
 * Calculates minimal differences between context versions.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\b\u0007\u001a\u0002\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00ca\u0001\u0002\b\u000e\u00a8\u0006\r"}, d2 = {"Lke/ac/mku/authcore/manager/DeltaComputationEngine;", "", "<init>", "()V", "Ljavax/inject/Inject;", "computeDelta", "Lke/ac/mku/authcore/domain/model/portal/ContextDelta;", "old", "Lke/ac/mku/authcore/domain/model/portal/StudentContext;", "current", "changedDomains", "", "", "app", "Ljavax/inject/Singleton;"})
public final class DeltaComputationEngine {
    
    @javax.inject.Inject()
    public DeltaComputationEngine() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.ContextDelta computeDelta(@org.jetbrains.annotations.Nullable()
    ke.ac.mku.authcore.domain.model.portal.StudentContext old, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.StudentContext current, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> changedDomains) {
        return null;
    }
}