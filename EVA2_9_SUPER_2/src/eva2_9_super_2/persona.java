/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_super_2;

/**
 *
 * @author VOSTRO 3401
 */
public class persona  {
    private String nombre;
    private String apellido;
    private int edad;
    
    public persona(){
        this.nombre="------------------";
        this.apellido="----------------";
        this.edad=-1;
    }

    public persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void imprimirDatos(){
        System.out.println("DATOS:  ");
        System.out.println("Nombre:  "+this.nombre);
        System.out.println("Apellidos:    "+this.apellido);
        System.out.println("Edad:      "+ this.edad);
    }
}
