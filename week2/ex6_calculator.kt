package com.example.week2

public class Calculator(){
    var num1: Double = 0.0
    var num2: Double = 0.0
    var command: String = ""

    var calList: MutableList<Double> = mutableListOf()
    private fun add(a: Double, b: Double){calList.add(a+b)}
    private fun subtract(a: Double, b: Double){calList.add(a-b)}
    private fun multiple(a: Double, b: Double){calList.add(a*b)}
    private fun division(a: Double, b: Double){
        if (b!=0.0) calList.add(a/b)
        else println("ERROR : number can not be divided with zero.")
    }

    fun print_calculated_number(){
        println(calList[calList.size-1])
    }
    fun load() {
        for (i: Int in 0 until calList.size step 1) {
            println("${calList[i]}")
        }
    }
    fun cal(a: Double, b: Double, type: String) {
        when(type){
            "add"-> add(a, b)
            "subtract"-> subtract(a, b)
            "multiple"-> multiple(a, b)
            "division"-> division(a, b)
        }
    }
}


fun main(){
    var calculator = Calculator()
    calculator.cal(1.0, 2.0, "add")
    calculator.print_calculated_number()
    calculator.cal(1.0, 10.0, "subtract")
    calculator.print_calculated_number()
    calculator.cal(1.0, 0.0, "division")
    calculator.print_calculated_number()
    calculator.cal(1.0, 10.0, "division")
    calculator.print_calculated_number()
    calculator.cal(1.0, 10.0, "multiple")
    calculator.print_calculated_number()
    println("----------------")
    calculator.load()
}