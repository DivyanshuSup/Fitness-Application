package com.project.collage_project

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.google.gson.Gson

class DataViewModel(private val application: Application) : AndroidViewModel(application) {
    private var exerciseList: MutableList<Exercise> = mutableListOf()

    init {
        exerciseList = loadExercisesFromAssets()
    }

    private fun loadExercisesFromAssets(): MutableList<Exercise> {
        val inputStream = application.assets.open("exercises.json")
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()

        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        return gson.fromJson(json, Array<Exercise>::class.java).toMutableList()
    }

    fun getExercises(): MutableList<Exercise> = exerciseList
}