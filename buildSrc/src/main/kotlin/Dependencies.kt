object Dependencies {

    object Versions {
        const val compileSdk = 30
        const val targetSdk = 30
        const val minSdk = 21
        const val versionCode = 1
        const val versionName = "0.1.0"
        const val compose = "1.0.0-beta02"
        const val buildTools = "30.0.3"
        internal const val appcompat = "1.3.0-beta01"
        internal const val core = "1.5.0-beta03"
        internal const val lifecycle = "2.3.0"
        internal const val activity = "1.3.0-alpha04"
        internal const val junit = "4.13.2"
        internal const val testJunit = "1.1.2"
        internal const val coroutines = "1.4.3"
        internal const val paging = "3.0.0-beta01"
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
        const val pagingCommon = "androidx.paging:paging-common:${Versions.paging}"
    }

    object TestLibraries {
        const val junit = "junit:junit:${Versions.junit}"
        const val testJunit = "androidx.test.ext:junit:${Versions.testJunit}"
    }

}