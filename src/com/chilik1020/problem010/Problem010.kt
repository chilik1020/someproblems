package com.chilik1020.problem010

import com.chilik1020.problem003.sieveOfEratosthenes

fun main() {
    val arr = sieveOfEratosthenes(2000000) // fun from Problem003
    var sum = 0L
    for (i in arr.indices) {
        if (arr[i] == 1)
            sum += i
    }

    println(sum)
}