package ke.ac.mku.authcore.contracts.ui

import ke.ac.mku.authcore.domain.model.ui.AnimationPlan
import ke.ac.mku.authcore.domain.model.ui.LayoutBlueprint
import ke.ac.mku.authcore.domain.model.ui.MotionProfile
import ke.ac.mku.authcore.domain.model.ui.RenderTree

/**
 * IMotionEngine - PROGRAM-019
 *
 * Interface for the premium animation and motion system.
 */
interface IMotionEngine {

    /**
     * Prepare a concrete animation plan for a given layout change.
     */
    fun prepareAnimationPlan(layout: LayoutBlueprint): AnimationPlan

    /**
     * Coordinate a smooth transition between two render states.
     */
    fun executeTransition(from: RenderTree, to: RenderTree)

    /**
     * Configure the global motion profile (e.g. FAST, EXPRESSIVE).
     */
    fun setMotionProfile(profile: MotionProfile)

    /**
     * Check if an animation sequence is currently active.
     */
    fun isAnimating(): Boolean
}
