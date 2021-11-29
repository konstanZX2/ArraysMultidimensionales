package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escaneado=new Scanner(System.in);
        System.out.println("Introduzca el numero de filas del array");
        int filas = escaneado.nextInt();
        System.out.println("Introduzca el numero de columnas array");
        int columnas = escaneado.nextInt();
        int Array [][]=new int[filas][columnas];
        int contadorFilas=0;
        int contadorColumnas=0;
        for (int i = 0; i < filas ; i++) {
            contadorFilas++;
            System.out.println("Introduzca el numero de la columna"+ contadorColumnas);
            Array[i]=escaneado.nextInt();
            for (int j = 0; j < columnas; j++) {

            }

        }



    }
}
