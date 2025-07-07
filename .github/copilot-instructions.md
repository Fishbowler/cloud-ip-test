<!-- Use this file to provide workspace-specific custom instructions to Copilot. For more details, visit https://code.visualstudio.com/docs/copilot/copilot-customization#_use-a-githubcopilotinstructionsmd-file -->

# WebView Android App Development Guidelines

This is an Android application project that creates a simple app with two buttons opening different URLs in WebViews.

## Project Context
- **Platform**: Android
- **Language**: Java
- **Build System**: Gradle
- **UI Framework**: Android Views with Material Design
- **Target**: Simple WebView demonstration app

## Development Guidelines

### Code Style
- Follow Android coding conventions
- Use meaningful variable and method names
- Add proper comments for complex logic
- Maintain consistent indentation (4 spaces)

### Architecture
- MainActivity: Main screen with buttons
- WebViewActivity: Displays web content
- Simple activity-based architecture suitable for this small app

### WebView Best Practices
- Always enable JavaScript for modern web content
- Handle navigation within WebView using WebViewClient
- Configure appropriate WebView settings for better user experience
- Consider security implications when enabling JavaScript

### UI Guidelines
- Use Material Design components
- Maintain consistent spacing and typography
- Ensure proper accessibility support
- Test on different screen sizes

### Build Configuration
- Keep dependencies up to date
- Use appropriate SDK versions
- Configure ProGuard rules if needed for release builds
