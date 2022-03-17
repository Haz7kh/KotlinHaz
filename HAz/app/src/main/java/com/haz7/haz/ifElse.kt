package com.haz7.haz

fun main() {

    println("enter a number : ")
    val number:Int = readLine()!!.toInt()
    if (number %2 ==0){
        println("$number is an even")
    } else {
        println("$number is an odd")
    }
}