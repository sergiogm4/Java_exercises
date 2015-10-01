package edu.upc.eetac.dsa.monty.Ejercicio_5_threads;

/**
 * Created by SergioGM on 27.09.15.
 */
public class Clase_Runnable implements Runnable {

   //declaramos el ultimo punto de ejecucion y un contador para cumplir la condicion de diez veces
    //tambien necesitaremos el punto actual y la diferencia entre puntos sera el lapso
    long ultimaejecucion;
    int contador;


    public void run() {
        for (int i = 0; i<10 ; i++){
            long lapso;
            long ejecucionactual = System.currentTimeMillis();
            //Si es la primera muestra, no hay lapso.
            if(ultimaejecucion == 0){
                lapso = 0;
            }
            else {lapso = ejecucionactual - ultimaejecucion;}
            ultimaejecucion = ejecucionactual;
            System.out.println(Thread.currentThread().getName()+ "lapso: "+ lapso + "ms. ["+contador+"]");
            long sleep = (long) (Math.random()*2000);
            try {
                Thread.sleep(sleep);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
