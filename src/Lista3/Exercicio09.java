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
public class Exercicio09 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite um numero: ");
        int numero = entrada.nextInt();
        int cont = 0;
        for(int n = 1; n < (numero+1); n++){
            if((numero % n )== 0){
                cont = cont + 1;                
            }
        }
        if(cont == 2){
            System.out.printf("%d é primo",numero);
        }else{
            System.out.printf("%d não é primo",numero);
        }
    }
}
