plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.kapt)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.yargisoft.worky"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.yargisoft.worky"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    // Core Dependencies
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    // Testing Dependencies
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Networking
    implementation(libs.retrofit)
    implementation(libs.retrofit.gson)

    // Database
    implementation(libs.room.runtime)
    kapt(libs.room.compiler)

    // Coroutines
    implementation(libs.coroutines.android)

    // Glide for Image Loading
    implementation(libs.glide)
    kapt(libs.glide.compiler)

    // Dependency Injection
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
}
