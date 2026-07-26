package ke.ac.mku.authcore.manager

import android.util.Log
import ke.ac.mku.authcore.bootstrap.BootstrapEvent
import ke.ac.mku.authcore.contracts.authentication.IAuthenticationEventManager
import ke.ac.mku.authcore.domain.model.portal.PriorityLevel
import javax.inject.Inject
import javax.inject.Singleton

/**
 * PriorityEventDispatcher - PROGRAM-014
 *
 * Dispatches events based on their urgency levels.
 */
@Singleton
class PriorityEventDispatcher @Inject constructor(
    private val authEventManager: IAuthenticationEventManager,
    private val router: ContextEventRouter
) {

    fun dispatch(event: BootstrapEvent, priority: PriorityLevel) {
        Log.i("EventDispatcher", "Dispatching ${event.javaClass.simpleName} with priority $priority")
        
        authEventManager.publish(BootstrapEvent.PriorityEventDispatched(
            eventName = event.javaClass.simpleName,
            priority = priority.name
        ))

        // If CRITICAL, bypass any queues (immediate execution)
        if (priority == PriorityLevel.CRITICAL) {
            router.route(event)
        } else {
            // Scheduled or background delivery
            router.route(event)
        }
    }
}
