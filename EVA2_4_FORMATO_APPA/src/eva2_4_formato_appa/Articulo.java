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
public class Articulo extends Documento {
    private int pagina;
    private String tituloPublicante;

    public int getPagina() {
        return pagina;
    }

    public String getTituloPublicante() {
        return tituloPublicante;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public void setTituloPublicante(String tituloPublicante) {
        this.tituloPublicante = tituloPublicante;
    }
    
}
