/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_3;

/**
 *
 * @author jalvarezbretana
 */
public class Boletin4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Circulo circulo = new Circulo();
        circulo.setRadio(2);
        System.out.println("Area " + circulo.calcularArea()
                + "\nLonxitude " + circulo.calcularLonxitude());
        
    }

}
