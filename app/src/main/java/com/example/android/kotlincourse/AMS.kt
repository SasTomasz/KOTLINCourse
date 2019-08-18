package com.example.android.kotlincourse

import java.util.*

fun main(args: Array<String>){
    println("Your fortune is: " + getFortuneCookies())
}

fun getFortuneCookies(): String {
    val fortune = listOf("You will have a great day!", "Things will go well for you today.",
        "Enjoy a wonderful day of success.", "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.", "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday: ")
    var birthday = readLine()?.toIntOrNull() ?:1
    birthday = birthday.div(7)
    return fortune[birthday]

}