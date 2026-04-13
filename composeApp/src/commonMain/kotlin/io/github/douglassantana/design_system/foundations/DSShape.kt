package io.github.douglassantana.design_system.foundations

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import io.github.douglassantana.design_system.foundations.tokens.DSRadius

val DSShapes = Shapes(
    extraSmall = RoundedCornerShape(size = DSRadius.xs),
    small = RoundedCornerShape(size = DSRadius.sm),
    medium = RoundedCornerShape(size = DSRadius.md),
    large = RoundedCornerShape(size = DSRadius.lg),
    extraLarge = RoundedCornerShape(size = DSRadius.xl),
)
