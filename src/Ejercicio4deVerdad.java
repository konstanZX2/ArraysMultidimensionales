import java.util.Scanner;

public class Ejercicio4deVerdad {
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
        System.out.println();
        System.out.println("Imprimiendo array 1...");
        for (int i = 0; i < tamañoArray; i++) {
            System.out.print(array[i] + " ");


        }
        int numero1; int numero2;
        System.out.println();
        System.out.println("Introduzca el numero deseado");
        int numeroDeseado = escaneado.nextInt();
        System.out.println();
        System.out.println("Los Numeros que componen la suma del "+numeroDeseado+" son: ");
        for(int i=0; i<tamañoArray ;i++){
        for(int j=i+1; j<tamañoArray ;j++){
            if (array[i]+array[j]==numeroDeseado){
                numero1=array[i];
                numero2=array[j];
                System.out.println(numero1+ " "+ numero2+ " ");
                break;
            }
        }
        }

    }
}
