#!/bin/bash
# Build script for WebView App
# This script builds the release APK that anyone can install

echo "🔨 Building WebView App Release..."
echo "================================================"

# Clean and build
./gradlew clean assembleRelease

if [ $? -eq 0 ]; then
    echo "================================================"
    echo "✅ Build successful!"
    echo "📱 APK location: app/build/outputs/apk/release/app-release.apk"
    echo ""
    echo "To install on device:"
    echo "  adb install app/build/outputs/apk/release/app-release.apk"
    echo ""
    echo "Or copy the APK to your device and install manually."
else
    echo "❌ Build failed!"
    exit 1
fi
