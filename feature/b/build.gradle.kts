plugins {
    `android-library`
    `kotlin-android`
    `kotlin-kapt`
}

apply<MainGradlePlugin>()

android {
    namespace = "com.anusorn.feature.b"
}

dependencies {

    ui()
    designSystem()
}
