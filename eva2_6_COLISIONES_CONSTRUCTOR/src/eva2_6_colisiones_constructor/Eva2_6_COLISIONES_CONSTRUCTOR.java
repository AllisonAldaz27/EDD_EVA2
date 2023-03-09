/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_6_colisiones_constructor;

/**
 *
 * @author VOSTRO 3401
 */
public class Eva2_6_COLISIONES_CONSTRUCTOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ANIMAL:");
      Animal animal=new Animal();
      animal.comer();
      animal.respirar();
      
        System.out.println("MAMIFERO");
        Mamifero mamifero=new Mamifero();       
    }
    
}
