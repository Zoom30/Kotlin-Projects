package com.example.kotlinfundamentals

fun main() {
    val sum: (Int, Int) -> Int = {a: Int, b: Int -> a + b}
    val sumShorter = {a: Int, b: Int -> println(a + b)}
}