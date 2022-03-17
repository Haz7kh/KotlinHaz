package com.haz7.haz.abstract

fun main(args: Array<String>) {

   // val vehicle = Vehicle()
    val car =Car(1980)
    car.speed = 300
    println("name : ${car.vehicleName("ferrari") }\n " +
            "Type : ${car.vehicleType("Car")}\n" +
            "model: ${car.model} \n " +
            "speed: ${car.speed}"
    )

}