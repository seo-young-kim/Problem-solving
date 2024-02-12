package backjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){

    val N = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())

    for (i in 1..9)
        println("$N * $i = ${N*i}")

}