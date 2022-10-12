package com.maskalor.myapplication.presentation

import androidx.recyclerview.widget.DiffUtil
import com.maskalor.myapplication.data.Note

class NoteListDiffUtilCallBack : DiffUtil.ItemCallback<Note>() {
    override fun areItemsTheSame(oldItem: Note, newItem: Note): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Note, newItem: Note): Boolean {
        return oldItem == newItem
    }
}