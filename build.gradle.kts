plugins {
    val kotlinVersion = "2.0.0"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion
    id("war")
}

group = "banking-app"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("jakarta.servlet:jakarta.servlet-api:6.1.0-M2")
    testImplementation(kotlin("test"))
    testImplementation("org.mockito:mockito-core:5.12.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
tasks.register<Jar>("jarWithDependencies") {
    archiveClassifier.set("standalone")
    from(sourceSets.main.get().output)

    dependsOn(configurations.runtimeClasspath)
    from({
        configurations.runtimeClasspath.get().filter { it.name.endsWith("jar") }.map { zipTree(it) }
    })
}
