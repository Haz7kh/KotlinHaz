package com.haz7.haz

fun main(args: Array<String>) {
    println("what is your name ?")
    var name:String?= readLine()
    println("how old are you ? ")
    var age: Int = readLine()!!.toInt()
    println("welcome >>> "+name)
}