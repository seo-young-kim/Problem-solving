package backjoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){

    //input
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    val P = IntArray(N)
    val S = IntArray(N)

    var token = StringTokenizer(br.readLine())
    for(i in 0 until N)
        P[i] = token.nextToken().toInt()
    token = StringTokenizer(br.readLine())

    for(i in 0 until N)
        S[i] = token.nextToken().toInt()

    print(getAnswer(S,P))

}

private fun getAnswer(S: IntArray, P: IntArray): Int{

    var count = 0

    //섞을 카드 초기화
    var card = IntArray(S.size) { i -> i }
    val init = IntArray(S.size) { i -> i }

    while(count>=0){

        if(isEnd(card,P))
            break;
        //섞기
        card = mix(card,S)
        count++
        //섞었는데 처음으로 돌아옴..
        if(isEqual(card,init))
            count = -1
    }

    return count
}

private fun isEqual(A: IntArray, B: IntArray): Boolean{
    for(i in A.indices)
        if(A[i]!=B[i])
            return false
    return true
}

private fun isEnd(card: IntArray, P: IntArray): Boolean{

    for(i in card.indices){

        //card[i]에 있는 애는 i%3 player로 가게 됨
        //card[i]에 있는 애가 P[card[i]] player로 가기를 원함
        if(P[card[i]]!=(i%3))
            return false
    }

    return true
}

//card를 S규칙대로 1번 섞어줌
private fun mix(card: IntArray, S: IntArray): IntArray{

    val temp = IntArray(card.size)

    for(i in card.indices)
        temp[S[i]] = card[i]
    return temp
}
