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
public class Conta {

    String nome, conta;
    double interese, saldo;

    public Conta(String nome, String conta, double interese, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.interese = interese;
        this.saldo = saldo;
    }

    public Conta() {

    }

    public String getNome() {
        return nome;
    }

    public String getConta() {
        return conta;
    }

    public double getInterese() {
        return interese;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setInterese(double interese) {
        this.interese = interese;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double Ingreso(double ingreso){
    this.saldo = saldo + ingreso ;
    return saldo;    
    }
    public double Reintegro(double reintegro){
    this.saldo = saldo - reintegro;
    return saldo;
    }
    
}
