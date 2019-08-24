package com.example.android.kotlincourse.spices

class SimpleSpice {
    var name = "curry"
    var spiciness = "mild"
    var heat: Int
        get() {return 5}
        set(value) {}
}