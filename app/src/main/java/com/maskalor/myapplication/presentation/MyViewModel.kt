package com.maskalor.myapplication.presentation

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.maskalor.myapplication.data.Note
import com.maskalor.myapplication.data.RepositoryImp
import com.maskalor.myapplication.domain.useCases.AddNoteUseCase
import com.maskalor.myapplication.domain.useCases.GetNoteListUseCase
import com.maskalor.myapplication.domain.useCases.Repository

class MyViewModel() : ViewModel() {


    private val repository = RepositoryImp() as Repository

    private val addNoteUseCase = AddNoteUseCase(repository)
    private val getNoteListUseCase = GetNoteListUseCase(repository)
    private var id = 1
    val noteListLV : MutableLiveData<List<Note>> = MutableLiveData()

    fun addNote(title: String, description: String){
        val note = Note(title, description, "none", id=id++)
        addNoteUseCase.execute(note)
        getNoteList()
    }

    fun getNoteList(){
        Log.d(DEBUG_TAG, noteListLV.value.toString())
        noteListLV.value = getNoteListUseCase.execute()
    }

    companion object{
        const val DEBUG_TAG = "MYViewModel"
    }
}