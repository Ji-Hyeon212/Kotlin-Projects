package com.example.week2

import java.util.*

fun main(){
    var num = 0
    var pairList: MutableList<Int> = mutableListOf()

    val sc : Scanner = Scanner(System.`in`)
    num = sc.nextLine().toInt()

    for (i: Int in 0 until num step 1){
        var temp = sc.nextLine().toInt()
        pairList.add(temp)
    }
    for (i : Int in 0 until num step 1){
        print("Pairs for ${pairList[i]} : ")
        for (j in 1 until pairList[i]/2+1){
            if(j!=pairList[i]-j)
                if(j==1) print("(${j} ${pairList[i]-j})")
                else print(",(${j} ${pairList[i]-j})")
        }
        println()
    }

}