/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_21_polimorfismo;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA2_21_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        estudiante estu = new estudiante("Allison", "Aldaz", 18, "22550373");
        estu.imprimirDatos();

        Docentes doc = new Docentes();
        doc.setNombre("Martin");
        doc.setApellido("Vega");
        doc.setEdad(20);
        doc.setPlaza("tiempo completo");
        doc.imprimirDatos();
     //puedo tratar a los objetos de las subclases como objetos de la super clase
        //Al reves no se puede 
        //Estoy asignando un objeto de tipo estudiante a una variable de tipo persona
        persona perso = estu;
//estoy generalizando (simplificando)     
//perso.
        persona perso2= doc;
        persona perso3=new persona();
        //Es imposible convertir una persona en un estudiante
        //no podemos agregar cosas,simplemente ocultamos propiedades
        estudiante estu=perso3;
    }

}
