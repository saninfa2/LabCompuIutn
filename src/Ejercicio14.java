
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce un número entero de tres cifras:");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 999) {
            int primerDigito = numero / 100;
            int tercerDigito = numero % 10;

            if (primerDigito == tercerDigito) {
                System.out.println("El número " + numero + " es capicúa.");
            } else {
                System.out.println("El número " + numero + " no es capicúa.");
            }
        } else {
            System.out.println("El número introducido no tiene tres cifras.");
        }

        scanner.close();
    }
}

