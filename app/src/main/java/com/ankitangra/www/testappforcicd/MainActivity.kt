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
            application, "0d6d3abd-e96a-4c72-a4c6-580ec6f3cf33",
            Analytics::class.java, Crashes::class.java
        )

        Log.d("MainActivity","New Feature")
    }
}
