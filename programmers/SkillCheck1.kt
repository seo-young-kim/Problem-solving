package programmers

fun main(){

}

class Solution {
    fun solution(s: String): String {
        val len = s.length
        var answer = ""
        when (len.mod(2)){
            1 -> answer+= s[len/2-1]
            0 -> answer+= s[len/2-1]
        }
        return answer
    }
}