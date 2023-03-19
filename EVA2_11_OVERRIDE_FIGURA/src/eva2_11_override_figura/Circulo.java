/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_override_figura;

/**
 *
 * @author VOSTRO 3401
 */
public class Circulo extends Figura {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public Circulo (double radio){
        this.radio=radio;
    }
    public Circulo(){
        radio=0;
    }
    @Override 
    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    @Override
    public double calcularPerimetro(){
        return Math.PI*(radio*2);
    }
    @Override 
    public String toString(){
        String cade="Datos Circulo"+"\n"
                +"Area:  "+calcularArea()+"\n"
                +"Perimetro: "+calcularPerimetro();
        return cade;
                
    }
}
