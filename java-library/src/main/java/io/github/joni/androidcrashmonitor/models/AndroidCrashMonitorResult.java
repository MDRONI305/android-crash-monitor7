package io.github.joni.androidcrashmonitor.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Generic result wrapper for AndroidCrashMonitor operations.
 *
 * @param <T> the result data type
 * @author MDRONI305
 */
public final class AndroidCrashMonitorResult<T> {

    private final boolean success;
    private final T       data;
    private final String  errorMessage;
    private final int     errorCode;

    private AndroidCrashMonitorResult(boolean success, T data, String errorMessage, int errorCode) {
        this.success      = success;
        this.data         = data;
        this.errorMessage = errorMessage;
        this.errorCode    = errorCode;
    }

    /** Create a success result with data. */
    @NonNull
    public static <T> AndroidCrashMonitorResult<T> success(@Nullable T data) {
        return new AndroidCrashMonitorResult<>(true, data, null, 0);
    }

    /** Create an error result. */
    @NonNull
    public static <T> AndroidCrashMonitorResult<T> error(@NonNull String message, int code) {
        return new AndroidCrashMonitorResult<>(false, null, message, code);
    }

    /** @return true if the operation succeeded */
    public boolean isSuccess() { return success; }

    /** @return the result data, or null on error */
    @Nullable
    public T getData() { return data; }

    /** @return error message, or null on success */
    @Nullable
    public String getErrorMessage() { return errorMessage; }

    /** @return numeric error code */
    public int getErrorCode() { return errorCode; }
}
