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
            double distancia = entrada.nextDouble();
            if(distancia > 12.0){
                System.out.printf("A distancia informada nunca seria alcançada.");
            }
            else{
                System.out.printf("A onda demorou %.2f minutos para alcançar essa distancia",((distancia/20)*60));
            }
        }
}
