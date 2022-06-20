package com.example.positioningtoastkot21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt=findViewById<Button>(R.id.button)
        val bt1=findViewById<Button>(R.id.button2)
        val bt2=findViewById<Button>(R.id.button3)
        val bt3=findViewById<Button>(R.id.button4)
        val bt4=findViewById<Button>(R.id.button5)
        val bt5=findViewById<Button>(R.id.button6)
        bt.setOnClickListener {
            val toast=Toast.makeText(this@MainActivity,"Toast:Gravity.TOP",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP,0,0)
            toast.show()
        }
        bt1.setOnClickListener {
            val toast=Toast.makeText(this@MainActivity,"Toast:Gravity.CENTER",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER,0,0)
            toast.show()
        }
        bt2.setOnClickListener {
            val toast=Toast.makeText(this@MainActivity,"Toast:Gravity.BOTTOM",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM,0,0)
            toast.show()
        }
        bt3.setOnClickListener {
            val toast=Toast.makeText(this@MainActivity,"Toast:Gravity.LEFT",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.LEFT,0,0)
            toast.show()
        }
        bt4.setOnClickListener {
            val toast=Toast.makeText(this@MainActivity,"Toast:Gravity.RIGHT",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.RIGHT,0,0)
            toast.show()
        }
        bt5.setOnClickListener {
            val toast=Toast.makeText(this@MainActivity,"Toast:Gravity.TOPLEFT",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP or Gravity.LEFT,0,0)
            toast.show()
        }
    }
}