package io.github.joni.androidcrashmonitor.interfaces;

import androidx.annotation.NonNull;

/**
 * Listener interface for AndroidCrashMonitor events.
 *
 * @author MDRONI305
 */
public interface IAndroidCrashMonitorListener {

    /**
     * Called when the library is successfully initialized.
     */
    void onInitialized();

    /**
     * Called when an error occurs.
     *
     * @param errorCode numeric error code
     * @param message   human-readable message
     */
    void onError(int errorCode, @NonNull String message);
}
