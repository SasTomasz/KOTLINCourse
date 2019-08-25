package com.example.android.kotlincourse.spices

fun main() {
    delegate()
}

fun delegate() {
    val curry = Curry()
    println(curry.color)
}

sealed class Spice(val name: String, val spiciness: String = "mild",
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
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color: Color
        get() = Color.YELLOW

}

 data class SpiceContainer(val spice: Spice){
    val label = spice.name
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}




