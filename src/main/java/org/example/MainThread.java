package org.example;

import org.example.threads.NombreThread;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("Juan");
        Thread hilo2 = new NombreThread("Christopher");
        hilo.start();
        hilo2.start();
    }
}