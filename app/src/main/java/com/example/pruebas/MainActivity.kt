package com.example.pruebas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var contador:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton:Button = findViewById(R.id.boton)
        val result:TextView = findViewById(R.id.result)

        boton.setOnClickListener{

            contador += 1
            result.text = (contador).toString()

        }

    }

    override fun onResume() {
        super.onResume()
        Log.d("Debug", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("Debug", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("Debug", "onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Debug", "onDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Debug", "onRestart")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Debug", "onStart")

    }

}