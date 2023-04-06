package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etemail: EditText = findViewById(R.id.etto)
        val etsubject : EditText = findViewById(R.id.etsu)
        val etmessage : EditText = findViewById(R.id.etms)
        val btsend: Button = findViewById(R.id.btn)

        btsend.setOnClickListener(){
            val email = etemail.text.toString()
            val subject = etsubject.text.toString()
            val message = etmessage.text.toString()
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_EMAIL,arrayOf(email))
            intent.putExtra(Intent.EXTRA_SUBJECT,subject)
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type = "message/rfc822"
            startActivity(Intent.createChooser(intent,"choose a client...!"))

        }
    }
}