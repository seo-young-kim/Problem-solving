package programmers

fun main() {

}

fun solution(players: Array<String>, callings: Array<String>): Array<String> {

    val answer = players.toMutableList()

    callings.forEach {winner ->
        val currentPosition = answer.indexOf(winner)
        //switch
        val looser = answer[currentPosition-1]
        answer[currentPosition] = looser
        answer[currentPosition-1] = winner
    }

    return Array(players.size){ answer[it] }
}

