package com.ankitangra.www.testappforcicd

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(
            application, "7b9ca933-5d6c-469b-a556-7bb0e7e2a5af",
            Analytics::class.java, Crashes::class.java
        )

        Log.d("MainActivity","New Feature")
    }
}
