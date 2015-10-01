package edu.upc.eetac.dsa.monty.Ejercicio_8_UDP;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.text.SimpleDateFormat;

/**
 * Created by SergioGM on 29.09.15.
 */
public class AppEj8_server {

    private static final int PUERTO_DEFECTO = 1234;
    public static void main(String[] args) throws IOException {
        int port = (args.length == 1)? Integer.parseInt(args[0]):1234;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        DatagramSocket dSocket = new DatagramSocket(port);
        int z = 0;
        while(z==0){
            byte[] buffer = new byte[0];
            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
            dSocket.receive(dp);
            //Como he recibido, continuo y preparo la info para enviarla
            //BAOS crea un buffer, DOS permite escribir, tobyteArry m lo convierte en array de bytes
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);
            dos.writeUTF(sdf.format(System.currentTimeMillis()));
            byte[] info = baos.toByteArray();
        //Enviamos
            dp = new DatagramPacket(info, info.length, dSocket.getInetAddress(), dSocket.getPort());
            dSocket.send(dp);


        }





    }

}
