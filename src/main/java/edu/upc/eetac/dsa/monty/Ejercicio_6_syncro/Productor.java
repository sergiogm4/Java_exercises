package edu.upc.eetac.dsa.monty.Ejercicio_6_syncro;

/**
 * Created by SergioGM on 28.09.15.
 */
public class Productor implements Runnable {
    private bufferClass buffer;
    private String linea;


    public Productor(bufferClass buff, String line){
        this.buffer = buff;
        this.linea = line ;
    }


    public void run(){
        char info[] = linea.toCharArray();
        for(char c : info){
            buffer.insertar(c);
        }


    }



}
