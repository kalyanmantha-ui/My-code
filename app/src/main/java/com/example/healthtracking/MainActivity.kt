package com.example.healthtracking

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonBreastfeeding = findViewById<Button>(R.id.btnBreastfeeding)
        val buttonDiaperChange = findViewById<Button>(R.id.btnDiaperChange)
        val buttonSleepTracking = findViewById<Button>(R.id.btnSleepTracking)

        buttonBreastfeeding.setOnClickListener {
            startActivity(Intent(this, BreastfeedingActivity::class.java))
        }

        buttonDiaperChange.setOnClickListener {
            startActivity(Intent(this, DiaperChangeActivity::class.java))
        }

        buttonSleepTracking.setOnClickListener {
            startActivity(Intent(this, SleepTrackingActivity::class.java))
        }
    }
}
