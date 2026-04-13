package com.douglassantana.design_system.foundations.tokens

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import com.douglassantana.design_system.foundations.typography.DSQuicksandFamily
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingBodyLarge
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingBodyMedium
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingBodySmall
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingDisplayLarge
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingDisplayMedium
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingDisplaySmall
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingHeadlineLarge
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingHeadlineMedium
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingHeadlineSmall
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingLabelLarge
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingLabelMedium
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingLabelSmall
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingTitleLarge
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingTitleMedium
import com.douglassantana.design_system.foundations.typography.dsLetterSpacingTitleSmall
import com.douglassantana.design_system.foundations.typography.dsLineHeightBodyLarge
import com.douglassantana.design_system.foundations.typography.dsLineHeightBodyMedium
import com.douglassantana.design_system.foundations.typography.dsLineHeightBodySmall
import com.douglassantana.design_system.foundations.typography.dsLineHeightDisplayLarge
import com.douglassantana.design_system.foundations.typography.dsLineHeightDisplayMedium
import com.douglassantana.design_system.foundations.typography.dsLineHeightDisplaySmall
import com.douglassantana.design_system.foundations.typography.dsLineHeightHeadlineLarge
import com.douglassantana.design_system.foundations.typography.dsLineHeightHeadlineMedium
import com.douglassantana.design_system.foundations.typography.dsLineHeightHeadlineSmall
import com.douglassantana.design_system.foundations.typography.dsLineHeightLabelLarge
import com.douglassantana.design_system.foundations.typography.dsLineHeightLabelMedium
import com.douglassantana.design_system.foundations.typography.dsLineHeightLabelSmall
import com.douglassantana.design_system.foundations.typography.dsLineHeightTitleLarge
import com.douglassantana.design_system.foundations.typography.dsLineHeightTitleMedium
import com.douglassantana.design_system.foundations.typography.dsLineHeightTitleSmall
import com.douglassantana.design_system.foundations.typography.dsTypeSizeBodyLarge
import com.douglassantana.design_system.foundations.typography.dsTypeSizeBodyMedium
import com.douglassantana.design_system.foundations.typography.dsTypeSizeBodySmall
import com.douglassantana.design_system.foundations.typography.dsTypeSizeDisplayLarge
import com.douglassantana.design_system.foundations.typography.dsTypeSizeDisplayMedium
import com.douglassantana.design_system.foundations.typography.dsTypeSizeDisplaySmall
import com.douglassantana.design_system.foundations.typography.dsTypeSizeHeadlineLarge
import com.douglassantana.design_system.foundations.typography.dsTypeSizeHeadlineMedium
import com.douglassantana.design_system.foundations.typography.dsTypeSizeHeadlineSmall
import com.douglassantana.design_system.foundations.typography.dsTypeSizeLabelLarge
import com.douglassantana.design_system.foundations.typography.dsTypeSizeLabelMedium
import com.douglassantana.design_system.foundations.typography.dsTypeSizeLabelSmall
import com.douglassantana.design_system.foundations.typography.dsTypeSizeTitleLarge
import com.douglassantana.design_system.foundations.typography.dsTypeSizeTitleMedium
import com.douglassantana.design_system.foundations.typography.dsTypeSizeTitleSmall
import com.douglassantana.design_system.foundations.typography.dsTypeWeightBold
import com.douglassantana.design_system.foundations.typography.dsTypeWeightMedium
import com.douglassantana.design_system.foundations.typography.dsTypeWeightRegular
import com.douglassantana.design_system.foundations.typography.dsTypeWeightSemiBold

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
