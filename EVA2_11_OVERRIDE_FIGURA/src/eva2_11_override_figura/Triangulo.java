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
public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
     @Override 
     public double calcularArea(){
         return(base*altura)/2;
         
     }
     @Override
     public double calcularPerimetro(){
         return calcularHipo()+base+altura;
     }
     
     @Override
     public double calcularHipo(){
         return Math.sqrt((base*base)+ (altura*altura));
     }
     @Override
     public String toString(){
         String cade="DATOS DEL TRIANGULO"+ "\n"+
                 "Area:  "+calcularArea()+"\n"+
                 "Perimetro:  "+calcularPerimetro();
         return cade;
     }
}
