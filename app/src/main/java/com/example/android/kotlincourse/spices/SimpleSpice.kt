package com.example.android.kotlincourse.spices

class SimpleSpice {
    var name = "curry"
    var spiciness = "mild"
    var heat: Int
        get() = if (spiciness == "mild") 5 else 0
        set(value) {}
}