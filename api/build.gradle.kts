plugins {
  kotlin("jvm") version "1.9.25"
  `maven-publish`
}

group = "io.github.architectplatform"

version = "2.0.2"

java {
  withSourcesJar()
  withJavadocJar()
  sourceCompatibility = JavaVersion.toVersion("17")
}

kotlin { jvmToolchain { languageVersion.set(JavaLanguageVersion.of(17)) } }

repositories { mavenCentral() }

publishing {
  publications {
    create<MavenPublication>("gpr") {
      from(components["java"])
      artifactId = "architect-api"
      pom {
        name.set("Architect API")
        description.set("API for the Architect engine")
        url.set("https://github.com/architect-platform/architect-api")
        licenses {
          license {
            name.set("Apache-2.0")
            url.set("https://www.apache.org/licenses/MIT-2.0")
          }
        }
        developers {
          developer {
            id.set("alemazzo")
            name.set("Alessandro Mazzoli")
          }
        }
      }
    }
  }
  repositories {
    maven {
      name = "GitHubPackages"
      url = uri("https://maven.pkg.github.com/architect-platform/architect-api")
      credentials {
        username =
            System.getenv("GITHUB_USER")
                ?: project.findProperty("githubUser") as String?
                ?: "github-actions"
        password = System.getenv("GITHUB_TOKEN") ?: project.findProperty("githubToken") as String?
      }
    }
  }
}