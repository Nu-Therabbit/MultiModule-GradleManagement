object Dependencies {
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"

    object Android {
        const val material = "com.google.android.material:material:${Versions.material}"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:${Versions.androidxCore}"
        const val activity = "androidx.activity:activity-ktx:${Versions.androidxActivity}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.androidxAppCompat}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.androidxConstraintLayout}"

        object Room {
            const val runtime = "androidx.room:room-runtime:${Versions.room}"
            const val compiler = "androidx.room:room-compiler:${Versions.room}"
            const val ktx = "androidx.room:room-ktx:${Versions.room}"
        }

        object Test {
            const val junitExt = "androidx.test.ext:junit:${Versions.jUnitExt}"
            const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
        }
    }

    object JUnit {
        const val junit = "junit:junit:${Versions.jUnit}"
    }
}
