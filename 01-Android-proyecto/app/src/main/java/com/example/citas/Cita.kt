package com.example.citas

class Cita {
    public var idCita: Int
    public var fecha: String
    public var nombreUsuario: String

    constructor(idCita: Int, fecha: String, nombreUsuario: String){
        this.idCita = idCita
        this.fecha = fecha
        this.nombreUsuario = nombreUsuario
    }
}