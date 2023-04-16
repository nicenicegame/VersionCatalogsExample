pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            version("compose", "1.4.0")
            version("activityCompose", "1.7.0")
            version("gradlePlugin", "8.0.0")
            version("kotlin", "1.8.10")
            library("compose-ui", "androidx.compose.ui", "ui").versionRef("compose")
            library("compose-ui-tooling", "androidx.compose.ui", "ui-tooling").versionRef("compose")
            library("compose-ui-tooling-preview", "androidx.compose.ui", "ui-tooling-preview").versionRef("compose")
            library("compose-foundation", "androidx.compose.foundation", "foundation").versionRef("compose")
            library("compose-material", "androidx.compose.material", "material").versionRef("compose")
            library("activity-compose", "androidx.activity", "activity-compose").versionRef("activityCompose")
            bundle("compose", listOf("compose-ui", "compose-ui-tooling", "compose-ui-tooling-preview", "compose-foundation", "compose-material"))
            plugin("android-application", "com.android.application").versionRef("gradlePlugin")
            plugin("android-library", "com.android.library").versionRef("gradlePlugin")
            plugin("kotlin-android", "org.jetbrains.kotlin.android").versionRef("kotlin")
            plugin("kotlin-multiplatform", "org.jetbrains.kotlin.multiplatform").versionRef("kotlin")
        }
    }
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "VersionCatalogsExample"
include(":androidApp")
include(":shared")