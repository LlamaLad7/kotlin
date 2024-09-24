plugins {
    id("org.jetbrains.kotlinx.kover")
}

kover {
    currentProject {
        instrumentation {
            includedClasses.add("org.jetbrains.kotlin.*")
        }
    }
}