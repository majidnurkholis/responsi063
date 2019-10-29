package com.example.responsi063

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = findViewById<EditText>(R.id.username)
        val pass = findViewById<EditText>(R.id.password)
        val btn=findViewById<Button>(R.id.register)
        val btnsave=findViewById<Button>(R.id.btn_log)


        btn.setOnClickListener {
            intent= Intent(this,Main3Activity::class.java)
            startActivity(intent)
        }
        btnsave.setOnClickListener {
            val emaill=user.text.toString()
            val passs=pass.text.toString()
            
            if(emaill=="memekz2gmail.com" && passs=="memek") {
                intent.putExtra("email",emaill)
                intent.putExtra("pass",passs)


                intent = Intent(this@MainActivity, Main2Activity::class.java)
                startActivity(intent)
            }
        }



    }
}
