
package controlador;

import javax.swing.JOptionPane;
import modelo.Alumno;

/**
 *
 * @author EduardoCGarcia
 */
public class RegistroController {
    public static void mensajeBienvenida(String nom){
        Alumno alu = new Alumno();
        alu.setNombre(nom);
        JOptionPane.showMessageDialog(null, "Bienvenido " + alu.getNombre());
    }
}
