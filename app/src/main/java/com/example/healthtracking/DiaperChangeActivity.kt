package com.example.healthtracking

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.healthtracking.databinding.ActivityDiaperChangeBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class DiaperChangeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDiaperChangeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiaperChangeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {
            val time = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
            val type = binding.etType.text.toString()
            Toast.makeText(this, "Diaper change recorded: $time, Type: $type", Toast.LENGTH_SHORT).show()
        }
    }
}

