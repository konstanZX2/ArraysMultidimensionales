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
        int lugarDelNumeroDelArray;
        System.out.println("Introduce el numero de la posicion del Array que quieras cambiar");
        do {
            lugarDelNumeroDelArray = escaneado.nextInt();
            if (lugarDelNumeroDelArray> tamañoArray){
                System.out.println("introduce un numero distinto xd");}
        }while (lugarDelNumeroDelArray> tamañoArray-1);

        int numeroDelArray = array[lugarDelNumeroDelArray-1];
        for (int i = lugarDelNumeroDelArray; i < array.length; i++) {
            array[i-1]=array[i];


        }
        array[tamañoArray-1]= numeroDelArray;
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println(array[i]);

        }
    }

}
