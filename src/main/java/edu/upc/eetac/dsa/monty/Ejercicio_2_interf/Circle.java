package main.java.edu.upc.eetac.dsa.monty.Ejercicio_2;

/**
 * Created by irkalla on 24.09.15.
 */
public class Circle extends AbstractShape{
private double radio;

    public Circle(double radio){
        super("circle");
        //Pasamos inicialmente variable pero aquí no se pasa el valor a la variable, por lo tanto muestra 0.
    }

    public void setRadio(double radius){
        this.radio=radius;

    }

    public double getRadio(){
        return radio;
    }

    public double area(){
        return Math.PI*radio*radio;
    }
}
