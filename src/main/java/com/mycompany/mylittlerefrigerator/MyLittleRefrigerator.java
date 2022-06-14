package com.mycompany.mylittlerefrigerator;

import java.util.Random;

public class MyLittleRefrigerator {

    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira();
        BebeLeite bebeLeite = new BebeLeite(geladeira);
        Parentes pai = new Parentes("Pai", geladeira);
        Parentes mae = new Parentes("Mae", geladeira);
        Parentes tio = new Parentes("Tio", geladeira);
    }
}
