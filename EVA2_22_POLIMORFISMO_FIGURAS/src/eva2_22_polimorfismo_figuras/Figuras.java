/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_polimorfismo_figuras;

/**
 *
 * @author VOSTRO 3401
 */
//NO SE PUEDEN INSTANCIAR LAS INTERFACES 
//SON COMO UN CONTRATO ; ESTOY OBLIGADO A IMPLEMENTAR
//SOLO METODOS ABSTRACTOS Y CONSTANTES
public interface Figuras {
    public abstract double calcularArea();
    double calcularPerimetro();
}
