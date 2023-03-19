/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import SuperClases.Electronica;

/**
 *
 * @author VOSTRO 3401
 */
public class Computadora extends Electronica {
 private double tamaño;
 private int memoria;
 private String Procesador;
 private String DD;

    public Computadora() {
        super();
         this.tamaño = 0;
        this.memoria = 0;
        this.Procesador = "";
        this.DD = "";
    }

    public Computadora(double tamaño, int memoria, String Procesador, String DD, String fabricante, String modelo, int garantia, double precio, String nombre, String unidad) {
        super(fabricante, modelo, garantia, precio, nombre, unidad);
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.Procesador = Procesador;
        this.DD = DD;
    }

    public double getTamaño() {
        return tamaño;
    }

    public int getMemoria() {
        return memoria;
    }

    public String getProcesador() {
        return Procesador;
    }

    public String getDD() {
        return DD;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public void setDD(String DD) {
        this.DD = DD;
    }
         
    @Override
    public double PrecioVenta(int cant) {
        //10 UNIDADES-->EL PRECIO ES DEL 80%
        if(cant <10)
            return getPrecio()*cant;
        else
            return(getPrecio()* 0.8)*cant;
    }
    
}
