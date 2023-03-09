/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_2_herencia;

/**
 *
 * @author VOSTRO 3401
 */
public class Proveedores {
    private String nombre;
    private String apellido;
    private int edad;
    private String razonsocial;
    private String rfc;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public String getRfc() {
        return rfc;
    }

    public Proveedores(String nombre, String apellido, int edad, String razonsocial, String rfc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.razonsocial = razonsocial;
        this.rfc = rfc;
    }
    
}
