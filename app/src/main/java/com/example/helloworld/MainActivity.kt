package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.clickButtton)
        btn.setOnClickListener {
            Log.v("Buton Click","Button Clicked" )
            Toast.makeText(this,"You Clickn' me? Say hello to my little friend",Toast.LENGTH_LONG).show()
        }
    }
}