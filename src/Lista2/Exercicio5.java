/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

/**
 *
 * @author danta
 */
    import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Informe o primeiro valor: ");
        float val1 = entrada.nextFloat();
        System.out.printf("Informe o segundo valor: ");
        float val2 = entrada.nextFloat();
        System.out.printf("Informe o terceiro valor: ");
        float val3 = entrada.nextFloat();
        System.out.printf("1. calcular media\n2. calcular soma\n3. calcular multiplicação\n");
        int opc = entrada.nextInt();
        switch(opc){
            case 1:
                System.out.print((val1 + val2 + val3)/3);
                break;
            case 2:
                System.out.print(val1 + val2 + val3);
                break;
            case 3:
                System.out.print(val1 * val2 * val3);
                break;
        }
    }
    
}
