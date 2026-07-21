package ke.ac.mku.authcore.bootstrap;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B-\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u001a\u0002\b\f\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\"H\u0082@\u00a2\u0006\u0002\u0010#J<\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u001c\u0010)\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0+\u0012\u0006\u0012\u0004\u0018\u00010\u00010*H\u0082@\u00a2\u0006\u0002\u0010,J\u001a\u0010-\u001a\u00020\"2\n\u0010.\u001a\u00060/j\u0002`0H\u0082@\u00a2\u0006\u0002\u00101R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u0002\b4\u00a8\u00063"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapManager;", "", "configManager", "Lke/ac/mku/authcore/config/ConfigManager;", "dependencyRegistry", "Lke/ac/mku/authcore/registry/DependencyRegistry;", "authCoreManager", "Lke/ac/mku/authcore/manager/AuthCoreManager;", "eventBus", "Lke/ac/mku/authcore/bootstrap/EventBus;", "<init>", "(Lke/ac/mku/authcore/config/ConfigManager;Lke/ac/mku/authcore/registry/DependencyRegistry;Lke/ac/mku/authcore/manager/AuthCoreManager;Lke/ac/mku/authcore/bootstrap/EventBus;)V", "Ljavax/inject/Inject;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lke/ac/mku/authcore/bootstrap/BootstrapState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "_progress", "Lke/ac/mku/authcore/bootstrap/StartupProgress;", "progress", "getProgress", "startTime", "", "hasStarted", "", "start", "getStatus", "Lke/ac/mku/authcore/bootstrap/BootstrapStatus;", "executePipeline", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeStep", "step", "", "action", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(ILjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleFailure", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app", "Ljavax/inject/Singleton;"})
public final class BootstrapManager {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.config.ConfigManager configManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.registry.DependencyRegistry dependencyRegistry = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.AuthCoreManager authCoreManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.bootstrap.EventBus eventBus = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "BootstrapManager";
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<ke.ac.mku.authcore.bootstrap.BootstrapState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<ke.ac.mku.authcore.bootstrap.BootstrapState> state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<ke.ac.mku.authcore.bootstrap.StartupProgress> _progress = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<ke.ac.mku.authcore.bootstrap.StartupProgress> progress = null;
    private long startTime = 0L;
    private boolean hasStarted = false;
    @org.jetbrains.annotations.NotNull()
    public static final ke.ac.mku.authcore.bootstrap.BootstrapManager.Companion Companion = null;
    
    @javax.inject.Inject()
    public BootstrapManager(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.config.ConfigManager configManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.registry.DependencyRegistry dependencyRegistry, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.AuthCoreManager authCoreManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.EventBus eventBus) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<ke.ac.mku.authcore.bootstrap.BootstrapState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<ke.ac.mku.authcore.bootstrap.StartupProgress> getProgress() {
        return null;
    }
    
    public final boolean start() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.bootstrap.BootstrapStatus getStatus() {
        return null;
    }
    
    private final java.lang.Object executePipeline(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object executeStep(int step, java.lang.String action, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object handleFailure(java.lang.Exception e, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lke/ac/mku/authcore/bootstrap/BootstrapManager$Companion;", "", "<init>", "()V", "TAG", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}