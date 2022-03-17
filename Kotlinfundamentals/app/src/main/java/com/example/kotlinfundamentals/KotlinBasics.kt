package com.example.kotlinfundamentals

import java.util.*

fun main() {
    println("Hello world")


    val list = listOf("a", "b", "c")

//    println(list.indices)
//    if (-1 !in 0..list.lastIndex) {
//        println("-1 is out of range")
//    }
//    if (list.size !in list.indices) {
//        println("list size is out of valid list indices range, too")
//    }

//    val x = InitOrderDemo("NewOrderDemo")
//    println(x)
    val y = Pet()

    val newPerson = Person(y)

}



//class InitOrderDemo(name: String) {
//    val firstProperty = "First property: $name".also(::println)
//
//    init {
//        println("First initializer block that prints $name")
//    }
//
//    val secondProperty = "Second property: ${name.length}".also(::println)
//
//    init {
//        println("Second initializer block that prints ${name.length}")
//    }
//}



class Person(val pets: MutableList<Pet> = mutableListOf())

class Pet {
    constructor(owner: Person) {
        owner.pets.add(this) // adds this pet to the list of its owner's pets
    }
}