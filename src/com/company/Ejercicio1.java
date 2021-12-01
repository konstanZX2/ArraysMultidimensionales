package com.company;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {


        Scanner escaneado = new Scanner(System.in);
        System.out.println("Introduzca el numero de filas del array");
        int filas = escaneado.nextInt();
        System.out.println("Introduzca el numero de columnas array");
        int columnas = escaneado.nextInt();
        int array[][] = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("A[" + i + "][" + j + "]= ");
                array[i][j] = escaneado.nextInt();
            }
        }



        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {
                System.out.println("array[" + i + "][" + j + "]=" + array[i][j]);
            }
        }
        System.out.println();


        System.out.println("Ahora que esta creado el Array elige la posicion que deseas cambiar");
        System.out.println();
        System.out.println("Selecciona el numero de fila");
        int filaUsuario=escaneado.nextInt();
        System.out.println("Selecciona el numero de columna");
        int columnaUsuario= escaneado.nextInt();
        System.out.println("Selecciona el valor que vas a colocar en esa posicion");
        int numeroUsuario=escaneado.nextInt();
        array[filaUsuario][columnaUsuario]= numeroUsuario;



        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {
                System.out.println("array[" + i + "][" + j + "]=" + array[i][j]);
            }
        }
        System.out.println();

    }
}

