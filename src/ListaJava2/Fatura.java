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
public class Fatura {
    
    private int numero,quantidade;
    private String descricao;
    private double preco,valor;
    
    public int getNumero(){
        return this.numero;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public double getpreco(){
        return this.preco;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double calcula(){
        if(this.quantidade < 0){
            this.quantidade = 0;
        }
        if(this.preco < 0){
            this.preco = 0;
        }
        this.valor = this.quantidade * this.preco;
        return this.valor;
    }
    
}
