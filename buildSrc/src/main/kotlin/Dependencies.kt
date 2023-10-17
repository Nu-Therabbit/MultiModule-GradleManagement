import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {
    const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.androidxAppCompat}"
    const val androidxCore = "androidx.core:core-ktx:${Versions.androidxCore}"
    const val androidxActivity = "androidx.activity:activity-ktx:${Versions.androidxActivity}"
    const val androidxConstraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.androidxConstraintLayout}"

    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"

    const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val gradlePlugin = "com.android.tools.build:gradle:${Versions.gradlePlugin}"
}

fun DependencyHandler.room() {
    implementation(Dependencies.roomRuntime)
    implementation(Dependencies.roomKtx)
    kapt(Dependencies.roomCompiler)
}

fun DependencyHandler.retrofit() {
    implementation(Dependencies.retrofit)
    implementation(Dependencies.moshiConverter)
    implementation(Dependencies.okHttp)
    implementation(Dependencies.okHttpLoggingInterceptor)
}

fun DependencyHandler.androidxCore() {
    implementation(Dependencies.androidxCore)
}

fun DependencyHandler.androidxAppCompat() {
    implementation(Dependencies.androidxAppCompat)
}

fun DependencyHandler.androidxConstraintLayout() {
    implementation(Dependencies.androidxConstraintLayout)
}

fun DependencyHandler.androidxActivity() {
    implementation(Dependencies.androidxActivity)
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
