import java.io.File

class Database {
    companion object {
        var establecimientos = arrayListOf<Establecimiento>()
        var citas = arrayListOf<Cita>()
        val pathEstablecimientos ="src/Establecimientos.txt"
        val pathCitas ="src/Citas.txt"

        fun cargarEstablecimiento(){
            File(pathEstablecimientos).forEachLine {
                val establecimiento = it.split(",")
                this.establecimientos.add(Establecimiento(establecimiento[0].toInt(), establecimiento[1],establecimiento[2]))
            }
        }

        fun cargarCitas(){
            File(pathCitas).forEachLine {
                val cita = it.split(",")
                this.citas.add(Cita(cita[0].toInt(),cita[1],cita[2],cita[3].toInt()))
                }
        }

        fun insertarEstablecimiento(establecimiento: Establecimiento){
            val registro:String = "\n"+establecimiento.idEstablecimiento.toString()+","+establecimiento.nombreEstablecimiento+","+establecimiento.direccionEstablecimiento
            File(pathEstablecimientos).appendText(registro)
        }

        fun insertarCitas(cita: Cita){
            val registro: String = "\n"+cita.idCita+cita.fecha+cita.nombreUsuario+cita.idEstablecimiento
            File(pathCitas).appendText(registro)
        }

    }
}