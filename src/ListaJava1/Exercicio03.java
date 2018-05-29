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
public class Exercicio03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        if(num < 100){
            System.out.printf("Numero invalido");
        }
        else{
            String sNum = "" + num;
            String iNum =new StringBuilder(sNum).reverse().toString();
            System.out.println(iNum);
        }
    }
}
