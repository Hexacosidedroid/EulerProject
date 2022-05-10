package ru.cib.euler

import kotlin.math.pow

fun main() {
    (1..100)
        .forEach { n ->
            (1..100).forEach { m ->
                if (m > n) {
                    val a = m.toDouble().pow(2) - n.toDouble().pow(2)
                    val b = 2.0 * m * n
                    val c = n.toDouble().pow(2) + m.toDouble().pow(2)
                    if (a + b + c == 1000.0) {
                        println("${a.toInt()} : ${b.toInt()} : ${c.toInt()}")
                        println("${a.toInt() * b.toInt() * c.toInt()}")
                    }
                }
            }
        }
}