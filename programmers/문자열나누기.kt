package programmers

class 문자열나누기 {
    fun solution(s: String): Int {
        var answer: Int = 0

        var charCompare:Char? = null
        var eqCnt = 0
        var ntCnt = 0


        for (char in s){

            if(charCompare == null) charCompare = char

            if(char == charCompare) eqCnt++ else ntCnt++

            if(eqCnt == ntCnt){
                answer++
                eqCnt = 0
                ntCnt = 0
                charCompare = null
            }
        }

        if(eqCnt!=ntCnt) answer++

        return answer
    }
}
