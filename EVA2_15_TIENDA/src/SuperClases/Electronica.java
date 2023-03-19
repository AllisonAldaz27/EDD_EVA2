/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperClases;

/**
 *
 * @author VOSTRO 3401
 */
public abstract class Electronica extends Producto {
    private String fabricante;
    private String modelo;
    private int garantia;

    public Electronica() {
        super();
          this.fabricante = "";
        this.modelo = "";
        this.garantia = 0;
    }

    public Electronica(String fabricante, String modelo, int garantia, double precio, String nombre, String unidad) {
        super(precio, nombre, unidad);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.garantia = garantia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
    
}
