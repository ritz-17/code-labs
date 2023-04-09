package com.example.code_labs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        Handler().postDelayed ({
            val intent = Intent(this, sc2::class.java)
            startActivity(intent)
            finish()
        },4000)

        val t = AnimationUtils.loadAnimation(this, R.anim.t);
        val b = AnimationUtils.loadAnimation(this, R.anim.b);
        val textView = findViewById<TextView>(R.id.textView)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)

        textView.startAnimation(t)
        imageView2.startAnimation(b)

    }
}