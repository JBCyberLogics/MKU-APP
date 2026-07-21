package ke.ac.mku.authcore.bootstrap

import android.util.Log
import ke.ac.mku.authcore.config.ConfigManager
import ke.ac.mku.authcore.manager.AuthCoreManager
import ke.ac.mku.authcore.registry.DependencyRegistry
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BootstrapManager @Inject constructor(
    private val configManager: ConfigManager,
    private val dependencyRegistry: DependencyRegistry,
    private val authCoreManager: AuthCoreManager,
    private val eventBus: EventBus
) {
    companion object {
        private const val TAG = "BootstrapManager"
    }

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Main)

    private val _state = MutableStateFlow(BootstrapState.IDLE)
    val state: StateFlow<BootstrapState> = _state.asStateFlow()

    private val _progress = MutableStateFlow<StartupProgress?>(null)
    val progress: StateFlow<StartupProgress?> = _progress.asStateFlow()

    private var startTime: Long = 0
    private var hasStarted = false

    fun start(): Boolean {
        if (hasStarted) {
            Log.w(TAG, "Bootstrap already started, ignoring duplicate call")
            return false
        }
        hasStarted = true

        scope.launch(Dispatchers.IO) {
            executePipeline()
        }
        return true
    }

    fun getStatus(): BootstrapStatus {
        return BootstrapStatus(
            state = _state.value,
            progress = _progress.value,
            isReady = _state.value == BootstrapState.READY,
            isFailed = _state.value == BootstrapState.FAILED
        )
    }

    private suspend fun executePipeline() {
        startTime = System.currentTimeMillis()

        try {
            // Step 1: Load Configuration Manager
            executeStep(1, "Load Configuration Manager") {
                if (!configManager.isLoaded) {
                    configManager.load()
                }
                eventBus.publish(BootstrapEvent.ConfigurationLoaded)
                Log.i(TAG, "Step 1/6: Configuration loaded")
            }

            // Step 2: Validate Configuration
            executeStep(2, "Validate Configuration") {
                // Config validation happens during load
                eventBus.publish(BootstrapEvent.ConfigurationValidated)
                Log.i(TAG, "Step 2/6: Configuration validated")
            }

            // Step 3: Initialize Authentication Core
            executeStep(3, "Initialize Authentication Core") {
                // AuthCoreManager init happens via constructor
                eventBus.publish(BootstrapEvent.AuthenticationCoreInitialized)
                Log.i(TAG, "Step 3/6: Authentication Core initialized")
            }

            // Step 4: Resolve Dependencies
            executeStep(4, "Resolve Dependencies") {
                val result = dependencyRegistry.validate()
                if (!result.isValid) {
                    throw IllegalStateException("Dependency validation failed: ${result.errors.joinToString("; ")}")
                }
                eventBus.publish(BootstrapEvent.DependenciesResolved)
                Log.i(TAG, "Step 4/6: Dependencies resolved")
            }

            // Step 5: Initialize Registered Services
            executeStep(5, "Initialize Registered Services") {
                dependencyRegistry.list().forEach { serviceName ->
                    dependencyRegistry.resolve(serviceName)
                    Log.d(TAG, "  Resolved service: $serviceName")
                }
                Log.i(TAG, "Step 5/6: Registered services initialized")
            }

            // Step 6: Publish Bootstrap Complete
            executeStep(6, "Publish Bootstrap Complete") {
                _state.value = BootstrapState.READY
                val elapsed = System.currentTimeMillis() - startTime
                _progress.value = StartupProgress.fromStep(6, "Bootstrap Complete", elapsed)
                eventBus.publish(BootstrapEvent.BootstrapCompleted)
                Log.i(TAG, "Step 6/6: Bootstrap completed in ${elapsed}ms")
            }

        } catch (e: Exception) {
            handleFailure(e)
        }
    }

    private suspend fun executeStep(step: Int, action: String, block: suspend () -> Unit) {
        _state.value = when (step) {
            1 -> BootstrapState.BOOTSTRAPPING
            2 -> BootstrapState.VALIDATING
            else -> BootstrapState.INITIALIZING
        }

        val elapsed = System.currentTimeMillis() - startTime
        _progress.value = StartupProgress.fromStep(step, action, elapsed)

        eventBus.publish(BootstrapEvent.BootstrapStarted)

        block()
    }

    private suspend fun handleFailure(e: Exception) {
        _state.value = BootstrapState.FAILED
        val elapsed = System.currentTimeMillis() - startTime
        _progress.value = StartupProgress.fromStep(
            _progress.value?.currentStep ?: 0,
            "Bootstrap Failed: ${e.message}",
            elapsed
        )
        eventBus.publish(BootstrapEvent.BootstrapFailed(e.message ?: "Unknown error"))
        Log.e(TAG, "Bootstrap failed: ${e.message}", e)
    }
}

data class BootstrapStatus(
    val state: BootstrapState,
    val progress: StartupProgress?,
    val isReady: Boolean,
    val isFailed: Boolean
)