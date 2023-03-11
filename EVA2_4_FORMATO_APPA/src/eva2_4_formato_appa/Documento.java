/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_formato_appa;

/**
 *
 * @author VOSTRO 3401
 */
public class Documento {
    private String autor;
    private String titulo;
    private int año;
    private String mes;
    private int dia;
    private String ciudad;
    
    public Documento(){
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }

    public String getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
