import java.awt.Dimension
import javax.swing.JButton
import javax.swing.JFrame

fun main(){
    val btnEstablecimiento = JButton("Establecimiento")
    val btnCitas = JButton("Citas")
    btnEstablecimiento.setBounds(250,385,50,20)

    val frame = JFrame("Main Menu")
    frame.add(btnEstablecimiento)
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    frame.setSize(Dimension(600, 400))
    frame.setLocationRelativeTo(null)
    frame.setVisible(true)
}