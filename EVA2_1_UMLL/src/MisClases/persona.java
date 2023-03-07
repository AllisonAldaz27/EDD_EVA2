/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;
public class persona {
    private int ID;
    private String nombre;
    private int edad;
public persona(){
    ID=0;
    nombre="nom";
    edad=0;
    
}
public persona (int Id,String nom,int ed){
 ID=Id;
 nombre=nom;
 edad=ed;
}
public int getID(){
    return ID;
}
public String getNombre(){
    return nombre;
}
public int getEdad(){
    return edad;
}
 public void setID(int valor){
   ID=valor;
 }
 public void setNombre(String valor){
     nombre=valor;
 }
 public void setEdad(int valor){
     edad=valor;
 }
 public void imprimirdatos(){
     System.out.println("Datos:   ");
     System.out.println("ID:  "+ID);
     System.out.println("Nombre:  "+ nombre);
     System.out.println("Edad: "+ edad);
 }
}
