import org.gradle.api.artifacts.dsl.DependencyHandler

//util functions for adding the different type dependencies from build.gradle file

fun DependencyHandler.room() {
    implementation(Dependencies.AndroidX.Room.compiler)
    implementation(Dependencies.AndroidX.Room.ktx)
    kapt(Dependencies.AndroidX.Room.compiler)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.retrofit)
    implementation(Dependencies.moshiConverter)
    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttpLoggingInterceptor)
}

fun DependencyHandler.androidxCore() {
    implementation(Dependencies.AndroidX.coreKtx)
}

fun DependencyHandler.androidxAppCompat() {
    implementation(Dependencies.AndroidX.appcompat)
}

fun DependencyHandler.androidxConstraintLayout() {
    implementation(Dependencies.AndroidX.constraintLayout)
}

fun DependencyHandler.androidxActivity() {
    implementation(Dependencies.AndroidX.activity)
}

fun DependencyHandler.material() {
    implementation(Dependencies.Android.material)
}

fun DependencyHandler.junit() {
    test(Dependencies.JUnit.junit)
    androidTest(Dependencies.AndroidX.Test.junitExt)
}

fun DependencyHandler.espresso() {
    androidTest(Dependencies.AndroidX.Test.espressoCore)
}

fun DependencyHandler.ui() {
    implementation(project(mapOf("path" to ":core:ui")))
}

fun DependencyHandler.designSystem() {
    implementation(project(mapOf("path" to ":core:designsystem")))
}

fun DependencyHandler.featureA() {
    implementation(project(mapOf("path" to ":feature:a")))
}

fun DependencyHandler.featureB() {
    implementation(project(mapOf("path" to ":feature:b")))
}
