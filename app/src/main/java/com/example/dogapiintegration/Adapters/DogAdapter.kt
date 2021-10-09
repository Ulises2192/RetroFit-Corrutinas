package com.example.dogapiintegration

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dogapiintegration.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogAdapter(val images: List<String>): RecyclerView.Adapter<DogViewHoleder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHoleder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return  DogViewHoleder(layoutInflater.inflate(R.layout.item_dog,parent, false))
    }

    override fun onBindViewHolder(holder: DogViewHoleder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = images.size
}

class DogViewHoleder(view: View): RecyclerView.ViewHolder(view){

    private val binding = ItemDogBinding.bind(view)

    fun bind(image: String){
        Picasso.get().load(image).into(binding.ivdog)
    }
}