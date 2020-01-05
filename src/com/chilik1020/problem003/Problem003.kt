package com.chilik1020.problem003

fun main(args: Array<String>) {
    val number = 600851475143
    val upperLimit = kotlin.math.sqrt(number.toDouble()).toInt()

    val arr = sieveOfEratosthenes(upperLimit)

    for(i in arr.size-1 downTo 0) {
        if (arr[i] == 1 && number%i==0L) {
            println(i)
            break
        }
    }
}

fun sieveOfEratosthenes(maxPrime: Int): Array<Int> {
    val arr = Array<Int>(maxPrime){1}
    arr[0] = 0
    arr[1] = 0

    for (k in 2..maxPrime/2) {
        if (arr[k] == 1) {
            for (j in (k+k) until maxPrime step k)
                arr[j] = 0
        }
    }

    return arr
}