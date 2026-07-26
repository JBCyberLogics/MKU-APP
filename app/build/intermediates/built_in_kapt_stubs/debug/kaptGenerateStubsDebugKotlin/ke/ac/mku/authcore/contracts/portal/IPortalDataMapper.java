package ke.ac.mku.authcore.contracts.portal;

/**
 * PORTAL-002: Portal Data Mapper Contract
 *
 * Transforms raw MKU Student Portal responses into strongly typed internal domain models.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0001H&\u00a8\u0006\u0014\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/portal/IPortalDataMapper;", "", "mapAuthenticationResponse", "Lke/ac/mku/authcore/domain/model/AuthResult;", "raw", "Lke/ac/mku/authcore/contracts/network/ProcessedResponse;", "mapStudentProfile", "Lke/ac/mku/authcore/domain/model/portal/StudentProfile;", "mapAcademicData", "Lke/ac/mku/authcore/domain/model/portal/StudentAcademicProfile;", "mapFinancialData", "Lke/ac/mku/authcore/domain/model/portal/StudentFinanceProfile;", "mapError", "", "statusCode", "", "", "validateModel", "", "model", "app"})
public abstract interface IPortalDataMapper {
    
    /**
     * Convert portal authentication response into AuthenticationResult.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.AuthResult mapAuthenticationResponse(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.ProcessedResponse raw);
    
    /**
     * Map portal profile into StudentProfile model.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.StudentProfile mapStudentProfile(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.ProcessedResponse raw);
    
    /**
     * Transform academic records.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.StudentAcademicProfile mapAcademicData(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.ProcessedResponse raw);
    
    /**
     * Transform financial information.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.portal.StudentFinanceProfile mapFinancialData(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.contracts.network.ProcessedResponse raw);
    
    /**
     * Translate portal errors into platform exceptions.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Throwable mapError(int statusCode, @org.jetbrains.annotations.Nullable()
    java.lang.String raw);
    
    /**
     * Validate mapped domain object.
     */
    public abstract boolean validateModel(@org.jetbrains.annotations.NotNull()
    java.lang.Object model);
}