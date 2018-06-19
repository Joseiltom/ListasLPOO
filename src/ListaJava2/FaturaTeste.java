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
public class FaturaTeste {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        Fatura fatura = new Fatura();
        
        System.out.println("digite o valor do produto:");
        fatura.setPreco(entrada.nextDouble());
        System.out.println("Digite a quantidade:");
        fatura.setQuantidade(entrada.nextInt());
        System.out.println("Digite a descricao do produto:");
        fatura.setDescricao(entrada.next());
        System.out.println("digite o numero do produto:");
        fatura.setNumero(entrada.nextInt());
        
        System.out.printf("produto numero: %d\nDescricao: %s\nQuantidade: %d\npreco por item:%.2f\npreco total: %.2f\n", fatura.getNumero(),fatura.getDescricao(),
                fatura.getQuantidade(), fatura.getpreco(),fatura.calcula());
        
    }
}
