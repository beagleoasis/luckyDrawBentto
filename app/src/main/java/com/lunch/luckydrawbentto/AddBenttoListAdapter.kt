package com.lunch.luckydrawbentto

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AddBenttoListAdapter(val items :MutableList<String>) : RecyclerView.Adapter<AddBenttoListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AddBenttoListAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.benttolist_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AddBenttoListAdapter.ViewHolder, position: Int) {
        holder.bindItems(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindItems(item:String){
            //foodList adapter와 같은 모양을 사용한다.
            val fl_text = itemView.findViewById<TextView>(R.id.blItem)
            fl_text.text = item
        }
    }

}