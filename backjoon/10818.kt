package backjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.max
import kotlin.math.min

fun main(){

    var MIN = 1000001
    var MAX = -MIN

    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = Integer.parseInt(br.readLine())
    val token = StringTokenizer(br.readLine())

    var arr = arrayListOf<Int>()
    for(i in 1 until N)
        arr.add(token.nextToken().toInt())

    for(i in 1..arr.size){
        MIN = min(arr.get(i-1),MIN)
        MAX = max(arr.get(i-1),MAX)
    }

    print("$MIN $MAX")

}
