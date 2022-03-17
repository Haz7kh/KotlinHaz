package com.haz7.haz

fun main(args: Array<String>) {
    val mySetArray = arrayListOf<Any>("Kotlin", 2,2.5,'k',true,"Kotlin")

    println(mySetArray.size)
    println(mySetArray.last())
    println("-------------------------------------------")
    val mySetOfArray = setOf<Any>("Kotlin", 2,2.5,'k',true,"Kotlin")

    println(mySetOfArray.size)
    println(mySetOfArray.last())
}