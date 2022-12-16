package com.example.money

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class budget : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.budget)

        val bb = findViewById<TextView>(R.id.bb)
        val ss = findViewById<TextView>(R.id.ss)
        val ll = findViewById<TextView>(R.id.ll)
        val b1 = findViewById<EditText>(R.id.b1)
        val b2 = findViewById<EditText>(R.id.b2)
        val b3 = findViewById<EditText>(R.id.b3)
        val b4 = findViewById<EditText>(R.id.b4)
        val b5 = findViewById<EditText>(R.id.b5)
        val s1 = findViewById<TextView>(R.id.s1)
        val s2 = findViewById<TextView>(R.id.s2)
        val s3 = findViewById<TextView>(R.id.s3)
        val s4 = findViewById<TextView>(R.id.s4)
        val s5 = findViewById<TextView>(R.id.s5)
        val l1 = findViewById<TextView>(R.id.l1)
        val l2 = findViewById<TextView>(R.id.l2)
        val l3 = findViewById<TextView>(R.id.l3)
        val l4 = findViewById<TextView>(R.id.l4)
        val l5 = findViewById<TextView>(R.id.l5)
        val re = findViewById<Button>(R.id.re)


        s1.text.toString().toInt()
        s2.text.toString().toInt()
        s3.text.toString().toInt()
        s4.text.toString().toInt()
        s5.text.toString().toInt()
        l1.text.toString().toInt()
        l2.text.toString().toInt()
        l3.text.toString().toInt()
        l4.text.toString().toInt()
        l5.text.toString().toInt()
        bb.text.toString().toInt()
        ss.text.toString().toInt()
        ll.text.toString().toInt()




    }



}


