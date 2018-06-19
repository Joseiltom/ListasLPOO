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

import java.util.Scanner;

public class Exercicio02classe01 {
    Scanner entrada = new Scanner(System.in);
    private double valor;
    private int fPagamento;
    
    public void Pagamento(){
        System.out.println("Digite 1 para boleto ou 2 para cartao:");
        fPagamento = entrada.nextInt();
        if(fPagamento == 1){
            valor = 450;
        }else if(fPagamento == 2){
            valor = 500;
        }
        
    }
    public double getValor(){
        return this.valor;
    }
}
