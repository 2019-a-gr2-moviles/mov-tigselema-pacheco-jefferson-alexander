package com.example.examen

import java.time.LocalDate
import java.util.*

class Actor{
    var idActor: Int
    var nombres:String
    var apellidos:String
    var fechaNacimiento: String
    var numeroPeliculas:Int
    var retirado:Boolean

    constructor(
        idActor: Int,
        nombres: String,
        apellidos: String,
        fechaNacimiento: String,
        numeroPeliculas: Int,
        retirado: Boolean
    ) {
        this.idActor = idActor
        this.nombres = nombres
        this.apellidos = apellidos
        this.fechaNacimiento = fechaNacimiento
        this.numeroPeliculas = numeroPeliculas
        this.retirado = retirado
    }

    override fun toString(): String {
        return this.nombres+" "+this.apellidos
    }
}