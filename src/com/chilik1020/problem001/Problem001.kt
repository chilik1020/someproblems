package com.chilik1020.problem001

fun main() {
    println("Sum of all multiples 3 or 5 below 1000");
    val m:IntArray = intArrayOf(3,5)
    findMultiples(1000, 0, m)
}

fun findMultiples(limit:Int, start:Int, multiples:IntArray){
    var value = start
    var sum = 0
    while(value < limit){
        for(i in multiples){
            if(value%i==0){
                sum+=value
                break
            }
        }
        value++
    }
    println(sum)
}