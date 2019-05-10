import java.awt.Dimension
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JOptionPane

fun main(){
     var opcionMenu = JOptionPane.showOptionDialog(null,"Elija una opción", "MenuPrincipal",JOptionPane.DEFAULT_OPTION,1, null, arrayOf("Establecimientos","Citas"),0)
    println(opcionMenu)

    when(opcionMenu){
        0 ->{
            Database.cargarEstablecimiento()
            var opcionMenuEstablcimientos = JOptionPane.showOptionDialog(null,"Elija una opción", "Menu Establecimientos",JOptionPane.DEFAULT_OPTION,1, null, arrayOf("Ver todos","Ingresar nuevo"),0)
            when(opcionMenuEstablcimientos){
                0->{
                    var mensajeEstablecimiento="";
                    Database.establecimientos.forEach {
                        mensajeEstablecimiento+= it.toString()+"\n"
                    }
                    JOptionPane.showMessageDialog(null, mensajeEstablecimiento);
                }
                1->{
                    var nuevoEstablecimiento: String = JOptionPane.showInputDialog("Ingrese el Establecimiento con el siguiente formato Codigo del Establecimiento,Nombre del Establecimiento,Direccion del Establecimiento")
                    var establecimientoAIngresar = nuevoEstablecimiento.split(",");
                    Database.insertarEstablecimiento(Establecimiento(establecimientoAIngresar[0].toInt(),establecimientoAIngresar[1],establecimientoAIngresar[2]))
                    JOptionPane.showMessageDialog(null, "Su nuevo establecimiento ha sido ingresada con exito");
                }
            }
        }
        1->{
            Database.cargarCitas()
            var opcionMenuCitas = JOptionPane.showOptionDialog(null,"Elija una opción", "Menu Citas",JOptionPane.DEFAULT_OPTION,1, null, arrayOf("Ver todos","Ingresar nuevo"),0)
            when(opcionMenuCitas){
                0->{
                    var mensajeCitas:String="";
                    Database.citas.forEach{
                        mensajeCitas += it.toString()+"\n"
                    }
                    JOptionPane.showMessageDialog(null, mensajeCitas);
                }
                1->{
                    var nuevaCita: String = JOptionPane.showInputDialog("Ingrese la cita con el siguiente formato CodigoCita,Año-Mes-Dia,NombreUsuario,CodigoEstablecimiento")
                    var citaAIngresar = nuevaCita.split(",");
                    Database.insertarCitas(Cita(citaAIngresar[0].toInt(),citaAIngresar[1],citaAIngresar[2],citaAIngresar[3].toInt()))
                    JOptionPane.showMessageDialog(null, "Su nueva cita ha sido ingresada con exito");

                }
            }
    }
    }
}