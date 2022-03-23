package com.example.calculatorapp.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculatorapp.Greeting
import android.widget.TextView
import android.widget.Toast

fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onDigit(view: View) {
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show()
    }
}
