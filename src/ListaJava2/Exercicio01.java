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
public class Exercicio01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        Exercicio01Classe01 interf = new Exercicio01Classe01();
        Exercicio01Classe02 operacoes = new Exercicio01Classe02();
        double saldo;
        while(opcao != 4){
            interf.ImprimeMenu();
            opcao = entrada.nextInt();
            if(opcao == 1){
                System.out.println("Digite o valor que deseja depositar: \n");
                double deposito = entrada.nextDouble();
                if(deposito > 0){
                    operacoes.Deposito(deposito);
                }else{
                    System.out.println("Valor invalido");
                }
            }
            if(opcao == 2){
                System.out.println("Digite o valor so saque:\n");
                double saque = entrada.nextDouble();
                if(operacoes.getSaldo() < saque){
                    operacoes.Saque(saque);
                }else{
                    System.out.println("saldo insuficiente");
                }
            }
            if(opcao == 3){
                System.out.printf("Saldo: %.2f\n", operacoes.getSaldo());
            }
            
        }
    }
}
