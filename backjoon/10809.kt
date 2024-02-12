package backjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val S = BufferedReader(InputStreamReader(System.`in`)).readLine().toCharArray()
    val result = Array<Int>(26){-1}

    for (i in S.indices.reversed())
        result[S[i] - 'a'] = i;

    for (i in result)
        print("$i ")
}