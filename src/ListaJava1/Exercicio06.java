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
public class Exercicio06 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        System.out.printf("soma = %d\nproduto = %d\ndiferença = %d\nquociente = %.2f\n",(n1+n2),(n1*n2),(n1-n2),((float)n1/(float)n2));
    }
}
