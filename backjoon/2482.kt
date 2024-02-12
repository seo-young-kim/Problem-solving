package backjoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val N =readLine().toInt()
    val K =readLine().toInt()

    val inf:Int = 1000000003

    val dp = Array(N,{IntArray(K+1,{0})})
    for(i in 0 until N)
        dp[i][0]=1
    for(i in 1 until N)
        dp[i][1] = i

    for(n in 3 until N)
        for(k in 2..K) {
            if (n <= k) continue
            dp[n][k]+=dp[n-1][k];
            dp[n][k]%=inf;
            dp[n][k]+=dp[n-2][k-1];
            dp[n][k]%=inf;
        }

    print((dp[N-1][K] + dp[N-3][K-1])%inf)
}