package com.project.collage_project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.collage_project.databinding.ActivityDayExerciseBinding

class DayExerciseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDayExerciseBinding
    private lateinit var exerciseRecycler: RecyclerView
    private lateinit var exercises: MutableList<Exercise>
    private lateinit var dataModel: DataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDayExerciseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataModel = ViewModelProvider(this)[DataViewModel::class.java]
        setupRecycler()
    }

    private fun setupRecycler() {
        exercises = dataModel.getExercises()
        exerciseRecycler = binding.exerciseRecycler
        exerciseRecycler.layoutManager = LinearLayoutManager(this)
        exerciseRecycler.adapter = WeightLossAdapter(exercises)
    }
}