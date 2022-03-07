plugins {
    kotlin("jvm") version "1.6.10"
    id("com.github.valderman.hello") version "0.1.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

tasks {
    compileKotlin {
        dependsOn(hello)
    }

    hello {
        receiver.set(System.getenv("GITHUB_USERNAME"))
    }
}
