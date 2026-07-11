package io.github.joni.androidcrashmonitor;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for {@link AndroidCrashMonitor}.
 *
 * @author MDRONI305
 */
public class AndroidCrashMonitorTest {

    @Test
    public void getInstance_returnsSameInstance() {
        AndroidCrashMonitor a = AndroidCrashMonitor.getInstance();
        AndroidCrashMonitor b = AndroidCrashMonitor.getInstance();
        assertSame(a, b);
    }

    @Test
    public void isInitialized_falseBeforeInit() {
        // Reset singleton for test isolation
        AndroidCrashMonitor lib = AndroidCrashMonitor.getInstance();
        assertFalse("Should not be initialized before init()", lib.isInitialized());
    }

    @Test
    public void config_builder_defaults() {
        AndroidCrashMonitorConfig config = new AndroidCrashMonitorConfig.Builder().build();
        assertFalse(config.isDebugEnabled());
        assertEquals("AndroidCrashMonitor", config.getTag());
        assertEquals(30_000, config.getTimeout());
    }
}
