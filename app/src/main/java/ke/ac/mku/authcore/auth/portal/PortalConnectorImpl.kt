package ke.ac.mku.authcore.auth.portal

import android.util.Log
import ke.ac.mku.authcore.contracts.portal.IPortalConnector
import ke.ac.mku.authcore.models.portal.PortalConnectionResult
import ke.ac.mku.authcore.models.portal.PortalConnectionState
import ke.ac.mku.authcore.models.portal.PortalInfo
import ke.ac.mku.authcore.models.portal.PortalType
import ke.ac.mku.authcore.registry.EndpointRegistry
import ke.ac.mku.authcore.registry.PortalDiscovery
import ke.ac.mku.authcore.registry.PortalSDK
import javax.inject.Inject
import javax.inject.Singleton

/**
 * PortalConnectorImpl - AUTH-002 / PORTAL-001
 *
 * Implementation of [IPortalConnector] that wraps existing portal components.
 *
 * This implementation delegates to:
 * - [PortalSDK] for portal operations (login/logout)
 * - [PortalDiscovery] for portal discovery and availability
 * - [EndpointRegistry] for endpoint management
 *
 * Does NOT duplicate any portal logic - purely an adapter layer.
 */
@Singleton
class PortalConnectorImpl @Inject constructor(
    private val portalSDK: PortalSDK,
    private val portalDiscovery: PortalDiscovery,
    private val endpointRegistry: EndpointRegistry
) : IPortalConnector {

    companion object {
        private const val TAG = "PortalConnectorImpl"
    }

    @Volatile
    private var currentState: PortalConnectionState = PortalConnectionState.DISCONNECTED

    @Volatile
    private var currentPortalInfo: PortalInfo? = null

    override suspend fun connect(): PortalConnectionResult {
        Log.i(TAG, "Connecting to portal")

        try {
            updateState(PortalConnectionState.CONNECTING)

            // Check if portal is available
            if (!portalDiscovery.isPortalAvailable("student")) {
                updateState(PortalConnectionState.ERROR)
                return PortalConnectionResult.Failure(
                    message = "Student portal is not available",
                    errorCode = "PORTAL_001"
                )
            }

            // Get portal info from discovery
            val discoveredPortal = portalDiscovery.getStudentPortal()
            val portalInfo = PortalInfo(
                portalId = discoveredPortal.id,
                portalName = discoveredPortal.name,
                baseUrl = discoveredPortal.baseUrl,
                portalType = mapPortalType(discoveredPortal.type)
            )

            // Get endpoint to verify connectivity
            val endpoint = endpointRegistry.getStudentPortalEndpoint()
            Log.d(TAG, "Portal endpoint: ${endpoint.url}")

            // Update state and return success
            currentPortalInfo = portalInfo
            updateState(PortalConnectionState.CONNECTED)

            Log.i(TAG, "Successfully connected to portal: ${portalInfo.portalName}")
            return PortalConnectionResult.Success(portalInfo)

        } catch (e: Exception) {
            Log.e(TAG, "Failed to connect to portal: ${e.message}", e)
            updateState(PortalConnectionState.ERROR)
            return PortalConnectionResult.Failure(
                message = e.message ?: "Failed to connect to portal",
                errorCode = "PORTAL_002"
            )
        }
    }

    override suspend fun disconnect(): Unit {
        Log.i(TAG, "Disconnecting from portal")

        try {
            updateState(PortalConnectionState.DISCONNECTING)

            // Perform logout via PortalSDK if logged in
            if (portalSDK.isLoggedIn()) {
                portalSDK.logout()
            }

            currentPortalInfo = null
            updateState(PortalConnectionState.DISCONNECTED)

            Log.i(TAG, "Successfully disconnected from portal")

        } catch (e: Exception) {
            Log.e(TAG, "Error during disconnect: ${e.message}", e)
            updateState(PortalConnectionState.ERROR)
        }
    }

    override suspend fun isPortalAvailable(): Boolean {
        return try {
            val isAvailable = portalDiscovery.isPortalAvailable("student")
            Log.d(TAG, "Portal availability: $isAvailable")
            isAvailable
        } catch (e: Exception) {
            Log.w(TAG, "Error checking portal availability: ${e.message}")
            false
        }
    }

    override fun getPortalInfo(): PortalInfo {
        return currentPortalInfo ?: throw IllegalStateException(
            "Portal not connected. Call connect() first."
        )
    }

    override fun getConnectionState(): PortalConnectionState {
        return currentState
    }

    private fun updateState(newState: PortalConnectionState) {
        val previousState = currentState
        currentState = newState
        Log.d(TAG, "Connection state: $previousState -> $newState")
    }

    private fun mapPortalType(discoveryType: PortalDiscovery.PortalType): PortalType {
        return when (discoveryType) {
            PortalDiscovery.PortalType.STUDENT_PORTAL -> PortalType.STUDENT_PORTAL
            PortalDiscovery.PortalType.VLMS -> PortalType.VLMS
        }
    }
}