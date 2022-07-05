package Utilerias;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Gonzalo CH
 */
public class FondoNoAjustable extends JPanel {

    private Image imagen;
    private String ruta; 

    public FondoNoAjustable() {
    }

    public FondoNoAjustable(String ruta) {
        this.ruta = ruta;
    }
    
    @Override
    public void paint(Graphics g) {
        imagen = new ImageIcon(getClass().getResource("/images/" + ruta)).getImage();
        g.drawImage(imagen, 0, 0,getWidth(),450, this);
        setOpaque(false);
        super.paint(g);
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
