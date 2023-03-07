/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author VOSTRO 3401
 */
public class Tv {
    private int volumen;
    private int canal;
    private boolean power;
    
    public Tv(){
        volumen=0;
        canal=0;
        power=false;//false es apagado
        
    }
    public Tv(int vol,int can,boolean pow){
        volumen=vol;
        canal=can;
        power=pow;
    }
    public int getVolumen(){
        return volumen;
    }
    public int getCanal(){
        return canal;
    }
    public boolean getPower(){
        return power;
    }
    public void setVolumen(int valor){
        volumen=valor;
    }
    public void setCanal(int valor){
        canal=valor;
    }
    public void setPower(boolean valor){
        power=valor;
    }
    public void imprimirdatos(){
        System.out.println("Valores:          ");
        System.out.println("Volumen: "+volumen);
        System.out.println("Canal:  "+canal);
        System.out.println("Power:   "+ power);
    }
}
