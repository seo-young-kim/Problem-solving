package backjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.abs

fun main(){

    //init data array
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    var token = StringTokenizer(br.readLine())
    var diff = Array<Int>(N,{0})
    for(i in 0 until N)
         diff[i] = token.nextToken().toInt()
     token = StringTokenizer(br.readLine())
     for(i in 0 until N)
         diff[i] -= token.nextToken().toInt()

    var answer = 0
    var index = 0

    for(i in 1 until N){
        while(index<N && diff[index]==0)
            index++
        if(index>=N) break
        if(index>i) continue

        if(diff[index]*diff[i]<=0){
            answer+= dp(diff,index,i-1,0)
            index = i
        }
    }
    answer+= dp(diff,index,N-1,0)

    println(answer)

}

private fun dp(arr:Array<Int>,start: Int,end:Int,PARENT:Int):Int{
    if(start>end) return 0
    if(start==end) return abs(PARENT-arr[start])

    var minIndex = start
    for (i in start..end)
        if(abs(arr[minIndex])> abs(arr[i]))
            minIndex = i
    return dp(arr,start,minIndex-1,arr[minIndex]) +abs(PARENT-arr[minIndex])+ dp(arr,minIndex+1,end,arr[minIndex])
}