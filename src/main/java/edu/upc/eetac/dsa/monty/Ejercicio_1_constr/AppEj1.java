package main.java.edu.upc.eetac.dsa.monty.Ejercicio_1;

/*
 * Created by irkalla on 24.09.15.
 */
public class AppEj1 {

    public static void main(String args[]) {
        Tree[] arboles = new Tree[4];
        arboles[0] = new Tree(4);
        arboles[1] = new Tree("Roble");
        arboles[2] = new Tree();
        arboles[3] = new Tree(5,"Pino");
        for(Tree t : arboles){
            System.out.printin(t);
        }
    }
}
