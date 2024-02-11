package com.salas.msu.trafficlightapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.View
import android.widget.Button


    private lateinit var btn: Button
    private lateinit var red: View
    private lateinit var yellow: View
    private lateinit var green: View

    private var isStop: Boolean = true
    private var isGo: Boolean = false
    private var isWait: Boolean = false

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.btn)
        red = findViewById(R.id.red)
        yellow = findViewById(R.id.yellow)
        green = findViewById(R.id.green)


        btn.setOnClickListener {
            if (isStop) {
                btn.setBackgroundColor(Color.RED)

                btn.text = "STOP"

                red.visibility = View.VISIBLE
                yellow.visibility = View.INVISIBLE
                green.visibility = View.INVISIBLE

                isStop = false
                isGo = true
                isWait = false

            } else if (isGo) {
                btn.setBackgroundColor(Color.GREEN)
                btn.text = "GO"

                red.visibility = View.INVISIBLE
                yellow.visibility = View.INVISIBLE
                green.visibility = View.VISIBLE

                isStop = false
                isGo = false
                isWait = true

            } else {
                btn.setBackgroundColor(Color.YELLOW)
                btn.text = "WAIT"

                red.visibility = View.INVISIBLE
                yellow.visibility = View.VISIBLE
                green.visibility = View.INVISIBLE

                isStop = true
                isGo = false
                isWait = false
            }
        }

    }
}