package com.project.collage_project

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WeightLossAdapter(private val exercises: MutableList<Exercise>) :
    RecyclerView.Adapter<WeightLossViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeightLossViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.weight_loss_view_holder, parent, false)
        return WeightLossViewHolder(view)
    }

    override fun getItemCount(): Int = exercises.size

    override fun onBindViewHolder(holder: WeightLossViewHolder, position: Int) {
        holder.bind(exercises[position])
    }
}