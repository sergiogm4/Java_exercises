package edu.upc.eetac.dsa.monty.Ejercicio_6_syncro;

/**
 * Created by SergioGM on 28.09.15.
 */
public class bufferClass {
private final static int BUFFER_SIZE=32;
    private char[] buffer;
    private int cabeza;
    private int cola;

    public bufferClass(){
        buffer = new char[BUFFER_SIZE];
        this.cabeza = 0;
        this.cola = 0;

    }

    public synchronized char obtener(){
        while(isEmpty())
            try{
                wait();
            }catch(InterruptedException e){}
        char c = buffer[cabeza++];
        if (cabeza == buffer.length){
            cabeza = 0;
        }
        notifyAll();
        return c;

    }

    public synchronized void insertar(char c) {
        while (isFull())
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        buffer[cola++] = c;
        if (cola == buffer.length) {
            cola = 0;
        }
        notifyAll();
    }

        private boolean isEmpty(){
        return cabeza==cola;
    }
        private boolean isFull(){
            if(cola+1 == cabeza){
                return true;
            }
            if(cola == (buffer.length - 1) && cabeza == 0){
                return true;
            }
            return false;
        }





}
