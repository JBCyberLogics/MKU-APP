package ke.ac.mku.authcore.manager;

/**
 * ConfidenceEngine - PROGRAM-007
 *
 * Scores classification results.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\b\u0007\u001a\u0002\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006\u00ca\u0001\u0002\b\u000e\u00a8\u0006\r"}, d2 = {"Lke/ac/mku/authcore/manager/ConfidenceEngine;", "", "<init>", "()V", "Ljavax/inject/Inject;", "calculateConfidence", "", "category", "Lke/ac/mku/authcore/domain/model/portal/EntityCategory;", "matchScore", "isAutoAcceptable", "", "score", "app", "Ljavax/inject/Singleton;"})
public final class ConfidenceEngine {
    
    @javax.inject.Inject()
    public ConfidenceEngine() {
        super();
    }
    
    public final float calculateConfidence(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.EntityCategory category, float matchScore) {
        return 0.0F;
    }
    
    public final boolean isAutoAcceptable(float score) {
        return false;
    }
}