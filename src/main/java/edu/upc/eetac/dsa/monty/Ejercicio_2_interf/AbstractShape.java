package main.java.edu.upc.eetac.dsa.monty.Ejercicio_2;

/**
 * Created by irkalla on 24.09.15.
 */
public abstract class AbstractShape implements Shape {
    private String tipo;
    public AbstractShape(String tipo){
        this.tipo = tipo;
    }

    public String toString(){
        return "I' am a" + tipo;
    }
}
