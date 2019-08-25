package com.example.android.kotlincourse.other

import android.view.View.Y
import android.view.View.Z

class Book(val title: String, val author: String, val year: Int) {

    fun simpleInfo(): Pair<String, String> {
        return title to author
    }

    fun fullInfo(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main() {
    val book1 = Book("Siła nawyku", "Charless Duhig", 2016)
    val book2 = Book("Czterogodzinny tydzień pracy", "Tim Ferris", 2015)

    var (X, Y, Z) = book1.fullInfo()
    println("Here is your book $X written by $Y in $Z.")

    X = book2.fullInfo().first
    Y = book2.fullInfo().second
    Z = book2.fullInfo().third
    println("Here is your book $X written by $Y in $Z")

    println("Without destructing declarations")
    println("Here is your book ${book1.simpleInfo().first} written by ${book1.simpleInfo().second} " +
            "in ${book1.fullInfo().third}")
    println("Here is your book ${book2.simpleInfo().first} written by ${book2.simpleInfo().second} " +
            "in ${book2.fullInfo().third}")

}