# WebView Android App

This is a simple Android application that demonstrates how to use WebViews to display web content. The app features two buttons on the main screen, each opening a different URL in a WebView.

## Features

- **Main Activity**: Contains two buttons that open different websites
- **WebView Activity**: Displays web content in a full-screen WebView
- **Internet Permission**: Configured to allow network access
- **Modern UI**: Uses Material Design components with a clean interface

## App Structure

### Main Screen
- Title: "WebView App"
- Button 1: "Open Google" - Opens https://www.google.com
- Button 2: "Open GitHub" - Opens https://www.github.com

### WebView Screen
- Full-screen WebView that loads the selected URL
- JavaScript enabled for interactive web content
- Zoom controls available
- Navigation handled within the WebView

## Technical Details

- **Min SDK**: 21 (Android 5.0)
- **Target SDK**: 34 (Android 14)
- **Language**: Java
- **Build System**: Gradle

## Project Structure

```
app/
├── src/main/
│   ├── java/com/example/webviewapp/
│   │   ├── MainActivity.java      # Main activity with buttons
│   │   └── WebViewActivity.java   # WebView activity
│   ├── res/
│   │   ├── layout/
│   │   │   ├── activity_main.xml     # Main screen layout
│   │   │   └── activity_webview.xml  # WebView screen layout
│   │   └── values/
│   │       ├── strings.xml
│   │       ├── colors.xml
│   │       └── themes.xml
│   └── AndroidManifest.xml
└── build.gradle
```

## Building and Running

### Prerequisites
- Android Studio or VS Code with Android development setup
- Java Development Kit (JDK) 8 or higher
- Android SDK

### Build the Project
```bash
./gradlew build
```

### Install on Device/Emulator
```bash
./gradlew installDebug
```

## Customization

You can easily customize the URLs by modifying the `MainActivity.java` file:

```java
// Change these URLs to your desired websites
intent.putExtra("url", "https://www.google.com");
intent.putExtra("url", "https://www.github.com");
```

## Permissions

The app requires the following permission:
- `INTERNET` - Required for loading web content in WebViews
