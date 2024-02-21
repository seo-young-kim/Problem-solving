package programmers

class 숫자짝꿍 {

    fun solution(X: String, Y: String): String {

        val XNums = IntArray(10){0}
        val YNums = IntArray(10){0}

        for (c in X){
            val num = c.toString().toInt()
            XNums[num]++
        }

        // println(XNums.toList().toString())

        for (c in Y){
            val num = c.toString().toInt()
            YNums[num]++
        }

        // println(YNums.toList().toString())


        val Common = IntArray(10){0}

        for (i in 0 until 10)
            Common[i] = minOf(XNums[i], YNums[i])

//        println(Common.toList().toString())

        var answer: String = ""

        for (i in 9 downTo 0)
            while(Common[i]>0) {
                answer += i
                Common[i]--
            }

        if(answer.isNullOrBlank()) answer = "-1"


        return answer.toLong().toString()

    }

}