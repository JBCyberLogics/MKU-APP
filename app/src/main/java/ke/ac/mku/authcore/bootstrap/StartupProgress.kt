package ke.ac.mku.authcore.bootstrap

data class StartupProgress(
    val currentStep: Int,
    val totalSteps: Int,
    val currentAction: String,
    val percentage: Int,
    val elapsedMs: Long
) {
    companion object {
        const val TOTAL_STEPS = 6

        fun initial() = StartupProgress(
            currentStep = 0,
            totalSteps = TOTAL_STEPS,
            currentAction = "Starting...",
            percentage = 0,
            elapsedMs = 0
        )

        fun fromStep(step: Int, action: String, elapsedMs: Long): StartupProgress {
            val percentage = ((step.toFloat() / TOTAL_STEPS) * 100).toInt()
            return StartupProgress(
                currentStep = step,
                totalSteps = TOTAL_STEPS,
                currentAction = action,
                percentage = percentage.coerceIn(0, 100),
                elapsedMs = elapsedMs
            )
        }
    }
}