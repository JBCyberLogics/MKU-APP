package ke.ac.mku.authcore.contracts.registry;

/**
 * IDependencyRegistry - CORE-012
 *
 * Contract for DependencyRegistry.
 * Service locator pattern for dependency resolution.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H&J6\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H&J+\u0010\u0013\u001a\u0004\u0018\u0001H\u0014\"\u0004\b\u0000\u0010\u00142\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0016H&\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H&\u00a8\u0006\u001a"}, d2 = {"Lke/ac/mku/authcore/contracts/registry/IDependencyRegistry;", "", "exists", "", "name", "", "getStartupSequence", "", "initialize", "", "isReady", "list", "listByOrder", "register", "instance", "dependencies", "startupOrder", "", "isRequired", "resolve", "T", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "validate", "Lke/ac/mku/authcore/contracts/registry/ValidationResult;", "app_debug"})
public abstract interface IDependencyRegistry {
    
    /**
     * Initialize the registry.
     */
    public abstract void initialize();
    
    /**
     * Register a service.
     */
    public abstract boolean register(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.Object instance, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> dependencies, int startupOrder, boolean isRequired);
    
    /**
     * Resolve a service by name.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object resolve(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    /**
     * Resolve a service by name and type.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract <T extends java.lang.Object>T resolve(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz);
    
    /**
     * Check if a service exists.
     */
    public abstract boolean exists(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    /**
     * List all registered services.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> list();
    
    /**
     * List services in startup order.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.Object> listByOrder();
    
    /**
     * Validate the registry.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.registry.ValidationResult validate();
    
    /**
     * Check if registry is ready.
     */
    public abstract boolean isReady();
    
    /**
     * Get the startup sequence.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getStartupSequence();
}