plugins {
    kotlin("jvm")
    id("jps-compatible")
    id("gradle-plugin-compiler-dependency-configuration")
    id("kotlin-kover")
}

project.configureJvmToolchain(JdkMajorVersion.JDK_1_8)

dependencies {
    api(project(":core:util.runtime"))
    api(kotlinStdlib())
    api(project(":kotlin-annotations-jvm"))
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}
