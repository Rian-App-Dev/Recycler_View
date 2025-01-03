package com.example.recyclerviewapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.databinding.RvDesignBinding

class Adapter(val datalist: List<Details>): RecyclerView.Adapter<Adapter.ViewHolderClass>() {
    inner class ViewHolderClass(val binding: RvDesignBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val binding = ViewHolderClass(RvDesignBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        return binding
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        holder.binding.userName.text = datalist[position].name
        holder.binding.userEmail.text = datalist[position].email
    }
}
