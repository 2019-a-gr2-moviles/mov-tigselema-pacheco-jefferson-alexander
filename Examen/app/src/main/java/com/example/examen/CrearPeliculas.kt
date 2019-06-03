package com.example.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_crear_peliculas.*

class CrearPeliculas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_peliculas)
        val idActor = this.intent.getIntExtra("idActor", -1)
        val position = this.intent.getIntExtra("posicion",-1)
        if(idActor<0)
            irGestionarPapa()

        btn_guardar_pelicula.setOnClickListener {
            val id = if (Database.peliculas.isEmpty())  0 else Database.peliculas.last().idPelicula+1
            Database.peliculas.add(
                Pelicula(
                id,
                txt_pelicula_nombre.text.toString(),
                   txt_pelicula_anio_l.text.toString().toInt(),
                    txt_pelicula_rating.text.toString().toInt(),
                    txt_pelicula_actores.text.toString(),
                    txt_pelicula_sinopsis.text.toString(),
                    idActor
            )
            )
            irASeleccionPapa(position)
        }
    }

    fun irGestionarPapa() {
        val intentExplicito = Intent(this, GestionarActores::class.java)
        intentExplicito.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intentExplicito)
    }

    fun irASeleccionPapa(position:Int){
        val intentExplicito = Intent(this, SelectPapa::class.java)
        intentExplicito.putExtra("posicion",position)
        intentExplicito.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intentExplicito)
    }

}
