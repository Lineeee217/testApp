package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText


const val EXTRA_MESSAGE = "com"
const val EXTRA_MESSAGE2 = "defult"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }

    fun sendNote(view:View)
    {
        val text = findViewById<EditText>(R.id.editText)
        val message2 = text.text.toString()
        val intent2 = Intent(this, DispalyNoteActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE2, message2)
        }
        startActivity(intent2)
    }
}
