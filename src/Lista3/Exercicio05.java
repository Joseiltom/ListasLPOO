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
public class Exercicio05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int somaPar = 0, somaImpar = 0;
        System.out.printf("Informe os inteiros positivos: \n");
        int val = entrada.nextInt();
        if(val > 0 && val < 1000){
            do{
                if(val < 0){
                    System.out.println("este numero não é positivo");
                }
                else{
                    if((val % 2) == 0){
                        somaPar = somaPar + val;
                    }
                    else{
                        somaImpar = somaImpar + val;
                    }
                }
                val = entrada.nextInt();
            }while( val < 1000);
        }
        System.out.printf("A soma dos numeros impares é: %d\nA soma dos numeros pares é: %d", somaImpar, somaPar);
        
    }
}
