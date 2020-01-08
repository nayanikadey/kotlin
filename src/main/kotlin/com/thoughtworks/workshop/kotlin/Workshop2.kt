package com.thoughtworks.workshop.kotlin

import kotlin.random.Random

fun main() {

    val secret: Int = Random.nextInt(100)

    var i = 0
    while(i < 5) {
        println("Enter number: ")
        val number = readLine()?.toIntOrNull()

        if (number == null) {
            println("Not a number!")
            continue
        }

        val message = when(number.compareTo(secret)) {
            1 -> "Too Big !"
            0 -> {
                "You got it !!"
                 return
            }
            -1 -> "Too small !"
            else -> ""
        }

        println(message)

        println("Chances remaining: $i")
        i++
    }
}