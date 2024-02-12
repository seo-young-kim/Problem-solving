package backjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = Integer.parseInt(br.readLine())
    val M = Integer.parseInt(br.readLine())
    val S = br.readLine()

    var answer = 0
    for (str in Regex("(IO)+I").findAll(S))
        if ((str.value.length/2 -N+1) > 0)
            answer += str.value.length/2 -N+1

    println(answer)
}