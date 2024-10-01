plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("org.jlleitschuh.gradle.ktlint") version "10.2.1"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
