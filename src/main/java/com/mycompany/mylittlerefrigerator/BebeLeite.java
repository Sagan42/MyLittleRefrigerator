package com.mycompany.mylittlerefrigerator;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BebeLeite extends Thread {
    private Geladeira geladeira;
    
    public BebeLeite (Geladeira geladeira){
        this.geladeira = geladeira;
        start();
    }
    
    public void run(){
        try {
            while(true){
                Random r = new Random();
                Thread.sleep(r.nextInt(1000,10000));
                if (geladeira.retiraLeite(1)){
                    System.out.println("Alguém bebeu leite!");
                }else{
                    System.out.println("Faltou leite!");
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(BebeLeite.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
