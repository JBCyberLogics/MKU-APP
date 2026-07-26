package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.domain.model.portal.SchemaDefinition
import ke.ac.mku.authcore.domain.model.portal.SchemaField
import java.util.concurrent.ConcurrentHashMap
import javax.inject.Inject
import javax.inject.Singleton

/**
 * JsonSchemaEngine - PROGRAM-008
 *
 * Builds and maintains normalized schemas for academic domains.
 */
@Singleton
class JsonSchemaEngine @Inject constructor() {

    companion object {
        private const val TAG = "JsonSchemaEngine"
    }

    private val schemaRegistry = ConcurrentHashMap<String, SchemaDefinition>()

    init {
        initializeDefaultSchemas()
    }

    fun getSchema(domain: String): SchemaDefinition? {
        return schemaRegistry[domain]
    }

    fun registerSchema(schema: SchemaDefinition) {
        schemaRegistry[schema.domain] = schema
        Log.d(TAG, "Registered schema for domain: ${schema.domain}")
    }

    private fun initializeDefaultSchemas() {
        // Default Student Schema
        registerSchema(SchemaDefinition(
            domain = "student",
            version = "1.0.0",
            fields = listOf(
                SchemaField("registrationNumber", "String", true),
                SchemaField("studentName", "String", true),
                SchemaField("programme", "String", true)
            )
        ))
        
        // Default Finance Schema
        registerSchema(SchemaDefinition(
            domain = "finance",
            version = "1.0.0",
            fields = listOf(
                SchemaField("feeBalance", "Double", true),
                SchemaField("lastPayment", "Double", false)
            )
        ))
    }
}
