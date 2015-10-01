package edu.upc.eetac.dsa.monty.Ejercicio_7_TCP;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

/**
 * Created by SergioGM on 28.09.15.
 */
public class AppEj7_server {
    private final static int PUERTO_DEFECTO = 1234;

    public static void main(String[] args) throws IOException{

        int port = (args.length == 1)? Integer.parseInt(args[0]):PUERTO_DEFECTO;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        ServerSocket server = new ServerSocket(port);
        char z = 0;
            while(z==0){
                Socket socket = server.accept();
                PrintWriter escritor = new PrintWriter(socket.getOutputStream());
                //Pasamos de milisegundos al formato de fecha declarado anteriormente
                escritor.println(sdf.format(System.currentTimeMillis()));
                escritor.flush();
            }



    }
}
