package com.example.week4

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class ex5_background : AppCompatActivity() {
    lateinit var btnColor : Button
    lateinit var linLayer : LinearLayout
    var count : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex5_background)
        title = "직접해보기 1번 문제"

        btnColor = findViewById(R.id.btn1)
        linLayer = findViewById<LinearLayout>(R.id.LinLay)

        btnColor.setOnTouchListener{view, motionEvent ->
            count++
            if (count%3==1)
                linLayer.setBackgroundColor(Color.parseColor("#FF0000"))
            if (count%3==2)
                linLayer.setBackgroundColor(Color.parseColor("#0000FF"))
            if (count%3==0)
                linLayer.setBackgroundColor(Color.parseColor("#00FF00"))
            false
        }
    }
}