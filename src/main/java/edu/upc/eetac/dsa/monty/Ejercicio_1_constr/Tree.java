package main.java.edu.upc.eetac.dsa.monty.Ejercicio_1;

/**
 * Created by SergioGM on 24.09.15.
 */
public class Tree {
    private int altura;
    private string nombre;

    public Tree(){
        this(0,null);//¿igual que no poner nada?
    }

    public Tree(int altura){
        this(altura, null);
    }

    public Tree(string nombre){
        this(0, nombre);
    }

    public Tree(int alt, string nom){
        this.altura = alt;
        this.nombre = nom;
    }
    public String   toString(){

        StringBuilder sb = new StringBuilder();
        sb.append("Un ");
        if(nombre == null)
            sb.append("arbol ");
        else sb.append(nombre);
        if(altura>0){

            sb.append("de ").append(altura).append(" metros");
            return sb.toString();
        }


    }



}
