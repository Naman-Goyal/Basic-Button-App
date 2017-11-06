package com.example.naman.basicbuttonapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.KeyEvent
import android.view.MenuItem
import android.widget.EditText

class NameAskerActivity: AppCompatActivity() {

    val nameTag = "NAME_ASKER_ACTIVITY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_asker)

        val ab = supportActionBar
        ab?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                val intent = Intent()

                val textfield: EditText = findViewById(R.id.name_enterer)
                intent.putExtra(nameTag,textfield.text.toString())

                setResult(RESULT_OK, intent)
                finish()
                return true

            }
        }
        return super.onOptionsItemSelected(item)
    }
}