package ke.ac.mku.authcore.manager

import ke.ac.mku.authcore.domain.model.portal.ParameterMetadata
import ke.ac.mku.authcore.domain.model.portal.ParameterSource
import okhttp3.Request
import javax.inject.Inject
import javax.inject.Singleton

/**
 * ParameterAnalyzer - PORTAL-004
 *
 * Extracts and analyzes metadata from request parameters.
 */
@Singleton
class ParameterAnalyzer @Inject constructor() {

    /**
     * Analyze a request for parameters.
     */
    fun analyze(request: Request): List<ParameterMetadata> {
        val parameters = mutableListOf<ParameterMetadata>()

        // 1. Query Parameters
        request.url.queryParameterNames.forEach { name ->
            parameters.add(ParameterMetadata(
                name = name,
                type = "String",
                isRequired = true,
                source = ParameterSource.QUERY
            ))
        }

        // 2. Form Fields / Body Structure
        // Simplified: real implementation would parse RequestBody
        
        return parameters
    }
}
