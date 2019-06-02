package com.example.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_gestionar_peliculas.*

class GestionarPeliculas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gestionar_peliculas)
        val idActor = this.intent.getIntExtra("idActor",-1)
        if(idActor<0)
            irGestionarPapa()
        val adapter = ArrayAdapter<Pelicula>(this, android.R.layout.simple_list_item_1, Database.peliculas.filter { it.actorId == idActor })
        lv_peliculas.adapter = adapter
        
        lv_peliculas.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            irASeleccionHijo(position, idActor)
        }
    }

    fun irASeleccionHijo(position:Int, idActor:Int){
        val intentExplicito = Intent(this, SeleccionHijo::class.java)
        intentExplicito.putExtra("posicion",position)
        intentExplicito.putExtra("idActor",idActor)
        startActivity(intentExplicito)
    }

    fun irGestionarPapa() {
        val intentExplicito = Intent(this, GestionarActores::class.java)
        startActivity(intentExplicito)
    }

}
