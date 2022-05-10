package ru.cib.euler

import kotlin.math.pow

fun main() {
    val array = IntArray(100) { it+1 }
    val sumOfSquares = array.sumOf { it * it }
    val squareOfSums = array.sum().toDouble().pow(2).toInt()
    println(squareOfSums - sumOfSquares)
}