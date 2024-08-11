package com.example.healthtracking

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.healthtracking.databinding.ActivitySleepTrackingBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class SleepTrackingActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySleepTrackingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySleepTrackingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val time = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
            val duration = binding.etDuration.text.toString()
            Toast.makeText(this, "Sleep tracking recorded: $time, Duration: $duration", Toast.LENGTH_SHORT).show()
        }
    }
}