/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_clases_abstractas2;

/**
 *
 * @author VOSTRO 3401
 */
public abstract class Persona {
    private String nombre;
    private int edad;
    
    
public Persona(){
    
}
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    //LOS METODOS ABSTRACTOS PUEDEN SER MEZCLADOS CON METODOS NORMALES
    public abstract void imprimirDatos();
        
    
}
