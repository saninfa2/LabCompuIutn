import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1, number2;

        do {
            System.out.print("Ingrese el primer número entero: ");
            number1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número entero (distinto del primero): ");
            number2 = scanner.nextInt();

            if (number1 == number2) {
                System.out.println("Los números ingresados son iguales. Por favor, ingrese números distintos.");
            }
        } while (number1 == number2);

        // Ordenar los números de menor a mayor
        if (number1 > number2) {
            int auxiliary = number1;
            number1 = number2;
            number2 = auxiliary;
        }

        // Mostrar los números desde el menor hasta el mayor
        System.out.println("Números desde el menor hasta el mayor:");
        for (int i = number1; i <= number2; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
