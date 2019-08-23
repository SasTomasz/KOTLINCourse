package com.example.android.kotlincourse

import java.lang.Math.random
import kotlin.random.Random

fun main(){
    println("How many size your dice have?: ")
    val sidesOdDice = readLine()!!.toInt()
    val rollDice = {sides: Int -> if (sides > 0) Random.nextInt(sides) else 0}
    val rollDice2: (Int) -> Int = {size -> if (size > 0) Random.nextInt(size) else 0}
    gamePlay(sidesOdDice, rollDice2)

}

fun gamePlay(sides: Int, roll: (Int) -> Int){
    print(roll(sides).toString())
}

