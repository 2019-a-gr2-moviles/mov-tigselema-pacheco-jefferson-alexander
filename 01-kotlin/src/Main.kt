fun main(args: Array<String>){

    /*
    * Comentarios
    *
    *
    * */

    // Variables

    // QUE ES MUTAR?? Cambiar??
    // Mutables
    var nombre = "Alexander"
    nombre = "Jefferson"

    // Inmutables
    val nombreI = "Alexander"
    // nombreI = "Jefferson"

    // Tipos de Datos

    val apellido: String = "Tigselema"
    val edad: Int = 23
    val sueldo: Double = 1.21
    val casado: Boolean = false
    val profesor: Boolean = true
    val hijos = null

    // Duck Typing
    // Si parece un pato
    // Si camina como pato
    // si suena como pato
    // si vuela como pato
    // Pato

    // if and else
    if(apellido== "Tigselema" && nombre== "Alexander"){
        println("Verdadero")
    }else{
        println("Falso")
    }

    val tieneNombreYApellido = if(apellido!= null && nombre!= null) "ok" else "no"
    println(tieneNombreYApellido)

    estaJalado(1.0)
    estaJalado(8.0)
    estaJalado(0.0)
    estaJalado(7.0)
    estaJalado(10.0)


}

fun estaJalado(nota: Double){
    when(nota){
        7.0 -> {
            println("Pasaste con las justas")
        }
        10.0-> {
            println("Genial :D Felicitaciones!")
        }
        0.0 -> {
            println("Dios mio que vago!")
        }
        else ->{
            println("Tu nota es: $nota")
        }
    }
}