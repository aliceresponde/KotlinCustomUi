pluginManagement {
  repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
  }
}

dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    mavenCentral()
    maven { url = uri("https://mvn.jwplayer.com/content/repositories/releases/") }
    maven { url = uri("https://jitpack.io") }
    //maven { url "https://maven.fabric.io/public" }
    maven { url = uri("https://github.com/Gainsight/px-android/raw/main/") }
  }
}

include(":app")
