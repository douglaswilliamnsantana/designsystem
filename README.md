# DS Design System

A Kotlin Multiplatform design system for Android and iOS, built with Compose Multiplatform and Material3.

## Installation

Add the dependency to your `build.gradle.kts`:

```kotlin
dependencies {
    implementation("io.github.douglassantana:design-system:1.0.0")
}
```

Make sure `mavenCentral()` is in your repositories.

## Usage

Wrap your app with `DSTheme`:

```kotlin
@Composable
fun App() {
    DSTheme {
        // your content
    }
}
```

Dark theme is applied automatically based on system settings. You can override it:

```kotlin
DSTheme(darkTheme = true) {
    // forced dark
}
```

### Accessing tokens

```kotlin
DSTheme.colors.primary
DSTheme.typography.bodyLarge
DSTheme.shapes.medium
DSTheme.spacing.md
DSTheme.radius.sm
DSTheme.elevation.xs
```

## Project structure

```
foundations/
  colors/         ← raw color values (Light, Dark, Medium/High Contrast)
  typography/     ← font family, sizes, weights, line heights, letter spacing
tokens/
  DSSpacing.kt
  DSRadius.kt
  DSElevation.kt
  DSType.kt       ← assembles Typography with Quicksand font
theme/
  DSShape.kt
  DSTheme.kt      ← entry point
```

## Requirements

- Android minSdk 31
- iOS arm64 / iosSimulatorArm64
- Kotlin 2.3.20
- Compose Multiplatform 1.10.3

## License

```
MIT License

Copyright (c) 2025 Douglas Santana

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
