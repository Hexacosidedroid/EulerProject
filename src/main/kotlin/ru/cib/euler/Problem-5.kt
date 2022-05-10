package ru.cib.euler

fun main() {
    val array = IntArray(999999999) { it + 1 }
    val numbers = mutableListOf<Int>()
    array.forEach { number ->
        var flag = true
        (1..20)
            .forEach { divider ->
                if (number%divider != 0)
                    flag = false
            }
        if (flag)
            numbers.add(number)
    }
    println(numbers.firstOrNull())
}