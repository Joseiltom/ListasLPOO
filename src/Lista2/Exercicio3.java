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
public class Exercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float fNota = 0, mNota = 0;
        for(int n=1; n< 4;n++){
            System.out.printf("informe o valor da %dª nota:", n);
            float nota = entrada.nextFloat();
            if(nota > mNota){
                mNota = nota;
            }
            fNota = fNota + (nota/3);
        }
        System.out.printf("A maior nota dentre as informadas é %.2f\n", mNota);
        System.out.printf("A media das tres notas é %.2f\n", fNota);
        
    }
    
}
