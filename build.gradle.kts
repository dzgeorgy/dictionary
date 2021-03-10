buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.Plugins.agp)
        classpath(Dependencies.Plugins.kotlin)
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
