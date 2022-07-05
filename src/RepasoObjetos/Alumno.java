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
public class Alumno {

    private String nombre;
    private int edad;
    private String numCuenta;
    private String correo;
    private Direccion direccion;

    public Alumno(String nombre, int edad, String numCuenta, String correo, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.numCuenta = numCuenta;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nEdad: %d\nNo.Cuenta: %s\nCorreo: %s\n%s", nombre, edad, numCuenta, correo, direccion.toString());
    }

}
