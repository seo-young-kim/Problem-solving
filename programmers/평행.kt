package programmers

import kotlin.math.min

class 평행 {

    fun solution(dots: Array<IntArray>): Int {

        for(i in 1..3){

            val others = (1..3).toList().filter {
                it!=i
            }.toList()

            val delta1 = getDelta(dots[0], dots[i])
            val delta2 = getDelta(dots[others[0]],dots[others[1]])

            if(delta1.first == delta2.first && delta1.second==delta2.second) return 1
        }
        return 0
    }

    fun getDelta(a: IntArray, b: IntArray): Pair<Int, Int> =

        if(a[0]<b[0]){
            var mom = b[0]-a[0]
            var son = b[1]-a[1]

            if(mom%son==0){
                mom/=son
                son/=son
            }
             mom to son

        }else{
            var mom = a[0]-b[0]
            var son = a[1]-b[1]

            if(mom%son==0){
                mom/=son
                son/=son
            }
             mom to son
        }

}