plugins {
    application
    id("io.github.ben-manes.versions") version "0.61.0"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {}

application { mainClass.set("hexlet.code.App") }

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}