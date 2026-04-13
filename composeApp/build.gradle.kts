import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    id("maven-publish")
    id("signing")
}

group = "com.douglassantana"
version = "1.0.0"

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
        publishLibraryVariants("release")
    }

    listOf(
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "DesignSystem"
            isStatic = true
        }
    }

    sourceSets {
        androidMain.dependencies {
            implementation(libs.compose.uiToolingPreview)
        }
        commonMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.foundation)
            implementation(libs.compose.material3)
            implementation(libs.compose.ui)
            implementation(libs.compose.components.resources)
            implementation(libs.compose.uiToolingPreview)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

android {
    namespace = "com.douglassantana.design_system"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

publishing {
    publications.withType<MavenPublication> {
        artifactId = artifactId.replace("composeapp", "design-system")

        pom {
            name.set("DS Design System")
            description.set("Design system Kotlin Multiplatform (Android + iOS) com Compose Multiplatform")
            url.set("https://github.com/douglassantana/designsystem")

            licenses {
                license {
                    name.set("MIT License")
                    url.set("https://opensource.org/licenses/MIT")
                }
            }

            developers {
                developer {
                    id.set("douglassantana")
                    name.set("Douglas Santana")
                }
            }

            scm {
                connection.set("scm:git:github.com/douglassantana/designsystem.git")
                developerConnection.set("scm:git:ssh://github.com/douglassantana/designsystem.git")
                url.set("https://github.com/douglassantana/designsystem")
            }
        }
    }

    repositories {
        mavenLocal()
    }
}

signing {
    val signingKey = providers.environmentVariable("SIGNING_KEY").orNull
        ?: providers.gradleProperty("signing.key").orNull
    val signingPassword = providers.environmentVariable("SIGNING_PASSWORD").orNull
        ?: providers.gradleProperty("signing.password").orNull

    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(signingKey, signingPassword)
        sign(publishing.publications)
    }
}

dependencies {
    debugImplementation(libs.compose.uiTooling)
}
