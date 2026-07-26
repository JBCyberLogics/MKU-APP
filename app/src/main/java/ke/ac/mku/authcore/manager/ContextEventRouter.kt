package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.bootstrap.EventBus
import javax.inject.Inject
import javax.inject.Singleton

/**
 * ContextEventRouter - PROGRAM-014
 *
 * Routes high-level intelligence events to interested platform modules.
 */
@Singleton
class ContextEventRouter @Inject constructor(
    private val eventBus: EventBus
) {
    companion object {
        private const val TAG = "EventRouter"
    }

    fun route(event: BootstrapEvent) {
        Log.d(TAG, "Routing intelligence event: ${event.javaClass.simpleName}")
        
        // In a real implementation, this could perform domain-specific routing
        // or notify external listeners like DashboardViewModel or Analytics.
        eventBus.publish(event)
    }
}
