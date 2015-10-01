package edu.upc.eetac.dsa.monty.Ejercicio_4_IObinary_EXC;

/**
 * Created by irkalla on 26.09.15.
 */
import java.io.*;

public class Clase_binario_IO {

    private int entero;
    private double decimal;
    private char caracter;

    public Clase_binario_IO(int integer, double decimal1, char character){
        this.entero = integer;
        this.decimal = decimal1;
        this.caracter = character;
    }

    public void setEntero(int entero){
        this.entero = entero;
    }

    public int getEntero() {
        return entero;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public void escribirBinario(String file) throws IOException{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(file));
        dos.writeInt(entero);
        dos.writeDouble(decimal);
        dos.writeChar(caracter);
        dos.close();

    }

    public final static Clase_binario_IO leerArchivo(String file) throws IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream(file));
        int integer = dis.readInt();
        double decimal = dis.readDouble();
        char character = dis.readChar();
         return new Clase_binario_IO(integer, decimal, character);

    }



}
