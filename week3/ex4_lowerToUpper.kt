package com.example.week3

import java.lang.StringBuilder

fun change(str:String):String{
    var a = StringBuilder()
    for (i in str){
        if (i.code in 97..122) continue
        else a.append(i)
    }

    return if (a.isBlank()) str.uppercase()
    else """error with = $a"""
}
fun main(){
    var a = "abcd"
    println(change(a))

    var b = "EfgH"
    println(change(b))

    var c = "!@%$"
    println(change(c))

}