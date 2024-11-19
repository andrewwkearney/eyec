package com.androsaces.eyec

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var daysRemaining = 14
    private lateinit var countdownButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        countdownButton = findViewById(R.id.countdownButton)

        countdownButton.setOnClickListener {
            if (daysRemaining > 0) {
                daysRemaining--
                countdownButton.text = "$daysRemaining days remaining"
            }
        }
    }
}