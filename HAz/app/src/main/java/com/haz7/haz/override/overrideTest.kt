package com.haz7.haz.override

fun main(args: Array<String>) {
    //creating an Object from Vehicle class
    val vehicle = Vehicle()
    vehicle.start()
    vehicle.accelerate(80)
    vehicle.stop()
    println("______________________________________________")
    val car = Car()

    car.superStar()
    car.superAccelerate()
    car.superStop()
    println("_________________________________________")
    car.start()
    car.accelerate(100)
    car.stop()

}