package com.haz7.haz.override

open class Vehicle {
    open fun start() {
        println("Vehicle has started .")
    }

    open fun accelerate(speed:Int) {
        println("Vehicle accelerates at $speed .")
    }

    open fun stop() {
        println("Vehicle has stopped .")
    }
}