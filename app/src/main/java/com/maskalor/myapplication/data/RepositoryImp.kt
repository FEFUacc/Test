package com.maskalor.myapplication.data

import com.maskalor.myapplication.domain.useCases.Repository
import kotlin.random.Random

class RepositoryImp : Repository {

    private val noteList: MutableList<Note> = mutableListOf()

    init {
        for (i in 0..20){
            noteList.add(Note("Title $i", "Description $i", "none", Random.nextBoolean()))
        }
    }

    override fun getNote(id: Int): Note {
        return noteList.first() {
            it.id == id
        }
    }

    override fun addNote(note: Note) {
        noteList.add(note)
    }

    override fun editNote(note: Note): Note {
        TODO("Not yet implemented")
    }

    override fun getNoteList(): List<Note> {
        return noteList.toList()
    }


}