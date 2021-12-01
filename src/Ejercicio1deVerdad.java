import java.util.Scanner;

public class Ejercicio1deVerdad {
    public static void main(String[] args) {
        Scanner escaneado = new Scanner(System.in);
        System.out.println("Introduzca el tamaño del array");
        int tamañoArray = escaneado.nextInt();
        int[] array = new int[tamañoArray];
        System.out.println("Introduzca los elementos del array");
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            contador += 1;
            System.out.println("elemento " + contador);
            array[i] = escaneado.nextInt();

        }
        System.out.println("Introduce el numero de la columna del Array que quieras cambiar");
        int filaDelArray = escaneado.nextInt();
        for (int i = 0; i < array.length; i++) {

        }
    }

}
