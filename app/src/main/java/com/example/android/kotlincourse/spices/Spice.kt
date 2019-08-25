package com.example.android.kotlincourse.spices

fun main() {
    delegate()
}

fun delegate() {
    val curry = Curry()
    println(curry.color)
}

abstract class Spice(val name: String, val spiciness: String = "mild",
                     color: SpiceColor): SpiceColor by color {
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

    abstract fun prepareSpice()
}

class Curry(
    name: String = "curry", spiciness: String = "mild", color: SpiceColor = YellowSpiceColor
) : Spice(name, spiciness, color), Grinder {

    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color: String
        get() = "yellow"

}


