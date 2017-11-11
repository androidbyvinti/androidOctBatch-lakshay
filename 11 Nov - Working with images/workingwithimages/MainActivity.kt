package com.bmpl.workingwithimages

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageOneButton.setOnClickListener {
            Glide.with(this)
                    .load(R.drawable.brain_game)
                    .into(imageView)
            //imageView.setImageResource(R.drawable.image1)
        }

        imageTwoButton.setOnClickListener{
            imageView.setImageResource(R.drawable.image2)
        }

    }
}
