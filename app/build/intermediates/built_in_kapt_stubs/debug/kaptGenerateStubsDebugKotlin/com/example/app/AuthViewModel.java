package com.example.app;

@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0002\b\t\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0012J\u0006\u0010\u001b\u001a\u00020\u0012J\b\u0010\u001c\u001a\u00020\u0012H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00ca\u0001\u0002\b\u001e\u00a8\u0006\u001d"}, d2 = {"Lcom/example/app/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "Lke/ac/mku/authcore/bootstrap/BootstrapObserver;", "authCoreManager", "Lke/ac/mku/authcore/manager/AuthCoreManager;", "eventBus", "Lke/ac/mku/authcore/bootstrap/EventBus;", "<init>", "(Lke/ac/mku/authcore/manager/AuthCoreManager;Lke/ac/mku/authcore/bootstrap/EventBus;)V", "Ljavax/inject/Inject;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/app/LoginUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onBootstrapEvent", "", "event", "Lke/ac/mku/authcore/bootstrap/BootstrapEvent;", "login", "regNumber", "", "password", "portalType", "logout", "clearError", "onCleared", "app", "Ldagger/hilt/android/lifecycle/HiltViewModel;"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class AuthViewModel extends androidx.lifecycle.ViewModel implements ke.ac.mku.authcore.bootstrap.BootstrapObserver {
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.manager.AuthCoreManager authCoreManager = null;
    @org.jetbrains.annotations.NotNull()
    private final ke.ac.mku.authcore.bootstrap.EventBus eventBus = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.app.LoginUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.app.LoginUiState> uiState = null;
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.manager.AuthCoreManager authCoreManager, @org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.EventBus eventBus) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.app.LoginUiState> getUiState() {
        return null;
    }
    
    @java.lang.Override()
    public void onBootstrapEvent(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.BootstrapEvent event) {
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String regNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String portalType) {
    }
    
    public final void logout() {
    }
    
    public final void clearError() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}