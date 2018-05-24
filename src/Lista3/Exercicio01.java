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
public class Exercicio01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite 15 numeros: ");
        float val = entrada.nextFloat();
        float maiorV = val, menorV = val;
        for(int n = 1; n < 15; n++){
            val = entrada.nextFloat();
            if( val < menorV){
                menorV = val;
            }
            if(val > maiorV){
                maiorV = val;
            }
        }
        System.out.printf("O maior valor digitado foi %.1f\nO menor valor digitado foi %.1f", maiorV,menorV);
    }
}
