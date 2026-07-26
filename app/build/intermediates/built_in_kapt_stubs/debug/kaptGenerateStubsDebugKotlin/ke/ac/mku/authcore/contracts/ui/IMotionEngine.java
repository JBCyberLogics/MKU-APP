package ke.ac.mku.authcore.contracts.ui;

/**
 * IMotionEngine - PROGRAM-019
 *
 * Interface for the premium animation and motion system.
 */
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&\u00a8\u0006\u0010\u00c0\u0006\u0003"}, d2 = {"Lke/ac/mku/authcore/contracts/ui/IMotionEngine;", "", "prepareAnimationPlan", "Lke/ac/mku/authcore/domain/model/ui/AnimationPlan;", "layout", "Lke/ac/mku/authcore/domain/model/ui/LayoutBlueprint;", "executeTransition", "", "from", "Lke/ac/mku/authcore/domain/model/ui/RenderTree;", "to", "setMotionProfile", "profile", "Lke/ac/mku/authcore/domain/model/ui/MotionProfile;", "isAnimating", "", "app"})
public abstract interface IMotionEngine {
    
    /**
     * Prepare a concrete animation plan for a given layout change.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract ke.ac.mku.authcore.domain.model.ui.AnimationPlan prepareAnimationPlan(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.ui.LayoutBlueprint layout);
    
    /**
     * Coordinate a smooth transition between two render states.
     */
    public abstract void executeTransition(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.ui.RenderTree from, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.ui.RenderTree to);
    
    /**
     * Configure the global motion profile (e.g. FAST, EXPRESSIVE).
     */
    public abstract void setMotionProfile(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.domain.model.ui.MotionProfile profile);
    
    /**
     * Check if an animation sequence is currently active.
     */
    public abstract boolean isAnimating();
}