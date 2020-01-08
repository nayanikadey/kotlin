package com.thoughtworks.workshop.kotlin


fun main() {
    println("What's your name ?")
    val name = readLine()

    val message = name ?: "Stranger"

    if(name == null) {
        printName(message = message, greeting = "Hi")
    } else {
        printName(message = message, excitationLevel = message.length, greeting = "Hello")
    }

}

fun printName(greeting: String, message: String, excitationLevel: Int = 0) {
    println("$greeting, $message ${"!".repeat(excitationLevel)}")
}
