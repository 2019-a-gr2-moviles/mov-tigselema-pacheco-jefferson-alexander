package com.example.examen

class Pelicula {
    var idPelicula: Int
    var nombre: String
    var anioLanzamiento: Int
    var rating: Int
    var actoresPrincipales: String
    var sinopsis: String
    var actorId:Int

    constructor(
        idPelicula: Int,
        nombre: String,
        anioLanzamiento: Int,
        rating: Int,
        actoresPrincipales: String,
        sinopsis: String,
        actorId: Int
    ) {
        this.idPelicula = idPelicula
        this.nombre = nombre
        this.anioLanzamiento = anioLanzamiento
        this.rating = rating
        this.actoresPrincipales = actoresPrincipales
        this.sinopsis = sinopsis
        this.actorId = actorId
    }

    override fun toString(): String {
        return this.nombre+"-"+this.anioLanzamiento
    }
}