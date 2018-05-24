/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

/**
 *
 * @author danta
 */
    import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Entre com o primeiro número: ");
        float n1 = entrada.nextFloat();
        System.out.printf("Entre com o segundo número: ");
        float n2 = entrada.nextFloat();
        System.out.printf("Soma: %.0f\n", (n1+n2));
        System.out.printf("Diferença: %.0f\n", (n1-n2));
        System.out.printf("Produto: %.0f\n", (n1*n2));
        System.out.printf("Media: %.2f\n", ((n1+n2)/2));
    }
}
