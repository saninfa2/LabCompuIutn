import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();

        for (int i = 1; i < N; i++) {
            System.out.println(i);
        }

        int i = N;
        while (i > 1) {
            System.out.println(i);
            i--;
        }

        i = N;
        do {
            System.out.println(i);
            i--;
        } while (i > 1);

        scanner.close();
    }
}
