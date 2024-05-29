package com.example.myapplication

import BookApi
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers

class BooksViewModel : ViewModel() {

    private val repository = ApiRepository(BookApi)

    val books = repository.books
//Research: was ist falsch im ViewmodelScope?
    fun loadBooks() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.loadBooks()
        }

    }

}

