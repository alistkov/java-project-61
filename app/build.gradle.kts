plugins {
    application
    id("com.github.ben-manes.versions") version "0.52.0"
    id("org.sonarqube") version "6.0.1.5171"
    checkstyle
}

application {
    mainClass = "hexlet.code.App"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.13.0-M3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

sonar {
    properties {
        property("sonar.projectKey", "alistkov_java-project-61")
        property("sonar.organization", "alistkov")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}