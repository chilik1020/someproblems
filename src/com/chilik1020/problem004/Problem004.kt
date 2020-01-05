package com.chilik1020.problem004

fun main() {
    firstWayToFindPalindromic()
    secondWayToFindPalindromic()
}
fun firstWayToFindPalindromic() {
    var biggestPalindromic = 0
    var a1 = 0
    var a2 = 0

    for (i in 999 downTo 100) {
        for (j in 999 downTo 100) {
            val product = i * j
            if (isNumberPalindromic(product) && product > biggestPalindromic) {
                biggestPalindromic = product
                a1 = i
                a2 = j
            }
        }
    }
    println("FirstWay: $a1 * $a2 = $biggestPalindromic")
}

fun secondWayToFindPalindromic() {
    var product = 1000000
    while (--product > 10000) {
        if (!isNumberPalindromic(product))
            continue

        for (a1 in 999 downTo 100) {
            if (product%a1 != 0)
                continue

            val a2 = product/a1
            if (a2 > 999)
                continue

            println("SecondWay: $a1 * $a2 = $product")
            return
        }
    }
}

fun isNumberPalindromic(i: Int): Boolean {
    val str = i.toString()
    return str == str.reversed()
}

