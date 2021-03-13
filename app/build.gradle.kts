plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(Dependencies.Versions.compileSdk)
    buildToolsVersion = Dependencies.Versions.buildTools

    defaultConfig {
        applicationId = "ru.dzgeorgy.dictionary"
        minSdkVersion(Dependencies.Versions.minSdk)
        targetSdkVersion(Dependencies.Versions.targetSdk)
        versionCode = Dependencies.Versions.versionCode
        versionName = Dependencies.Versions.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro")
        }
        getByName("debug") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Dependencies.Versions.compose
    }
}

dependencies {
    implementation(Dependencies.Libraries.core)
    implementation(Dependencies.Libraries.appcompat)
    implementation(Dependencies.Libraries.composeUi)
    implementation(Dependencies.Libraries.composeMaterial)
    implementation(Dependencies.Libraries.composeTooling)
    implementation(Dependencies.Libraries.lifecycleRuntime)
    implementation(Dependencies.Libraries.activityCompose)
    testImplementation(Dependencies.TestLibraries.junit)
    androidTestImplementation(Dependencies.TestLibraries.testJunit)
}
