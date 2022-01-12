import java.util.Scanner;

public class Ejercicio2deVerdad {
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
        int numeroDuplicado = 0;
        int numerosDuplicados = 0;
        System.out.println("EEEESTos son los numeros ke se repiten en el arrai");
        for (int i = 0; i < tamañoArray; i++) {
            for (int j = i + 1; j < tamañoArray; j++) {
                if (array[i] == array[j]) {
                    numerosDuplicados += 1;
                    numeroDuplicado = array[j];
                    System.out.print(numeroDuplicado+ " ");
                    break;
                }

            }


        }

        System.out.println("En total =" + numerosDuplicados);
    }
}






