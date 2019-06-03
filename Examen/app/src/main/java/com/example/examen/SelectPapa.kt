package com.example.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_select_papa.*

class SelectPapa : AppCompatActivity() {

    lateinit var actorTemporal: Actor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_papa)

        val position: Int = this.intent.getIntExtra("posicion", -1)
        if (position > -1) {
            actorTemporal = Database.actores.get(position)
            txt_nombre_actor2.setText(actorTemporal.nombres)
            txt_apellido_actor2.setText(actorTemporal.apellidos)
            txt_fn_actor2.setText(actorTemporal.fechaNacimiento)
            txt_num_peliculas_actor2.setText(actorTemporal.numeroPeliculas.toString())
            if (actorTemporal.retirado)
                sw_retirado_actor2.isChecked = true
        }else{
            irGestionarPapa()
        }


        btn_eliminar_actor.setOnClickListener {
            eliminarActor(position)
            irGestionarPapa()
        }

        btn_actualizar_actor.setOnClickListener {
            actualizarActor(position, txt_nombre_actor2.text.toString(),
                txt_apellido_actor2.text.toString(),
                txt_fn_actor2.text.toString(),
                txt_num_peliculas_actor2.text.toString().toInt(),
                sw_retirado_actor2.isChecked)
            irGestionarPapa()
        }

        btn_crear_pelicula.setOnClickListener {
            irCrearPeliculas(actorTemporal.idActor, position)
        }

        btn_gestionar_pelicula.setOnClickListener {
            irGestionarHijo(actorTemporal.idActor)
        }
    }

    fun eliminarActor(position: Int) {
        Database.actores.removeAt(position)
    }

    fun irGestionarPapa() {
        val intentExplicito = Intent(this, GestionarActores::class.java)
        startActivity(intentExplicito)
    }

    fun actualizarActor(position:Int, nombres: String, apellidos: String, fechaNacimiento: String, numeroPeliculas: Int ,retirado: Boolean){
        Database.actores[position].nombres = nombres
        Database.actores[position].apellidos = apellidos
        Database.actores[position].fechaNacimiento = fechaNacimiento
        Database.actores[position].numeroPeliculas = numeroPeliculas
        Database.actores[position].retirado = retirado
    }

    fun irCrearPeliculas(idActor:Int, posicion:Int){
        val intentExplicito = Intent(this, CrearPeliculas::class.java)
        intentExplicito.putExtra("idActor", idActor)
        intentExplicito.putExtra("posicion", posicion)
        intentExplicito.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intentExplicito)
    }

    fun irGestionarHijo(idActor: Int){
        val intentExplicito = Intent(this, GestionarPeliculas::class.java)
        intentExplicito.putExtra("idActor", idActor)
        intentExplicito.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intentExplicito)
    }
}
