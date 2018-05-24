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
public class Exercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite o valor do raio: ");
        float raio = entrada.nextFloat();
        System.out.printf("Digite o valor da altura: ");
        float altura = entrada.nextFloat();
        System.out.printf("Volume = %.2f\n",(3.14 *(raio * raio)*altura));
    }
    
}
