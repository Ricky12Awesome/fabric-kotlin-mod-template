pluginManagement {
  repositories {
    maven("http://maven.fabricmc.net") { name = "Fabric" }

    mavenCentral()

    maven("https://plugins.gradle.org/m2/")
  }
}

// Can't be '= Info.modid', cause it doesn't work (unresolved reference)
rootProject.name = "example-mod"

