package com.mycompany.mylittlerefrigerator;

import java.util.Random;

public class MyLittleRefrigerator {

    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira(); //Criação objeto geladeira
        BebeLeite bebeLeite = new BebeLeite(geladeira); //Thread para beber o leite
        Parentes pai = new Parentes("Pai", geladeira); //Threads para abastecer geladeira
        Parentes mae = new Parentes("Mae", geladeira);
        Parentes tio = new Parentes("Tio", geladeira);
    }
}
