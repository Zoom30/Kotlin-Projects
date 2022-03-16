package com.example.kotlinfundamentals

import kotlin.math.pow

fun main() {

//    var x = 15
//    do {
//        println(x)
//        x++
//    } while (x <= 35)
//    println(x)


//    for(i in 15 downTo 1 step 3){
//       println(i)
//    }
//
//    for(x in 1.until(10).step(3)){
//        println(x)
//    }


//    var season = 3
//    when(season){
//        1 -> println("It's Spring")
//        2 -> println("It's Summer")
//        3 -> {
//            println("It's Fall")
//        }
//        else -> println("Invalid Season")
//    }


//    var month = 3
//    when(month){
//        in 3..5 -> println("Spring")
//        in 12, 1, 2 -> println("Winter")
//    }
//    println(total(6.0,5.0))

//    var name: String = "Daniel"
//    name = null
    var nullableName: String? = null

    //elvis operator
    val name = nullableName ?: "Guest"
    println(name)

    //not null assertion operator
    var surname = nullableName!!.lowercase()
    println(surname)


    //if let equivalent

    nullableName?.let { println(it.length) }
}

fun myFunction() {
    println("Called from myFunction")
}


fun total(x: Double, y: Double): Double {
    return x.pow(y)
}