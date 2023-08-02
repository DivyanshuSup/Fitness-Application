package com.project.collage_project

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import pl.droidsonroids.gif.GifImageView

class WeightLossViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val name: TextView = itemView.findViewById(R.id.exerciseName)
    private val repCount: TextView = itemView.findViewById(R.id.reps)
    private val bodyPart: TextView = itemView.findViewById(R.id.bodyPart)
    private val gif: GifImageView = itemView.findViewById(R.id.gif)
    private val context: Context = itemView.context

    fun bind(exercise: Exercise) {
        name.text = exercise.exercise
        bodyPart.text = exercise.bodyPart
        repCount.text = exercise.reps
        gif.setImageResource(
            context.resources.getIdentifier(exercise.uri, null, context.packageName)
        )
//        val drawable = context.resources.getIdentifier(exercise.gif, null, context.packageName)
//        gif.setImageDrawable(context.getDrawable(drawable))
    }
}