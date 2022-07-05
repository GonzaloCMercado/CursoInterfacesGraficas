package Utilerias;

import javax.swing.JPanel;

/**
 *
 * @author EduardoCGarcia
 */
public class GUITools {
   
    public static void panelIntoPanel(JPanel padre,JPanel hijo){
        hijo.setBounds(0,0,padre.getWidth(),padre.getHeight());//definir tamaño y posicion del hijo
        //hijo.setBackground(Color.red);
        padre.removeAll();
        padre.add(hijo);
        padre.revalidate();
        padre.repaint();
    }
    
        public static void panelIntoPanel(JPanel padre,JPanel hijo,int x,int y,int width,int height){
        hijo.setBounds(x,y,width,height);//definir tamaño y posicion del hijo
        //hijo.setLocation(x, y);
        //hijo.setBackground(Color.red);
        //padre.removeAll();
        padre.add(hijo);
        padre.revalidate();
        padre.repaint();
    }
}
