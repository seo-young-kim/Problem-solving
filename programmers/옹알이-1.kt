package programmers

class `옹알이-1` {

        fun solution(babbling: Array<String>): Int {
            var answer: Int = 0

            val baby = listOf("aya", "ye", "woo", "ma")

            for (word in babbling){
                var target = word
                baby.forEach {
                    target = target.replaceFirst(it," ")
                }
                if(target.isBlank()) answer++
            }
            return answer
        }

}