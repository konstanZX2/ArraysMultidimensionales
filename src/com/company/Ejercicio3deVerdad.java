package com.company;

import java.util.Scanner;

public class Ejercicio3deVerdad {
    public static void main(String[] args) {
        int array3[] = new int[10];
        rellenaArray(array3, 0, 10);
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");

        }
        System.out.println();
        Scanner escaneado = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del Array");
        int tamañoArray = escaneado.nextInt();
        int array[] = new int[tamañoArray];
        System.out.println("Rellene el array con numeros manualmente");
        int contador = 0;
        for (int i = 0; i < tamañoArray; i++) {
            contador += 1;
            System.out.print("numero " + contador + ": ");
            array[i] = escaneado.nextInt();

        }
        System.out.println("Introduzca los elementos/numeros del segundo Array");
        int contador2 = 0;
        int array2[] = new int[tamañoArray];
        for (int i = 0; i < tamañoArray; i++) {
            contador2 += 1;
            System.out.print("numero " + contador2 + ": ");
            array2[i] = escaneado.nextInt();

        }
        System.out.println("Imprimiendo array 1...");
        for (int i = 0; i < tamañoArray; i++) {
            System.out.print(array[i] + " ");


        }
        System.out.println();
        System.out.println("Imprimiendo array 2...");
        for (int i = 0; i < tamañoArray; i++) {
            System.out.print(array2[i] + " ");

        }
        System.out.println();
        System.out.println("Estos son los numeros comunes ");
        int contador3=0;
        for (int i = 0; i < tamañoArray; i++) {
            for (int j = 0; j <tamañoArray; j++) {
                if (array[i]==array2[j]){
                    int numerosComunes=array2[j];
                    contador3+=1;
                    System.out.print(numerosComunes+ " ");
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("Hay "+ contador3+ " numeros comunes entre los 2 arrays");


    }


    public static void rellenaArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * (max - min + 1) + min);
            array[i] = aleatorio;
        }
    }

}
