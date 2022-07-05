package Utilerias;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author EduardoCGarcia
 */
public class Archivos {

    public static ArrayList leerArchivo(String nomArch) {
        ArrayList array = new ArrayList();
        try { //lee archivo     
            FileInputStream fi = new FileInputStream(nomArch);
            ObjectInputStream oi = new ObjectInputStream(fi);
            array = (ArrayList) oi.readObject();
            oi.close();
        } catch (Exception e) {
            System.out.println("Error;" + e.toString());
        }
        return array;
    }

    public static void guardarArchivo(String nomArch, ArrayList array) {
        try {
            FileOutputStream fo = new FileOutputStream(nomArch);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(array);
            oo.close();
            System.out.println("Vector guardado");
        } catch (IOException e) {
            System.out.println("Error;" + e.toString());
        }
    }

}
