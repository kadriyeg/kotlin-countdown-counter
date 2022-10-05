package com.example.kotlincountdowncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object : CountDownTimer(30000, 1000){
            override fun onTick(p0: Long) {
            textView2.text = "Seconds left ${p0/1000}"
            }

            override fun onFinish() {
                textView2.text= "Finished"
            }
        }.start()
    }
}