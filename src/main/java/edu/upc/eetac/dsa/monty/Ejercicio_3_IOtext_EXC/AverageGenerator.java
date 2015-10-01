package main.java.edu.upc.eetac.dsa.monty.Ejercicio_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by irkalla on 26.09.15.
 */
public class AverageGenerator {
    public final static double average(String file) throws Exc_Archivo_Conv, Exc_numero_superior_1000 {
        double cont = 0d;
        double sum = 0d;
        BufferedReader lector = null;
        //Abrimos archivo
        try {
                lector = new BufferedReader(new FileReader(file));
                String line = null;
                while ((line = lector.readLine()) != null)
                try{
                    int number = Integer.parseInt(line);
                    if (number>1000)
                        throw new Exc_numero_superior_1000("Numero mayor que 1000 encontrado en línea" + (int) (++cont));
                        sum += number;
                        cont++;
                }catch(NumberFormatException e) {
                    throw new Exc_Archivo_Conv(e.getMessage());
                }

        }catch(java.io.IOException e) {
            throw new Exc_Archivo_Conv(e.getMessage());
        }finally {
            try{
                lector.close();
            }catch(IOException e){
                System.err.println("Imposible cerrar el archivo");
            }
        }
        return sum / cont;
    }
}
