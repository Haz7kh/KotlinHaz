package com.haz7.haz

import kotlin.random.Random

fun main(args: Array<String>) {
    var i = 5
    while (i>0){
        println("i = $i")
        i--
    }
    //3 --> 3*2*1
    var k=1
    var fact =1
    while (k<6){
        fact *=k
        println("$k! =$fact")
        k++
    }
    //infinite loop
    //guess the number game
   val number = Random.nextInt(0,100)
    println("enter a number:")
    while (true){
        val  guessNum = readLine()!!.toInt()
        if(number ==guessNum){
            println("winner ")
            break
        }else if (guessNum < number){
            println("increase your number ")
        }else {
            println("decrease your number")
        }
    }




}