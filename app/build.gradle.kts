plugins {
	id("com.android.application")
	id("org.jetbrains.kotlin.android")
	id("com.google.devtools.ksp")
}

android {
	namespace = "com.jwplayer.customui"
	compileSdk = 34

	defaultConfig {
		minSdk = 26
		targetSdk = 34
		versionCode = 1
		versionName = "1.0"
		applicationId = "com.jwplayer.opensourcedemo"
	}

	buildTypes {
		release {
			isMinifyEnabled = false
			proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
		}
	}

	compileOptions {
		sourceCompatibility = JavaVersion.VERSION_1_8
		targetCompatibility = JavaVersion.VERSION_1_8
	}
	kotlinOptions {
		jvmTarget = "1.8"
	}

	buildFeatures {
		viewBinding = true
	}
}

dependencies {
	val media3version = "1.1.1"
	val room = "2.6.1"
	val nav_version = "2.7.5"

	implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.0")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.0")

	implementation("androidx.core:core-ktx:1.12.0")
	implementation("androidx.appcompat:appcompat:1.6.1")
	implementation("com.google.android.material:material:1.11.0")
	implementation("androidx.constraintlayout:constraintlayout:2.1.4")

	val JWPlayerVersion = "4.16.2"
	implementation("com.jwplayer:jwplayer-core:$JWPlayerVersion")
	implementation("com.jwplayer:jwplayer-common:$JWPlayerVersion")
	//implementation("com.jwplayer:jwplayer-ima:$JWPlayerVersion")
	//implementation("com.jwplayer:jwplayer-cast:$JWPlayerVersion")

	implementation("androidx.media3:media3-exoplayer:$media3version")
	implementation("androidx.media3:media3-exoplayer-dash:$media3version")
	implementation("androidx.media3:media3-exoplayer-hls:$media3version")
	implementation("androidx.media3:media3-exoplayer-smoothstreaming:$media3version")
	implementation("androidx.media3:media3-ui:$media3version")

	implementation("com.squareup.picasso:picasso:2.71828")
	implementation("com.android.volley:volley:1.2.1")
	implementation("androidx.recyclerview:recyclerview:1.3.1")



	implementation("androidx.activity:activity-ktx:1.8.2")
	// implementation("androidx.appcompat:appcompat:1.6.1")
	implementation("androidx.biometric:biometric:1.1.0") // Android Biometrics
	// implementation("androidx.core:core-ktx:1.12.0")
	// implementation("androidx.constraintlayout:constraintlayout:2.1.4")
	implementation("androidx.fragment:fragment-ktx:1.6.2")
	implementation("androidx.legacy:legacy-support-v13:1.0.0")
	implementation("androidx.multidex:multidex:2.0.1")
	implementation("androidx.recyclerview:recyclerview:1.3.2")

	//Lifecycle components
	//ksp("androidx.lifecycle:lifecycle-compiler:2.6.2")
	implementation("androidx.lifecycle:lifecycle-common-java8:2.6.2")
	implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
	implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
	implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
	implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")

	//kotlin coroutines
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2") // Coroutine
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2") // Coroutine

	//Navigation
	implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
	implementation("androidx.navigation:navigation-ui-ktx:$nav_version")

	//Room
	ksp("androidx.room:room-compiler:$room")
	implementation("androidx.room:room-rxjava2:$room")
	implementation("androidx.room:room-runtime:$room")
	implementation("androidx.room:room-ktx:$room")

	implementation("androidx.work:work-runtime-ktx:2.7.1")

	implementation("com.google.android.gms:play-services-auth:20.7.0") //Google Sign in
	implementation("com.google.android.gms:play-services-auth-api-phone:18.0.1") //SMS Consent API
	implementation("com.google.android.gms:play-services-vision:20.1.3") //QR code
	// implementation("com.google.android.material:material:1.2.1")

	//firebase
	implementation(platform("com.google.firebase:firebase-bom:32.3.1"))
	implementation("com.google.firebase:firebase-messaging-ktx")
	implementation("com.google.firebase:firebase-analytics:17.6.0")
	implementation("com.google.firebase:firebase-crashlytics:17.2.2") //crash analytics
	implementation("com.google.firebase:firebase-messaging-directboot:20.2.0")

	//permission
	implementation("com.google.accompanist:accompanist-permissions:0.16.0")

	//timber
	implementation("com.jakewharton.timber:timber:4.7.1")

	// JWP SDK 4.3.0 --> 4.15.2  -> 4.16.1?
	//implementation("com.jwplayer:jwplayer-core:4.3.0")
	//implementation("com.jwplayer:jwplayer-common:4.3.0")

	implementation("com.google.android.gms:play-services-cast:21.4.0")
	implementation("com.google.android.gms:play-services-cast-framework:21.4.0")

	//Ziggeo   2.5.7
	//implementation("com.github.ZiggeoJitpackService:Android-SDK:2.5.7")

	//JWPlayer Native  Ui
	implementation("com.android.volley:volley:1.2.0")

	//GainSight PX
	implementation("com.gainsight.px:mobile-sdk:1.10.0")

	//Picasso Image
	implementation("com.squareup.picasso:picasso:2.8")

	//retrofit
	implementation("com.squareup.retrofit2:retrofit:2.9.0")
	implementation("com.squareup.retrofit2:converter-gson:2.9.0")
	implementation("com.squareup.retrofit2:adapter-rxjava2:2.5.0")
	implementation("com.squareup.okhttp3:logging-interceptor:3.12.6")
	implementation("com.google.code.gson:gson:2.10")
	implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")

	//test
	androidTestImplementation("androidx.test:runner:1.3.0")
	androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
	testImplementation("junit:junit:4.13.2")
}