package com.chilik1020.problem006

fun main() {
    val a1 = sumOfSquare(101)
    val a2 = squareOfSum(101)
    println(a2-a1)
}

fun sumOfSquare(n: Int): Int {
    return n*(n+1)*(2*n+1)/6
}

fun squareOfSum(n: Int): Int {
    val sum = if (n%2 == 0)
        (n+1)*n/2
    else
        (n+1)*(n/2) + (n/2 + 1)

    return sum*sum
}
