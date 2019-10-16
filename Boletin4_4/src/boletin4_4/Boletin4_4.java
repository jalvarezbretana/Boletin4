/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author jalvarezbretana
 */
public class Boletin4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Conta conta = new Conta();
        conta.setSaldo(50);
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Reintegro: " + conta.reintegro(20));

        Conta cuentaOrigen = new Conta();
        Conta cuentaDestino = new Conta();

        cuentaOrigen.setSaldo(100);
        cuentaDestino.setSaldo(80);
        System.out.println("Saldo Inicial Cuenta Origen: " + cuentaOrigen.getSaldo()
                + "\nSaldo Inicial Cuenta Destino: " + cuentaDestino.getSaldo());
        cuentaOrigen.transferencia(cuentaDestino, 30);
        System.out.println("Saldo Cuenta Origen: " + cuentaOrigen.getSaldo());
        System.out.println("Saldo Cuenta Destino: " + cuentaDestino.getSaldo());
    }

}
