class Establecimiento{
    var idEstablecimiento: Int
    var nombreEstablecimiento: String
    var direccionEstablecimiento: String

    constructor(idEstablecimiento: Int, nombreEstablecimiento: String, direccionEstablecimiento: String){
        this.idEstablecimiento = idEstablecimiento
        this.nombreEstablecimiento = nombreEstablecimiento
        this.direccionEstablecimiento = direccionEstablecimiento
    }

    override fun toString(): String {
        return this.idEstablecimiento.toString()+","+this.nombreEstablecimiento+","+this.direccionEstablecimiento
    }
}