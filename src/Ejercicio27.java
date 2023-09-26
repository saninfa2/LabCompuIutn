import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B;

        do {
            System.out.print("Ingrese el número entero A: ");
            A = scanner.nextInt();

            System.out.print("Ingrese el número entero B (mayor que A): ");
            B = scanner.nextInt();

            if (A >= B) {
                System.out.println("A debe ser menor que B. Por favor, ingrese valores nuevamente.");
            }
        } while (A >= B);

        System.out.println("Números pares entre " + A + " y " + B + ":");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
