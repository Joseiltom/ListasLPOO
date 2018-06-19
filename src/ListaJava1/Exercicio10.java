/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaJava1;

import java.util.Scanner;

/**
 *
 * @author danta
 */
public class Exercicio10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double raio = entrada.nextDouble();
        System.out.printf("Diametro = %.2f\n", 2*raio);
        System.out.printf("Circunferencia = %.2f\n", 2 * Math.PI * raio);
        System.out.printf("Area = %.2f", Math.PI * raio * raio);
    }
}
