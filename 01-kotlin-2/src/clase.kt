class Usuario(var cedula: String){
    public var nombre: String = " "
    public var apellido: String = " "

    constructor() : this("1") {
        this.apellido = apellido
    }

}

class UsuarioKt( public var nombre: String,
                 public var apellido: String){

    public var numero = 2
    constructor(nombre:String, apellido: String,numero: Int): this(nombre, apellido){
        println("primer")
    }

    init {
        println("init")
    }

}

fun a(){
    val alexander = UsuarioKt("Alexander", "Tigselema" )
    alexander.nombre = "Jefferson"
}



class Gravity(){
    companion object {
        val gravedad = 10.5
        fun correr(){
            println("Estoy corriendo en $gravedad")
        }
    }
}

fun aa(){
    Gravity.gravedad
    Gravity.correr()
}

class BaseDeDatos{
    companion object {
        val usuarios = arrayListOf(1,2,3)
    }
}

fun main(){
    val user = UsuarioKt("a", "b")

}

abstract class Numeros (var numeroUno: Int,
                    var numeroDos:Int){}

class Suma (numeroUnos: Int, numeroDoss: Int): Numeros(numeroUnos, numeroDoss){}

fun presley(requerido: Int, opcional: Int = 1, nulo: Int?){


}

fun cddd(){
    presley(1, opcional = 1, nulo = null)
}