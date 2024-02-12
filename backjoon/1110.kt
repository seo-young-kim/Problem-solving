package backjoon

fun main(){
    with(System.`in`.bufferedReader()) {
        val N = readLine().toInt()
        var next = N
        var count = 0
        val new : (Int) -> Int = {N: Int ->(N%10)*10+(N%10+N/10)%10 }
        do {
            next = new(next)
            count++
        }while (N!=next)
        print(count)
    }
}
