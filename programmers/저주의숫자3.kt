package programmers

class 저주의숫자3 {

    fun solution(n: Int): Int {

        var answer: Int = 0

        for(i in 1..n){

            if(n==1) answer = 1
            else{
                var cnt = 1
                while(isCurse(cnt+answer)){ cnt++ }
                answer = cnt+answer
            }
        }

        return answer
    }

    private fun isCurse(num: Int):Boolean{
        if(num%3==0) return true
        return num.toString().contains("3")
    }
}