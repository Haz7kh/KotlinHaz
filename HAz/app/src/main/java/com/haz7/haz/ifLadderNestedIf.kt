package com.haz7.haz

fun main(args: Array<String>) {

    print("please enter your age : ")
    val yourAge :Int = readLine()!!.toInt()
    if (yourAge<13){
        println("you are a child")
    }else if (yourAge <19){
        println("you are a teenage ")

    }else {
        //nested if sats
        if(yourAge <65){
        println("you are an adult")} else {
            println("you are a senior")
        }
    }
}