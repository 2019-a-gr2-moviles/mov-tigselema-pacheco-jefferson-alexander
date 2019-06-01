package com.example.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_app.*

class MenuApp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_app)
        btn_crear_papas.setOnClickListener {
            irCrearActor()
        }

        btn_gestionar_papas.setOnClickListener {
            irGestionarPapa()
        }
    }

    fun irCrearActor(){
        val intentExplicito = Intent(this, CrearActores::class.java)
        startActivity(intentExplicito)
    }

    fun irGestionarPapa(){
        val intentExplicito = Intent(this, GestionarActores::class.java)
        startActivity(intentExplicito)
    }
}
