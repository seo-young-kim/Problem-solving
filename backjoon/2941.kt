package backjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){

    val str = BufferedReader(InputStreamReader(System.`in`)).readLine()
    val list = listOf<String>(
        "c=","c-","dz=","d-","lj","nj","s=","z="
    )

    var answer = 0
    var index =0
    while (index<str.length){
        if(index+1<str.length && str.substring(index,index+2) in list){
            index+=1
        }else if (index+2<str.length && str.substring(index,index+3) in list)
            index+=2
        answer++
        index++
    }

    print(answer)

}