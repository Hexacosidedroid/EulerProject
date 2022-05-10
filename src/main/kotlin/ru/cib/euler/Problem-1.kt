package ru.cib.euler
fun main() {
    val sum = IntArray(999) { it+1 }.filter { it % 3 == 0 || it % 5 == 0 }.sumOf { it }
    println(sum)
}