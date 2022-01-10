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
        for (int i = 0; i < tamañoArray; i++) {
            for (int j = i+1; j < tamañoArray; j++) {
                if (array[i]==array[j]){
                    numeroDuplicado += array[j];
                    numerosDuplicados +=1;

            }
        }
        }
        System.out.println("Los numeros duplicados son "+numeroDuplicado);
        System.out.println("En total ="+numerosDuplicados);


    }
}

