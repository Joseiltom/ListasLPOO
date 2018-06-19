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
public class Exercicio08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();
        int maiorNum = n1, menorNum = n1;
        int n2 = entrada.nextInt();
        if(n2 > maiorNum){
            maiorNum = n2;
        }
        if(n2 < menorNum){
            menorNum = n2;
        }
        int n3 = entrada.nextInt();
        if(n3 > maiorNum){
            maiorNum = n3;
        }
        if(n3 < menorNum){
            menorNum = n3;
        }
        System.out.printf("Soma = %d\nMedia = %.2f\nProduto = %d",(n1+n2+n3),((float)(n1+n2+n3)/3),(n1*n2*n3));
        System.out.printf("\nO maior numero foi %d e o menor foi %d\n",maiorNum,menorNum);
    }
}
