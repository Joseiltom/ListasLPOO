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
public class Exercicio07 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        System.out.printf(" digite os valores des medias: ");
        float media = entrada.nextFloat();
        if( media >= 0){
            float menorMedia = media, maiorMedia = media, somaTurma = media;
            cont = cont + 1;
            do{
                media = entrada.nextFloat();
                if(media >= 0){
                    somaTurma = somaTurma + media;
                    cont = cont + 1;
                    if(media > maiorMedia){
                        maiorMedia = media;
                    }
                    if(media < menorMedia){
                        menorMedia = media;
                    }
                }
            }while(media >= 0);
            System.out.printf("A media da turma é de: %.2f\n A maior media é: %.2f\n A menor media é: %.2f",(somaTurma/cont),maiorMedia,menorMedia);
            
        }
    }
}
