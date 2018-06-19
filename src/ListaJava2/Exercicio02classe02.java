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

public class Exercicio02classe02 {
    
    private String nome,origem,destino,cpf,ida, volta;
        
    Scanner entrada  = new Scanner(System.in);
    
    public void Mensagem(double valor){
        System.out.printf("Obrigado por escolher a nossa agência aérea\nOrigem: %s\nDestino: %s\nValor: %.2f\nNome do passageiro: %s\nCPF: %s\nData de ida: %s"
                + "\nData de volta: %s\nDesejamos que tenha um excelente vôo!!!",origem,destino,valor,nome,cpf,ida,volta);
    }
    public void Dados(){
        System.out.println("digite o seu nome:");
        this.nome = entrada.nextLine();
        System.out.println("Digite a origem:");
        this.origem = entrada.nextLine();
        System.out.println("Digite o destino:");
        this.destino = entrada.nextLine();
        System.out.println("digite o seu CPF:");
        this.cpf = entrada.nextLine();
        System.out.println("Digite a data de ida:");
        this.ida = entrada.nextLine();
        System.out.println("digite a data de volta:");
        this.volta = entrada.nextLine();
        
        
    }
}
