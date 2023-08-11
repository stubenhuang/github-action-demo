pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "github-action-demo"

include(":core")
include(":core:module")
include(":core:boot")
