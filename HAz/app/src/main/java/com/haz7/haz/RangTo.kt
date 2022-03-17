package com.haz7.haz

fun main(args: Array<String>) {
    //var myCharRange='a' .. 'j' :we can use it also same result
    val myCharRange='a'.rangeTo('k')
    val myChar = 'k' in myCharRange
    println("myCharRange has : "+myChar)
}