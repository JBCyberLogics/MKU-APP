package ke.ac.mku.authcore.manager.ui

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

/**
 * LoadingExperienceManager - PROGRAM-019
 *
 * Coordinates shimmer and skeleton animations during data loads.
 */
@Singleton
class LoadingExperienceManager @Inject constructor() {

    fun startShimmer() {
        Log.d("LoadingManager", "Activating shimmer effect for dashboard...")
    }

    fun stopShimmer() {
        Log.d("LoadingManager", "Shimmer effect deactivated.")
    }
}
