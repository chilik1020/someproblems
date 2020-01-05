package com.chilik1020.problem012

import com.chilik1020.problem003.sieveOfEratosthenes

fun main() {
    val n = 1300401123219
    val n1 = 76576500L
    val n2 = 28L
    factorization(n1)
    calcCountOfDivisors(n1)
    calcCountOfDivisorsTriangleNumber()
}

fun factorization(n: Long) {
    val listOfPrimes = mutableListOf<Int>()
    val sieveArray = sieveOfEratosthenes(655500)
    for (i in sieveArray.indices) {
        if (sieveArray[i] == 1)
            listOfPrimes.add(i)
    }

    var nTemp = n
    println(n)
    for (i in 0 until listOfPrimes.size) {
        val prime = listOfPrimes[i]

        var exponent = 0
        while (nTemp % prime == 0L) {
            exponent++
            nTemp /= prime
        }
        if (exponent > 0)
            println("$prime ^ $exponent")

        if (nTemp == 1L) {
            break
        }
    }
}

fun calcCountOfDivisors(n: Long) {
    val listOfPrimes = mutableListOf<Int>()
    val sieveArray = sieveOfEratosthenes(655500)
    for (i in sieveArray.indices) {
        if (sieveArray[i] == 1)
            listOfPrimes.add(i)
    }

        var countOfDivisors = 1
        var triangleTemp = n
        for (i in 0 until listOfPrimes.size) {
            val prime = listOfPrimes[i]
            if (prime * prime > triangleTemp) {
                countOfDivisors *= 2
                break
            }
            var exponent = 1
            while (triangleTemp % prime == 0L) {
                exponent++
                triangleTemp /= prime
            }
            if (exponent>1)
                countOfDivisors *= exponent

            if (triangleTemp == 1L)
                break
        }
    println("Number of Divisors = $countOfDivisors")
}

fun calcCountOfDivisorsTriangleNumber() {
    val listOfPrimes = mutableListOf<Int>()
    val sieveArray = sieveOfEratosthenes(655500)
    for (i in sieveArray.indices) {
        if (sieveArray[i] == 1)
            listOfPrimes.add(i)
    }

    var triangle = 1
    var number = 1
    var countOfDivisors = 0
    var triangleTemp = 0

    while (countOfDivisors <= 500) {
        countOfDivisors = 1
        number += 1
        triangle += number
        triangleTemp = triangle
        for (i in 0 until listOfPrimes.size) {
            val prime = listOfPrimes[i]
            if (prime * prime > triangleTemp) {
                countOfDivisors *= 2
                break
            }
            var exponent = 1
            while (triangleTemp % prime == 0) {
                exponent++
                triangleTemp /= prime
            }
            if (exponent>1)
                countOfDivisors *= exponent

            if (triangleTemp == 1)
                break
        }
    }
    println(triangle)
}





