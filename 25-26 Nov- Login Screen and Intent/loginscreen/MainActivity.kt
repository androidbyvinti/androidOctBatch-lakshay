package com.bmpl.loginscreen

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton.setOnClickListener {
            var name = nameEditText.text.toString()
            var password = passwordEditText.text.toString()

            // when ever an object is created an constructor will be called
            //explicit intent --> source and destination
            var intent = Intent(this, WelcomeActivity :: class.java)// constructor call   // object is created of class Intent
            intent.putExtra("nm", name)
            intent.putExtra("pas", password)
            startActivity(intent)
            finish()
            //Activity class  --> Activity root of all Activity classes
            // Intent intent = new Intent();
        }

    }
}
