package programmers

class 추억점수 {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer = IntArray(photo.size)

        val nameList = name.toList()

        for ((id,pt) in photo.withIndex()){
            pt.forEach { people ->
                val index = nameList.indexOf(people)
                val score = if(index>-1) yearning[index] else 0
                answer[id]+=score
            }
        }


        return answer
    }

}