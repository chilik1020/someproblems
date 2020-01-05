package com.chilik1020.problem007

import com.chilik1020.problem003.sieveOfEratosthenes

fun main() {
    val arr = sieveOfEratosthenes(200000) // fun from Problem003

    var count = 0
    for (i in arr.indices) {
        if (arr[i] == 1)
            count++

        if (count == 10001) {
            println(i)
            break
        }
    }
}
