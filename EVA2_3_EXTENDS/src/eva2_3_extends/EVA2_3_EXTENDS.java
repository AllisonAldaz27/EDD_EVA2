/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_extends;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       estudiante estu=new estudiante();
        estu.setNombre("ALLISON");
        estu.setApellido("ALDAZ");
        estu.setEdad(18);
        estu.setNoControl("22550373");
        System.out.println("DATOS DEL ESTUDIANTE");
        System.out.println(estu.getNombre());
        System.out.println(estu.getApellido());
        System.out.println(estu.getEdad());
        System.out.println(estu.getNoControl());
    }
    
}
