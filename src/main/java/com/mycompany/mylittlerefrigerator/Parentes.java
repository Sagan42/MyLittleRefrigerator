package com.mycompany.mylittlerefrigerator;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Parentes extends Thread {

    private Geladeira geladeira;
    private String nome;

    public Parentes(String nome, Geladeira geladeira) {
        this.geladeira = geladeira;
        this.nome = nome;
        start();
    }

    public void run() {
        try {
            while (true) {
                if (geladeira.qtdLeite() < 3) { //Um parente só vai comprar leite caso exista menos de 3 litros.
                    Random r = new Random();
                    Random e = new Random();

                    Thread.sleep(e.nextInt(1000, 10000)); //Leva um certo tempo.
                    int qtd = r.nextInt(0, 10); //Ele pode desistir e não comprar nada, ou comprar até 10.
                    if (geladeira.recebeLeite(qtd)) {
                        System.out.println(nome + " comprou " + qtd + " litros de leite!");
                    } else {
                        System.out.println(nome + " desperdiçou " + qtd + " leite!"); //Quando não existe espaço, perdemos o leite todo.
                    }
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Parentes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
