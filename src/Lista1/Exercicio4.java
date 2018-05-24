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
public class Exercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite o valor de A: ");
        int a = entrada.nextInt();
        System.out.printf("Digite o valor de B: ");
        int b = entrada.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.printf("A = %d\nB = %d\n",a,b);  
        
    }
    
}
