package com.example.money

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ExpenseIncome  : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.expense_income)
        val btn_back = findViewById<Button>(R.id.btn_back)
        val ed_money = findViewById<EditText>(R.id.ed_money)
        val ed_date = findViewById<EditText>(R.id.ed_date)
        val ed_note = findViewById<EditText>(R.id.ed_note)
        val ed_accoutbook = findViewById<EditText>(R.id.ed_accountbook)
        val EIbtn_budget = findViewById<Button>(R.id.EIbtn_budget)
        val EIbtn_ = findViewById<Button>(R.id.EIbtn_)
        val EIbtn_AA = findViewById<Button>(R.id.EIbtn_AA)
        val EIbtn_money = findViewById<Button>(R.id.EIbtn_money)
        val btn_expense = findViewById<Button>(R.id.btn_expense)
        val btn_income = findViewById<Button>(R.id.btn_income)
        val btn_store = findViewById<Button>(R.id.btn_store)
        btn_store.setOnClickListener {
            //將主餐名稱放入Bundle
            lateinit var food: CheckBox
            lateinit var clothe: CheckBox
            lateinit var live: CheckBox
            lateinit var traffic: CheckBox
            lateinit var other: CheckBox
            food = findViewById(R.id.checkBox_food)
            clothe = findViewById(R.id.checkBox_clothe)
            live = findViewById(R.id.checkBox_live)
            traffic = findViewById(R.id.checkBox_traffic)
            other = findViewById(R.id.checkBox_other)

            var Food = if (food.isChecked) "食" else ""
            var Clothe = if (clothe.isChecked) "衣" else ""
            var Live = if (live.isChecked) "住" else ""
            var Traffic = if (traffic.isChecked) "行" else ""
            var Other = if (other.isChecked) "其他" else ""
            val classic = "$Food $Clothe $Live $Traffic $Other"

            val intent = Intent().apply {
                putExtra("result", "$classic")
                //透過setResult將資料回傳

            }
            //透過setResult將資料回傳
            setResult(Activity.RESULT_OK, intent)

            //結束MainActivity2
            finish()

        }
        btn_store.setOnClickListener {
            //判斷是否輸入金額，日期，帳簿名稱
            if (ed_money.length()<1||ed_date.length()<1||ed_accoutbook.length()<1){
                ed_money.hint = "請輸入金額！"
                ed_date.hint = "日期"
                ed_accoutbook.hint = "帳簿名稱"
            }

            else {
                //跳轉至主餐頁，並傳送桌號
                val intent = Intent(this, ExpenseIncome::class.java)
                startActivityForResult(intent, 0)
            }
        }
        btn_back.setOnClickListener {
                //跳轉至主餐頁，並傳送桌號
                val intent = Intent(this, Calendar::class.java)
                startActivityForResult(intent, 0)
        }
    }
}
