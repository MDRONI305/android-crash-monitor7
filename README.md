# AndroidCrashMonitor

[![JitPack](https://jitpack.io/v/MDRONI305/android-crash-monitor8.svg)](https://jitpack.io/#MDRONI305/android-crash-monitor8)
[![License](https://img.shields.io/badge/License-Apache-2.0-blue.svg)](LICENSE)
[![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg)](https://android-arsenal.com/api?level=21)

AndroidCrashMonitor — Android Library

## Installation

Add JitPack to your root `build.gradle`:

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency:

```gradle
dependencies {
    implementation 'com.github.MDRONI305:android-crash-monitor8:1.0.0'
}
```

## Usage

```java
// Initialize the library
AndroidCrashMonitor library = AndroidCrashMonitor.getInstance(context);
library.init();
```

## Requirements

- Android API 21+
- Java 8+ / Kotlin 1.8+

## License

```
Copyright 2026 MDRONI305

Licensed under the Apache-2.0 License.
```

See [LICENSE](LICENSE) for details.
