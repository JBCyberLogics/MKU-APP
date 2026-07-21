package com.example.app

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp
import ke.ac.mku.authcore.bootstrap.BootstrapManager
import ke.ac.mku.authcore.bootstrap.BootstrapState
import javax.inject.Inject

@HiltAndroidApp
class MKUApplication : Application() {

    companion object {
        private const val TAG = "MKUApplication"
    }

    @Inject
    lateinit var bootstrapManager: BootstrapManager

    @Inject
    lateinit var coreInitializer: ke.ac.mku.authcore.bootstrap.CoreInitializer

    override fun onCreate() {
        super.onCreate()
        Log.i(TAG, "Application starting...")

        // Force core services initialization
        coreInitializer.initialize()

        // Start bootstrap via coroutine
        bootstrapManager.start()

        Log.i(TAG, "Bootstrap initiated, state: ${bootstrapManager.state.value}")
    }
}