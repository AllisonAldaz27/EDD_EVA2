/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_super_2;
public class EVA2_9_SUPER_2 {
    public static void main(String[] args) {
       estudiante estu=new estudiante("ALLISON","ALDAZ",18,"22550373");
       estu.imprimirDatos();
        System.out.println("NoControl:  "+ estu.getNoControl());
        
        Docentes docentes=new Docentes("ALLISÓN","ALDAZ",18,"CHIHUAHUA");
        docentes.imprimirDatos();
        System.out.println("Plaza:   "+docentes.getPlaza());
        
        Proveedores proveedores=new Proveedores("ALLISON","ALDAZ",18,"RFC");
        proveedores.imprimirDatos();
        System.out.println("Rfc:   "+ proveedores.getRfc());
        
    }
    
}
