package com.example.android.kotlincourse.books

open class Book(val title: String, val author: String) {
    private var currentPage = 1

    open fun readPage() {
        currentPage++
    }

}

class eBook(title: String, author: String, val format: String = "text") :
    Book(title, author) {
    private var currentWord = 1
    override fun readPage() {
        currentWord.plus(250)

    }

}