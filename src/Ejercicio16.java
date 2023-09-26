import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número de mes (1-12): ");
        int mount = scanner.nextInt();

        // Verificar si el valor está dentro del rango válido
        if (mount >= 1 && mount <= 12) {
            String nameMount;
            int mountDays;

            // Asignar el nombre del mes y el número de días
            switch (mount) {
                case 1 -> {
                    nameMount = "Enero";
                    mountDays = 31;
                }
                case 2 -> {
                    nameMount = "Febrero";
                    mountDays = 28;
                }
                case 3 -> {
                    nameMount = "Marzo";
                    mountDays = 31;
                }
                case 4 -> {
                    nameMount = "Abril";
                    mountDays = 30;
                }
                case 5 -> {
                    nameMount = "Mayo";
                    mountDays = 31;
                }
                case 6 -> {
                    nameMount = "Junio";
                    mountDays = 30;
                }
                case 7 -> {
                    nameMount = "Julio";
                    mountDays = 31;
                }
                case 8 -> {
                    nameMount = "Agosto";
                    mountDays = 31;
                }
                case 9 -> {
                    nameMount = "Septiembre";
                    mountDays = 30;
                }
                case 10 -> {
                    nameMount = "Octubre";
                    mountDays = 31;
                }
                case 11 -> {
                    nameMount = "Noviembre";
                    mountDays = 30;
                }
                default -> {
                    nameMount = "Diciembre";
                    mountDays = 31;
                }
            }

            System.out.println("El mes de " + nameMount + " tiene " + mountDays + " días.");
        } else {
            System.out.println("El valor ingresado no corresponde a un mes válido (1-12).");
        }

        scanner.close();
    }
}
