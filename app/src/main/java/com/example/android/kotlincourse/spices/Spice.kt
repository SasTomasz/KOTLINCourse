package com.example.android.kotlincourse.spices

class Spice(val name: String, val spiciness: String = "mild") {
    private val heat: Int
        get() {
            return when (spiciness) {
                "medium" -> 2
                "hot" -> 3
                "extra hot" -> 4
                else -> 1
            }
        }

    init {
        println("$name is $spiciness that means it have spiciness of $heat")
    }

    val listOfSpices = listOf(Spice("chili", "hot"),
        Spice("chabanero", "extra hot"), Spice("salt", "mild"))

    val spice = Spice("jalapeno", "extra hot")

    val listOfSpicy = listOfSpices.filter { it.heat > 1 }


    fun makeSalt() = Spice("salt", "mild")
}