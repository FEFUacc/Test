package com.maskalor.myapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

import com.maskalor.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MyViewModel
    lateinit var noteListAdapter: NoteListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        noteListAdapter = NoteListAdapter()
        binding.rv.adapter = noteListAdapter
        binding.rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        viewModel.getNoteList()
        viewModel.noteListLV.observe(this){
            noteListAdapter.submitList(it)
        }

        binding.addNoteButton.setOnClickListener{
            viewModel.addNote(
                binding.title.text.toString(),
                binding.desc.text.toString()
            )
        }
    }
}

