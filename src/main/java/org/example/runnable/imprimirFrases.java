package org.example.runnable;

import org.example.ThreadSync;

public class imprimirFrases implements Runnable{
    String frase1, frase2;

    public imprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        ThreadSync.imprimirFrases(this.frase1, this.frase2);
    }
}
