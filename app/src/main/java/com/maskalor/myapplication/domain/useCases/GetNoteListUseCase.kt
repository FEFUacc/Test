package com.maskalor.myapplication.domain.useCases

import com.maskalor.myapplication.data.Note

class GetNoteListUseCase (private val repository: Repository) {
    fun execute() : List<Note> {
        return repository.getNoteList()
    }
}