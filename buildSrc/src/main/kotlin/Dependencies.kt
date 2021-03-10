object Dependencies {

    object Versions {
        const val compileSdk = 30
        const val targetSdk = 30
        const val minSdk = 21
        const val versionCode = 1
        const val versionName = "0.1.0"
        const val compose = "1.0.0-beta01"
        const val buildTools = "30.0.3"
        internal const val appcompat = "1.3.0-beta01"
        internal const val agp = "7.0.0-alpha09"
        internal const val kotlin = "1.4.30"
        internal const val core = "1.5.0-beta02"
        internal const val lifecycle = "2.3.0"
        internal const val activity = "1.3.0-alpha03"
        internal const val junit = "4.13.2"
        internal const val testJunit = "1.1.2"
        internal const val espresso = "3.3.0"
        internal const val coroutines = "1.4.3"
    }

    object Plugins {
        const val agp = "com.android.tools.build:gradle:${Versions.agp}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    }

    object Libraries {
        const val core = "androidx.core:core-ktx:${Versions.core}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
        const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
        const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
        const val activityCompose = "androidx.activity:activity-compose:${Versions.activity}"
        const val lifecycleRuntime =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
        const val coroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    }

    object TestLibraries {
        const val junit = "junit:junit:${Versions.junit}"
        const val testJunit = "androidx.test.ext:junit:${Versions.testJunit}"
    }

}