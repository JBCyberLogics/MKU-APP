package ke.ac.mku.authcore.contracts.service;

/**
 * IServiceRegistry - CORE-012
 *
 * Contract for the ServiceRegistry.
 * Provides runtime service resolution and listing.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H&J+\u0010\u000b\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000eH&\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lke/ac/mku/authcore/contracts/service/IServiceRegistry;", "", "exists", "", "serviceName", "", "getRegistrySize", "", "isInitialized", "list", "", "resolve", "T", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "app_debug"})
public abstract interface IServiceRegistry {
    
    /**
     * Resolve a service by name.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object resolve(@org.jetbrains.annotations.NotNull()
    java.lang.String serviceName);
    
    /**
     * Resolve a service by name and type.
     */
    @org.jetbrains.annotations.Nullable()
    public abstract <T extends java.lang.Object>T resolve(@org.jetbrains.annotations.NotNull()
    java.lang.String serviceName, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz);
    
    /**
     * Check if a service is registered.
     */
    public abstract boolean exists(@org.jetbrains.annotations.NotNull()
    java.lang.String serviceName);
    
    /**
     * List all registered service names.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> list();
    
    /**
     * Get the number of registered services.
     */
    public abstract int getRegistrySize();
    
    /**
     * Check if the registry is initialized.
     */
    public abstract boolean isInitialized();
}