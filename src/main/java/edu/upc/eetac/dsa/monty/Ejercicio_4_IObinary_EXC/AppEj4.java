package edu.upc.eetac.dsa.monty.Ejercicio_4_IObinary_EXC;

/**
 * Created by SergioGM on 26.09.15.
 */

import java.io.File;
import java.io.IOException;
public class AppEj4 {

    public static void main (String[] args) throws IOException{
        Clase_binario_IO pruebaEscribir = new Clase_binario_IO(5, 2.6,'t');
        pruebaEscribir.escribirBinario("archivo-test");

        Clase_binario_IO pruebaLeer = Clase_binario_IO.leerArchivo("archivo-test");
        System.out.println("entero: "+ pruebaLeer.getEntero());
        System.out.println("decimal:"+ pruebaLeer.getDecimal());
        System.out.println("caracter: "+ pruebaLeer.getCaracter());

        //¿Por qué aquí?
        File file = new File("archivo-test");
        file.delete();



    }
}
