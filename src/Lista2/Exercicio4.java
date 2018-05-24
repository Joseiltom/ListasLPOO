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
public class Exercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Informe o primeiro valor: ");
        int val1 = entrada.nextInt();
        System.out.printf("Informe o segundo valor: ");
        int val2 = entrada.nextInt();
        System.out.printf("Informe o terceiro valor: ");
        int val3 = entrada.nextInt();
        int ord1,ord2,ord3;
        if((val1 > val2)&& (val1 > val3)){
            ord3 = val1;
        }
        else{
            if((val2 > val1) && (val2 > val3)){
                ord3 = val2;
            }
            else{
                ord3 = val3;
            }
        }
        if((val1 < val2)&&(val2 < val3)){
            ord1 = val1;
        }
        else{
            if((val2 < val1)&&(val2 < val3)){
                ord1 = val2;
            }
            else{
                ord1 = val3;
            }
        }
        if((val1 > ord1)&&(val1 < ord3)){
            ord2 = val1;
        }
        else{
            if ((val2 > ord1)&&(val2 < ord3)){
                ord2 = val2;
            }
            else{
                ord2 = val3;
            }
        }
        System.out.printf("Digite \"c\" para ordem crecente ou \"d\" para decrecente: " );
        String cOuD = entrada.next();
        if(cOuD.intern() == "c"){
            System.out.printf("%d, %d, %d", ord1,ord2,ord3);
        }
        else if(cOuD.intern() == "d"){
            System.out.printf("%d, %d, %d", ord3,ord2,ord1);
        }
    }
    
}
