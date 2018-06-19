/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaJava1;

import java.util.Scanner;

/**
 *
 * @author danta
 */
public class Exercicio09 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        if((n1 % n2) == 0){
            System.out.printf("%d é multiplo de %d",n1,n2);
        }
        else{
            System.out.printf("%d não é multiplo de %d",n1,n2);
        }
    }
}
