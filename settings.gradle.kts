pluginManagement {
    repositories {
        // Mirror first: repo.maven.apache.org sometimes answers JitPack with 429 (too many requests).
        maven("https://maven-central.storage-download.googleapis.com/maven2/")
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    // Use these repositories for all dependencies (okhttp, moshi, coroutines...)
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        maven("https://maven-central.storage-download.googleapis.com/maven2/")
        mavenCentral()
    }
}

rootProject.name = "streamx-extractor"

