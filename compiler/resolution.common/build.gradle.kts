plugins {
    kotlin("jvm")
    id("jps-compatible")
    id("kotlin-kover")
}

dependencies {
    api(project(":core:compiler.common"))
    api(project(":compiler:util"))
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}
