package com.example.anmp_week1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        Log.d("destroy", "App is resuming")
        super.onResume()
    }

    override fun onDestroy() {
        Log.d("destroy", "App is closing")
        super.onDestroy()
    }
}