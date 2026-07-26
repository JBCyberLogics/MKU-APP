package com.example.app

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.BootstrapObserver
import ke.ac.mku.authcore.bootstrap.EventBus
import ke.ac.mku.authcore.domain.model.AuthResult
import ke.ac.mku.authcore.manager.AuthCoreManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class LoginUiState(
    val isLoading: Boolean = false,
    val isValidating: Boolean = false,
    val loadingStep: String = "",
    val isLoggedIn: Boolean = false,
    val isDashboardReady: Boolean = false,
    val errorMessage: String? = null,
    val successMessage: String? = null
)

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val authCoreManager: AuthCoreManager,
    private val eventBus: EventBus
) : ViewModel(), BootstrapObserver {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    init {
        eventBus.subscribe(this)
    }

    override fun onBootstrapEvent(event: BootstrapEvent) {
        when (event) {
            is BootstrapEvent.LoginWorkflowStarted -> {
                _uiState.value = _uiState.value.copy(isValidating = true, loadingStep = "Authenticating...")
            }
            is BootstrapEvent.LoginAuthenticated -> {
                _uiState.value = _uiState.value.copy(loadingStep = "Loading Student Profile...")
            }
            is BootstrapEvent.PlatformValidationStarted -> {
                _uiState.value = _uiState.value.copy(loadingStep = "Starting Platform Verification...")
            }
            is BootstrapEvent.PlatformValidationStepCompleted -> {
                _uiState.value = _uiState.value.copy(loadingStep = "Verified: ${event.name}")
            }
            is BootstrapEvent.PortalDiscoveryStarted -> {
                _uiState.value = _uiState.value.copy(loadingStep = "Analyzing Portal...")
            }
            is BootstrapEvent.KnowledgeGraphStarted -> {
                _uiState.value = _uiState.value.copy(loadingStep = "Building Knowledge Graph...")
            }
            is BootstrapEvent.StudentContextStarted -> {
                _uiState.value = _uiState.value.copy(loadingStep = "Preparing Dashboard...")
            }
            is BootstrapEvent.DashboardRenderStarted -> {
                _uiState.value = _uiState.value.copy(loadingStep = "Rendering Interface...")
            }
            is BootstrapEvent.LoginCompleted -> {
                _uiState.value = _uiState.value.copy(isLoggedIn = true, loadingStep = "Starting Platform...")
            }
            is BootstrapEvent.DashboardReady -> {
                _uiState.value = _uiState.value.copy(
                    isValidating = false,
                    isDashboardReady = true,
                    isLoggedIn = true,
                    loadingStep = "Complete"
                )
            }
            is BootstrapEvent.LoginFailed -> {
                _uiState.value = _uiState.value.copy(isValidating = false, isLoading = false, errorMessage = event.reason)
            }
            is BootstrapEvent.BootstrapFailed -> {
                _uiState.value = _uiState.value.copy(isValidating = false, isLoading = false, errorMessage = event.error)
            }
            else -> {}
        }
    }

    fun login(regNumber: String, password: String, portalType: String = "student") {
        Log.d("AuthViewModel", "Login initiated for $portalType, user: $regNumber")
        if (regNumber.isBlank() || password.isBlank()) {
            _uiState.value = _uiState.value.copy(
                errorMessage = "Please enter registration number and password"
            )
            return
        }

        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                isLoading = true,
                errorMessage = null,
                successMessage = null
            )

            val result = authCoreManager.login(regNumber, password, portalType)
            if (result is AuthResult.Failure) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    errorMessage = result.message
                )
            }
        }
    }

    fun logout() {
        viewModelScope.launch {
            authCoreManager.logout()
            _uiState.value = LoginUiState()
        }
    }

    fun clearError() {
        _uiState.value = _uiState.value.copy(errorMessage = null)
    }

    override fun onCleared() {
        eventBus.unsubscribe(this)
        super.onCleared()
    }
}
