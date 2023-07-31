package org.example;

import org.example.runnable.NombreRunnable;

public class MainRunnable {
    public static void main(String[] args){
        new Thread(new NombreRunnable("Juan")).start();
        new Thread(new NombreRunnable("Pepe")).start();
    }
}
