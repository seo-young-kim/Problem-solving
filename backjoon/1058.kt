package backjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main(){

    //initialization
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    val map = Array(N,{IntArray(N,{0})})

    for(i in 0 until N){
        val row = br.readLine()
        for(j in 0 until N){
            when(row[j]){
                'N' -> map[i][j]=0
                'Y' -> map[i][j]=1
            }
        }
    }

    var answer = 0

    for(i in 0 until N) {
        answer = max(answer, getTwoFriendOf(i, map))
    }
    println(answer)

}

private fun getTwoFriendOf(node:Int, map:Array<IntArray>): Int{

    val queue = ArrayDeque<Int>()
    queue.addLast(node)
    var cnt = 0

    val visit = BooleanArray(map.size) { false }
    visit[node]= true
    //그냥 두번 도는거를 괜히 이렇게 해보고 시펐음
    (0..1).toList().forEach {
        var SIZE = queue.size
        while(--SIZE>=0){

            val current = queue.removeFirst()

            //current랑 친구인 애들 큐에 넣고 cnt++
            for(i in map.indices){
                if(map[current][i]>0 && !visit[i]){
                    cnt++
                    queue.addLast(i)
                    visit[i]=true
                }
            }
        }
    }


    return cnt
}