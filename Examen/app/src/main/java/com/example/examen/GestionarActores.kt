package com.example.examen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_gestionar_actores.*

class GestionarActores : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gestionar_actores)
        val adapter = ArrayAdapter<Actor>(this, android.R.layout.simple_list_item_1, Database.actores)
        lv_actores.adapter = adapter
    }
}
