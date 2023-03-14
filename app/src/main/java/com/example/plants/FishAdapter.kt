package com.example.plants

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.plants.databinding.FishItemBinding

class FishAdapter : RecyclerView.Adapter<FishAdapter.FishHolder>() {
    val fishList = ArrayList<Fish>()
    class FishHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = FishItemBinding.bind(item)

        fun bind (fish: Fish) = with(binding){
            imageView.setImageResource(fish.ImageId)
            tvTitle.text = fish.Title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FishHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fish_item, parent, false)
        return FishHolder(view)
    }

    override fun onBindViewHolder(holder: FishHolder, position: Int) {
        holder.bind(fishList[position])
    }

    override fun getItemCount(): Int {
        return fishList.size
    }

    fun addFish(fish: Fish){
        fishList.add(fish)
        notifyDataSetChanged()
    }
}

