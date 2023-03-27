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
public class Triangulo implements Figuras ,MostrarDatos{
  private double base;
  private double altura;

    public Triangulo() {
        this.altura=0;
        this.base=0;
    }

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
    public double calcularArea() {
        return (base* altura/2);
    }

    @Override
    public double calcularPerimetro() {
        double hip=Math.hypot(base, altura);
        return base+altura+hip;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("TRIANGULO:   ");
        System.out.println("BASE    "+ base);
        System.out.println("ALTURA:    "+ altura);
        System.out.println("AREA:  "+ calcularArea());
        System.out.println("PERIMETRO:   "+calcularPerimetro());
       
    }

  
}
