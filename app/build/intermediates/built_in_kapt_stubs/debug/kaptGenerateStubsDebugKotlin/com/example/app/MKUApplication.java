package com.example.app;

@dagger.hilt.android.HiltAndroidApp()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016R#\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u0092\u0002\u0002\b\n\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR#\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u0092\u0002\u0002\b\n\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00ca\u0001\u0002\b\u0015\u00a8\u0006\u0014"}, d2 = {"Lcom/example/app/MKUApplication;", "Landroid/app/Application;", "<init>", "()V", "bootstrapManager", "Lke/ac/mku/authcore/bootstrap/BootstrapManager;", "getBootstrapManager", "()Lke/ac/mku/authcore/bootstrap/BootstrapManager;", "setBootstrapManager", "(Lke/ac/mku/authcore/bootstrap/BootstrapManager;)V", "Ljavax/inject/Inject;", "coreInitializer", "Lke/ac/mku/authcore/bootstrap/CoreInitializer;", "getCoreInitializer", "()Lke/ac/mku/authcore/bootstrap/CoreInitializer;", "setCoreInitializer", "(Lke/ac/mku/authcore/bootstrap/CoreInitializer;)V", "onCreate", "", "Companion", "app", "Ldagger/hilt/android/HiltAndroidApp;"})
public final class MKUApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "MKUApplication";
    @javax.inject.Inject()
    public ke.ac.mku.authcore.bootstrap.BootstrapManager bootstrapManager;
    @javax.inject.Inject()
    public ke.ac.mku.authcore.bootstrap.CoreInitializer coreInitializer;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.app.MKUApplication.Companion Companion = null;
    
    public MKUApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.bootstrap.BootstrapManager getBootstrapManager() {
        return null;
    }
    
    public final void setBootstrapManager(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.BootstrapManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.bootstrap.CoreInitializer getCoreInitializer() {
        return null;
    }
    
    public final void setCoreInitializer(@org.jetbrains.annotations.NotNull()
    ke.ac.mku.authcore.bootstrap.CoreInitializer p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/app/MKUApplication$Companion;", "", "<init>", "()V", "TAG", "", "app"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}