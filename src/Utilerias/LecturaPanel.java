package Utilerias;

import javax.swing.JOptionPane;
/**
 *
 * @author GonzaloCMercado & EduardoCGarcia
 */
public class LecturaPanel {

    public static int leerEntero(String mensaje) {
        int a = 0;
        boolean error = false;

        do {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                error = true;

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,"Error de formato");
            }

        } while (!error);
        return a;
    }

    public static int leerEntero(int min, int max, String mensaje) {
        int a = 0;
        boolean error = false;

        do {
            try {
                a = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                if (a >= min && a <= max) {
                    error = true;
                } else {
                    JOptionPane.showMessageDialog(null,"Error de formato");
                }

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,"Error de formato");
            }

        } while (!error);
        return a;
    }

    public static float leerFloat(String mensaje) {
        float a = 0;
        boolean error = false;

        do {
            try {
                a = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
                error = true;

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,"Error de formato");
            }

        } while (!error);
        return a;
    }

    public static float leerFloat(float min, float max, String mensaje) {
        float a = 0;
        boolean error = false;

        do {
            try {
                a = Float.parseFloat(JOptionPane.showInputDialog(mensaje));
                if (a >= min && a <= max) {
                    error = true;
                } else {
                    JOptionPane.showMessageDialog(null,"Error de formato");
                }

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,"Error de formato");
            }

        } while (!error);
        return a;
    }

    public static double leerDouble(String mensaje) {
        double a = 0;
        boolean error = false;

        do {
            try {
                a = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
                error = true;

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,"Error de formato");
            }

        } while (!error);
        return a;
    }

    public static double leerDouble(double min, double max, String mensaje) {
        double a = 0;
        boolean error = false;
        do {
            try {
                a = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
                if (a >= min && a <= max) {
                    error = true;
                } else {
                    JOptionPane.showMessageDialog(null,"Fuera de rango");
                }

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,"Error de formato");
            }

        } while (!error);
        return a;
    }
    
    public static byte leerByte(String mensaje) {
        byte a = 0;
        boolean error = false;

        do {
            try {
                a = Byte.parseByte(JOptionPane.showInputDialog(mensaje));
                error = true;

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,"Error de formato");
            }

        } while (!error);
        return a;
    }
    
     public static byte leerByte(byte min, byte max, String mensaje) {
        byte num = 0;
        boolean error = false;

        do {
            try {
                num = Byte.parseByte(JOptionPane.showInputDialog(mensaje));
                if (num >= min && num <= max) {
                    error = true;
                } else {
                    JOptionPane.showMessageDialog(null,"Fuera de rango");
                }

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null,"Error de formato");
            }

        } while (!error);
        return num;
    }
    
    

    public static String leerString(String mensaje) {
        String a;
        a = JOptionPane.showInputDialog(mensaje);
        return a;
    }
   
}
