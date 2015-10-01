package edu.upc.eetac.dsa.monty.Ejercicio_5_threads;

/**
 * Created by SergioGM on 27.09.15.
 */
public class AppEj5 {

    public static void main(String[] args) throws InterruptedException{

        Clase_Thread threadclase = new Clase_Thread("clase thread");
        Thread runnableclase = new Thread(new Clase_Runnable(), "clase runnable");

        threadclase.start();
        runnableclase.start();

        threadclase.join();
        runnableclase.join();

        System.out.println("THE END");


    }

}
