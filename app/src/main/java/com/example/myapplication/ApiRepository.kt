package com.example.myapplication

import BookApi
import androidx.lifecycle.MutableLiveData

class ApiRepository(private val api: BookApi) {

    private val _books = MutableLiveData<List<BookApi>>()
    val books : MutableLiveData<List<BookApi>>
    get()= _books

}