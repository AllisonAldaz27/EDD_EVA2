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
public class Libro extends Documento {
    private String editorial;
    private String ISBN;

    public String getEditorial() {
        return editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    
}
