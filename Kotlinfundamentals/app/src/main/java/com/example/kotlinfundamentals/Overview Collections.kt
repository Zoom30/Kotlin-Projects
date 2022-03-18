package com.example.kotlinfundamentals

fun main() {

    // array
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 5, 3, 4 ,6)
    val numbers1 = intArrayOf(1, 3, 2, 5, 7, 4)
    val numbers2 = arrayOf(2, 3, 4, 7, 5, 2)

    println(numbers2.contentToString())


    // list
    val months = listOf("Jan", "Feb", "Mar")
    val anyTypes = listOf<Any>("Bruh", 1, 2, 3, true, "String")

    val additionalMonths = months.toMutableList()
    additionalMonths.add(2, "March")
    println(additionalMonths)


    // sets

    val fruits = setOf("Orange", "Apple", "Grape", "Apple", "Mango")
    println("Size of fruits is ${fruits.size}")
    val newFruits = fruits.toMutableSet()
    newFruits.add("Bruh")
    println(newFruits)

    // maps (equivalent to python dictionary)
    val daysOfWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")

    for(key in daysOfWeek.keys){
        println(key)
    }


    // arraylist



}