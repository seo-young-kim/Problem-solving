package backjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){

    val br = BufferedReader(InputStreamReader(System.`in`))
    var token = StringTokenizer(br.readLine())
    val T = token.nextToken().toInt()
    val W = token.nextToken().toInt()
    val Zadu = IntArray(T+1)
    for(i in 1..T)
        Zadu[i]=br.readLine().toInt()


}