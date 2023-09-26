import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double miles;

        do {
            System.out.print("Ingrese una cantidad de millas (0 para salir): ");
            miles = scanner.nextDouble();

            if (miles == 0) {
                break;
            }

            if (miles < 0) {
                System.out.println("Por favor, ingrese un valor positivo de millas.");
                continue;
            }

            double kilometers = miles * 1.6093;
            System.out.printf("%.2f millas equivale a %.2f kilómetros%n", miles, kilometers);

        } while (true);

        System.out.println("Gracias por usar el convertidor de millas a kilómetros.");
        scanner.close();
    }
}
