/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

/**
 *
 * @author danta
 */
    import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();
        if((n1 %2) == 0){
            if(n1 >= 0){
                System.out.printf("%d é par e positivo\n", n1);
            }
            else{
                System.out.printf("%d é par e negativo\n", n1);
            }
        }
        else{
            if(n1 >= 0){
                System.out.printf("%d é impar e positivo\n", n1);
            }
            else{
                System.out.printf("%d é impar e negativo\n", n1);
            }
        }
    }
    
}
