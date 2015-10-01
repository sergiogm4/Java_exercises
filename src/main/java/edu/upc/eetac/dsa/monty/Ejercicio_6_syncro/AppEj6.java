package edu.upc.eetac.dsa.monty.Ejercicio_6_syncro;

/**
 * Created by SergioGM on 27.09.15.
 */
public class AppEj6 {
    public static  void main(String[] args){

        bufferClass buffer = new bufferClass();
        String line = "Knowledge will give you power, but character respect.\n";

        Thread productor = new Thread(new Productor(buffer,line), "soy productor");
        Thread consumidor = new Thread(new Consumidor(buffer),"soy consumidor");

        productor.start();
        consumidor.start();



    }
}
