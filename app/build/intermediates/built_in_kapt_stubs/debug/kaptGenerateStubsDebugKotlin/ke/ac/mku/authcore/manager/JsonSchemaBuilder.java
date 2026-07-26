package ke.ac.mku.authcore.manager;

/**
 * JsonSchemaBuilder - PROGRAM-008
 *
 * Builds and extends universal schemas dynamically.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\b\u0007\u001a\u0002\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b\u0014\u00a8\u0006\u0013"}, d2 = {"Lke/ac/mku/authcore/manager/JsonSchemaBuilder;", "", "<init>", "()V", "Ljavax/inject/Inject;", "schemas", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lke/ac/mku/authcore/domain/model/portal/SchemaDefinition;", "registerSchema", "", "domain", "fieldNames", "", "getSchema", "extendSchema", "newField", "Lke/ac/mku/authcore/domain/model/portal/SchemaField;", "Companion", "app", "Ljavax/inject/Singleton;"})
public final class JsonSchemaBuilder {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "JsonSchemaBuilder";
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, ke.ac.mku.authcore.domain.model.portal.SchemaDefinition> schemas = null;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.manager.JsonSchemaBuilder.Companion Companion = null;
    
    @javax.inject.Inject()
    public JsonSchemaBuilder() {
        super();
    }
    
    public final void registerSchema(@org.jetbrains.annotations.NotNull()
    java.lang.String domain, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> fieldNames) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ke.ac.mku.authcore.domain.model.portal.SchemaDefinition getSchema(@org.jetbrains.annotations.NotNull()
    java.lang.String domain) {
        return null;
    }
    
    public final void extendSchema(@org.jetbrains.annotations.NotNull()
    java.lang.String domain, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.portal.SchemaField newField) {
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/manager/JsonSchemaBuilder$Companion;", "", "<init>", "()V", "TAG", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}