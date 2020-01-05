package com.chilik1020.problem002

fun main() {
    println("sum = ${fib(1, 2, 0)}" )
}

fun fib(n1:Int, n2:Int, sum:Int):Int{
    if(n1 >= 4000000)
        return sum

    if(n1.rem(2)==0)
        return fib(n2, n1+n2, sum+n1)

    return fib(n2, n1+n2, sum)
}