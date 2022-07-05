/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoObjetos;

import Utilerias.LecturaPanel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo CH
 */
public class CD {
    
   static void registrarAlumno(ArrayList<Alumno> alumnos){
       Alumno a = new Alumno(
               LecturaPanel.leerString("Nombre:"),
               LecturaPanel.leerEntero(15,80,"Edad:"),
               LecturaPanel.leerString("Numero de cuenta:"),
               LecturaPanel.leerString("Correo electronico"),
               new Direccion(
                       LecturaPanel.leerString("Calle:"),
                       LecturaPanel.leerString("C.P"),
                       LecturaPanel.leerEntero(0,9999,"Numero exterior:")));
       alumnos.add(a);
   }
}
