package ke.ac.mku.authcore.bootstrap

import java.util.concurrent.CopyOnWriteArrayList
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class EventBus @Inject constructor() {

    private val observers = CopyOnWriteArrayList<BootstrapObserver>()

    fun subscribe(observer: BootstrapObserver) {
        observers.add(observer)
    }

    fun unsubscribe(observer: BootstrapObserver) {
        observers.remove(observer)
    }

    fun publish(event: BootstrapEvent) {
        observers.forEach { observer ->
            try {
                observer.onBootstrapEvent(event)
            } catch (e: Exception) {
                // Log but don't crash
                android.util.Log.e("EventBus", "Error notifying observer: ${e.message}")
            }
        }
    }

    fun clear() {
        observers.clear()
    }

    val observerCount: Int
        get() = observers.size
}

interface BootstrapObserver {
    fun onBootstrapEvent(event: BootstrapEvent)
}