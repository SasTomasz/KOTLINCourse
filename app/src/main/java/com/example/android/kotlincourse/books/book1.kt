package com.example.android.kotlincourse.books

fun main() {
    val allBooks = setOf("Gilgamesh", "The story of king Lear", "The story of Don Juan", "Hamlet")
    val library = mapOf(Pair("William Shakespeare",allBooks))
    println("Is there a \"Hamlet\" in my books: ${library.any { library.containsValue(allBooks) && allBooks.contains("Hamlet")}}")
    val moreBooks = mutableMapOf<String, String>()
    moreBooks.put("Siła Nawyku", "Charles Duhigg")
    moreBooks.getOrPut("Charles Duhigg") {"Mądrzej, szybciej, lepiej"}

    println(moreBooks)
}

