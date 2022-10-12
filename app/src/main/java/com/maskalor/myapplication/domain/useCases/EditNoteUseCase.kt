package com.maskalor.myapplication.domain.useCases

import com.maskalor.myapplication.data.Note

class EditNoteUseCase (private val repository: Repository) {
    fun execute(note: Note){
        repository.editNote(note)
    }
}