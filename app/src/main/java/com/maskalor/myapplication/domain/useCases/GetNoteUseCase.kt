package com.maskalor.myapplication.domain.useCases

class GetNoteUseCase (private val repository: Repository) {
    fun execute(id: Int){
        repository.getNote(id)
    }
}