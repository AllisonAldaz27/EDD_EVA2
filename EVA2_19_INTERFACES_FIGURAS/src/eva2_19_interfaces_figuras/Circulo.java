/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_interfaces_figuras;

/**
 *
 * @author VOSTRO 3401
 */
public class Circulo implements Figuras ,MostrarDatos{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {
        this.radio=0;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI *Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI*(radio * 2);
    }

    @Override
    public void imprimirDatos() {
        System.out.println("CIRCULO");
        System.out.println("RADIO:   "+radio);
        System.out.println("AREA:   "+calcularArea());
        System.out.println("PERIMETRO:    "+calcularPerimetro());
    
    
    }

}
