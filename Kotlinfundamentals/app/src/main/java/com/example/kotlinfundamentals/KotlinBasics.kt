package com.example.kotlinfundamentals

import java.lang.IllegalArgumentException


data class User(val id: Long, val name: String){

}

fun main() {
    println("Hello world")
//    val samsung1 = Phone("Android 11", "Samsung", "Galaxy S21")
//    println(samsung1)
//    println(samsung1.completeInfo)

    val myCar = Car()
    myCar.owner

    println(myCar.myBrand)
    myCar.maxSpeed = -30
    println(myCar.maxSpeed)
}

//class Phone constructor(osName: String, brand: String, model: String){
//    val completeInfo = "OS name: $osName, Phone brand: $brand, Phone model: $model"
//    init {
//        println("Initialising:> OS name: $osName, Phone brand: $brand, Phone model: $model")
//    }
//}


class Car{
    lateinit var owner: String

    val myBrand: String = "BMW"
    get() {
        return field.lowercase()
    }


    var maxSpeed: Int = 250
    set(maxSpeed) {
        field = if (maxSpeed > 0) maxSpeed else throw IllegalArgumentException("Max speed cannot be less than 0")

    }

    init {
        this.owner = "Daniel"
    }
}