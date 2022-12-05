package com.example.week3

import java.util.*
import kotlin.system.exitProcess

val sc = Scanner(System.`in`)
enum class Menu(var menu:String, var cost:Int){
    RAMEN("참깨라면", 1000),
    HAMBURGER("햄버거", 1500),
    COKE("콜라", 800),
    HOTBAR("핫바", 1200),
    CHOCO("초코우유", 1500)
}

fun getChange(type: Menu){
    var change = getCoin() - getPrice(type)
    if (change >= 0) {
        println("감사합니다. 잔돈반환 : $change")
    }
    else {
        println("현금이 부족합니다.");
        exitProcess(1)
    }
}

fun getCoin():Int {
    var money = ""
    while (true){
        println("Insert coin")
        money = sc.next()
        if (money != null&& money in "1".."7") {
            println("${money}원을 넣었습니다.")
            return money.toInt()
        }
        else if(money==null|| money !in "1".."7")println("돈을 넣지 않았습니다.\n다시 돈을 넣어주세요.")
    }
}

fun getMenu(){
    println("Choose menu:")
    var menu = sc.next()
    if (menu != null&& menu in "1".."5") {
        when (menu) {
            "1" -> {
                println("참깨라면이 선택되었습니다."); getChange(Menu.RAMEN)
            }
            "2" -> {
                println("햄버거가 선택되었습니다."); getChange(Menu.HAMBURGER)
            }
            "3" -> {
                println("콜라가 선택되었습니다."); getChange(Menu.COKE)
            }
            "4" -> {
                println("핫바가 선택되었습니다."); getChange(Menu.HOTBAR)
            }
            "5" -> {
                println("초코우유가 선택되었습니다."); getChange(Menu.CHOCO)
            }
        }
    }
    else if(menu==null|| menu !in "1".."5")println("아무것도 선택하지 않았습니다.\n다시 선택해주세요.")

}
fun getPrice(type: Menu): Int {
    return type.cost
}

fun main(){
    while (true){
        println("==========MENU==========")
        println("| (1) 참깨라면 - 1,000원 |")
        println("| (2) 햄버거   - 1,500원 |")
        println("| (3) 콜라     -   800원 |")
        println("| (4) 핫바     - 1,200원 |")
        println("| (5) 초코우유  - 1,500원 |")
        getMenu()
    }
}