package io.github.joni.androidcrashmonitor;

import android.content.Context;
import androidx.annotation.NonNull;

/**
 * AndroidCrashMonitor — main entry point.
 *
 * <p>Usage:
 * <pre>
 *   AndroidCrashMonitor lib = AndroidCrashMonitor.getInstance();
 *   lib.init(context, new AndroidCrashMonitorConfig.Builder().build());
 * </pre>
 *
 * @author  MDRONI305
 * @version 1.0.0
 */
public final class AndroidCrashMonitor {

    private static volatile AndroidCrashMonitor sInstance;
    private AndroidCrashMonitorConfig mConfig;
    private boolean mInitialized;

    /** Private constructor — use {@link #getInstance()}. */
    private AndroidCrashMonitor() {}

    /**
     * Returns the singleton instance of {@link AndroidCrashMonitor}.
     *
     * @return singleton instance
     */
    @NonNull
    public static AndroidCrashMonitor getInstance() {
        if (sInstance == null) {
            synchronized (AndroidCrashMonitor.class) {
                if (sInstance == null) {
                    sInstance = new AndroidCrashMonitor();
                }
            }
        }
        return sInstance;
    }

    /**
     * Initialize the library.
     *
     * @param context application context
     * @param config  library configuration
     */
    public void init(@NonNull Context context, @NonNull AndroidCrashMonitorConfig config) {
        if (mInitialized) {
            AndroidCrashMonitorLogger.w("AndroidCrashMonitor", "Already initialized");
            return;
        }
        mConfig      = config;
        mInitialized = true;
        AndroidCrashMonitorLogger.i("AndroidCrashMonitor", "Initialized — version 1.0.0");
    }

    /**
     * Check if the library has been initialized.
     *
     * @return true if initialized
     */
    public boolean isInitialized() { return mInitialized; }

    /**
     * Return the current configuration.
     *
     * @return config, or null if not initialized
     */
    public AndroidCrashMonitorConfig getConfig() { return mConfig; }

    /** Release all resources held by this instance. */
    public void release() {
        mInitialized = false;
        mConfig      = null;
        sInstance    = null;
    }
}
