
package controlador;

import javax.swing.JOptionPane;
import modelo.Alumno;
import vista.app;

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
    public static void altaAlumno(Alumno alu){
        app.alumnos.add(alu);
        JOptionPane.showMessageDialog(null, "EL alumno se ha guardado correctamente!!");
    }
    public static void mostrarAlumnos(){
        String cadena = "Nombre | Edad | Numero de cuenta | Calle | \n";
        
        for (Alumno a : app.alumnos) {
            cadena += String.format("%s | %d | %s | %s | \n", a.getNombre(),a.getEdad(),a.getNumCuenta(),a.getDireccion().getCalle());
        }
        
        JOptionPane.showMessageDialog(null, cadena);
        
    }
    
}
