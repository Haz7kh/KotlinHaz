package com.haz7.haz

fun main(args: Array<String>) {
//    for (x in 1..10){
//        println("x")
//    }
//    var sum:Int = 0
//    for (y in 0..5) {
//        println(y)
//        sum +=y
//    }
//    println("sum = $sum")

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++

//    val num = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
//
//    for (y in num){
//        println(y)
//    }
//    val num = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
//
//    for (y in 0..(num.size)-1){
//        println("my array [$y]=${num[y]}")
//    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++

//    val num = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
//
//    for (y in num.indices){
//        println("my array [$y]=${num[y]}")
//    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //for each
    val num = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    num.forEach { println(it) }

}