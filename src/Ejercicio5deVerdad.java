import java.util.Scanner;

public class Ejercicio5deVerdad {
    public static void main(String[] args) {
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
        boolean si=false;
        for (int i = 0; i < tamañoArray; i++) {
            if (array[i] == array2[i]) {
                si = true;
            } else {
                si = false;

            }

        }if (si) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");

        }
    }
}
