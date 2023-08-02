package com.project.collage_project

data class Exercise(
    val exercise: String,
    val description: String,
    val bodyPart: String,
    val reps: String,
    val gif: String) {

    val uri: String
        get() = "drawable/$gif"

}

