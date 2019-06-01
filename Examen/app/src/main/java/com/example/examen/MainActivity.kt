package com.example.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_login.setOnClickListener {
            Database.nombreUsuario = nombre_usuario.text.toString()
            irMenu()
        }
    }

    fun irMenu(){
    val intentExplicito = Intent(this, MenuApp::class.java)
        startActivity(intentExplicito)
    }
}
