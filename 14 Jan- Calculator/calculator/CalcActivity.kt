package com.android.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_calc.*

class CalcActivity : AppCompatActivity(), View.OnLongClickListener {

    var first  = 0
    var second = 0
    var operationRequested : String = ""

    override fun onLongClick(p0: View?): Boolean {
        resultTextView.text = ""
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        btnCancel.setOnClickListener {
            if(!inputTextView.text.isEmpty()){
                inputTextView.text = inputTextView.text.dropLast(1)
            }
        }
        btnCancel.setOnLongClickListener(this)
    }

    fun buttonClicked(view : View){
        var button  = findViewById<Button>(view.id)

        inputTextView.text = if(!inputTextView.text.isEmpty())
            inputTextView.text.toString().plus(button.text) // 2 or 3 time clicked on button
        else
            button.text // first time button clicked
    }

    fun operations(view : View){

        var button  = findViewById<Button>(view.id)
        operationRequested = button.text.toString()

        if(first==0){
            first = inputTextView.text.toString().toInt()
        }
        inputTextView.text = inputTextView.text.toString().plus(button.text)
    }

    fun showResult(view: View){
        // 33+56
        // 20*53
        second = inputTextView.text.substring(inputTextView.text.lastIndexOf(operationRequested) + 1).toInt()
        Log.i("CalcActivity","" + second)

        resultTextView.text = when(operationRequested){
            "+"-> (first + second).toString()
            "-"-> (first - second).toString()
            "X"-> (first * second).toString()
            "/"-> (first / second).toString()
            else-> ""
        }
        first = resultTextView.text.toString().toInt()
        second = 0
    }

}