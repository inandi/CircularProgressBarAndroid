package com.inandi.circleprogressbarsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val circularProgressBar = findViewById<CircularProgressBar>(R.id.circularProgressBar)
        val btnIncreaseProgress = findViewById<android.widget.Button>(R.id.btnIncreaseProgress)

        var progress = 0f

        btnIncreaseProgress.setOnClickListener {
            progress += 0.1f // Increase progress by 10%
            if (progress > 1f) progress = 0f // Reset if over 100%
            circularProgressBar.setProgress(progress)
        }
    }
}
