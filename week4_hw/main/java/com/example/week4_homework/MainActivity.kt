package com.example.week4_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var edit1 : EditText; lateinit var edit2 : EditText
    lateinit var btnAdd : Button; lateinit var btnSub : Button
    lateinit var btnMul : Button; lateinit var btnDiv : Button
    lateinit var btnMod : Button; lateinit var btnChange : Button
    lateinit var textResult1 : TextView; lateinit var textResult2 : TextView
    var num1 : String? = null; var num2 : String? = null
    var result : Int? = null
    var count : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "${count}회 계산기"
        edit1 = findViewById<EditText>(R.id.Edit1)
        //textResult1 = findViewById(R.id.result1)
        edit2 = findViewById(R.id.Edit2)
        textResult2 = findViewById(R.id.result2)
        btnAdd = findViewById(R.id.BtnAdd)
        btnSub = findViewById(R.id.BtnSub)
        btnMul = findViewById(R.id.BtnMul)
        btnDiv = findViewById(R.id.BtnDiv)
        btnMod = findViewById(R.id.BtnMod)
        btnChange = findViewById(R.id.BtnChange)

        btnAdd.setOnClickListener(){
            if (edit1.text.isEmpty() || edit2.text.isEmpty()){
                textResult2.visibility = View.VISIBLE
                textResult2.text = "숫자를 입력하세요"
            }
            else{
                num1 = edit1.text?.toString()
                num2 = edit2.text?.toString()
                result = Integer.parseInt(num1) + Integer.parseInt(num2)
                edit1.setText(result.toString())
                edit2.text = null
                textResult2.visibility = View.GONE
                count++
                title = "${count}회 계산기"
            }
            false
        }
        btnSub.setOnClickListener(){
            if (edit1.text.isEmpty() || edit2.text.isEmpty()){
                textResult2.visibility = View.VISIBLE
                textResult2.text = "숫자를 입력하세요"
            }
            else{
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = Integer.parseInt(num1) - Integer.parseInt(num2)
                edit1.setText(result.toString())
                edit2.text = null
                textResult2.visibility = View.GONE
                count++
                title = "${count}회 계산기"
            }
            false
        }
        btnMul.setOnClickListener(){
            if (edit1.text.isEmpty() || edit2.text.isEmpty()){
                textResult2.visibility = View.VISIBLE
                textResult2.text = "숫자를 입력하세요"
            }
            else{
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = Integer.parseInt(num1) * Integer.parseInt(num2)
                edit1.setText(result.toString())
                edit2.text = null
                textResult2.visibility = View.GONE
                count++
                title = "${count}회 계산기"
            }
            false
        }
        btnDiv.setOnClickListener(){
            if (edit1.text.isEmpty() || edit2.text.isEmpty()){
                textResult2.visibility = View.VISIBLE
                textResult2.text = "숫자를 입력하세요"
            }
            else{
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                if (num2.equals("0")) {
                    textResult2.text = "오류"
                }
                else{
                    result = Integer.parseInt(num1) / Integer.parseInt(num2)
                    edit1.setText(result.toString())
                    edit2.text = null
                    textResult2.visibility = View.GONE
                    count++
                    title = "${count}회 계산기"
                }

            }
            false
        }
        btnMod.setOnClickListener(){
            if (edit1.text.isEmpty() || edit2.text.isEmpty()){
                textResult2.visibility = View.VISIBLE
                textResult2.text = "숫자를 입력하세요"
            }
            else{
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                result = Integer.parseInt(num1) % Integer.parseInt(num2)
                edit1.setText(result.toString())
                edit2.text = null
                textResult2.visibility = View.GONE
                count++
                title = "${count}회 계산기"
                false
            }

        }
        btnChange.setOnClickListener(){
            if (edit1.text.isEmpty() || edit2.text.isEmpty()){
                textResult2.visibility = View.VISIBLE
                textResult2.text = "숫자를 입력하세요"
            }
            else{
                num1 = edit1.text.toString()
                num2 = edit2.text.toString()
                edit1.setText(num2.toString())
                edit2.setText(num1.toString())
                textResult2.visibility = View.GONE
                count++
                title = "${count}회 계산기"
            }

            false
        }
    }
}
