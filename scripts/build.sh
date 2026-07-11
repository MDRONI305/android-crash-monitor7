#!/bin/bash
# Build script for AndroidCrashMonitor
set -e

echo "Building AndroidCrashMonitor v1.0.0..."
chmod +x gradlew
./gradlew clean java-library:assembleRelease
echo "Build complete: java-library/build/outputs/aar/"
