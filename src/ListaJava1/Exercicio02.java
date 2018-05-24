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
public class Exercicio02 {
        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            double m = entrada.nextInt();
            double p = entrada.nextInt();
            double resultado = Math.pow((m/p), 5);
            System.out.println(resultado);
        }
}
