package com.example.mipt1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val colorButton = findViewById<Button>(R.id.colorButton)
        val backgroundButton = findViewById<Button>(R.id.backgroundButton)

        button.setOnClickListener {
            textView.text = "Button Clicked!"
        }

        colorButton.setOnClickListener {
            textView.setTextColor(Color.RED)
        }

        backgroundButton.setOnClickListener {
            textView.setBackgroundColor(Color.YELLOW)
        }
    }
}