/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoObjetos;

import modelo.Direccion;
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
        Direccion a = new Direccion("calle A", "12345", 123);
        
        System.out.println(a.toString());
    }
    
}
