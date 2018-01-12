repositories {
    jcenter()
    maven("https://mavenproxy.finntech.no/finntech-release/")
    gradlePluginPortal()
    maven("https://dl.bintray.com/kotlin/kotlin-eap/")
}

dependencies {
    "classpath"("com.gradle:build-scan-plugin:1.11")
    "classpath"("org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.20-eap-33") // Sync with gradle/dependencies.gradle
}

