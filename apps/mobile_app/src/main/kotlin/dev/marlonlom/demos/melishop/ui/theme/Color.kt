/*
 * Copyright 2023 marlonlom
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.marlonlom.demos.melishop.ui.theme

import androidx.compose.ui.graphics.Color
import dev.marlonlom.demos.melishop.R

/**
 * Brand colors object specification.
 *
 * @author marlonlom
 */
private object BrandColors {
  val acadia = Color(R.color.brand_acadia)
  val arrowtown = Color(R.color.brand_arrowtown)
  val bisque = Color(R.color.brand_bisque)
  val black = Color(R.color.brand_black)
  val creamBrulee = Color(R.color.brand_cream_brulee)
  val fairPink = Color(R.color.brand_fair_pink)
  val fireBrick = Color(R.color.brand_fire_brick)
  val heatheredGrey = Color(R.color.brand_heathered_grey)
  val kournikova = Color(R.color.brand_kournikova)
  val lavenderBlush = Color(R.color.brand_lavender_blush)
  val macaroniAndCheese = Color(R.color.brand_macaroni_and_cheese)
  val maroon = Color(R.color.brand_maroon)
  val maroon2 = Color(R.color.brand_maroon2)
  val maroon3 = Color(R.color.brand_maroon3)
  val maroon4 = Color(R.color.brand_maroon4)
  val maroon5 = Color(R.color.brand_maroon5)
  val maroon6 = Color(R.color.brand_maroon6)
  val maroon7 = Color(R.color.brand_maroon7)
  val maroon8 = Color(R.color.brand_maroon8)
  val maroon9 = Color(R.color.brand_maroon9)
  val melon = Color(R.color.brand_melon)
  val metallicBronze = Color(R.color.brand_metallic_bronze)
  val mistyRose = Color(R.color.brand_misty_rose)
  val navajoWhite = Color(R.color.brand_navajo_white)
  val olive = Color(R.color.brand_olive)
  val olive2 = Color(R.color.brand_olive2)
  val olive3 = Color(R.color.brand_olive3)
  val olive4 = Color(R.color.brand_olive4)
  val olive5 = Color(R.color.brand_olive5)
  val olive6 = Color(R.color.brand_olive6)
  val pearlLusta = Color(R.color.brand_pearl_lusta)
  val saffron = Color(R.color.brand_saffron)
  val sangria = Color(R.color.brand_sangria)
  val springWood = Color(R.color.brand_spring_wood)
  val starkWhite = Color(R.color.brand_stark_white)
  val white = Color(R.color.brand_white)
  val woodBark = Color(R.color.brand_wood_bark)
}

/* Light theme colors */
val md_theme_light_primary = BrandColors.olive2
val md_theme_light_onPrimary = BrandColors.white
val md_theme_light_primaryContainer = BrandColors.navajoWhite
val md_theme_light_onPrimaryContainer = BrandColors.maroon2
val md_theme_light_secondary = BrandColors.olive
val md_theme_light_onSecondary = BrandColors.white
val md_theme_light_secondaryContainer = BrandColors.creamBrulee
val md_theme_light_onSecondaryContainer = BrandColors.maroon
val md_theme_light_tertiary = BrandColors.olive3
val md_theme_light_onTertiary = BrandColors.white
val md_theme_light_tertiaryContainer = BrandColors.bisque
val md_theme_light_onTertiaryContainer = BrandColors.maroon3
val md_theme_light_error = BrandColors.fireBrick
val md_theme_light_errorContainer = BrandColors.mistyRose
val md_theme_light_onError = BrandColors.white
val md_theme_light_onErrorContainer = BrandColors.maroon4
val md_theme_light_background = BrandColors.lavenderBlush
val md_theme_light_onBackground = BrandColors.woodBark
val md_theme_light_surface = BrandColors.lavenderBlush
val md_theme_light_onSurface = BrandColors.woodBark
val md_theme_light_surfaceVariant = BrandColors.pearlLusta
val md_theme_light_onSurfaceVariant = BrandColors.metallicBronze
val md_theme_light_outline = BrandColors.arrowtown
val md_theme_light_inverseOnSurface = BrandColors.fairPink
val md_theme_light_inverseSurface = BrandColors.acadia
val md_theme_light_inversePrimary = BrandColors.kournikova

/* LATER: check if this attribute works -> val md_theme_light_shadow = BrandColors.black */
val md_theme_light_surfaceTint = BrandColors.olive2
val md_theme_light_outlineVariant = BrandColors.starkWhite
val md_theme_light_scrim = BrandColors.black

/* Dark theme colors */
val md_theme_dark_primary = BrandColors.kournikova
val md_theme_dark_onPrimary = BrandColors.maroon6
val md_theme_dark_primaryContainer = BrandColors.olive4
val md_theme_dark_onPrimaryContainer = BrandColors.navajoWhite
val md_theme_dark_secondary = BrandColors.saffron
val md_theme_dark_onSecondary = BrandColors.maroon5
val md_theme_dark_secondaryContainer = BrandColors.olive5
val md_theme_dark_onSecondaryContainer = BrandColors.creamBrulee
val md_theme_dark_tertiary = BrandColors.macaroniAndCheese
val md_theme_dark_onTertiary = BrandColors.maroon7
val md_theme_dark_tertiaryContainer = BrandColors.maroon8
val md_theme_dark_onTertiaryContainer = BrandColors.bisque
val md_theme_dark_error = BrandColors.melon
val md_theme_dark_errorContainer = BrandColors.sangria
val md_theme_dark_onError = BrandColors.maroon9
val md_theme_dark_onErrorContainer = BrandColors.mistyRose
val md_theme_dark_background = BrandColors.woodBark
val md_theme_dark_onBackground = BrandColors.springWood
val md_theme_dark_surface = BrandColors.woodBark
val md_theme_dark_onSurface = BrandColors.springWood
val md_theme_dark_surfaceVariant = BrandColors.metallicBronze
val md_theme_dark_onSurfaceVariant = BrandColors.starkWhite
val md_theme_dark_outline = BrandColors.heatheredGrey
val md_theme_dark_inverseOnSurface = BrandColors.woodBark
val md_theme_dark_inverseSurface = BrandColors.springWood
val md_theme_dark_inversePrimary = BrandColors.olive6

/* LATER: check if this attribute works -> val md_theme_dark_shadow = BrandColors.black */
val md_theme_dark_surfaceTint = BrandColors.kournikova
val md_theme_dark_outlineVariant = BrandColors.metallicBronze
val md_theme_dark_scrim = BrandColors.black
