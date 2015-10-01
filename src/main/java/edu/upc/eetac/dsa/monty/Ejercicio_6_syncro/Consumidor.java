package edu.upc.eetac.dsa.monty.Ejercicio_6_syncro;

/**
 * Created by SergioGM on 28.09.15.
 */
public class Consumidor implements Runnable {
    private bufferClass buffer = null;

    public Consumidor(bufferClass buffer) {
        this.buffer = buffer;
    }


    public void run(){

        StringBuilder info = new StringBuilder();
        char c;
         while((c=buffer.obtener()) != '\n'){
             info.append(c);
         }
        System.out.println(c);


    }



}
