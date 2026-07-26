package ke.ac.mku.authcore.domain.model.portal

/**
 * SemanticEntityModels - PROGRAM-007
 *
 * Models for the semantic interpretation of discovered portal elements.
 */

data class SemanticEntity(
    val entityId: String,
    val type: EntityCategory,
    val name: String,
    val value: String?,
    val confidence: Float,
    val sourcePage: String,
    val sourceElement: String,
    val relationships: List<EntityRelationship> = emptyList(),
    val metadata: Map<String, String> = emptyMap()
)

enum class EntityCategory {
    STUDENT_PROFILE,
    STUDENT_PHOTO,
    REGISTRATION_NUMBER,
    STUDENT_NAME,
    PROGRAMME,
    DEPARTMENT,
    FACULTY,
    CAMPUS,
    SEMESTER,
    ACADEMIC_YEAR,
    UNITS,
    RESULTS,
    GRADES,
    GPA,
    FEE_BALANCE,
    PAYMENTS,
    HOSTEL,
    LIBRARY,
    TIMETABLE,
    ANNOUNCEMENTS,
    DOWNLOADS,
    NOTIFICATIONS,
    FORMS,
    DOCUMENTS,
    UNKNOWN
}

data class EntityRelationship(
    val targetEntityId: String,
    val type: String
)

data class SemanticRegistry(
    val entities: List<SemanticEntity> = emptyList(),
    val lastUpdated: Long
)

data class ClassificationReport(
    val timestamp: Long,
    val entitiesClassified: Int,
    val averageConfidence: Float,
    val unknownCount: Int
)
