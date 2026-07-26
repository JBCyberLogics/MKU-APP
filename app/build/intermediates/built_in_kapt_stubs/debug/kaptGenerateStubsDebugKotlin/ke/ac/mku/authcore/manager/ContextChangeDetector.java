package ke.ac.mku.authcore.manager;

/**
 * ContextChangeDetector - PROGRAM-012
 *
 * Detects modifications within the Student Context.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\b\u0007\u001a\u0002\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t\u00ca\u0001\u0002\b\f\u00a8\u0006\u000b"}, d2 = {"Lke/ac/mku/authcore/manager/ContextChangeDetector;", "", "<init>", "()V", "Ljavax/inject/Inject;", "detectChanges", "", "", "old", "Lke/ac/mku/authcore/domain/model/portal/StudentContext;", "current", "app", "Ljavax/inject/Singleton;"})
public final class ContextChangeDetector {
    
    @javax.inject.Inject()
    public ContextChangeDetector() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> detectChanges(@org.jetbrains.annotations.Nullable()
    ke.ac.mku.authcore.domain.model.portal.StudentContext old, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.StudentContext current) {
        return null;
    }
}