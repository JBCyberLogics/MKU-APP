package ke.ac.mku.authcore.feature

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.lifecycle.LifecycleEvent
import ke.ac.mku.authcore.lifecycle.LifecycleManager
import ke.ac.mku.authcore.lifecycle.LifecycleManager.LifecycleListener
import ke.ac.mku.authcore.service.ServiceRegistry
import ke.ac.mku.authcore.state.StateRegistry
import javax.inject.Inject
import javax.inject.Singleton

/**
 * FeatureRegistry - CORE-008
 *
 * Central registry for feature discovery, registration, enablement, and dependency validation.
 * Acts as the single source of truth for all feature management.
 *
 * Subscribes to:
 * - BootstrapEvent.StateInitialized (triggers feature discovery)
 * - LifecycleEvent (tracks service lifecycle)
 */
@Singleton
class FeatureRegistry @Inject constructor(
    private val eventBus: EventBus,
    private val stateRegistry: StateRegistry,
    private val serviceRegistry: ServiceRegistry
) : BootstrapObserver, LifecycleListener {

    companion object {
        private const val TAG = "FeatureRegistry"

        // Default feature definitions with dependencies
        private val DEFAULT_FEATURES = listOf(
            Feature(
                id = "AUTHENTICATION",
                name = "Authentication",
                description = "Core authentication functionality",
                isRequired = true,
                isEnabled = true,
                dependencies = emptyList(),
                capabilities = listOf("LOGIN", "LOGOUT", "VALIDATE_SESSION")
            ),
            Feature(
                id = "SESSION_MANAGEMENT",
                name = "Session Management",
                description = "Session lifecycle management",
                isRequired = true,
                isEnabled = true,
                dependencies = listOf("AUTHENTICATION"),
                capabilities = listOf("CREATE_SESSION", "DESTROY_SESSION", "VALIDATE_SESSION")
            ),
            Feature(
                id = "COOKIE_MANAGEMENT",
                name = "Cookie Management",
                description = "HTTP cookie handling",
                isRequired = true,
                isEnabled = true,
                dependencies = listOf("AUTHENTICATION"),
                capabilities = listOf("SET_COOKIE", "GET_COOKIE", "CLEAR_COOKIES")
            ),
            Feature(
                id = "NETWORK_LAYER",
                name = "Network Layer",
                description = "HTTP networking infrastructure",
                isRequired = true,
                isEnabled = true,
                dependencies = listOf("AUTHENTICATION", "SESSION_MANAGEMENT"),
                capabilities = listOf("HTTP_GET", "HTTP_POST", "REDIRECT_HANDLING")
            ),
            Feature(
                id = "PORTAL_DISCOVERY",
                name = "Portal Discovery",
                description = "Discover available MKU portals",
                isRequired = true,
                isEnabled = true,
                dependencies = listOf("NETWORK_LAYER"),
                capabilities = listOf("DISCOVER_PORTALS", "GET_PORTAL_INFO")
            ),
            Feature(
                id = "ENDPOINT_DISCOVERY",
                name = "Endpoint Discovery",
                description = "Discover service endpoints",
                isRequired = true,
                isEnabled = true,
                dependencies = listOf("PORTAL_DISCOVERY"),
                capabilities = listOf("GET_LOGIN_ENDPOINT", "GET_LOGOUT_ENDPOINT")
            ),
            Feature(
                id = "HEALTH_MONITORING",
                name = "Health Monitoring",
                description = "System health checks",
                isRequired = true,
                isEnabled = true,
                dependencies = listOf("AUTHENTICATION", "NETWORK_LAYER"),
                capabilities = listOf("CHECK_HEALTH", "GET_STATUS")
            )
        )
    }

    // Feature storage
    private val features = mutableMapOf<String, Feature>()
    private val featureFlags = mutableMapOf<String, FeatureFlag>()

    // Listeners for internal events
    private val listeners = mutableListOf<FeatureListener>()

    // Initialization state
    private var isInitialized = false

    init {
        eventBus.subscribe(this)
        Log.i(TAG, "FeatureRegistry initialized, subscribed to bootstrap events")
    }

    /**
     * Interface for components that want to observe feature events.
     */
    interface FeatureListener {
        fun onFeatureEvent(event: FeatureEvent)
    }

    /**
     * Add a listener for feature events.
     */
    fun addFeatureListener(listener: FeatureListener) {
        listeners.add(listener)
    }

    /**
     * Remove a feature listener.
     */
    fun removeFeatureListener(listener: FeatureListener) {
        listeners.remove(listener)
    }

    private fun notifyListeners(event: FeatureEvent) {
        listeners.forEach { listener ->
            try {
                listener.onFeatureEvent(event)
            } catch (e: Exception) {
                Log.e(TAG, "Error notifying feature listener: ${e.message}")
            }
        }
    }

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.StateInitialized -> {
                Log.i(TAG, "State initialized, discovering features...")
                discoverAndRegisterFeatures()
            }
            else -> { /* Ignore other events */ }
        }
    }

    override fun onLifecycleEvent(event: LifecycleEvent) {
        when (event) {
            is LifecycleEvent.AllServicesReady -> {
                Log.i(TAG, "All services ready, FeatureRegistry available")
            }
            is LifecycleEvent.ServiceStarted -> {
                // Could track which services are running
            }
            is LifecycleEvent.ServiceShutdown -> {
                // Could update feature availability
            }
            else -> { /* Ignore other events */ }
        }
    }

    /**
     * Discover and register all built-in features.
     */
    fun discoverAndRegisterFeatures() {
        if (isInitialized) {
            Log.w(TAG, "Features already discovered, skipping")
            return
        }

        Log.i(TAG, "Discovering and registering ${DEFAULT_FEATURES.size} features...")

        // Register all default features
        for (feature in DEFAULT_FEATURES) {
            val success = registerFeature(feature)
            if (!success) {
                Log.e(TAG, "Failed to register feature: ${feature.id}")
            }
        }

        // Enable features in dependency order
        val sortedFeatures = topologicalSort()
        for (featureId in sortedFeatures) {
            val feature = features[featureId]
            if (feature != null && feature.isRequired) {
                enableFeature(featureId)
            }
        }

        isInitialized = true
        notifyListeners(FeatureEvent.FeatureRegistryReady)
        eventBus.publish(BootstrapEvent.FeatureRegistryReady)
        Log.i(TAG, "Feature registry ready with ${features.size} features")
    }

    /**
     * Register a new feature.
     */
    fun registerFeature(feature: Feature): Boolean {
        if (features.containsKey(feature.id)) {
            Log.w(TAG, "Feature ${feature.id} already registered, skipping")
            return false
        }

        // Validate dependencies exist
        for (dep in feature.dependencies) {
            if (!features.containsKey(dep) && !DEFAULT_FEATURES.any { it.id == dep }) {
                Log.e(TAG, "Feature ${feature.id} depends on missing feature: $dep")
                notifyListeners(FeatureEvent.FeatureValidationFailed(feature.id, "Missing dependency: $dep"))
                eventBus.publish(BootstrapEvent.FeatureValidationFailed(feature.id, "Missing dependency: $dep"))
                return false
            }
        }

        // Check for circular dependencies
        if (hasCircularDependency(feature.id, feature.dependencies)) {
            Log.e(TAG, "Circular dependency detected for feature: ${feature.id}")
            notifyListeners(FeatureEvent.FeatureValidationFailed(feature.id, "Circular dependency detected"))
            eventBus.publish(BootstrapEvent.FeatureValidationFailed(feature.id, "Circular dependency detected"))
            return false
        }

        features[feature.id] = feature
        featureFlags[feature.id] = FeatureFlag(
            featureId = feature.id,
            enabled = feature.isEnabled,
            source = if (feature.isRequired) FlagSource.MANDATORY else FlagSource.RUNTIME
        )

        notifyListeners(FeatureEvent.FeatureRegistered(feature.id))
        eventBus.publish(BootstrapEvent.FeatureRegistered(feature.id))
        Log.d(TAG, "Registered feature: ${feature.id}")
        return true
    }

    /**
     * Enable a feature.
     */
    fun enableFeature(featureId: String): Boolean {
        val feature = features[featureId] ?: run {
            Log.w(TAG, "Cannot enable unknown feature: $featureId")
            return false
        }

        // Check if dependencies are enabled
        for (dep in feature.dependencies) {
            val depFeature = features[dep]
            if (depFeature == null || !depFeature.isEnabled) {
                Log.w(TAG, "Cannot enable ${feature.id}: dependency $dep not enabled")
                return false
            }
        }

        // Update feature
        val updatedFeature = feature.copy(isEnabled = true)
        features[featureId] = updatedFeature

        // Update flag
        featureFlags[featureId] = featureFlags[featureId]?.copy(
            enabled = true,
            lastModified = System.currentTimeMillis()
        ) ?: FeatureFlag(featureId, true, FlagSource.MANDATORY)

        notifyListeners(FeatureEvent.FeatureEnabled(featureId))
        eventBus.publish(BootstrapEvent.FeatureEnabled(featureId))
        Log.d(TAG, "Enabled feature: $featureId")
        return true
    }

    /**
     * Disable a feature.
     */
    fun disableFeature(featureId: String): Boolean {
        val feature = features[featureId] ?: run {
            Log.w(TAG, "Cannot disable unknown feature: $featureId")
            return false
        }

        // Cannot disable required features
        if (feature.isRequired) {
            Log.w(TAG, "Cannot disable required feature: $featureId")
            notifyListeners(FeatureEvent.FeatureValidationFailed(featureId, "Cannot disable required feature"))
            return false
        }

        // Check if any enabled feature depends on this one
        for ((id, f) in features) {
            if (f.isEnabled && f.dependencies.contains(featureId)) {
                Log.w(TAG, "Cannot disable $featureId: ${f.id} depends on it")
                notifyListeners(FeatureEvent.FeatureValidationFailed(featureId, "Feature ${f.id} depends on this"))
                return false
            }
        }

        // Update feature
        val updatedFeature = feature.copy(isEnabled = false)
        features[featureId] = updatedFeature

        // Update flag
        featureFlags[featureId] = featureFlags[featureId]?.copy(
            enabled = false,
            lastModified = System.currentTimeMillis()
        ) ?: FeatureFlag(featureId, false, FlagSource.RUNTIME)

        notifyListeners(FeatureEvent.FeatureDisabled(featureId))
        eventBus.publish(BootstrapEvent.FeatureDisabled(featureId))
        Log.d(TAG, "Disabled feature: $featureId")
        return true
    }

    /**
     * Check if a feature is enabled.
     */
    fun isEnabled(featureId: String): Boolean {
        return features[featureId]?.isEnabled ?: false
    }

    /**
     * Get all registered features.
     */
    fun listFeatures(): List<Feature> = features.values.toList()

    /**
     * Get all available runtime capabilities.
     */
    fun discoverFeatures(): List<Feature> = features.values.filter { it.isEnabled }

    /**
     * Get feature dependencies.
     */
    fun getFeatureDependencies(featureId: String): List<String> {
        return features[featureId]?.dependencies ?: emptyList()
    }

    /**
     * Get feature by ID.
     */
    fun getFeature(featureId: String): Feature? = features[featureId]

    /**
     * Get feature flag.
     */
    fun getFeatureFlag(featureId: String): FeatureFlag? = featureFlags[featureId]

    /**
     * Topological sort of features based on dependencies.
     */
    private fun topologicalSort(): List<String> {
        val result = mutableListOf<String>()
        val visited = mutableSetOf<String>()
        val tempMark = mutableSetOf<String>()

        fun visit(id: String): Boolean {
            if (tempMark.contains(id)) {
                Log.e(TAG, "Circular dependency detected at: $id")
                return false
            }
            if (visited.contains(id)) return true

            tempMark.add(id)
            features[id]?.dependencies?.forEach { dep ->
                if (features.containsKey(dep)) {
                    if (!visit(dep)) return false
                }
            }
            tempMark.remove(id)
            visited.add(id)
            result.add(id)
            return true
        }

        for (id in features.keys) {
            if (!visited.contains(id)) {
                if (!visit(id)) return emptyList()
            }
        }

        return result
    }

    /**
     * Check for circular dependencies using DFS.
     */
    private fun hasCircularDependency(featureId: String, dependencies: List<String>): Boolean {
        val visited = mutableSetOf<String>()
        val recursionStack = mutableSetOf<String>()

        fun dfs(id: String): Boolean {
            visited.add(id)
            recursionStack.add(id)

            val feature = features[id] ?: DEFAULT_FEATURES.find { it.id == id }
            feature?.dependencies?.forEach { dep ->
                if (!visited.contains(dep)) {
                    if (dfs(dep)) return true
                } else if (recursionStack.contains(dep)) {
                    return true
                }
            }

            recursionStack.remove(id)
            return false
        }

        return dfs(featureId)
    }

    /**
     * Get the number of registered features.
     */
    fun getFeatureCount(): Int = features.size

    /**
     * Check if the registry is initialized.
     */
    fun isInitialized(): Boolean = isInitialized
}