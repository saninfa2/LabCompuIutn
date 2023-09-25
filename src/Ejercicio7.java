import java.util.Scanner;
/*Programa java para calcular si un número entero es múltiplo de tres y de cinco*/
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Será múltiplo de 3 y 5?");
        System.out.println("Ingrese un número entero:");
        int number = scan.nextInt();
        if ((number % 5 == 0) && (number % 3 == 0)) {
            System.out.println("Es múltiplo de 3 y 5");
        } else {
            System.out.println("No es múltiplo de 3 y 5");
        }
    }

}
