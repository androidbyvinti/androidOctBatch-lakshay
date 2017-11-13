package com.bmpl.displayimage

import android.content.Context
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Vibrator
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //CountDownTimer class

        var countDownTimer : CountDownTimer = object : CountDownTimer(10000, 1000){

            override fun onFinish() {

                //vibration service
                //Vibrator

                var vib : Vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                vib.vibrate(500)

                firstImage.visibility = View.VISIBLE
                secondImage.visibility = View.VISIBLE
                thirdImage.visibility = View.VISIBLE
                textView.visibility = View.INVISIBLE
            }

            override fun onTick(milliseconds : Long) {
                textView.text = (milliseconds/1000).toString()
            }
        }
        countDownTimer.start() // now it will start count down
    }
}
