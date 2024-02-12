package backjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){


    val br = BufferedReader(InputStreamReader(System.`in`))
    var token = StringTokenizer(br.readLine())
    val H = token.nextToken().toInt()
    val W = token.nextToken().toInt()
    token = StringTokenizer(br.readLine())
    val block = IntArray(W)
    for(i in 0 until W)
        block[i] = token.nextToken().toInt()

    var max = -1
    val leftMax = IntArray(W)
    for(i in 0 until W){
        leftMax[i]=max
        if(max<block[i])
            max = block[i]
    }

    max = -1
    val rightMax = IntArray(W)
    for(i in W-1 downTo 0){
        rightMax[i]=max
        if(max<block[i])
            max = block[i]
    }

    var answer = 0

    for(i in 0 until W){
        (Math.min(leftMax[i],rightMax[i])-block[i]).takeIf {
            it>0
        }?.let {
            answer+=it
        }
    }

    println(answer)


}