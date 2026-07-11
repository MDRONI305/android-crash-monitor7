package io.github.joni.androidcrashmonitor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Configuration for {@link AndroidCrashMonitor}.
 * Use {@link Builder} to construct an instance.
 *
 * @author MDRONI305
 */
public final class AndroidCrashMonitorConfig {

    private final boolean debugEnabled;
    private final String  tag;
    private final int     timeout;

    private AndroidCrashMonitorConfig(@NonNull Builder builder) {
        this.debugEnabled = builder.debugEnabled;
        this.tag          = builder.tag;
        this.timeout      = builder.timeout;
    }

    /** @return true if debug logging is enabled */
    public boolean isDebugEnabled() { return debugEnabled; }

    /** @return log tag */
    @NonNull
    public String getTag() { return tag; }

    /** @return timeout in milliseconds */
    public int getTimeout() { return timeout; }

    @NonNull
    @Override
    public String toString() {
        return "AndroidCrashMonitorConfig{debug=" + debugEnabled + ", tag='" + tag + "', timeout=" + timeout + "}";
    }

    /**
     * Builder for {@link AndroidCrashMonitorConfig}.
     */
    public static final class Builder {
        private boolean debugEnabled = false;
        private String  tag          = "AndroidCrashMonitor";
        private int     timeout      = 30_000;

        /** Enable or disable debug logging. */
        @NonNull
        public Builder debugEnabled(boolean enabled) { this.debugEnabled = enabled; return this; }

        /** Set the log tag. */
        @NonNull
        public Builder tag(@NonNull String tag) { this.tag = tag; return this; }

        /** Set the operation timeout in milliseconds. */
        @NonNull
        public Builder timeout(int ms) { this.timeout = ms; return this; }

        /** Build the configuration. */
        @NonNull
        public AndroidCrashMonitorConfig build() { return new AndroidCrashMonitorConfig(this); }
    }
}
