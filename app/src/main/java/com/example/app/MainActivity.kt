package com.example.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.app.ui.theme.MKUTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MKUTheme {
                MainApp()
            }
        }
    }
}

@Composable
private fun MainApp() {
    var currentScreen by remember { mutableStateOf("splash") }

    // Handle splash timeout - 1500ms
    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(1500)
        currentScreen = "login"
    }

    Box(modifier = Modifier.fillMaxSize()) {
        AnimatedContent(
            targetState = currentScreen,
            transitionSpec = {
                fadeIn(
                    animationSpec = tween(600, easing = FastOutSlowInEasing)
                ).togetherWith(
                    fadeOut(
                        animationSpec = tween(600, easing = FastOutSlowInEasing)
                    )
                )
            },
            label = "screenTransition"
        ) { screen ->
            when (screen) {
                "splash" -> SplashScreen(
                    onTimeout = { /* handled by LaunchedEffect */ }
                )
                "login" -> LoginScreen()
            }
        }
    }
}