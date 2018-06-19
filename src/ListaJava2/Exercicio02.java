/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaJava2;

/**
 *
 * @author danta
 */
public class Exercicio02 {
    public static void main(String[]args){
        Exercicio02classe01 ec1 = new Exercicio02classe01();
        Exercicio02classe02 ec2 = new Exercicio02classe02();
        
        ec2.Dados();
        ec1.Pagamento();
        ec2.Mensagem(ec1.getValor());
    }
}
