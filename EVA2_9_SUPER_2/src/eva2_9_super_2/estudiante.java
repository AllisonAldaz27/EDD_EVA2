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

public class estudiante extends persona {
   public String noControl;

    public estudiante() {
        super();
       this.noControl="-----------";
    }

    public estudiante(String nombre, String apellido, int edad,String noControl) {
        super(nombre, apellido, edad);//LLAMADA AL CONSTRUCTOR
        this.noControl=noControl;
    }

   
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    //OVERRIDE:reemplza el metodo(la misma firma)en la super clase ,en este caso
    //reemplaza a imprirmirDatos();de persona
   @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("No de control:  "+ noControl);
    }
}
