package com.example.week2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val N = readLine().toInt()

    var T = IntArray(N+10)
    var P = IntArray(N+10)
    var dp = IntArray(N+10)

    var max = 0

    for(i in 1..N){
        val st = StringTokenizer(readLine())
        T[i] = st.nextToken().toInt()
        P[i] = st.nextToken().toInt()
    }

    for (i in N downTo 1){
        var next = i + T[i]
        if(next > N + 1){
            dp[i] = dp[i+1]
        }
        else{
            dp[i] = Math.max(dp[i+1], dp[next] + P[i])
        }
    }
    max = dp[1]
    println(max)

    close()
}
