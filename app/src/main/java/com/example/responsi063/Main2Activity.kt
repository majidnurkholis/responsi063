package com.example.responsi063

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main2.*
import org.w3c.dom.Text

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val email=findViewById<EditText>(R.id.username)
        val pas=findViewById<EditText>(R.id.password)
        val hobi=findViewById<EditText>(R.id.hobi)

        val emailll=email.text.toString()
        val passs=pas.text.toString()
        val hobbi=hobi.text.toString()

       intent.getStringExtra("email")
        intent.getStringExtra("pass")
      intent.getStringExtra("hobi")
        val Result=findViewById<TextView>(R.id.result)

        Result.text="email : "+emailll+"password ; "+passs+"hobbi : "+hobbi

    }
}
