package com.company;

public class Main {
    public static void rellenaNotas( int [][] notas){
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                notas[i][j]= (int)(Math.random()*11);

            }

        }
    }
public static void imprimeNotas(int[][]notas) {
    for (int i = 0; i < notas.length; i++) {
        for (int j = 0; j < notas[0].length; j++) {
            System.out.println(notas[i][j]+ " ");
        }
        System.out.println();

}
}
    public static void main(String[] args) {
        int numeroAlumnos= 10;
        int numeroAsignaturas = 8;
        int [][] notas= new int[10][8];//filas alumnos(10) y columnas materias(8)
        rellenaNotas(notas);
        imprimeNotas(notas);

        }






}
