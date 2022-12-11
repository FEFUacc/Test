package com.maskalor.myapplication.data

data class Note(
    var title: String,
    var description: String,
    val date: String,
    var isFavorite : Boolean = false,
    val id: Int = UNDEFINED_ID
) {
    companion object{
        const val UNDEFINED_ID = -1
    }
}