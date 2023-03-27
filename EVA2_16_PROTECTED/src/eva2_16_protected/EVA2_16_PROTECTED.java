/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_protected;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA2_16_PROTECTED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SuperClase objsuper=new SuperClase();
        objsuper.dato= 100;
              
    }
    
}
class SuperClase{
    protected int dato;
   
    
}
class SubClase extends SuperClase{
    protected void imprimirDatos(){
        System.out.println("el valor del dato es:  "+ dato);
    }
}