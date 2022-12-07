package com.example.week5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class EX7_Keypad : AppCompatActivity() {
    lateinit var phoneNum : TextView
    lateinit var btn1 : Button; lateinit var btn2 : Button; lateinit var btn3 : Button
    lateinit var btn4 : Button; lateinit var btn5 : Button; lateinit var btn6 : Button
    lateinit var btn7 : Button; lateinit var btn8 : Button; lateinit var btn9 : Button
    lateinit var btn_ast : Button; lateinit var btn0 : Button; lateinit var btn_sh : Button
    lateinit var btn_delete : ImageButton
    var num : String = ""
    var count : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex7_keypad)
        phoneNum = findViewById(R.id.phoneNum)
        btn1 = findViewById(R.id.btn1); btn2 = findViewById(R.id.btn2); btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4); btn5 = findViewById(R.id.btn5); btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7); btn8 = findViewById(R.id.btn8); btn9 = findViewById(R.id.btn9)
        btn_ast = findViewById(R.id.btn_ast); btn0 = findViewById(R.id.btn0); btn_sh = findViewById(R.id.btn_sh)
        btn_delete = findViewById(R.id.delete)

        btn1.setOnClickListener(){
            if(count==3||count==7){
                num = num.plus("-1")
            }
            else{
                num = num.plus("1")
            }
            count++
            phoneNum.text = num
        }
        btn2.setOnClickListener(){
            if(count==3||count==7){
                num = num.plus("-2")
            }
            else{
                num = num.plus("2")
            }
            count++
            phoneNum.text = num
        }
        btn3.setOnClickListener(){
            if(count==3||count==7){
                num = num.plus("-3")
            }
            else{
                num = num.plus("3")
            }
            count++
            phoneNum.text = num
        }
        btn4.setOnClickListener(){
            if(count==3||count==7){
                num = num.plus("-4")
            }
            else{
                num = num.plus("4")
            }
            count++
            phoneNum.text = num
        }
        btn5.setOnClickListener(){
            if(count==3||count==7){
                num = num.plus("-5")
            }
            else{
                num = num.plus("5")
            }
            count++
            phoneNum.text = num
        }
        btn6.setOnClickListener(){
            if(count==3||count==7){
                num = num.plus("-6")
            }
            else{
                num = num.plus("6")
            }
            count++
            phoneNum.text = num
        }
        btn7.setOnClickListener(){
            if(count==3||count==7){
                num = num.plus("-7")
            }
            else{
                num = num.plus("7")
            }
            count++
            phoneNum.text = num
        }
        btn8.setOnClickListener(){
            if(count==3||count==7){
                num = num.plus("-8")
            }
            else{
                num = num.plus("8")
            }
            count++
            phoneNum.text = num
        }
        btn9.setOnClickListener(){
            if(count==3||count==7){
                num = num.plus("-9")
            }
            else{
                num = num.plus("9")
            }
            count++
            phoneNum.text = num
        }
        btn0.setOnClickListener(){
            if(count==3||count==7){
                num = num.plus("-0")
            }
            else{
                num = num.plus("0")
            }
            count++
            phoneNum.text = num
        }
        btn_ast.setOnClickListener(){
            if(count==3||count==7){
                num = num.plus("-*")
            }
            else{
                num = num.plus("*")
            }
            count++
            phoneNum.text = num
        }
        btn_sh.setOnClickListener(){
            if(count==3||count==7){
                num = num.plus("-#")
            }
            else{
                num = num.plus("#")
            }
            count++
            phoneNum.text = num
        }

        btn_delete.setOnClickListener(){
            if (num.isEmpty()) num = ""
            else{
                if(count==4||count==8){
                    num = num.substring(0, num.length-2)
                }
                else{
                    num = num.substring(0, num.length-1)
                }
                count--
            }
            phoneNum.text = num
        }
    }
}