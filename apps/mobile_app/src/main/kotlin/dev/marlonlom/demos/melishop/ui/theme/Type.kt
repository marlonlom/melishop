package dev.marlonlom.demos.melishop.ui.theme

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.style.LineBreak
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp
import dev.marlonlom.demos.melishop.R

/**
 * Brand font object specification for Melishop application.
 *
 * @author marlonlom
 */
@ExperimentalMaterial3Api
private object BrandFont {

  @ExperimentalMaterial3Api
  private val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
  )

  private val OUTFIT_FONT = FontFamily(
    Font(
      googleFont = GoogleFont("Outfit"),
      fontProvider = provider
    )
  )

  private val DEFAULT_TEXT_STYLE = TextStyle(
    fontFamily = OUTFIT_FONT,
    fontWeight = FontWeight.Normal,
    lineHeightStyle = LineHeightStyle(
      alignment = LineHeightStyle.Alignment.Center,
      trim = LineHeightStyle.Trim.None
    )
  )

  private const val NEGATIVE_ZERO_DOT_TWENTY_FIVE = -0.25

  val appTypography = Typography(
    displayLarge = DEFAULT_TEXT_STYLE.copy(
      fontSize = 57.sp, lineHeight = 64.sp, letterSpacing = NEGATIVE_ZERO_DOT_TWENTY_FIVE.sp
    ),
    displayMedium = DEFAULT_TEXT_STYLE.copy(
      fontSize = 45.sp, lineHeight = 52.sp, letterSpacing = 0.sp
    ),
    displaySmall = DEFAULT_TEXT_STYLE.copy(
      fontSize = 36.sp, lineHeight = 44.sp, letterSpacing = 0.sp
    ),
    headlineLarge = DEFAULT_TEXT_STYLE.copy(
      fontSize = 32.sp,
      lineHeight = 40.sp,
      letterSpacing = 0.sp,
      lineBreak = LineBreak.Heading,
    ),
    headlineMedium = DEFAULT_TEXT_STYLE.copy(
      fontSize = 28.sp,
      lineHeight = 36.sp,
      letterSpacing = 0.sp,
      lineBreak = LineBreak.Heading,
    ),
    headlineSmall = DEFAULT_TEXT_STYLE.copy(
      fontSize = 24.sp,
      lineHeight = 32.sp,
      letterSpacing = 0.sp,
      lineBreak = LineBreak.Heading,
    ),
    titleLarge = DEFAULT_TEXT_STYLE.copy(
      fontSize = 22.sp,
      lineHeight = 28.sp,
      letterSpacing = 0.sp,
      lineBreak = LineBreak.Heading,
    ),
    titleMedium = DEFAULT_TEXT_STYLE.copy(
      fontSize = 16.sp,
      lineHeight = 24.sp,
      letterSpacing = 0.15.sp,
      lineBreak = LineBreak.Heading,
    ),
    titleSmall = DEFAULT_TEXT_STYLE.copy(
      fontWeight = FontWeight.Medium,
      fontSize = 14.sp,
      lineHeight = 20.sp,
      letterSpacing = 0.1.sp,
      lineBreak = LineBreak.Heading,
    ),
    bodyLarge = DEFAULT_TEXT_STYLE.copy(
      fontSize = 16.sp,
      lineHeight = 24.sp,
      letterSpacing = 0.5.sp,
      lineBreak = LineBreak.Heading,
    ),
    bodyMedium = DEFAULT_TEXT_STYLE.copy(
      fontSize = 14.sp,
      lineHeight = 20.sp,
      letterSpacing = 0.25.sp,
      lineBreak = LineBreak.Heading,
    ),
    bodySmall = DEFAULT_TEXT_STYLE.copy(
      fontSize = 12.sp,
      lineHeight = 16.sp,
      letterSpacing = 0.4.sp,
      lineBreak = LineBreak.Heading,
    ),
    labelLarge = DEFAULT_TEXT_STYLE.copy(
      fontWeight = FontWeight.Medium,
      fontSize = 14.sp,
      lineHeight = 20.sp,
      letterSpacing = 0.1.sp,
    ),
    labelMedium = DEFAULT_TEXT_STYLE.copy(
      fontWeight = FontWeight.Medium,
      fontSize = 12.sp,
      lineHeight = 16.sp,
      letterSpacing = 0.5.sp,
    ),
    labelSmall = DEFAULT_TEXT_STYLE.copy(
      fontWeight = FontWeight.Medium,
      fontSize = 11.sp,
      lineHeight = 16.sp,
      letterSpacing = 0.5.sp,
    )
  )
}

/* Set of Material typography styles to start with */
@OptIn(ExperimentalMaterial3Api::class)
val typography = BrandFont.appTypography
