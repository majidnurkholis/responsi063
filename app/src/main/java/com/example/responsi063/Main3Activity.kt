package com.example.responsi063

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val user = findViewById<EditText>(R.id.username)
        val pass = findViewById<EditText>(R.id.password)
        val hobi = findViewById<EditText>(R.id.hobi)
        val btn=findViewById<Button>(R.id.btn_reg)

        btn.setOnClickListener {
            val emaill=user.text.toString()
            val passs=pass.text.toString()
            val hobbi=hobi.text.toString()
            intent.putExtra("email",emaill)
            intent.putExtra("pass",passs)
            intent.putExtra("hobi",hobbi)

            intent = Intent(this@Main3Activity, Main2Activity::class.java)
            startActivity(intent)
        }
    }
}
