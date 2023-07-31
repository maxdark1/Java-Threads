package org.example.runnable;

public class NombreRunnable implements Runnable{
    private  String nombre;

    public String getNombre() {
        return nombre;
    }

    public NombreRunnable(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(i + "-" + nombre);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Termina la ejecucion de la interfaz runnable + " + this.getNombre());
    }
}
