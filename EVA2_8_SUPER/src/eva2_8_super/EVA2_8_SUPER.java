/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_super;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA2_8_SUPER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal=new Animal("JAJAJ",10);
        Mamifero mamifero=new Mamifero("negro","luna",10);
        Canes can=new  Canes ();
        can.
    }
    
}
class Animal{
    private String nombre;
    private String peso;

    public Animal(){
        System.out.println("ITS ALIVE!!");
    }

    public Animal(String nombre, String peso) {
        this.nombre = nombre;
        this.peso = peso;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public void  respirar(){
        System.out.println("Estoy respirando");
    }
}
class Mamifero extends Animal{
    private String pelo;
    
   public Mamifero(){
       //lo primero que se tiene que hacer es llamar al constructor al constructor de la super clase 
       super();//llamada al constructor default 
       System.out.println("soy un mamifero!!!");
               
   }
    public Mamifero(String pelo, String nombre, String peso) {
        super(nombre, peso);
        this.pelo = pelo;
        System.out.println("soy un mamifero constructor 2!!");
    }

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }
   
}
class Canes extends Mamifero{

    public Canes() {
        super();
        System.out.println("Soy un can!!");
    }
    
}
