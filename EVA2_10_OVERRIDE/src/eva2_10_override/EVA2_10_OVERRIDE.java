/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_override;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA2_10_OVERRIDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso=new Persona();
        Persona perso2=new Persona();
        System.out.println("PERSONA");
        System.out.println("PERSONA2");
    }
    
}
class Persona{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
     public Persona(){
         nombre="default";
         edad=-1;
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
     @Override
     public String toString(){
         String cade="Datos  "+"\nNombre:  "+nombre+"\n"+"Edad:  "+edad;
         return cade;
     }
}
