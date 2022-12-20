package com.example.money

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_ei = findViewById<Button>(R.id.btn_EI)
        val btn_budget = findViewById<Button>(R.id.btn_budget)
        val btn = findViewById<Button>(R.id.button)
        val btn_AA = findViewById<Button>(R.id.btn_AA)
        val btn_today = findViewById<Button>(R.id.btn_Today)
        val btn_money = findViewById<Button>(R.id.btn_money)

    }
}