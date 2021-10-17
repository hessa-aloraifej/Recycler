package com.example.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class RVAdapter ( private val info: ArrayList<Information>): RecyclerView.Adapter<RVAdapter.ItemViewHolder>() {
    class ItemViewHolder (itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val information=info[position]

        holder.itemView.apply {
         name.text= information.fname
         lastname.text=information.lname
         phone.text=information.phone.toString()
         location.text= information.location

        }
    }

    override fun getItemCount() = info.size

}

