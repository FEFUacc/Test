package com.maskalor.myapplication.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.maskalor.myapplication.R
import com.maskalor.myapplication.data.Note

class NoteListAdapter : ListAdapter<Note, NoteListAdapter.MyViewHolder>(NoteListDiffUtilCallBack()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = when (viewType){
            FAVORITE_TYPE -> R.layout.note_item_favorite
            DEFAULT_TYPE -> R.layout.note_item_default
            else -> throw Exception("UNKNOWN TYPE: $viewType")
        }
        val view = LayoutInflater.from(parent.context).inflate(layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text = getItem(position).title
        holder.description.text = getItem(position).description
        holder.itemView.setOnClickListener {
            getItem(position).isFavorite = !getItem(position).isFavorite
            notifyItemChanged(position)
        }
    }

    class MyViewHolder(view: View) : ViewHolder(view){
        val title: TextView = view.findViewById(R.id.note_item_title)
        val description: TextView = view.findViewById(R.id.note_item_desc)
    }

    override fun getItemViewType(position: Int): Int {
        return if (getItem(position).isFavorite) {
            FAVORITE_TYPE
        } else {
            DEFAULT_TYPE
        }
    }


    companion object {
        const val FAVORITE_TYPE = 1
        const val DEFAULT_TYPE = 2
    }
}