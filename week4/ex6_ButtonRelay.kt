package com.example.week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ex6_ButtonRelay : AppCompatActivity() {
    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var btn4 : Button
    lateinit var btn5 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex6_button_relay)
        title = "직접해보기 6번 문제"

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)

        btn1.setOnTouchListener { view, motionEvent ->
            btn1.visibility = View.INVISIBLE
            btn2.visibility = View.VISIBLE
            false
        }
        btn2.setOnTouchListener { view, motionEvent ->
            btn2.visibility = View.INVISIBLE
            btn3.visibility = View.VISIBLE
            false
        }
        btn3.setOnTouchListener { view, motionEvent ->
            btn3.visibility = View.INVISIBLE
            btn4.visibility = View.VISIBLE
            false
        }
        btn4.setOnTouchListener { view, motionEvent ->
            btn4.visibility = View.INVISIBLE
            btn5.visibility = View.VISIBLE
            false
        }
        btn5.setOnTouchListener { view, motionEvent ->
            btn5.visibility = View.INVISIBLE
            btn1.visibility = View.VISIBLE
            false
        }
    }
}