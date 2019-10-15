/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

/**
 *
 * @author jalvarezbretana
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Coche coche =new Coche();
        coche.acelerar(30);
        System.out.println("Velocidade acelerar "+coche.getVelocidade());
        coche.frenar(20);
        System.out.println("Despois de frenar "+coche.getVelocidade());
    
    }    
    
    
}
