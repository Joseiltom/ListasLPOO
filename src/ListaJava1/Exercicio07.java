/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaJava1;

/**
 *
 * @author danta
 */
    import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        if(n1 == n2){
            System.out.println("These numbers are equal");
        }
        else if(n1 > n2){
            System.out.printf("%d is larger",n1);
        }
        else{
            System.out.printf("%d is larger",n2);
        }
    }
}
