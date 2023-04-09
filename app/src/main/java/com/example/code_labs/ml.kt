package com.example.code_labs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button

class ml : AppCompatActivity() {
    internal var x1: Float = 0.toFloat()
    internal var x2: Float = 0.toFloat()
    internal var y1: Float = 0.toFloat()
    internal var y2: Float = 0.toFloat()
    private lateinit var btn1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ml)
        btn1 = findViewById(R.id.btn1)

        btn1.setOnClickListener {
            val intent = Intent(this@ml, MainActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onTouchEvent(tochevent: MotionEvent): Boolean {
        when (tochevent.action) {
            MotionEvent.ACTION_DOWN -> {
                x1 = tochevent.x
                y1 = tochevent.y
            }
            MotionEvent.ACTION_UP -> {
                x2 = tochevent.x
                y2 = tochevent.y
                if (x1 > x2) {
                    val i = Intent(this@ml, MainActivity::class.java)
                    startActivity(i)
                }
            }
        }
        return false
    }

}