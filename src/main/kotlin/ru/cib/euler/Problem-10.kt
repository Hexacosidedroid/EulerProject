package ru.cib.euler

fun main() {
    val sums = mutableListOf<Int>()
    val array = IntArray(2000000) { it + 1 }
    array.drop(1).forEach {
        if (isPrime(it)) //Starting to use methods from previous problems =P
            sums.add(it)
    }
    println(sums.sumOf { it.toLong() })
}