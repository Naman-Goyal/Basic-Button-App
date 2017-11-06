package com.example.naman.basicbuttonapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val messageTag = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==messageTag && resultCode==RESULT_OK && data!=null) {
            val message = "Hullo, "+data.getStringExtra(NameAskerActivity().nameTag)

            val textView: TextView = findViewById(R.id.greeter_text)

            textView.textSize = 40f
            textView.text = message
        }
    }

    fun greet(view: View) {
        val intent = Intent(applicationContext,NameAskerActivity::class.java)
        startActivityForResult(intent, messageTag)
    }
}
