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
public class Docentes extends persona{
    private String plaza;

    public Docentes() {
        super();
        this.plaza="-----";
    }

    
    public Docentes(String nombre, String apellido, int edad,String plaza) {
        super(nombre, apellido, edad);
        this.plaza=plaza;
    }


    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
}
