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
public class Docente {
    private String nombre;
    private String apellido;
    private int edad;
    private String plaza;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getPlaza() {
        return plaza;
    }

    public Docente(String nombre, String apellido, int edad, String plaza) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.plaza = plaza;
    }
          
}
