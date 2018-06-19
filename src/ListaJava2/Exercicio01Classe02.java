/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaJava2;

/**
 *
 * @author danta
 */
public class Exercicio01Classe02 {
    private double saldo = 0;
    public void Deposito(double deposito){
        this.saldo = this.saldo + deposito;
    }
    public void Saque(double saque){
        if(this.saldo >= saque){
            this.saldo = this.saldo - saque;
        }else{
            System.out.printf("saldo insuficiente");
        }
    }
    public double getSaldo(){
        return this.saldo;
    }
}
