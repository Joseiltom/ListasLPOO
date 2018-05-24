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
public class Exercicio03 {
    public static void main(String[] args){
        int i = 1;
        float soma = 0;
        System.out.printf("Soma: ");
        for(int n = 1; n < 51; n++){
            if( n < 50){
                System.out.printf("%d / %d + ", i, n);
            }
            else{
                System.out.printf("%d / %d",i,n);
            }
            soma = soma + (i/n);
            i = i + 2;
        }
        System.out.printf(" = %.2f", soma);
    }
}
