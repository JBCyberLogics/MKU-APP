package ke.ac.mku.authcore.runtime

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.DisplayMetrics
import android.view.WindowManager
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Provides runtime environment information including device details,
 * Android version, network status, and debug detection.
 */
@Singleton
class EnvironmentInfo @Inject constructor(
    @dagger.hilt.android.qualifiers.ApplicationContext private val context: Context
) {

    private val connectivityManager: ConnectivityManager by lazy {
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

    private val windowManager: WindowManager by lazy {
        context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
    }

    /**
     * Get the Android SDK version.
     */
    val androidVersion: Int = Build.VERSION.SDK_INT

    /**
     * Get the Android version name (e.g., "14", "13").
     */
    val androidVersionName: String = Build.VERSION.RELEASE

    /**
     * Get the device model.
     */
    val deviceModel: String = "${Build.MANUFACTURER}/${Build.MODEL}"

    /**
     * Get the device brand.
     */
    val deviceBrand: String = Build.BRAND

    /**
     * Get the application version code.
     */
    val appVersionCode: Long
        get() = try {
            context.packageManager.getPackageInfo(context.packageName, 0).longVersionCode
        } catch (e: Exception) {
            0L
        }

    /**
     * Get the application version name.
     */
    val appVersionName: String
        get() = try {
            context.packageManager.getPackageInfo(context.packageName, 0).versionName ?: "Unknown"
        } catch (e: Exception) {
            "Unknown"
        }

    /**
     * Check if the app is running on a debug build.
     */
    val isDebugBuild: Boolean
        get() = try {
            (context.applicationInfo.flags and android.content.pm.ApplicationInfo.FLAG_DEBUGGABLE) != 0
        } catch (e: Exception) {
            false
        }

    /**
     * Check if network is available.
     */
    val isNetworkAvailable: Boolean
        get() {
            val network = connectivityManager.activeNetwork ?: return false
            val capabilities = connectivityManager.getNetworkCapabilities(network) ?: return false
            return capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
        }

    /**
     * Check if connected via WiFi.
     */
    val isWifiConnected: Boolean
        get() {
            val network = connectivityManager.activeNetwork ?: return false
            val capabilities = connectivityManager.getNetworkCapabilities(network) ?: return false
            return capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)
        }

    /**
     * Check if connected via cellular.
     */
    val isCellularConnected: Boolean
        get() {
            val network = connectivityManager.activeNetwork ?: return false
            val capabilities = connectivityManager.getNetworkCapabilities(network) ?: return false
            return capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)
        }

    /**
     * Get the network type (WIFI, CELLULAR, or NONE).
     */
    val networkType: NetworkType
        get() = when {
            isWifiConnected -> NetworkType.WIFI
            isCellularConnected -> NetworkType.CELLULAR
            isNetworkAvailable -> NetworkType.OTHER
            else -> NetworkType.NONE
        }

    /**
     * Get screen resolution.
     */
    val screenResolution: String
        get() {
            val metrics = DisplayMetrics()
            @Suppress("DEPRECATION")
            windowManager.defaultDisplay.getMetrics(metrics)
            return "${metrics.widthPixels}x${metrics.heightPixels}"
        }

    /**
     * Get screen density.
     */
    val screenDensity: Float
        get() {
            val metrics = DisplayMetrics()
            @Suppress("DEPRECATION")
            windowManager.defaultDisplay.getMetrics(metrics)
            return metrics.density
        }

    /**
     * Get all environment information as a data class.
     */
    fun getEnvironmentDetails(): EnvironmentDetails {
        return EnvironmentDetails(
            androidVersion = androidVersion,
            androidVersionName = androidVersionName,
            deviceModel = deviceModel,
            deviceBrand = deviceBrand,
            appVersionCode = appVersionCode,
            appVersionName = appVersionName,
            isDebugBuild = isDebugBuild,
            isNetworkAvailable = isNetworkAvailable,
            networkType = networkType,
            screenResolution = screenResolution,
            screenDensity = screenDensity
        )
    }

    /**
     * Network type enum.
     */
    enum class NetworkType {
        WIFI,
        CELLULAR,
        OTHER,
        NONE
    }

    /**
     * Complete environment details.
     */
    data class EnvironmentDetails(
        val androidVersion: Int,
        val androidVersionName: String,
        val deviceModel: String,
        val deviceBrand: String,
        val appVersionCode: Long,
        val appVersionName: String,
        val isDebugBuild: Boolean,
        val isNetworkAvailable: Boolean,
        val networkType: NetworkType,
        val screenResolution: String,
        val screenDensity: Float
    )
}