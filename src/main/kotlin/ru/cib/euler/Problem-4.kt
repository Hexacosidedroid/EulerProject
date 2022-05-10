package ru.cib.euler

fun main() {
    val palindromes = hashMapOf<Int, Pair<Int, Int>>()
    (10000..999999)
        .filter { "$it" == "$it".reversed() && it > 900000 }
        .forEach { palindrome ->
            (900..999)
                .forEach {
                    if (palindrome%it == 0)
                        palindromes[palindrome] = Pair(it, palindrome/it)
                }
        }
    println(palindromes)
}