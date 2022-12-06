package com.example.week4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ex7_gallery : AppCompatActivity() {
    lateinit var img : ImageView
    lateinit var btnLeft : Button
    lateinit var btnRight : Button
    var countLeft : Int = 0
    var countRight : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex7_gallery)
        title = "동물 갤러리"

        img = findViewById(R.id.image)
        img.setImageResource(R.drawable.a)
        btnLeft = findViewById(R.id.left)
        btnRight = findViewById(R.id.right)

        btnLeft.setOnTouchListener { view, motionEvent ->
            countLeft++
            if (countLeft%4==1)
                img.setImageResource(R.drawable.b)
            if (countLeft%4==2)
                img.setImageResource(R.drawable.c)
            if (countLeft%4==3)
                img.setImageResource(R.drawable.d)
            if (countLeft%4==0)
                img.setImageResource(R.drawable.a)
            false
        }
        btnRight.setOnTouchListener { view, motionEvent ->
            countRight++
            if (countRight%4==1)
                img.setImageResource(R.drawable.a)
            if (countRight%4==2)
                img.setImageResource(R.drawable.d)
            if (countRight%4==3)
                img.setImageResource(R.drawable.c)
            if (countRight%4==0)
                img.setImageResource(R.drawable.b)
            false
        }
    }
}