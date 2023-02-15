package com.audio.transcription.app.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import com.audio.transcription.app.R

val ProductSansFonts = FontFamily(
    Font(R.font.product_sans_regular, weight = FontWeight.Medium),
    Font(R.font.product_sans_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
    Font(R.font.product_sans_bold, weight = FontWeight.Bold),
    Font(R.font.product_sans_bold_italic, weight = FontWeight.Bold, style = FontStyle.Italic),

    )