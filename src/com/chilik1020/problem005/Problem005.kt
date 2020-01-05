package com.chilik1020.problem005

fun main() {
    var number = 39
    while (!checkIfNumberDivisibleByAllFrom1To20(++number)) {}

    println(number)
}

private fun checkIfNumberDivisibleByAllFrom1To20(number: Int): Boolean {
    for (i in 20 downTo 2) {
        if (number%i != 0)
            return false
    }
    return true
}