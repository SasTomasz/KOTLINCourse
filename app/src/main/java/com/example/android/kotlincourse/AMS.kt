package com.example.android.kotlincourse

import java.util.*

fun main(args: Array<String>){
    dayOfWeek()
}

fun dayOfWeek() {
    println("What day is it today?")
    var intDay = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var stringDay = "initial day"
    when (intDay) {
        1 -> stringDay = "Sunday"
        2 -> stringDay = "Monday"
        3 -> stringDay = "Tuesday"
        4 -> stringDay = "Wednesday"
        5 -> stringDay = "Thursday"
        6 -> stringDay = "Friday"
        7 -> stringDay = "Saturday"
    }
    println("Today is the $stringDay")
}