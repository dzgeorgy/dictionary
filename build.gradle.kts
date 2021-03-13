buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter() //Necessary for kotlinx-collections-immutable-jvm from compose.ui:ui
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
