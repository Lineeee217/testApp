package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class DispalyNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dispaly_note)
        val message = intent.getStringExtra(EXTRA_MESSAGE2)

        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView2).apply {
            text = "Hello World!"}

    }
}