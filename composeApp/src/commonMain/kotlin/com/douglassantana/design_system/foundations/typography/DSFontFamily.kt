package com.douglassantana.design_system.foundations.typography

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.douglassantana.composeapp.generated.resources.Res
import com.douglassantana.composeapp.generated.resources.quicksand_bold
import com.douglassantana.composeapp.generated.resources.quicksand_light
import com.douglassantana.composeapp.generated.resources.quicksand_medium
import com.douglassantana.composeapp.generated.resources.quicksand_regular
import com.douglassantana.composeapp.generated.resources.quicksand_semi_bold
import org.jetbrains.compose.resources.Font

@Composable
fun DSQuicksandFamily() = FontFamily(
    Font(Res.font.quicksand_light, FontWeight.Light),
    Font(Res.font.quicksand_regular, FontWeight.Normal),
    Font(Res.font.quicksand_medium, FontWeight.Medium),
    Font(Res.font.quicksand_semi_bold, FontWeight.SemiBold),
    Font(Res.font.quicksand_bold, FontWeight.Bold),
)
