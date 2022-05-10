package ru.cib.euler

import kotlin.math.sqrt

fun main() {
    val number = 600851475143
    val findPrime = findFactors(number)
    println(findPrime)
}

fun findFactors(number: Long): Long {
    val factors = mutableListOf<Long>()
    (2..sqrt(number.toDouble()).toLong())
        .filter { number % it == 0L }
        .forEach { factors.add(it) }
    factors.add(number)
    return findHighestPrimeFactor(factors)
}

fun findHighestPrimeFactor(factors: MutableList<Long>): Long {
    var highestPrimeFactor = 0L
    factors.forEach {
        for (i in 2..it/2) {
            if (it%i == 0L)
            return@forEach
        }
        highestPrimeFactor = it
    }
    return highestPrimeFactor
}