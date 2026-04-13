package io.github.douglassantana.design_system.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import io.github.douglassantana.design_system.foundations.DSShapes
import io.github.douglassantana.design_system.foundations.colors.DSDarkColorScheme
import io.github.douglassantana.design_system.foundations.colors.DSLightColorScheme
import io.github.douglassantana.design_system.foundations.tokens.DSElevation
import io.github.douglassantana.design_system.foundations.tokens.DSRadius
import io.github.douglassantana.design_system.foundations.tokens.DSSpacing
import io.github.douglassantana.design_system.foundations.tokens.DSTypography

data class DSSpacingTokens(
    val none: androidx.compose.ui.unit.Dp = DSSpacing.none,
    val xs: androidx.compose.ui.unit.Dp = DSSpacing.xs,
    val sm: androidx.compose.ui.unit.Dp = DSSpacing.sm,
    val md: androidx.compose.ui.unit.Dp = DSSpacing.md,
    val lg: androidx.compose.ui.unit.Dp = DSSpacing.lg,
    val xl: androidx.compose.ui.unit.Dp = DSSpacing.xl,
    val xxl: androidx.compose.ui.unit.Dp = DSSpacing.xxl,
    val xxxl: androidx.compose.ui.unit.Dp = DSSpacing.xxxl,
)

data class DSRadiusTokens(
    val none: androidx.compose.ui.unit.Dp = DSRadius.none,
    val xs: androidx.compose.ui.unit.Dp = DSRadius.xs,
    val sm: androidx.compose.ui.unit.Dp = DSRadius.sm,
    val md: androidx.compose.ui.unit.Dp = DSRadius.md,
    val lg: androidx.compose.ui.unit.Dp = DSRadius.lg,
    val xl: androidx.compose.ui.unit.Dp = DSRadius.xl,
    val full: androidx.compose.ui.unit.Dp = DSRadius.full,
)

data class DSElevationTokens(
    val none: androidx.compose.ui.unit.Dp = DSElevation.none,
    val xs: androidx.compose.ui.unit.Dp = DSElevation.xs,
    val sm: androidx.compose.ui.unit.Dp = DSElevation.sm,
    val md: androidx.compose.ui.unit.Dp = DSElevation.md,
    val lg: androidx.compose.ui.unit.Dp = DSElevation.lg,
    val xl: androidx.compose.ui.unit.Dp = DSElevation.xl,
)

private val LocalDSSpacing = staticCompositionLocalOf { DSSpacingTokens() }
private val LocalDSRadius = staticCompositionLocalOf { DSRadiusTokens() }
private val LocalDSElevation = staticCompositionLocalOf { DSElevationTokens() }

@Composable
fun DSTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    spacing: DSSpacingTokens = DSSpacingTokens(),
    radius: DSRadiusTokens = DSRadiusTokens(),
    elevation: DSElevationTokens = DSElevationTokens(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) DSDarkColorScheme else DSLightColorScheme

    CompositionLocalProvider(
        LocalDSSpacing provides spacing,
        LocalDSRadius provides radius,
        LocalDSElevation provides elevation,
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = DSTypography(),
            shapes = DSShapes,
            content = content,
        )
    }
}

object DSTheme {
    val spacing: DSSpacingTokens
        @Composable @ReadOnlyComposable get() = LocalDSSpacing.current

    val radius: DSRadiusTokens
        @Composable @ReadOnlyComposable get() = LocalDSRadius.current

    val elevation: DSElevationTokens
        @Composable @ReadOnlyComposable get() = LocalDSElevation.current

    val colors
        @Composable @ReadOnlyComposable get() = MaterialTheme.colorScheme

    val typography
        @Composable @ReadOnlyComposable get() = MaterialTheme.typography

    val shapes
        @Composable @ReadOnlyComposable get() = MaterialTheme.shapes
}
