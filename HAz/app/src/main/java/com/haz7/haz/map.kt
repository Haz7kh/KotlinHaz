package com.haz7.haz

fun main(args: Array<String>) {
    //this map is  immutable
    println("---------------immutable mapOf")
    val age= mapOf<String,Int>("Khaled" to 34,"Haz" to 23)

    println("age of Khaled:" +age["Khaled"])
    println("age of Haz:" +age["Haz"])

    println("---------------mutableMapOf")
    //this map is  mutable
    val ageM= mutableMapOf<String,Int>("Khaled" to 34,"Haz" to 23)
    //add index
    ageM["Sara"] = 24
    ageM.put("Salma",30)
    println("age of Khaled:" +ageM["Khaled"])
    println("age of Haz:" +age["Haz"])
    println("age of Sara:" +ageM["Sara"])
    println("age of Salma:" +ageM.get("Salma"))
}