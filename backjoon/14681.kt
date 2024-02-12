package backjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val X = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    val Y = Integer.parseInt(BufferedReader(InputStreamReader(System.`in`)).readLine())
    when{
        X>0 && Y>0 -> println(1)
        X<0 && Y>0 -> println(2)
        X<0 && Y<0 -> println(3)
        X>0 && Y<0 -> println(4)
    }
}


