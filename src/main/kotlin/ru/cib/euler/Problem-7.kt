package ru.cib.euler

fun main() {
    val primeArray = mutableListOf<Int>()
    (1..1000000)
        .forEach {
            if (primeArray.size <= 10001 && isPrime(it))
                primeArray.add(it)
        }
    println(primeArray.last())
}

fun isPrime(number: Int): Boolean {
    (2..number/2).forEach {
        if (number%it == 0)
            return false
    }
    return true
}