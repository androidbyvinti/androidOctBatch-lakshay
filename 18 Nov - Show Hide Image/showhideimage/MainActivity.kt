package com.bmpl.showhideimage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var clicked = true

        button.setOnClickListener{

            //clicked = !clicked   //!false --> true

            if(clicked){
                imageView.visibility = View.VISIBLE
                button.text = "Hide Image"
                clicked = false

            } else {
                imageView.visibility = View.INVISIBLE
                button.text = "Show Image"
                clicked = true

            }
        }
    }
}