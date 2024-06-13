package com.kevinsurya.randomnumbersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etInput1 = findViewById<EditText>(R.id.etInput1)
        val etInput2 = findViewById<EditText>(R.id.etInput2)
        val tvResult1 = findViewById<TextView>(R.id.tvResult1)
        val tvResult2 = findViewById<TextView>(R.id.tvResult2)
        val tvEndResult = findViewById<TextView>(R.id.tvEndResult)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)

        btnGenerate.setOnClickListener {
            val angka1 = etInput1.text.toString().toIntOrNull() ?: 0
            val angka2 = etInput2.text.toString().toIntOrNull() ?: 0
            val RandomAngka1 = Random.nextInt(angka1, angka2 + 1)
            val RandomAngka2 = Random.nextInt(angka1, angka2 +1)
            tvResult1.text = "Random Number 1 = " + RandomAngka1.toString()
            tvResult2.text = "Random Number 2 = " + RandomAngka2.toString()

            if (RandomAngka1 == RandomAngka2) {
                tvEndResult.text = "Result " + "Tie"
            } else {
                tvEndResult.text ="Result " + "No Tie"
            }

        }
    }
}