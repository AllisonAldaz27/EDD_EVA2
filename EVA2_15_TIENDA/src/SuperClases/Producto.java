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
public abstract class Producto {
   private  double precio;
    private String nombre;
    private String unidad;

    public Producto() {
    }

    public Producto(double precio, String nombre, String unidad) {
        this.precio = precio;
        this.nombre = nombre;
        this.unidad = unidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUnidad() {
        return unidad;
    }
    public abstract double PrecioVenta(int cant);
}
