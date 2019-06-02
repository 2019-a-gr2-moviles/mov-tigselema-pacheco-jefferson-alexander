package com.example.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_gestionar_actores.*

class GestionarActores : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gestionar_actores)
        val adapter = ArrayAdapter<Actor>(this, android.R.layout.simple_list_item_1, Database.actores)
        lv_actores.adapter = adapter
        
        lv_actores.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            irASeleccionPapa(position);
        }
    }

    fun irASeleccionPapa(position:Int){
        val intentExplicito = Intent(this, SelectPapa::class.java)
        intentExplicito.putExtra("posicion",position)
        startActivity(intentExplicito)
    }
}
