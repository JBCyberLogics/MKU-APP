package ke.ac.mku.authcore.contracts.network;

/**
 * NETWORK-004: Response Processing Manager Contract
 *
 * Central authority responsible for processing, validating, sanitizing 
 * and distributing every HTTP response received from the network.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H&J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/network/IResponseProcessingManager;", "", "processResponse", "Lke/ac/mku/authcore/contracts/network/ProcessedResponse;", "raw", "Lke/ac/mku/authcore/contracts/network/RawResponse;", "validateResponse", "Lke/ac/mku/authcore/contracts/network/ValidationResult;", "extractCookies", "", "updateSession", "processed", "mapResponse", "", "", "getProcessingStatus", "Lke/ac/mku/authcore/contracts/network/ProcessingStatus;", "app"})
public abstract interface IResponseProcessingManager {
    
    /**
     * Process an incoming HTTP response through the full pipeline.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.network.ProcessedResponse processResponse(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.RawResponse raw);
    
    /**
     * Validate response integrity and security.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.network.ValidationResult validateResponse(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.RawResponse raw);
    
    /**
     * Extract and synchronize response cookies with CookieManager.
     */
    public abstract void extractCookies(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.RawResponse raw);
    
    /**
     * Update session state using validated response data.
     */
    public abstract void updateSession(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.ProcessedResponse processed);
    
    /**
     * Convert raw HTTP response into platform model.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.String, java.lang.Object> mapResponse(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.RawResponse raw);
    
    /**
     * Return current processing pipeline status and metrics.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.contracts.network.ProcessingStatus getProcessingStatus();
}