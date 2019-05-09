class Cita {
    var idCita: Int;
    var fecha: String
    var nombreUsuario: String
    var idEstablecimiento: Int

    constructor(idCita:Int, fecha: String, nombreUsuario: String, idEstablecimiento: Int){
        this.idCita = idCita
        this.fecha = fecha
        this.nombreUsuario = nombreUsuario
        this.idEstablecimiento = idEstablecimiento
    }
}