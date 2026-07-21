package ke.ac.mku.authcore.runtime;

/**
 * Provides runtime environment information including device details,
 * Android version, network status, and debug detection.
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001:\u000278B\u001b\b\u0007\u0012\f\b\u0001\u0010\u0002\u001a\u00020\u0003:\u0002\b\u0004\u001a\u0002\b\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0006\u00105\u001a\u000206R\u0015\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004\u0092\u0002\u0002\b\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u0014X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u0018X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u0018X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u001f\u001a\u00020 8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\b$\u0010\u001aR\u0011\u0010%\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010\'R\u0011\u0010(\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010\'R\u0011\u0010)\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\b)\u0010\'R\u0011\u0010*\u001a\u00020&8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010\'R\u0011\u0010+\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\b0\u0010\u001aR\u0011\u00101\u001a\u0002028F\u00a2\u0006\u0006\u001a\u0004\b3\u00104\u00ca\u0001\u0002\b:\u00a8\u00069"}, d2 = {"Lke/ac/mku/authcore/runtime/EnvironmentInfo;", "", "context", "Landroid/content/Context;", "Ldagger/hilt/android/qualifiers/ApplicationContext;", "<init>", "(Landroid/content/Context;)V", "Ljavax/inject/Inject;", "connectivityManager", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "()Landroid/net/ConnectivityManager;", "connectivityManager$delegate", "Lkotlin/Lazy;", "windowManager", "Landroid/view/WindowManager;", "getWindowManager", "()Landroid/view/WindowManager;", "windowManager$delegate", "androidVersion", "", "getAndroidVersion", "()I", "androidVersionName", "", "getAndroidVersionName", "()Ljava/lang/String;", "deviceModel", "getDeviceModel", "deviceBrand", "getDeviceBrand", "appVersionCode", "", "getAppVersionCode", "()J", "appVersionName", "getAppVersionName", "isDebugBuild", "", "()Z", "isNetworkAvailable", "isWifiConnected", "isCellularConnected", "networkType", "Lke/ac/mku/authcore/runtime/EnvironmentInfo$NetworkType;", "getNetworkType", "()Lke/ac/mku/authcore/runtime/EnvironmentInfo$NetworkType;", "screenResolution", "getScreenResolution", "screenDensity", "", "getScreenDensity", "()F", "getEnvironmentDetails", "Lke/ac/mku/authcore/runtime/EnvironmentInfo$EnvironmentDetails;", "NetworkType", "EnvironmentDetails", "app", "Ljavax/inject/Singleton;"})
public final class EnvironmentInfo {
    @dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy connectivityManager$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy windowManager$delegate = null;
    
    /**
     * Get the Android SDK version.
     */
    private final int androidVersion = 0;
    
    /**
     * Get the Android version name (e.g., "14", "13").
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String androidVersionName = null;
    
    /**
     * Get the device model.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String deviceModel = null;
    
    /**
     * Get the device brand.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String deviceBrand = null;
    
    @javax.inject.Inject()
    public EnvironmentInfo(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final android.net.ConnectivityManager getConnectivityManager() {
        return null;
    }
    
    private final android.view.WindowManager getWindowManager() {
        return null;
    }
    
    /**
     * Get the Android SDK version.
     */
    public final int getAndroidVersion() {
        return 0;
    }
    
    /**
     * Get the Android version name (e.g., "14", "13").
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAndroidVersionName() {
        return null;
    }
    
    /**
     * Get the device model.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceModel() {
        return null;
    }
    
    /**
     * Get the device brand.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeviceBrand() {
        return null;
    }
    
    public final long getAppVersionCode() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppVersionName() {
        return null;
    }
    
    public final boolean isDebugBuild() {
        return false;
    }
    
    public final boolean isNetworkAvailable() {
        return false;
    }
    
    public final boolean isWifiConnected() {
        return false;
    }
    
    public final boolean isCellularConnected() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.runtime.EnvironmentInfo.NetworkType getNetworkType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScreenResolution() {
        return null;
    }
    
    public final float getScreenDensity() {
        return 0.0F;
    }
    
    /**
     * Get all environment information as a data class.
     */
    @org.jetbrains.annotations.NotNull()
    public final ke.ac.mku.authcore.runtime.EnvironmentInfo.EnvironmentDetails getEnvironmentDetails() {
        return null;
    }
    
    /**
     * Complete environment details.
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0004\b\u0013\u0010\u0014J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\tH\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\fH\u00c6\u0003J\t\u0010+\u001a\u00020\fH\u00c6\u0003J\t\u0010,\u001a\u00020\u000fH\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0012H\u00c6\u0003Jw\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u00c6\u0001J\u0014\u00100\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u00102\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u00103\u001a\u00020\u0005H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001eR\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#\u00a8\u00064"}, d2 = {"Lke/ac/mku/authcore/runtime/EnvironmentInfo$EnvironmentDetails;", "", "androidVersion", "", "androidVersionName", "", "deviceModel", "deviceBrand", "appVersionCode", "", "appVersionName", "isDebugBuild", "", "isNetworkAvailable", "networkType", "Lke/ac/mku/authcore/runtime/EnvironmentInfo$NetworkType;", "screenResolution", "screenDensity", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZZLke/ac/mku/authcore/runtime/EnvironmentInfo$NetworkType;Ljava/lang/String;F)V", "getAndroidVersion", "()I", "getAndroidVersionName", "()Ljava/lang/String;", "getDeviceModel", "getDeviceBrand", "getAppVersionCode", "()J", "getAppVersionName", "()Z", "getNetworkType", "()Lke/ac/mku/authcore/runtime/EnvironmentInfo$NetworkType;", "getScreenResolution", "getScreenDensity", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "app"})
    public static final class EnvironmentDetails {
        private final int androidVersion = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String androidVersionName = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String deviceModel = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String deviceBrand = null;
        private final long appVersionCode = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String appVersionName = null;
        private final boolean isDebugBuild = false;
        private final boolean isNetworkAvailable = false;
        @org.jetbrains.annotations.NotNull()
        private final ke.ac.mku.authcore.runtime.EnvironmentInfo.NetworkType networkType = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String screenResolution = null;
        private final float screenDensity = 0.0F;
        
        public EnvironmentDetails(int androidVersion, @org.jetbrains.annotations.NotNull()
        java.lang.String androidVersionName, @org.jetbrains.annotations.NotNull()
        java.lang.String deviceModel, @org.jetbrains.annotations.NotNull()
        java.lang.String deviceBrand, long appVersionCode, @org.jetbrains.annotations.NotNull()
        java.lang.String appVersionName, boolean isDebugBuild, boolean isNetworkAvailable, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.runtime.EnvironmentInfo.NetworkType networkType, @org.jetbrains.annotations.NotNull()
        java.lang.String screenResolution, float screenDensity) {
            super();
        }
        
        public final int getAndroidVersion() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAndroidVersionName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDeviceModel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDeviceBrand() {
            return null;
        }
        
        public final long getAppVersionCode() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAppVersionName() {
            return null;
        }
        
        public final boolean isDebugBuild() {
            return false;
        }
        
        public final boolean isNetworkAvailable() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.runtime.EnvironmentInfo.NetworkType getNetworkType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getScreenResolution() {
            return null;
        }
        
        public final float getScreenDensity() {
            return 0.0F;
        }
        
        public final int component1() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component10() {
            return null;
        }
        
        public final float component11() {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        public final long component5() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        public final boolean component7() {
            return false;
        }
        
        public final boolean component8() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.runtime.EnvironmentInfo.NetworkType component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ke.ac.mku.authcore.runtime.EnvironmentInfo.EnvironmentDetails copy(int androidVersion, @org.jetbrains.annotations.NotNull()
        java.lang.String androidVersionName, @org.jetbrains.annotations.NotNull()
        java.lang.String deviceModel, @org.jetbrains.annotations.NotNull()
        java.lang.String deviceBrand, long appVersionCode, @org.jetbrains.annotations.NotNull()
        java.lang.String appVersionName, boolean isDebugBuild, boolean isNetworkAvailable, @org.jetbrains.annotations.NotNull()
        ke.ac.mku.authcore.runtime.EnvironmentInfo.NetworkType networkType, @org.jetbrains.annotations.NotNull()
        java.lang.String screenResolution, float screenDensity) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    /**
     * Network type enum.
     */
    @kotlin.Metadata(mv = {2, 4, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lke/ac/mku/authcore/runtime/EnvironmentInfo$NetworkType;", "", "<init>", "(Ljava/lang/String;I)V", "WIFI", "CELLULAR", "OTHER", "NONE", "app"})
    public static enum NetworkType {
        /*public static final*/ WIFI /* = new WIFI() */,
        /*public static final*/ CELLULAR /* = new CELLULAR() */,
        /*public static final*/ OTHER /* = new OTHER() */,
        /*public static final*/ NONE /* = new NONE() */;
        
        NetworkType() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<ke.ac.mku.authcore.runtime.EnvironmentInfo.NetworkType> getEntries() {
            return null;
        }
    }
}