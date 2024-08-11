plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.healthtracking"  // Add this line
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.healthtracking"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    dependencies {
        implementation("androidx.appcompat:appcompat:1.6.1")
        implementation("androidx.core:core-ktx:1.10.0")
        implementation("androidx.constraintlayout:constraintlayout:2.1.4")
        implementation("com.google.android.material:material:1.9.0") // Ensure this is included
        // Add other dependencies here
    }

}
