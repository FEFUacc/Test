package com.maskalor.myapplication.domain.useCases

import com.maskalor.myapplication.data.Note

interface Repository {
    fun getNote(id: Int): Note
    fun addNote(note: Note)
    fun editNote(note: Note): Note
    fun getNoteList(): List<Note>
}