package modelo;

/**
 *
 * @author Gonzalo CH
 */
public class Direccion {

    private String calle;
    private String cp;
    private int numero;

    public Direccion(String calle, String cp, int numero) {
        this.calle = calle;
        this.cp = cp;
        this.numero = numero;
    }

    public Direccion() {
    }
    
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        /*
        %s string
        %d int
        %f float
        */
        return String.format("Direccion: \nCalle:%s \nCodigo Postal: %s \nNumero Exterior: %d \n", calle,cp,numero);
    }

    
}
