package edu.upc.eetac.dsa.monty.Ejercicio_8_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by SergioGM on 29.09.15.
 */
public class AppEj8_client {
    public static void main(String[] args) throws IOException{
        if (args.length < 2) {
            System.err.println("Debes determinar la direccion y el puerto");
            System.exit(-1);

        }

        String servidor = args[0];
        int puerto = Integer.parseInt(args[1]);

        byte[] info = new byte[0];
        //Como es UDP, usamos datagramas
        //el mensaje, la longitud , la dirección  y el puerto local del socket de destino
        //getByName lo pone en tipo inetadress. DatagramPakcet crea el datagrama
        DatagramPacket dp = new DatagramPacket(info, info.length, InetAddress.getByName(servidor), puerto);
        DatagramSocket dSocket = new DatagramSocket();
        dSocket.send(dp);
        //Ahora recibo respuesta



    }
}
