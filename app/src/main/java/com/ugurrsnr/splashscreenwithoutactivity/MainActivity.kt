package com.ugurrsnr.splashscreenwithoutactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_SplashScreenWithoutActivity) // default theme should be loaded
        setContentView(R.layout.activity_main)
    }
}