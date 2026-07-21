package ke.ac.mku.authcore.config

sealed class ConfigurationEvent {
    object ConfigurationLoaded : ConfigurationEvent()
    object ConfigurationValidated : ConfigurationEvent()
    data class ConfigurationFailed(val error: String) : ConfigurationEvent()
    object ConfigurationUpdated : ConfigurationEvent()
}

interface Observable {
    fun addObserver(observer: Observer)
    fun removeObserver(observer: Observer)
}

interface Observer {
    fun onConfigurationEvent(event: ConfigurationEvent)
}

abstract class AbstractObservable : Observable {
    private val observers = mutableListOf<Observer>()

    override fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    protected fun notifyObservers(event: ConfigurationEvent) {
        observers.forEach { it.onConfigurationEvent(event) }
    }
}