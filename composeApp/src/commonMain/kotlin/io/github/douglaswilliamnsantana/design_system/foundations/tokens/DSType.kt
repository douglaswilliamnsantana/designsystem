package io.github.douglaswilliamnsantana.design_system.foundations.tokens

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import io.github.douglaswilliamnsantana.design_system.foundations.typography.DSQuicksandFamily
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingBodyLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingBodyMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingBodySmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingDisplayLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingDisplayMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingDisplaySmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingHeadlineLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingHeadlineMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingHeadlineSmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingLabelLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingLabelMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingLabelSmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingTitleLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingTitleMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLetterSpacingTitleSmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightBodyLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightBodyMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightBodySmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightDisplayLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightDisplayMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightDisplaySmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightHeadlineLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightHeadlineMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightHeadlineSmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightLabelLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightLabelMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightLabelSmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightTitleLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightTitleMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsLineHeightTitleSmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeBodyLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeBodyMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeBodySmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeDisplayLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeDisplayMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeDisplaySmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeHeadlineLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeHeadlineMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeHeadlineSmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeLabelLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeLabelMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeLabelSmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeTitleLarge
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeTitleMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeSizeTitleSmall
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeWeightBold
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeWeightMedium
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeWeightRegular
import io.github.douglaswilliamnsantana.design_system.foundations.typography.dsTypeWeightSemiBold

@Composable
fun DSTypography(): Typography {
    val quicksand = DSQuicksandFamily()
    return Typography(
        displayLarge = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightBold,
            fontSize = dsTypeSizeDisplayLarge,
            lineHeight = dsLineHeightDisplayLarge,
            letterSpacing = dsLetterSpacingDisplayLarge,
        ),
        displayMedium = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightBold,
            fontSize = dsTypeSizeDisplayMedium,
            lineHeight = dsLineHeightDisplayMedium,
            letterSpacing = dsLetterSpacingDisplayMedium,
        ),
        displaySmall = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightBold,
            fontSize = dsTypeSizeDisplaySmall,
            lineHeight = dsLineHeightDisplaySmall,
            letterSpacing = dsLetterSpacingDisplaySmall,
        ),
        headlineLarge = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightBold,
            fontSize = dsTypeSizeHeadlineLarge,
            lineHeight = dsLineHeightHeadlineLarge,
            letterSpacing = dsLetterSpacingHeadlineLarge,
        ),
        headlineMedium = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightBold,
            fontSize = dsTypeSizeHeadlineMedium,
            lineHeight = dsLineHeightHeadlineMedium,
            letterSpacing = dsLetterSpacingHeadlineMedium,
        ),
        headlineSmall = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightBold,
            fontSize = dsTypeSizeHeadlineSmall,
            lineHeight = dsLineHeightHeadlineSmall,
            letterSpacing = dsLetterSpacingHeadlineSmall,
        ),
        titleLarge = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightSemiBold,
            fontSize = dsTypeSizeTitleLarge,
            lineHeight = dsLineHeightTitleLarge,
            letterSpacing = dsLetterSpacingTitleLarge,
        ),
        titleMedium = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightSemiBold,
            fontSize = dsTypeSizeTitleMedium,
            lineHeight = dsLineHeightTitleMedium,
            letterSpacing = dsLetterSpacingTitleMedium,
        ),
        titleSmall = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightMedium,
            fontSize = dsTypeSizeTitleSmall,
            lineHeight = dsLineHeightTitleSmall,
            letterSpacing = dsLetterSpacingTitleSmall,
        ),
        bodyLarge = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightRegular,
            fontSize = dsTypeSizeBodyLarge,
            lineHeight = dsLineHeightBodyLarge,
            letterSpacing = dsLetterSpacingBodyLarge,
        ),
        bodyMedium = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightRegular,
            fontSize = dsTypeSizeBodyMedium,
            lineHeight = dsLineHeightBodyMedium,
            letterSpacing = dsLetterSpacingBodyMedium,
        ),
        bodySmall = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightRegular,
            fontSize = dsTypeSizeBodySmall,
            lineHeight = dsLineHeightBodySmall,
            letterSpacing = dsLetterSpacingBodySmall,
        ),
        labelLarge = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightBold,
            fontSize = dsTypeSizeLabelLarge,
            lineHeight = dsLineHeightLabelLarge,
            letterSpacing = dsLetterSpacingLabelLarge,
        ),
        labelMedium = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightMedium,
            fontSize = dsTypeSizeLabelMedium,
            lineHeight = dsLineHeightLabelMedium,
            letterSpacing = dsLetterSpacingLabelMedium,
        ),
        labelSmall = TextStyle(
            fontFamily = quicksand,
            fontWeight = dsTypeWeightMedium,
            fontSize = dsTypeSizeLabelSmall,
            lineHeight = dsLineHeightLabelSmall,
            letterSpacing = dsLetterSpacingLabelSmall,
        ),
    )
}
