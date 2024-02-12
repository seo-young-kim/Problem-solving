package backjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    val score = Integer.parseInt(token.nextToken())
    when(score/10) {
        10,9 -> println("A")
        8 -> println("B")
        7 -> println("C")
        6 -> println("D")
        else -> println("F")
     }

}