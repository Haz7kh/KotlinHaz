package com.haz7.haz

fun main(args: Array<String>) {
    val age =ArrayList<Int>()
    age.add(10)
    age.add(1,15)
    age.add(20)
    println("first element = "+ age[0])
    println("second element = "+ age.get(1))
    println("third element = ${age[2]}")
    age.remove(15)
    println("-----------------------------------------")
    println(age.size)
    println("first element = "+ age[0])
    println("second element = "+ age.get(1))
    println("-----------------------------------------")
    val cars = arrayListOf<String>("Opel","BMW")
    cars.add("Ford")
    println("first element = "+ cars[0])
    println("second element = "+ cars.get(1))
    println("third element = ${cars[2]}")

    val mixArrayList= arrayListOf<Any>()
    mixArrayList.add("ford")
    mixArrayList.add(20)
    mixArrayList.add(2.34)
    mixArrayList.add(false)
    mixArrayList.add('K')

}