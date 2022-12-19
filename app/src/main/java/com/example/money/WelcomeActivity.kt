package com.example.money

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Message

class WelcomeActivity : Activity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)
        mHandler.sendEmptyMessageDelayed(GOTO_CALENDAR, 2000) //2秒跳轉
    }

    private val mHandler: Handler = @SuppressLint("HandlerLeak")
    object : Handler() {
        override fun handleMessage(msg: Message) {
            when (msg.what) {
                GOTO_CALENDAR -> {
                    val intent = Intent()
                    //將原本Activity的換成calendar
                    intent.setClass(this@WelcomeActivity, Calendar::class.java)
                    startActivity(intent)
                    finish()
                }
                else -> {}
            }
        }
    }

    companion object {
        private const val GOTO_CALENDAR = 0
    }
}