package ke.ac.mku.authcore.manager.ui

import android.util.Log
import ke.ac.mku.authcore.domain.model.ui.TransitionEffect
import ke.ac.mku.authcore.domain.model.ui.TransitionPlan
import javax.inject.Inject
import javax.inject.Singleton

/**
 * TransitionManager - PROGRAM-019
 *
 * Controls screen and widget transitions.
 */
@Singleton
class TransitionManager @Inject constructor() {

    companion object {
        private const val TAG = "TransitionManager"
    }

    fun planTransition(from: String, to: String): TransitionPlan {
        Log.d(TAG, "Planning transition from $from to $to")
        
        return TransitionPlan(
            fromState = from,
            toState = to,
            durationMs = 400,
            effect = TransitionEffect.CROSS_FADE
        )
    }
}
