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
public class Exercicio08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite um numero: ");
        int i = entrada.nextInt();
        System.out.println("Os numeros impares são: ");
        for(int n = 1; n < (i+1); n = n + 2){
            System.out.printf("%d, ", n);
        }
        System.out.printf("os numeros pares são: ");
        for(int n = 0; n < (i+1); n = n + 2){
            System.out.printf("%d, ", n);
        }
        
    }
}
