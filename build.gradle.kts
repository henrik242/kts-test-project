buildscript {
    rootProject.apply {
        from(rootProject.file("gradle/buildscript.gradle.kts"))
        to(buildscript)
    }
}
apply {
    from("gradle/footer.gradle.kts")
}
