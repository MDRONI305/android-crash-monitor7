package io.github.joni.androidcrashmonitor.sample;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import io.github.joni.androidcrashmonitor.AndroidCrashMonitor;
import io.github.joni.androidcrashmonitor.AndroidCrashMonitorConfig;

/**
 * Sample Activity demonstrating AndroidCrashMonitor usage.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the library
        AndroidCrashMonitorConfig config = new AndroidCrashMonitorConfig.Builder()
            .debugEnabled(true)
            .tag("SampleApp")
            .build();

        AndroidCrashMonitor.getInstance().init(getApplicationContext(), config);

        TextView statusView = findViewById(R.id.tv_status);
        boolean initialized = AndroidCrashMonitor.getInstance().isInitialized();
        statusView.setText("AndroidCrashMonitor initialized: " + initialized);
    }
}
