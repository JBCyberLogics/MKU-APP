package com.example.app

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.app.R
import com.example.app.ui.theme.PrimaryContainer
import com.example.app.ui.theme.Surface
import com.example.app.ui.theme.WaveColor1
import com.example.app.ui.theme.WaveColor2
import com.example.app.ui.theme.WaveColor3
import kotlin.math.sin

@Composable
fun SplashScreen(
    onTimeout: () -> Unit,
    modifier: Modifier = Modifier
) {
    val infiniteTransition = rememberInfiniteTransition(label = "splash")

    // Wave animation
    val waveOffset by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(3000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "wave"
    )

    // Logo pulse animation
    val pulseScale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.05f,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "pulse"
    )

    // Spinner rotation
    val spinnerRotation by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
        label = "spinner"
    )

    // Fade in animations
    val logoAlpha by animateFloatAsState(
        targetValue = 1f,
        animationSpec = tween(500, easing = FastOutSlowInEasing),
        label = "logoAlpha"
    )

    val textAlpha by animateFloatAsState(
        targetValue = 1f,
        animationSpec = tween(500, delayMillis = 200, easing = FastOutSlowInEasing),
        label = "textAlpha"
    )

    val contentAlpha by animateFloatAsState(
        targetValue = 1f,
        animationSpec = tween(500, delayMillis = 400, easing = FastOutSlowInEasing),
        label = "contentAlpha"
    )

    // Trigger timeout after 800ms
    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(800)
        onTimeout()
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Surface),
        contentAlignment = Alignment.Center
    ) {
        // Wave background at bottom
        WaveBackground(
            waveOffset = waveOffset,
            modifier = Modifier.align(Alignment.BottomCenter)
        )

        // Main content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 32.dp)
                .statusBarsPadding()
                .navigationBarsPadding(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Logo with pulse glow
            Box(
                modifier = Modifier
                    .size(160.dp)
                    .shadow(
                        elevation = 20.dp,
                        shape = CircleShape,
                        ambientColor = PrimaryContainer.copy(alpha = 0.3f),
                        spotColor = PrimaryContainer.copy(alpha = 0.3f)
                    )
                    .clip(CircleShape)
                    .background(Surface)
                    .padding(4.dp),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .size((160 * pulseScale).dp)
                        .clip(CircleShape)
                        .background(
                            Brush.radialGradient(
                                colors = listOf(
                                    PrimaryContainer.copy(alpha = 0.2f),
                                    PrimaryContainer.copy(alpha = 0.1f),
                                    Color.Transparent
                                )
                            )
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "MKU Logo",
                        modifier = Modifier
                            .size(140.dp)
                            .clip(CircleShape)
                    )
                }
            }

            Spacer(modifier = Modifier.height(48.dp))

            // Welcome text
            Text(
                text = "Welcome",
                style = MaterialTheme.typography.displayMedium,
                color = PrimaryContainer,
                modifier = Modifier.graphicsLayer(alpha = logoAlpha)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Empowering minds, Transforming lives",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.graphicsLayer(alpha = textAlpha)
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "Preparing your campus experience",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.8f),
                modifier = Modifier.graphicsLayer(alpha = textAlpha)
            )

            Spacer(modifier = Modifier.height(64.dp))

            // Loading spinner
            Box(
                modifier = Modifier.graphicsLayer(alpha = contentAlpha),
                contentAlignment = Alignment.Center
            ) {
                Canvas(
                    modifier = Modifier.size(56.dp)
                ) {
                    drawSpinner(spinnerRotation)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Loading...",
                style = MaterialTheme.typography.labelLarge,
                color = PrimaryContainer,
                modifier = Modifier.graphicsLayer(alpha = contentAlpha)
            )
        }
    }
}

@Composable
private fun WaveBackground(
    waveOffset: Float,
    modifier: Modifier = Modifier
) {
    Canvas(modifier = modifier.fillMaxWidth().height(221.dp)) {
        val width = size.width
        val height = size.height

        // Draw three wave layers
        drawWave(waveOffset, width, height, WaveColor1, 0.2f, 0.05f, 0f)
        drawWave(waveOffset, width, height, WaveColor2, 0.15f, 0.03f, -0.05f)
        drawWave(waveOffset, width, height, WaveColor3, 0.1f, 0.04f, -0.1f)
    }
}

private fun DrawScope.drawWave(
    offset: Float,
    width: Float,
    height: Float,
    color: Color,
    baseHeight: Float,
    amplitude: Float,
    phaseShift: Float
) {
    val path = Path()
    val waveHeight = height * (1f - baseHeight)

    path.moveTo(0f, height)

    for (x in 0..width.toInt()) {
        val angle = (x / width * 360f + offset + phaseShift * 180f) * (Math.PI / 180f)
        val y = waveHeight + sin(angle).toFloat() * height * amplitude
        path.lineTo(x.toFloat(), y)
    }

    path.lineTo(width, height)
    path.close()

    drawPath(path, color)
}

private fun DrawScope.drawSpinner(rotation: Float) {
    val sweepAngle = 270f
    val startAngle = rotation

    drawArc(
        color = WaveColor1,
        startAngle = startAngle,
        sweepAngle = sweepAngle,
        useCenter = false,
        style = androidx.compose.ui.graphics.drawscope.Stroke(width = 6.dp.toPx(), cap = androidx.compose.ui.graphics.StrokeCap.Round)
    )

    drawArc(
        color = WaveColor3.copy(alpha = 0.5f),
        startAngle = startAngle + sweepAngle,
        sweepAngle = 90f,
        useCenter = false,
        style = androidx.compose.ui.graphics.drawscope.Stroke(width = 6.dp.toPx(), cap = androidx.compose.ui.graphics.StrokeCap.Round)
    )
}