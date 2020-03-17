
tasks.named<Wrapper>("wrapper") {
  gradleVersion = "6.2.2"
}

subprojects {
  repositories {
    jcenter()
  }

  afterEvaluate {
    convention.findPlugin(JavaPluginConvention::class)?.apply {
      sourceCompatibility = JavaVersion.VERSION_1_8
      targetCompatibility = JavaVersion.VERSION_1_8
    }
  }

  tasks.withType<ScalaCompile> {
    scalaCompileOptions.additionalParameters = listOf(
        "-Yno-imports",
        "-language:implicitConversions"
    )
  }
}
