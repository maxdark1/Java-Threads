package org.example;

import org.example.runnable.imprimirFrases;

import javax.swing.plaf.TableHeaderUI;

public class ThreadSync {
    public static void main(String[] args) {
        new Thread(new imprimirFrases("Hola ", "¿Que tal?")).start();
        new Thread(new imprimirFrases("¿Quien eres ","tu?")).start();
        new Thread(new imprimirFrases("Muchas ", "Gracias amigo!")).start();
    }

    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.println(frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frase2);
    }
}
