package com.haz7.haz

fun main(args: Array<String>) {

    println("enter number between 1 till 7")

    val numOfTheDay: Int = readLine()!!.toInt()

    when (numOfTheDay ){
        1 -> println("Monday")
        2 -> print("Tuesday")
        3 -> print("Wednesday")
        4 -> print("Thursday")
        5 -> println("Friday")
        6 -> print("Saturday")
        7 -> print("Sunday")
        else -> println("wrong enter")


    }

}