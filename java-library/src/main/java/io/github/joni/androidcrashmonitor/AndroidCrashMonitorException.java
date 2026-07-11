package io.github.joni.androidcrashmonitor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Base exception for AndroidCrashMonitor.
 *
 * @author MDRONI305
 */
public class AndroidCrashMonitorException extends RuntimeException {

    private final int code;

    /** Create exception with message. */
    public AndroidCrashMonitorException(@NonNull String message) {
        super(message);
        this.code = -1;
    }

    /** Create exception with message and cause. */
    public AndroidCrashMonitorException(@NonNull String message, @Nullable Throwable cause) {
        super(message, cause);
        this.code = -1;
    }

    /** Create exception with error code. */
    public AndroidCrashMonitorException(@NonNull String message, int code) {
        super(message);
        this.code = code;
    }

    /** @return numeric error code, or -1 if not set */
    public int getCode() { return code; }
}
