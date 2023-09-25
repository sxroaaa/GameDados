package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)

        val btnLanzar: Button= findViewById(R.id.btnLanzar)
        btnLanzar.setOnClickListener{
            tiempo()
        }
        rollDice()
    }

    private fun rollDice(){
        val numero: Int = lanzar(6)
        val txtResultado: TextView = findViewById(R.id.txtResultado)
        txtResultado.text = numero.toString()



      val drawableResource=  when(numero){
            1 -> R.drawable.dado1
            2 -> R.drawable.dado2
            3 -> R.drawable.dado3
            4 -> R.drawable.dado4
            5 -> R.drawable.dado5
            else -> R.drawable.dado6
        }
        val imgDado: ImageView = findViewById(R.id.imgdado)
        imgDado.setImageResource(drawableResource)
    }
    private fun lanzar(max: Int ):Int{
       return (1..max).random()
    }
    private fun tiempo(){
        object : CountDownTimer (3000, 150){
            override fun onTick(p0: Long) {
                rollDice()
            }

            override fun onFinish() {
                TODO("Not yet implemented")
            }

        }.start()
    }
}