import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la hora (0-23): ");
        int hours = scanner.nextInt();

        System.out.print("Ingrese los minutos (0-59): ");
        int minutes = scanner.nextInt();

        System.out.print("Ingrese los segundos (0-59): ");
        int seconds = scanner.nextInt();

        // Verificar si la hora es válida
        boolean hoursValid = (hours >= 0 && hours <= 23) && (minutes >= 0 && minutes <= 59) && (seconds >= 0 && seconds <= 59);

        if (hoursValid) {
            System.out.println("La hora ingresada es válida.");
        } else {
            System.out.println("La hora ingresada no es válida.");
        }

        scanner.close();
    }

}
