package edu.upc.eetac.dsa.monty.Ejercicio_7_TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by SergioGM on 28.09.15.
 */
public class AppEj7_client {
    public static void main(String[] args)throws IOException{
        if(args.length<2){
            System.err.println("Introduzca nombre y puerto del servidor");
            System.exit(-1);
        }

        String servidor = args[0];
        int puerto = Integer.parseInt(args[1]);
        Socket socket = new Socket(servidor, puerto);
        //InputStreamReader nos permite convertir de bytes a string
        //getInputStream es para saber el canal de comunicacion del socket
        BufferedReader lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String tiempo = lector.readLine();
        System.out.println("Time: " + tiempo);


    }
}
