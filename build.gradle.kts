plugins {
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.nexusPublish)
}

nexusPublishing {
    repositories {
        sonatype {
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
            username.set(
                providers.environmentVariable("OSSRH_USERNAME").orNull
                    ?: providers.gradleProperty("ossrh.username").orNull
            )
            password.set(
                providers.environmentVariable("OSSRH_PASSWORD").orNull
                    ?: providers.gradleProperty("ossrh.password").orNull
            )
        }
    }
}