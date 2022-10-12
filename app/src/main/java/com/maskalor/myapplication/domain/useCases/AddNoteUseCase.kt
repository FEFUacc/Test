package com.maskalor.myapplication.domain.useCases

import com.maskalor.myapplication.data.Note

class AddNoteUseCase(private val repository: Repository) {
    fun execute(note: Note){
        repository.addNote(note)
    }
}