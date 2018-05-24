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
public class Exercicio01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double vFinal = 550 * 12, atlz = 550;
        for(int n = 0; n < 3; n++){
            atlz = atlz * 1.1;
            for(int i = 0; i < 12; i++){
                vFinal = vFinal + atlz;
            }
        }
        System.out.printf("Qual a porcentagem do desconto(digite somente numeros)? ");
        double desconto = entrada.nextDouble();
        desconto = desconto / 100;
        System.out.printf("o valor final é de %.2f",(vFinal-(vFinal*desconto)));
    }
}
