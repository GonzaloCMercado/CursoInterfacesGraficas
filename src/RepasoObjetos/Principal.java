/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoObjetos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gonzalo CH
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Alumno a = new Alumno("Torthillero",19,"12345","thor123@alumno.com",new Direccion("CalleA","1010",567));
//        JOptionPane.showMessageDialog(null,a.toString());
          
          ArrayList<Alumno> alumnos = new ArrayList();
          
          CD.registrarAlumno(alumnos);
          CD.registrarAlumno(alumnos);
          
          for (Alumno a : alumnos) {
              //System.out.println(a);
              JOptionPane.showMessageDialog(null,a.toString());
        }
    }
    
}
