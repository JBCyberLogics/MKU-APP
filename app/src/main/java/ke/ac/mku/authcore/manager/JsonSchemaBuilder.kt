package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.domain.model.portal.SchemaDefinition
import ke.ac.mku.authcore.domain.model.portal.SchemaField
import java.util.concurrent.ConcurrentHashMap
import javax.inject.Inject
import javax.inject.Singleton

/**
 * JsonSchemaBuilder - PROGRAM-008
 *
 * Builds and extends universal schemas dynamically.
 */
@Singleton
class JsonSchemaBuilder @Inject constructor() {

    companion object {
        private const val TAG = "JsonSchemaBuilder"
    }

    private val schemas = ConcurrentHashMap<String, SchemaDefinition>()

    init {
        // Initialize core schemas
        registerSchema("student", listOf("registrationNumber", "studentName"))
        registerSchema("finance", listOf("feeBalance"))
    }

    fun registerSchema(domain: String, fieldNames: List<String>) {
        val fields = fieldNames.map { SchemaField(it, "String", true) }
        schemas[domain] = SchemaDefinition(domain, "1.0", fields)
        Log.d(TAG, "Schema registered for $domain")
    }

    fun getSchema(domain: String): SchemaDefinition? = schemas[domain]

    fun extendSchema(domain: String, newField: SchemaField) {
        val existing = schemas[domain]
        if (existing != null) {
            schemas[domain] = existing.copy(fields = existing.fields + newField)
            Log.i(TAG, "Extended schema $domain with field ${newField.name}")
        }
    }
}
