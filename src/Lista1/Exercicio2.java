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
public class Exercicio2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite a temperatura: ");
        int tempC = entrada.nextInt();
        System.out.printf("Fahrenheit: %d\n", ((9* tempC + 160)/5));
    }
    
}
