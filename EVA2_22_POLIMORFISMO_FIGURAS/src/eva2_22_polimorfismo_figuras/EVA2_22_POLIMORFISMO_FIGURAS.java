/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author VOSTRO 3401
 */
public class EVA2_22_POLIMORFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /* Circulo []circulos=new Circulo[10];
      //un arreglo en java va de la posicion 0 a la N-1
      //N es la cantidad de elementos del arreaglo
        for (int i = 0; i < circulos.length; i++) {
            circulos[i]=new Circulo(i);//CREAMOS CADA UNO DE LOS OBJETOS
            circulos[i].imprimirDatos();
        }*/
    Figuras[]figuras;//delcramos un arreglo pero todavia no lo creamos 
    //con el scanner capturamos por el teclado la cantidad de figuras a utilizar
    Scanner input =new Scanner (System.in);
        System.out.println("¿cuantas figuras quieres capturar?  ");
        int cant=input.nextInt();
        System.out.println("cantidad:   "+ cant);
     figuras=new Figuras[cant];//aqui creamos el arreglo
                              //cantidad de figuras que quiere el usuario
     for (int i = 0; i < cant; i++) {
         System.out.println("Captura el tipo de figura:  ");
         System.out.println("1.CIRCULO,2.TRIANGULO");
         int figu=input.nextInt();
         if(figu==1){//circulo
             Circulo circu=new Circulo();
             System.out.println("Introduce el radio:  ");
             circu.setRadio(input.nextDouble());
             figuras[i]=circu;
         }else {//triangulo
             Triangulo trian=new Triangulo();
             System.out.println("Introduce el base:   ");
                  trian.setBase(input.nextDouble());
             System.out.println("Introduce la altura:   ");
             trian.setAltura(input.nextDouble());
                 figuras[i]=trian;
                 }
         }
     //imprimir los resultados:
        for (int i = 0; i < figuras.length; i++) {
            if(figuras[i] instanceof Circulo){
            Circulo circu=(Circulo)figuras[i];//esto es un casting
            circu.imprimirDatos();
            } else{
            Triangulo trian=(Triangulo)figuras[1];//esto es casting tambien
            trian.imprimirDatos();
          //  System.out.println("Área:   "+ figuras[i].calcularArea());
            //System.out.println("Perimetro:   "+ figuras[i].calcularPerimetro());
            
            }
        }
     
     
     
    }
    
}
