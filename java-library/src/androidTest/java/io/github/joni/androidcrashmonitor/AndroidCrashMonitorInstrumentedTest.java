package io.github.joni.androidcrashmonitor;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented tests for {@link AndroidCrashMonitor}.
 * Run on a real device or emulator.
 *
 * @author MDRONI305
 */
@RunWith(AndroidJUnit4.class)
public class AndroidCrashMonitorInstrumentedTest {

    @Test
    public void useAppContext() {
        Context ctx = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("io.github.joni.androidcrashmonitor.test", ctx.getPackageName());
    }

    @Test
    public void init_withContext_succeeds() {
        Context ctx = InstrumentationRegistry.getInstrumentation().getTargetContext();
        AndroidCrashMonitorConfig config = new AndroidCrashMonitorConfig.Builder()
            .debugEnabled(true)
            .build();
        AndroidCrashMonitor lib = AndroidCrashMonitor.getInstance();
        lib.init(ctx, config);
        assertTrue(lib.isInitialized());
        lib.release();
    }
}
