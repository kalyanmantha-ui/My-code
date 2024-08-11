package com.example.healthtracking

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.healthtracking.databinding.ActivityBreastfeedingBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class BreastfeedingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBreastfeedingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBreastfeedingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val time = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
            val duration = binding.etDuration.text.toString()
            Toast.makeText(this, "Breastfeeding recorded: $time, Duration: $duration", Toast.LENGTH_SHORT).show()
        }
    }
}
