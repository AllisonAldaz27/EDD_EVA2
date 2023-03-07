/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;
public class Vehiculo {
    private int Marca;
    private String Modelo;
    private int Año;
    
    public Vehiculo(){
        Marca=0;
        Modelo="";
        Año=0;
      
    }
    public Vehiculo(int Mar,String Mod,int Anio){
        Marca=Mar;
        Modelo=Mod;
        Año=Anio;
    }
    public int getMarca(){
        return Marca;
    }
    public String getModelo(){
        return Modelo;
    }
    public int getAño(){
        return Año;
    }
    public void setMarca (int valor){
        Marca=valor;
    }
    public void setModelo(String valor){
        Modelo=valor;
    }
    public void setAño (int valor){
        Año=valor;
    }
    public void imprimirDatos(){
        System.out.println("Datos:   ");
        System.out.println("Marca:  "+ Marca);
        System.out.println("Modelo:   "+ Modelo);
        System.out.println("Año:    "+ Año);
    }
}
