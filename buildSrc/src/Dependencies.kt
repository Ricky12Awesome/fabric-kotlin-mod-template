object Jetbrains {
  private const val annotationsVersion = "17.0.0"
  const val annotations = "org.jetbrains:annotations:$annotationsVersion"

  object Kotlin {
    const val version = "1.3.72"
    const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
    const val reflect = "org.jetbrains.kotlin:kotlin-reflect:$version"
  }

  object Kotlinx {
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.3.7"
    const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-runtime:0.20.0"
  }
}

object Mods {
  const val modmenu = "io.github.prospector:modmenu:1.14.5+build.+"
}

object Fabric {

  object Kotlin {
    const val version = "${Jetbrains.Kotlin.version}+build.+"
  }

  object Loader {
    const val version = "0.9.0+build.204" // https://maven.fabricmc.net/net/fabricmc/fabric-loader/
  }

  object API {
    const val version = "0.16.0+build.384-1.16.1"
  }

  object Loom {
    const val version = "0.4-SNAPSHOT"
  }

  object YarnMappings {
    const val version = "${Minecraft.version}+build.21"
  }
}

object Minecraft {
  const val version = "1.16.1"
}

object CurseGradle {
  const val version = "1.4.0"
}
