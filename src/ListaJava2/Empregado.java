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
public class Empregado {
    private String nome, sobrenome;
    private double salario;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public double getSalario(){
        return this.salario;
    }
    
    
}
