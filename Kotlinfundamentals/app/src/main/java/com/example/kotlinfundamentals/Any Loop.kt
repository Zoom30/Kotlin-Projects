package com.example.kotlinfundamentals

import kotlin.reflect.typeOf

fun main() {
    var anyTypeList: MutableList<Any> = mutableListOf("Daniel", 15, "Kg", 60.5)

    for(obj in anyTypeList){
        when(obj){
            is String -> {
                println("$obj is String")
            }
            is Int -> {
                println("$obj is Int")
            }
            else -> {
                println("$obj is Double")
            }
        }
    }
}