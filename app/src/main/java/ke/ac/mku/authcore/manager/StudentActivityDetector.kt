package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.domain.model.portal.ContextDelta
import javax.inject.Inject
import javax.inject.Singleton

/**
 * StudentActivityDetector - PROGRAM-014
 *
 * Analyzes context changes to detect high-level student activity.
 */
@Singleton
class StudentActivityDetector @Inject constructor() {

    fun detectActivity(delta: ContextDelta): List<BootstrapEvent> {
        val discoveredEvents = mutableListOf<BootstrapEvent>()
        
        Log.d("ActivityDetector", "Analyzing delta ${delta.deltaId} for student activity...")

        delta.items.forEach { item ->
            when {
                item.domain == "finance" && item.path == "feeBalance" -> {
                    val old = (item.oldValue as? Double) ?: 0.0
                    val new = (item.newValue as? Double) ?: 0.0
                    discoveredEvents.add(BootstrapEvent.FeeBalanceChanged(old, new))
                    
                    if (new < old) {
                        discoveredEvents.add(BootstrapEvent.PaymentRecorded(old - new))
                    }
                }
                // More detection logic...
            }
        }
        
        return discoveredEvents
    }
}
