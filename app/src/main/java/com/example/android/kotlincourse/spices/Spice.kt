package com.example.android.kotlincourse.spices

import android.graphics.Color

fun main() {
    val labelsTest = listOf(SpiceContainer(Curry("green curry", "hot")),
        SpiceContainer(Curry("red curry", "mild")),
        SpiceContainer(Curry("yellow curry", "mild"))
    )
    for (i in labelsTest) println(i.label)
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

 data class SpiceContainer(val spice: Spice){
    val label = spice.name
}



