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
public class Proveedores extends persona {
    private String rfc;

    public Proveedores() {
        super();
        this.rfc="-------";
    }

    
    public Proveedores(String nombre, String apellido, int edad,String Rfc) {
        super(nombre, apellido, edad);
        this.rfc=rfc;
    }

    
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    
}
