package com.example.week3

import java.util.*
import kotlin.collections.ArrayList

private lateinit var map: Array<IntArray>
private val dx = intArrayOf(-1, 0, 1, 0)
private val dy = intArrayOf(0, -1, 0, 1)
private var N = 0
private var M = 0
private val virusList = ArrayList<Virus>()
private var answer = 0


fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    N = sc.nextInt()
    M = sc.nextInt()
    map = Array(N) { IntArray(M) }

    for (i in 0 until N) {
        for (j in 0 until M) {
            map[i][j] = sc.nextInt()
            if (map[i][j] == 2) {
                virusList.add(Virus(i, j))
            }
        }
    }
    makeWall(0)
    println(answer)
}

private fun makeWall(count: Int) {
    if (count == 3) {
        val tmpMap = Array(N) { IntArray(M) }
        for (i in 0 until N) {
            for (j in 0 until M) {
                tmpMap[i][j] = map[i][j]
            }
        }
        for (virus in virusList) {
            spreadVirus(virus, tmpMap)
        }
        countSafeArea(tmpMap)
        return
    }
    for (i in 0 until N) {
        for (j in 0 until M) {
            if (map[i][j] == 0) {
                map[i][j] = 1
                makeWall(count + 1)
                map[i][j] = 0
            }
        }
    }
}

private fun spreadVirus(virus: Virus, map: Array<IntArray>) {
    val queue: Queue<Virus> = LinkedList()
    queue.offer(virus)
    while (!queue.isEmpty()) {
        queue.poll().run {
            for (i in 0..3) {
                val x2 = x + dx[i]
                val y2 = y + dy[i]
                if(x2 >=0 && y2 >=0 && x2 < N && y2 < M) {
                    if (map[x2][y2] == 0) {
                        map[x2][y2] = 2
                        queue.offer(Virus(x2, y2))
                    }
                }
            }
        }
    }
}

private fun countSafeArea(map: Array<IntArray>) {
    var count = 0
    for (i in 0 until N) {
        for (j in 0 until M) {
            if (map[i][j] == 0) {
                count++
            }
        }
    }
    answer = answer.coerceAtLeast(count)
}

data class Virus(var x: Int, var y: Int)