package com.project.collage_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.collage_project.databinding.ActivityModesBinding

class ModesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityModesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityModesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMuscleGain.setOnClickListener {
            daysActivity()
        }
        binding.btnWeightLoss.setOnClickListener {
            daysActivity()
        }
    }

    fun daysActivity() {
        val intent  = Intent(this, DaysActivity::class.java)
        startActivity(intent)
    }
}