package ke.ac.mku.authcore.contracts.service;

/**
 * IServiceRegistry - CORE-012
 *
 * Contract for the ServiceRegistry.
 * Provides runtime service resolution and listing.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H&J+\u0010\u0002\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H&\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\nH&\u00a8\u0006\u0010\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/service/IServiceRegistry;", "", "resolve", "serviceName", "", "T", "clazz", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "exists", "", "list", "", "getRegistrySize", "", "isInitialized", "app"})
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