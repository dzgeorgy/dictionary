plugins {
    id("android-lib")
}

dependencies {
    implementation(Dependencies.Libraries.core)
    testImplementation(Dependencies.TestLibraries.junit)
    androidTestImplementation(Dependencies.TestLibraries.testJunit)
}