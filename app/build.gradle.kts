plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    kotlin("kapt")
}

android {
    namespace = "com.example.mibikesp1"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.mibikesp1"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.play.services.analytics.impl)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Glide dependencies
    implementation(libs.glide) // Glide core library
    annotationProcessor("com.github.bumptech.glide:compiler:4.15.1") // Glide annotation processor

    // Room dependencies
    implementation("androidx.room:room-runtime:2.6.0")
    implementation("androidx.room:room-ktx:2.6.0")
    kapt("androidx.room:room-compiler:2.6.0")

    // Optional: Additional Room libraries
    implementation("androidx.room:room-paging:2.6.0")
    implementation("androidx.room:room-rxjava3:2.6.0")

    // ViewModel and LiveData dependencies
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.0") // ViewModel
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.0")   // LiveData
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.0")    // Lifecycle components

    // For Kotlin annotation processing
    kapt("androidx.lifecycle:lifecycle-compiler:2.6.0")  // Required for annotation processing with ViewModel
}

