package com.mycompany.mylittlerefrigerator;

public class Geladeira {
    private int leite;
    
    public Geladeira(){
        leite = 0;
    }
    
    int qtdLeite(){
        return this.leite;
    }
    
    boolean recebeLeite(int qtd){
        if (leite + qtd <= 10){
            leite += qtd;
            return true;
        } else {
            return false;
        }
    }
    
    boolean retiraLeite (int qtd){
        if (leite >= qtd) {
            leite -= qtd;
            return true;
        } else{
            return false;
        }
    }
}
