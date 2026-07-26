package ke.ac.mku.authcore.manager;

/**
 * EntitySerializer - PROGRAM-008
 *
 * Converts semantic entities into JSON structures.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\b\u0007\u001a\u0002\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000bH\u0002\u00ca\u0001\u0002\b\u000f\u00a8\u0006\u000e"}, d2 = {"Lke/ac/mku/authcore/manager/EntitySerializer;", "", "<init>", "()V", "Ljavax/inject/Inject;", "mapToDomains", "", "", "Lorg/json/JSONObject;", "entities", "", "Lke/ac/mku/authcore/domain/model/portal/SemanticEntity;", "detectDomain", "entity", "app", "Ljavax/inject/Singleton;"})
public final class EntitySerializer {
    
    @javax.inject.Inject()
    public EntitySerializer() {
        super();
    }
    
    /**
     * Map a list of entities into a JSON object grouped by domain.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, org.json.JSONObject> mapToDomains(@org.jetbrains.annotations.NotNull()
    java.util.List<ke.ac.mku.authcore.domain.model.portal.SemanticEntity> entities) {
        return null;
    }
    
    private final java.lang.String detectDomain(ke.ac.mku.authcore.domain.model.portal.SemanticEntity entity) {
        return null;
    }
}