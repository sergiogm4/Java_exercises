package main.java.edu.upc.eetac.dsa.monty.Ejercicio_2;





/**
 * Created by SergioGM  on 24.09.15.
 */
public class AppEj2 {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(2.5);
        shapes[1] = new Rectangle(3, 5);
        for (Shape shape : shapes)
            System.out.println(shape + " with area = " + shape.area());
    }
}
