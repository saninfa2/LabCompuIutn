/*Programa java para calcular si un número entero es múltiplo de dos o de tres.*/
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Será múltiplo de 2 y 3?");
        System.out.println("Ingrese un número entero:");
        int number = scan.nextInt();
        if ((number % 2 == 0) && (number % 3 == 0)) {
            System.out.println("Es múltiplo de 2 y 3");
        } else {
            System.out.println("No es múltiplo de 2 y 3");
        }
    }
}
