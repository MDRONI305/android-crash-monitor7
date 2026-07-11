package io.github.joni.androidcrashmonitor;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Internal logger for AndroidCrashMonitor.
 * Respects {@link AndroidCrashMonitorConfig#isDebugEnabled()}.
 *
 * @author MDRONI305
 */
public final class AndroidCrashMonitorLogger {

    private static final String DEFAULT_TAG = "AndroidCrashMonitor";
    private static boolean sDebug = false;

    private AndroidCrashMonitorLogger() {}

    /** Enable or disable debug logging. */
    public static void setDebug(boolean debug) { sDebug = debug; }

    /** Log a debug message. */
    public static void d(@NonNull String tag, @NonNull String msg) {
        if (sDebug) Log.d(tag, msg);
    }

    /** Log an info message. */
    public static void i(@NonNull String tag, @NonNull String msg) {
        Log.i(tag, msg);
    }

    /** Log a warning. */
    public static void w(@NonNull String tag, @NonNull String msg) {
        Log.w(tag, msg);
    }

    /** Log an error. */
    public static void e(@NonNull String tag, @NonNull String msg) {
        Log.e(tag, msg);
    }

    /** Log an error with throwable. */
    public static void e(@NonNull String tag, @NonNull String msg, @Nullable Throwable t) {
        Log.e(tag, msg, t);
    }
}
