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
public class Exercicio2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Informe o valor do primeiro lado: ");
        float l1 = entrada.nextFloat();
        System.out.printf("Informe o valor do segundo lado: ");
        float l2 = entrada.nextFloat();
        System.out.printf("Informe o valor do terceiro lado: ");
        float l3 = entrada.nextFloat();
        if((l1 + l2) > l3){
            if((l1 + l3)> l2){
                if((l2 + l3)> l1){
                    if((l1 == l2) && (l2 == l3)){
                        System.out.println("este é um triangulo equilátero");
                    }
                    else{
                        if(((l1 == l2) || (l2 == l3)) || (l1 == l3)){
                            System.out.println("este é um triangulo isósceles");
                        }
                        else{
                            System.out.println("este é um triangulo escaleno");
                        }
                    }
                }
                else{
                    System.out.println("os valores informados não formam um triangulo");
                }
            }
            else{
                System.out.println("os valores informados não formam um triangulo");
            }
        }
        else{
            System.out.println("os valores informados não formam um triangulo");
        }
    }
    
}
