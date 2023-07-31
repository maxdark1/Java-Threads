package org.example;

import org.example.runnable.NombreRunnable;

public class MainRunnableFuncional {

    public static void main(String[] args){
        Runnable nombre = () ->{
            for(int i = 0; i < 10; i++){
                System.out.println(i + "-" + Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Termina la ejecucion de la interfaz runnable + " + Thread.currentThread().getName());
        };

        new Thread(nombre, "Nombre del Hilo 1").start();
        new Thread(nombre, "Nombre del Hilo 2").start();

        System.out.println("Continuando con la ejecucion del metodo Main");
    }
}
