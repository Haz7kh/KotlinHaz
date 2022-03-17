package com.haz7.haz

fun main(args: Array<String>) {
    val age= arrayOf(23,34,54,33,45)
    println("first element of array =" + age[0])
    println("second element of array =" + age.get(1))
    println("third element of array =" + age[2])
    println("--------------------------------------------")

    val cars = arrayOf("marc","BMW","TESLA")
    println("first element of array =" + cars[0])
    println("second element of array =" + cars.get(1))
    println("third element of array =" + cars[2])

    cars.set(2,"Ford")
    println("--------------------------------------------")
    println("first element of array =" + cars[0])
    println("second element of array =" + cars.get(1))
    println("third element of array =" + cars[2])
    println("number of cars =" + cars.size)
    println("--------------------------------------------")
    val carsAndAge= arrayOf("ford",45,"Nissan", 47)
    println("first element of array =" + carsAndAge[0])
    println("second element of array =" + carsAndAge.get(1))
    println("third element of array =" + carsAndAge[2])
    println("Forth element of array =" + carsAndAge[3])

}