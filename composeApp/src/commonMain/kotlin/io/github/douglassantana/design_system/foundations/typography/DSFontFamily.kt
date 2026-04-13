package io.github.douglassantana.design_system.foundations.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import io.github.douglassantana.composeapp.generated.resources.Res
import io.github.douglassantana.composeapp.generated.resources.quicksand_bold
import io.github.douglassantana.composeapp.generated.resources.quicksand_light
import io.github.douglassantana.composeapp.generated.resources.quicksand_medium
import io.github.douglassantana.composeapp.generated.resources.quicksand_regular
import io.github.douglassantana.composeapp.generated.resources.quicksand_semi_bold
import org.jetbrains.compose.resources.Font

@Composable
fun DSQuicksandFamily() = FontFamily(
    Font(Res.font.quicksand_light, FontWeight.Light),
    Font(Res.font.quicksand_regular, FontWeight.Normal),
    Font(Res.font.quicksand_medium, FontWeight.Medium),
    Font(Res.font.quicksand_semi_bold, FontWeight.SemiBold),
    Font(Res.font.quicksand_bold, FontWeight.Bold),
)
