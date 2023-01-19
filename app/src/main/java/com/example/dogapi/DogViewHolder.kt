package com.example.dogapi

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.dogapi.databinding.ItemDogBinding
import com.squareup.picasso.Picasso

class DogViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemDogBinding.bind(view)

    fun bind(image:String){
        //carga la imagen en el imageView
        Picasso.get().load(image).into(binding.ivDog)

    }
}