package com.bmpl.loginscreen

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var newIntent = intent // getIntent()
        textView.text = newIntent.getStringExtra("nm").plus(newIntent.getStringExtra("pas"))
    }
}
