package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonLogin=findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener{
          val intent: Intent = Intent(this, Game::class.java)
            startActivity(intent)
        }

    }

}