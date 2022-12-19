package com.example.money

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Calendar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendar)
        val btn_ei = findViewById<Button>(R.id.btn_EI)
        val btn_budget = findViewById<Button>(R.id.btn_budget)
        val btn = findViewById<Button>(R.id.button)
        val btn_AA = findViewById<Button>(R.id.btn_AA)
        val btn_today = findViewById<Button>(R.id.btn_Today)
        val btn_money = findViewById<Button>(R.id.btn_money)

    }
}