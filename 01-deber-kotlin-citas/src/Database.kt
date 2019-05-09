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
                establecimientos.add(Establecimiento(establecimiento[0].toInt(), establecimiento[1],establecimiento[2]))
            }

        }

        fun cargarCitas(){
            File(pathCitas).forEachLine {
                val cita = it.split(",")
                citas.add(Cita(cita[0].toInt(),cita[1],cita[2],cita[3].toInt()))
            }
        }

    }
}