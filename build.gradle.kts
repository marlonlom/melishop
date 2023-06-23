/*
 * Copyright 2023 Marlonlom
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@file:Suppress("DSL_SCOPE_VIOLATION")

plugins {
  alias(libs.plugins.android.application) apply false
  alias(libs.plugins.android.library) apply false
  alias(libs.plugins.kotlin.android) apply false
  alias(libs.plugins.spotless) apply false
  alias(libs.plugins.detekt) apply false
}

apply(plugin = "io.gitlab.arturbosch.detekt")

/* Applying additional configs */
subprojects {
  repositories {
    google()
    mavenCentral()
  }

  val ktlintEditorConfigOverridesMap = mapOf(
    "android" to true,
    "indent_size" to 2,
    "ij_continuation_indent_size" to 2,
    "trim_trailing_whitespace" to true,
    "insert_final_newline" to true,
    "end_of_line" to "lf",
    "max_line_length" to 120,
  )

  apply(plugin = "com.diffplug.spotless")
  configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    kotlin {
      target("**/src/*.kt")
      targetExclude("$buildDir/**/*.kt")
      ktlint().editorConfigOverride(ktlintEditorConfigOverridesMap)
      trimTrailingWhitespace()
      indentWithSpaces(2)
      endWithNewline()
      licenseHeaderFile(rootProject.file("extensions/spotless/copyright.kt"))
    }
    format("kts") {
      target("**/*.gradle.kts", "*.gradle.kts")
      targetExclude("$buildDir/**/*.kts")
      trimTrailingWhitespace()
      indentWithSpaces(2)
      endWithNewline()
      licenseHeaderFile(rootProject.file("extensions/spotless/copyright.kts"), "(^(?![\\/ ]\\*).*$)")
    }
  }

  apply(plugin = "io.gitlab.arturbosch.detekt")
  configure<io.gitlab.arturbosch.detekt.extensions.DetektExtension> {
    config = project.files("${project.rootDir}/extensions/detekt/detekt_config.yml")
  }
}
