package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escaneado = new Scanner(System.in);
        System.out.println("Introduzca el numero de filas del array");
        int filas = escaneado.nextInt();
        System.out.println("Introduzca el numero de columnas array");
        int columnas = escaneado.nextInt();
        int Array[][] = new int[filas][columnas];
       /* int contadorFilas=0;
        int contadorColumnas=0;
        for (int i = 0; i < filas ; i++) {
            contadorFilas++;
            System.out.println("Introduzca el numero de la columna"+ contadorColumnas);
            Array[][i]=escaneado.nextInt();
            for (int j = 0; j < columnas; j++) {
                Array[][j]=escaneado.nextInt();

            }

        }*/

        rellenaArray(Array);
        mostrarArray(Array);
        }


    public static void rellenaArray(int[][] Array) {
        // Producir nuevo int aleatorio entre 0 y (max-1)
        int filas = Array.length;
        int columnas = Array[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Array[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void mostrarArray(int[][] array) {
        int i, j;
        int filas = array.length;
        int columnas = array[0].length;
        // Recorrido de las filas de la matriz
        for (i = 0; i < filas; i++) {
            // Recorrido de las celdas de una fila
            for (j = 0; j < columnas; j++) {
                System.out.println("array[" + i + "][" + j + "]=" + array[i][j]);
            }
        }
    }
}

