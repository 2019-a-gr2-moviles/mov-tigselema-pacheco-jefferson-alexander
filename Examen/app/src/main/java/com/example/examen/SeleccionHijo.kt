package com.example.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_seleccion_hijo.*

class SeleccionHijo : AppCompatActivity() {

    lateinit var peliculaTemporal: Pelicula
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_hijo)

        val posicion = this.intent.getIntExtra("posicion",-1)
        val idActor = this.intent.getIntExtra("idActor",-1)
        if(posicion>-1 || idActor<-1){
            peliculaTemporal = Database.peliculas.filter { it.actorId==idActor }.get(posicion)
            txt_pelicula_nombre2.setText(peliculaTemporal.nombre)
            txt_pelicula_anio_l2.setText(peliculaTemporal.anioLanzamiento.toString())
            txt_pelicula_rating2.setText(peliculaTemporal.rating.toString())
            txt_pelicula_actores2.setText(peliculaTemporal.actoresPrincipales)
            txt_pelicula_sinopsis2.setText(peliculaTemporal.sinopsis)
        }else{
            irGestionarHijo(peliculaTemporal.actorId)
        }

        btn_eliminar_pelicula.setOnClickListener {
            eliminarPelicula(posicion,peliculaTemporal)
            irGestionarHijo(peliculaTemporal.actorId)
        }

        btn_actualizar_pelicula.setOnClickListener {
            actualizarPelicula(
                idActor,
                posicion,
                txt_pelicula_nombre2.text.toString(),
                txt_pelicula_anio_l2.text.toString().toInt(),
                txt_pelicula_rating2.text.toString().toInt(),
                txt_pelicula_actores2.text.toString(),
                txt_pelicula_sinopsis2.text.toString()
            )
            irGestionarHijo(peliculaTemporal.actorId)
        }
    }

    fun irGestionarHijo(idActor: Int){
        val intentExplicito = Intent(this, GestionarPeliculas::class.java)
        intentExplicito.putExtra("idActor", idActor)
        startActivity(intentExplicito)
    }

    fun eliminarPelicula(position:Int, pelicula:Pelicula){
        Database.peliculas.remove(pelicula)
    }

    fun actualizarPelicula(idActor: Int,position: Int, nombre:String, anio:Int, rating:Int, actores:String, sinopsis:String){
        Database.peliculas.filter { it.actorId==idActor }[position].nombre = nombre
        Database.peliculas.filter { it.actorId==idActor }[position].anioLanzamiento = anio
        Database.peliculas.filter { it.actorId==idActor }[position].rating = rating
        Database.peliculas.filter { it.actorId==idActor }[position].actoresPrincipales = actores
        Database.peliculas.filter { it.actorId==idActor }[position].sinopsis =  sinopsis
    }
}
