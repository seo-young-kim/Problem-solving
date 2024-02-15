package programmers

class 카드뭉치 {

    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {

        var idxCard1 = 0
        var idxCard2 = 0

        goal.forEach {
            if(idxCard1<cards1.size && it == cards1[idxCard1])
                idxCard1++
            else if(idxCard2<cards2.size && it == cards2[idxCard2])
                idxCard2++
            else return "No"
        }

        return "Yes"
    }

}