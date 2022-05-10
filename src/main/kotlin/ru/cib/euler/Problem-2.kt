package ru.cib.euler

fun main() {
    val sum = generateSequence(Pair(1, 2)) {
        Pair(it.second, it.first + it.second)
    }
        .map { it.first }
        .takeWhile { it < 4000000 }
        .filter { it%2 == 0 }
        .sumOf { it }
    println(sum)
}