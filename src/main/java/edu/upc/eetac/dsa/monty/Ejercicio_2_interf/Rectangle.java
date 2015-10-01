package main.java.edu.upc.eetac.dsa.monty.Ejercicio_2;

/**
 * Created by irkalla on 24.09.15.
 */
public class Rectangle extends AbstractShape{
    private int ancho;
    private int largo;

    public Rectangle(int ancho, int largo){
        super("rectangle");
        this.ancho = ancho;
        this.largo = largo;
    }

    public int getAncho(){
        return ancho;
    }

    public void setAncho(int ancho){
        this.ancho = ancho;
    }

    public void setLargo(int largo){
        this.largo = largo;
    }
    public int getLargo(){
        return largo;
    }
    public double area(){
        return largo*ancho;
    }

}

