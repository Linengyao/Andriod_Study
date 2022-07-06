package com.example.andriod_study

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SharedPreferencesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preferences)

        val button:Button = findViewById(R.id.WriteBtn)
        button.setOnClickListener {
            val editor = getSharedPreferences("data", Context.MODE_PRIVATE).edit()
            editor.putString("name", "Jack")
            editor.putInt("age", 28)
            editor.putBoolean("male", false)
            editor.apply()

            Toast.makeText(this,"SharedPreference方式数据已经写入",Toast.LENGTH_SHORT).show()
        }

        val readButton:Button = findViewById(R.id.readButton)
        val editText : EditText = findViewById(R.id.editText)
        readButton.setOnClickListener {
            val prefs = getSharedPreferences("data", Context.MODE_PRIVATE)
            val name = prefs.getString("name", "")
            val age = prefs.getInt("age", 0)
            val male = prefs.getBoolean("male", true)
            val textLine = "name: $name, age: ${age.toString()}, ${male.toString()}"
            editText.setText(textLine)
        }



    }


}