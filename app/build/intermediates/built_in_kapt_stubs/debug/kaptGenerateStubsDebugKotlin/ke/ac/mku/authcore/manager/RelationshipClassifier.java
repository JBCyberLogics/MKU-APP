package ke.ac.mku.authcore.manager;

/**
 * RelationshipClassifier - PROGRAM-009
 *
 * Categorizes and scores discovered links.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\b\u0007\u001a\u0002\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006\u00ca\u0001\u0002\b\u000e\u00a8\u0006\r"}, d2 = {"Lke/ac/mku/authcore/manager/RelationshipClassifier;", "", "<init>", "()V", "Ljavax/inject/Inject;", "classify", "Lke/ac/mku/authcore/domain/model/portal/EntityRelationshipType;", "sourceType", "", "targetType", "calculateConfidence", "", "relType", "app", "Ljavax/inject/Singleton;"})
public final class RelationshipClassifier {
    
    @javax.inject.Inject()
    public RelationshipClassifier() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.domain.model.portal.EntityRelationshipType classify(@org.jetbrains.annotations.NotNull()
    java.lang.String sourceType, @org.jetbrains.annotations.NotNull()
    java.lang.String targetType) {
        return null;
    }
    
    public final float calculateConfidence(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.EntityRelationshipType relType) {
        return 0.0F;
    }
}