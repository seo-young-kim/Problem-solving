package backjoon

import kotlin.math.max
import kotlin.math.min

fun main(){
    fun gcd(a: Int,b: Int): Int = if(b==0) a else gcd(b, a%b)
    val (N,M) = readLine()!!.split(' ').map { it.toInt() }

    val GCD = gcd(max(N,M), min(N,M))
    val LCM = (N*M)/GCD

    println(GCD)
    println(LCM)
}