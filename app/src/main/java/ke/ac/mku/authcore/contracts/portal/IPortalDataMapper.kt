package ke.ac.mku.authcore.contracts.portal

import ke.ac.mku.authcore.contracts.network.ProcessedResponse
import ke.ac.mku.authcore.domain.model.AuthResult
import ke.ac.mku.authcore.domain.model.portal.*

/**
 * PORTAL-002: Portal Data Mapper Contract
 *
 * Transforms raw MKU Student Portal responses into strongly typed internal domain models.
 */
interface IPortalDataMapper {

    /**
     * Convert portal authentication response into AuthenticationResult.
     */
    fun mapAuthenticationResponse(raw: ProcessedResponse): AuthResult

    /**
     * Map portal profile into StudentProfile model.
     */
    fun mapStudentProfile(raw: ProcessedResponse): StudentProfile

    /**
     * Transform academic records.
     */
    fun mapAcademicData(raw: ProcessedResponse): StudentAcademicProfile

    /**
     * Transform financial information.
     */
    fun mapFinancialData(raw: ProcessedResponse): StudentFinanceProfile

    /**
     * Translate portal errors into platform exceptions.
     */
    fun mapError(statusCode: Int, raw: String?): Throwable

    /**
     * Validate mapped domain object.
     */
    fun validateModel(model: Any): Boolean
}
