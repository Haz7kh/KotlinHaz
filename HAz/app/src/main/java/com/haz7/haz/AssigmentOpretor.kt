package com.haz7.haz

fun main(args: Array<String>) {
    val x:Int =20
    val y:Int =15
    var z:Int = 0
    z= x + y
    println("z= x + y = $z")
    z += x
    println("z += x  = $z")
    z -=x
    println("z -= x = $z")
    z *=x
    println("z *= x = $z")
    z /= x
    println("z /= x  = $z")
    z %= x
    println("z %= x  = $z")
}
