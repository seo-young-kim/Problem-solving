package backjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.roundToInt
import kotlin.math.sqrt

fun main(){

    val N = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val list = prims(N)
    var answer = 0
    for (i in 0 until list.size){
        var sum = 0
        for(j in i until list.size){
            sum+= list[j]
            if(sum>=N){
                if(sum==N) answer++
                break
            }
        }
    }
    println(answer)
}

private fun prims(N:Int): MutableList<Int>{

    val check = Array<Boolean>(N+1){true}

    for(i in 2..sqrt(N.toDouble()).roundToInt()){
        if(!check[i]) continue
        for(j in i*i..N step i)
            check[j]=false
    }

    val result = mutableListOf<Int>()
    for (i in 2..N)
        if(check[i]) {
            result.add(i)
        }
    return result
}