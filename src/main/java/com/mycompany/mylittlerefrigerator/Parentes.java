package com.mycompany.mylittlerefrigerator;

import java.util.Random;

public class Parentes extends Thread{
    private Geladeira geladeira;
    private String nome;
    
    public Parentes (String nome, Geladeira geladeira){
        this.geladeira = geladeira;
        this.nome = nome;
        start();
    }
    
    public void run(){
        while(true){
            if (geladeira.qtdLeite() < 3){
                Random r = new Random();
                int qtd = r.nextInt(0, 10);
                if (geladeira.recebeLeite(qtd)){
                    System.out.println(nome+" comprou "+qtd+" litros de leite!");
                } else{
                    System.out.println(nome+" desperdiçou leite!");
                }
            }
        }
    }
    
}
