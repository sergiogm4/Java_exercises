package main.java.edu.upc.eetac.dsa.monty.Ejercicio_3;

/**
 * Created by irkalla on 26.09.15.
 */
public class AppEj3 {

    public static void main (String[] args){
        if(args.length!=1){
            System.err.println("No se detecta path de documento");
            System.exit(-1);
        }
        try{
            double media = AverageGenerator.average(args[0]);
            System.out.println("La media es :"+ media);

        }catch(Exc_Archivo_Conv e){
            e.printStackTrace();

        }catch(Exc_numero_superior_1000 e){
            e.printStackTrace();

        }
    }
}
