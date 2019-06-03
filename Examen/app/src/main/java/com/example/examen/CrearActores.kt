package com.example.examen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.util.Log
import kotlinx.android.synthetic.main.activity_crear_actores.*
import java.sql.Date
import java.time.LocalDate

class CrearActores : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_actores)
        btn_guardar.setOnClickListener {
            val id = if (Database.actores.isEmpty())  0 else Database.actores.last().idActor+1
            Database.actores.add(Actor(id,txt_nombre_actor.text.toString(),
                                        txt_apellido_actor.text.toString(),
                txt_fn_actor.text.toString(),
                txt_num_peliculas_actor.text.toString().toInt(),
                sw_retirado_actor.isChecked))
            Snackbar.make(it, "El elemento ha sido creado por ${Database.nombreUsuario}", Snackbar.LENGTH_LONG).setAction("Action",null).show()
            irMenu()

        }
    }

    fun irMenu(){
        val intentExplicito = Intent(this, MenuApp::class.java)
        intentExplicito.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intentExplicito)
    }

}
