rootProject.name = "hello-world-gradle-plugin-consumer"

pluginManagement {
    // If you're importing a library and not a plugin, just move this whole section to build.gradle.kts.
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/valderman/gradle-plugin-on-github-packages-maven-repo")
            credentials {
                username = System.getenv("GITHUB_USERNAME")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
        gradlePluginPortal()
    }
}
