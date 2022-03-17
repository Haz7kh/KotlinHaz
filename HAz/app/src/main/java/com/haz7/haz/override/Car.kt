package com.haz7.haz.override

class Car: Vehicle() {
    fun superStar(){
        super.start()
    }
    fun superAccelerate(){
        super.accelerate(80)
    }
    fun superStop(){
        super.stop()
    }

    override fun start() {
        println("Car has started .")
    }

    override fun accelerate(speed:Int) {
        println("Car accelerates at $speed .")
    }

    override fun stop() {
        println("Car has stopped .")
    }

}