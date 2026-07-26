package ke.ac.mku.authcore.domain.model.ui

/**
 * MotionModels - PROGRAM-019
 *
 * Models for the premium motion and animation system.
 */

data class AnimationPlan(
    val planId: String,
    val timestamp: Long,
    val widgetAnimations: List<WidgetAnimation>,
    val transition: TransitionType
)

data class WidgetAnimation(
    val widgetId: String,
    val type: AnimationCategory,
    val durationMs: Int,
    val delayMs: Int = 0
)

data class TransitionPlan(
    val fromState: String,
    val toState: String,
    val durationMs: Int,
    val effect: TransitionEffect
)

data class MotionProfile(
    val id: String,
    val durationMs: Int,
    val springDamping: Float = 0.8f,
    val springStiffness: Float = 300f
) {
    companion object {
        val FAST = MotionProfile("FAST", 150, 0.9f, 400f)
        val NORMAL = MotionProfile("NORMAL", 250, 0.8f, 300f)
        val EXPRESSIVE = MotionProfile("EXPRESSIVE", 400, 0.7f, 200f)
        val HERO = MotionProfile("HERO", 600, 0.6f, 150f)
    }
}

enum class AnimationCategory {
    WIDGET_ENTRY,
    WIDGET_EXIT,
    WIDGET_REORDER,
    WIDGET_EXPAND,
    WIDGET_COLLAPSE,
    CHART_ANIMATION,
    COUNTER_ANIMATION,
    LOADING_SHIMMER
}

enum class TransitionType {
    FADE,
    SCALE,
    SLIDE,
    SHARED_ELEMENT
}

enum class TransitionEffect {
    CROSS_FADE,
    SLIDE_UP,
    EXPLODE,
    IMPLODE
}

data class GestureHandler(
    val type: String,
    val isEnabled: Boolean,
    val sensitivity: Float = 1.0f
)
