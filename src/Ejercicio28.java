import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N, M;

        do {
            System.out.print("Ingrese un número entero positivo N: ");
            N = scanner.nextInt();

            System.out.print("Ingrese un número entero positivo M (mayor que N): ");
            M = scanner.nextInt();

            if (N <= 0 || M <= 0 || N >= M) {
                System.out.println("Los valores ingresados no son válidos. Por favor, inténtelo nuevamente.");
            }
        } while (N <= 0 || M <= 0 || N >= M);

        System.out.println("Múltiplos de " + N + " desde 1 hasta " + M + ":");

        for (int i = 1; i <= M; i++) {
            if (i % N == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
