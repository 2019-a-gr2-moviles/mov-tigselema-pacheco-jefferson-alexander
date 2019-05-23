package com.example.parcelables

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Parcelable : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable)

        val alexander: Usuario? = this.intent.getParcelableExtra<Usuario>("usuario")
        Log.i("parcelable", "Nombre ${alexander?.nombre}")
        Log.i("parcelable", "Nombre ${alexander?.edad}")
        Log.i("parcelable", "Nombre ${alexander?.fechaNacimiento.toString()}")
        Log.i("parcelable", "Nombre ${alexander?.sueldo}")
    }

    fun regresarAMenu(){
        val intentExplicito = Intent(this, MainActivity::class.java)
        startActivity(intentExplicito)
    }
}
