package com.example.week2

import java.util.*

//enum class Credit(val credit: Int){A(0), B(1), C(2), D(3), E(4), F(5)}
//enum class Credit{A, B, C, D, E, F}
enum class Credit{
    A{
        override fun up() = A
        override fun down() = B
     },
    B{
        override fun up() = A
        override fun down() = C
     },
    C{
        override fun up() = B
        override fun down() = D
     },
    D{
        override fun up() = C
        override fun down() = E
    },
    E{
        override fun up() = D
        override fun down() = F
    },
    F{
        override fun up() = E
        override fun down() = F
    },;
    abstract fun up() : Credit
    abstract fun down() : Credit
}
class MyAccount(){
    var name: String = "Kim"
    var balance: Int = 0
    var credit: Credit = Credit.C

    fun deposit(){
        println("입금하실 금액을 말하세요.")
        var depositMoney = Scanner(System.`in`).nextInt()
        balance += depositMoney
        if(balance>=0){
            if (credit==Credit.F) println("동결계좌가 열렸습니다.")
            println("신용등급이 '$credit->${upGrade(credit)}'로 한단계 상승합니다.")
            credit = upGrade(credit)
        }
        println("$depositMoney 원을 입금하였습니다. 잔액 : $balance")
    }
    fun withdraw(){
        println("출금하실 금액을 말하세요.")
        var withdrawMoney = Scanner(System.`in`).nextInt()
        balance -= withdrawMoney
        if(balance<0&&balance>=-1000){
            println("계좌가 마이너스 되었습니다.")
            println("신용등급이 '$credit->${downGrade(credit)}'로 한단계 하락합니다.")
            credit = downGrade(credit)
            println("$withdrawMoney 원을 출금하였습니다. 잔액 : $balance")
            if(credit==Credit.F){
                println("최저 등급의 신용을 가지고 있습니다.\n계좌가 동결됩니다.")
            }
        }
        //else if (balance<-1000)
    }
    fun downGrade(a: Credit): Credit {
        return a.down()
    }
    fun upGrade(a: Credit): Credit {
        return a.up()
    }
}

fun main(){
    var atm = MyAccount()
    while (true){
        println("""----선택하세요----
|(I) 계좌정보 |
|(D) 입금 |      
|(W) 출금 |
|(E) 종료 |
------------""")
        val command = Scanner(System.`in`).next()
        when(command){
            "I"-> println(("""계좌정보는 다음과 같습니다.
|이름: ${atm.name}|
|계좌잔액: ${atm.balance}|      
|신용등급: ${atm.credit}|
------------"""))
            "D"-> atm.deposit()
            "W"-> if (atm.credit!=Credit.F){atm.withdraw()};
            else println("동결된 계좌에서 출금하실 수 없습니다.")
        }
    }
}