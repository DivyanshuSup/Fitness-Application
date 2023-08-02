package com.project.collage_project

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.collage_project.databinding.ActivityDaysBinding

class DaysActivity: AppCompatActivity() {

    private lateinit var binding: ActivityDaysBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDaysBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            exerciseList()
        }
    }

    private fun exerciseList() {
        val intent = Intent(this, DayExerciseActivity::class.java)
        startActivity(intent)
    }
}