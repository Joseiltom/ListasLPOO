/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

/**
 *
 * @author danta
 */
    import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int n = 0, val1,val2,val3;
        
        do{
            val1 = entrada.nextInt();
            val2 = entrada.nextInt();
            val3 = entrada.nextInt();
            if((val1 < val2)&&(val2 < val3)){
                System.out.printf("soma: %d\n", (val1 + val2 + val3));
                System.out.printf("produto: %d\n", (val1 + val2 + val3));
                System.out.printf("media: %d\n", (val1 + val2 + val3));
            }
            else{
                n = 1;
            }
        }while(n != 1);
    }
}
