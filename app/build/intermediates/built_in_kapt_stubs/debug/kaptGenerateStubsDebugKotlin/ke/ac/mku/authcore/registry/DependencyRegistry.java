package ke.ac.mku.authcore.registry;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\r\b\u0007\u001a\u0002\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bJ\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\rJ:\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\rJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\u0007J)\u0010\u001f\u001a\u0004\u0018\u0001H \"\u0004\b\u0000\u0010 2\u0006\u0010\u0018\u001a\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u0002H 0\"\u00a2\u0006\u0002\u0010#J\u000e\u0010$\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0007J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u001bJ\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u001bJ\u0006\u0010\'\u001a\u00020(J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u001bH\u0002J\u0006\u0010*\u001a\u00020\rJ\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u001bR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b.\u00a8\u0006-"}, d2 = {"Lke/ac/mku/authcore/registry/DependencyRegistry;", "", "<init>", "()V", "Ljavax/inject/Inject;", "services", "", "", "Lke/ac/mku/authcore/registry/ServiceDescriptor;", "observers", "", "Lke/ac/mku/authcore/registry/RegistryObserver;", "isInitialized", "", "isValidated", "addObserver", "", "observer", "removeObserver", "notifyObservers", "event", "Lke/ac/mku/authcore/registry/RegistryEvent;", "initialize", "register", "name", "instance", "dependencies", "", "startupOrder", "", "isRequired", "resolve", "T", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "exists", "list", "listByOrder", "validate", "Lke/ac/mku/authcore/registry/ValidationResult;", "findCircularDependencies", "isReady", "getStartupSequence", "Companion", "app", "Ljavax/inject/Singleton;"})
public final class DependencyRegistry {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "DependencyRegistry";
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, ke.ac.mku.authcore.registry.ServiceDescriptor> services = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<ke.ac.mku.authcore.registry.RegistryObserver> observers = null;
    private boolean isInitialized = false;
    private boolean isValidated = false;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.registry.DependencyRegistry.Companion Companion = null;
    
    @javax.inject.Inject()
    public DependencyRegistry() {
        super();
    }
    
    public final void addObserver(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.RegistryObserver observer) {
    }
    
    public final void removeObserver(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.RegistryObserver observer) {
    }
    
    private final void notifyObservers(ke.ac.mku.authcore.registry.RegistryEvent event) {
    }
    
    public final boolean initialize() {
        return false;
    }
    
    public final boolean register(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.Object instance, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> dependencies, int startupOrder, boolean isRequired) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object resolve(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T resolve(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz) {
        return null;
    }
    
    public final boolean exists(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> list() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<ke.ac.mku.authcore.registry.ServiceDescriptor> listByOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.registry.ValidationResult validate() {
        return null;
    }
    
    private final java.util.List<java.lang.String> findCircularDependencies() {
        return null;
    }
    
    public final boolean isReady() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getStartupSequence() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/registry/DependencyRegistry$Companion;", "", "<init>", "()V", "TAG", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}