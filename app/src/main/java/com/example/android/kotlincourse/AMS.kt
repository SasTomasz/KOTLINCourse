package com.example.android.kotlincourse

fun main(args: Array<String>){
    whatShouldIDoToday("sad")
    whatShouldIDoToday("happy", temperature = 30)
    whatShouldIDoToday("good")
    whatShouldIDoToday("sad", weather = "windy")
    whatShouldIDoToday("good", weather = "calm", temperature = 19)
}

fun whatShouldIDoToday (mood : String, weather : String = "Sunny", temperature : Int = 24) {
    when{
        isHappyMood(mood) && isSunnyWeather(weather) -> println("go for a walk")
        isSadMood(mood) && isSunnyWeather(weather) && isWarm(temperature) -> println("go for a jogging")
        isHappyMood(mood) || isSadMood(mood) && isWindyWeather(weather) -> println ("go for the gym")
        isCold(temperature) && isCalmWeather(weather) -> println("go to swimming pool")
        else -> println("Stay home and read.")
    }
}

fun isHappyMood(mood: String) = mood == "happy"
fun isSadMood(mood: String) = mood == "sad"
fun isSunnyWeather(weather: String) = weather == "Sunny"
fun isWindyWeather(weather: String) = weather == "windy"
fun isCalmWeather(weather: String) = weather == "calm"
fun isWarm(temperature: Int) = temperature >= 20
fun isCold(temperature: Int) = temperature < 20
fun getMood(): String{
    val mood: String = "Happy"
    readLine(mood)
}