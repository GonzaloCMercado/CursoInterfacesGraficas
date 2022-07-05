/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoObjetos;

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
        return String.format("Dirección:\nCalle: %s\nCp: %s\nNumero: %d", calle, cp, numero);
    }
}
