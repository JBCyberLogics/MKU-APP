package com.example.app;

import android.app.Application;
import android.util.Log;
import dagger.hilt.android.HiltAndroidApp;
import ke.ac.mku.authcore.bootstrap.BootstrapManager;
import ke.ac.mku.authcore.bootstrap.BootstrapState;
import javax.inject.Inject;

@dagger.hilt.android.HiltAndroidApp()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/example/app/MKUApplication;", "Landroid/app/Application;", "()V", "bootstrapManager", "Lke/ac/mku/authcore/bootstrap/BootstrapManager;", "getBootstrapManager", "()Lke/ac/mku/authcore/bootstrap/BootstrapManager;", "setBootstrapManager", "(Lke/ac/mku/authcore/bootstrap/BootstrapManager;)V", "onCreate", "", "Companion", "app_debug"})
public final class MKUApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "MKUApplication";
    @javax.inject.Inject()
    public ke.ac.mku.authcore.bootstrap.BootstrapManager bootstrapManager;
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
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/app/MKUApplication$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}