import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificación numérica (0-10): ");
        double qualification = scanner.nextDouble();
        String qualificationAlphabetical;
        // Verificar si la calificación está en el rango válido
        if (qualification >= 0 && qualification <= 10) {


            // Convertir calificación numérica a calificación alfabética
            if (qualification < 5) {
                qualificationAlphabetical = "Insuficiente";
            } else if (qualification < 6) {
                qualificationAlphabetical = "Suficiente";
            } else if (qualification < 7) {
                qualificationAlphabetical = "Bien";
            } else if (qualification < 9) {
                qualificationAlphabetical = "Notable";
            } else {
                qualificationAlphabetical = "Sobresaliente";
            }

            System.out.println("La calificación alfabética es: " + qualificationAlphabetical);
        } else {
            System.out.println("La calificación ingresada no está en el rango válido (0-10).");
        }

        scanner.close();
    }
}
