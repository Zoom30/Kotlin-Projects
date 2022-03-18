package com.example.kotlinfundamentals

open class Vehicle (name: String, numberOfWheels: Int) {
    var range = 0
    fun getRange(): String{
        return "Travelled for $range"
    }
}


open class Car(name: String, numberOfWheels: Int, brand: String) : Vehicle(name, numberOfWheels)

class ElectricCar(name: String, numberOfWheels: Int, brand: String) : Car(name, numberOfWheels,
    brand
)

fun main() {
    var tesla = ElectricCar("tesla s", 4, "Tesla")
    tesla.range = 350
    println(tesla.getRange())
}

