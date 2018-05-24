/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

/**
 *
 * @author danta
 */
    import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite um numero: ");
        int numero = entrada.nextInt(), cont;
        for(int n = 1; n < numero; n++){
            cont = 0;           
            for(int i = 1; i < n; i++){
                if( n % i == 0){
                    cont = cont + 1;
                }
            }
            if( cont == 1){
                System.out.printf("%d é primo\n", n);
            }
        }
    }
}
