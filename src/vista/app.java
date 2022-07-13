/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import javax.swing.JFrame;
import modelo.Alumno;

/**
 *
 * @author EduardoCGarcia
 */
public class app {
    public static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    public static void main(String[] args) {
        RegistroAlumnos ventana = new RegistroAlumnos();
        ventana.setVisible(true);
    }
}
