package com.chilik1020.problem009

fun main() {

    for(n in 0..500) {
        for(m in n+1..500) {
            val a = m*m - n*n
            val b = 2*m*n
            val c = m*m + n*n
            val sum = a + b + c

            if (sum == 1000 && (a*a + b*b == c*c)) {
                println("$a $b $c")
                println(a*b*c)
            }
        }
    }
}