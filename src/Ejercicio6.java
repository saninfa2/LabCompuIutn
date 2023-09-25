import java.util.Scanner;
/* Programa java para calcular si la última cifra de dos números enteros es la misma*/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿La última cifra será la misma?");
        System.out.println("Ingrese dos números enteros para saber si la última cifra de ambos es la misma:  ");
        int last_figure1, last_figure2;
        boolean coincidence;
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        if ((number1 <= 9 && number1 >= 0) && (number2 < 9 && number2 >= 0)) {
            if (number1 == number2) {
                coincidence = true;
            } else {
                coincidence = false;
            }
        } else if ((number1 > 9 & number1 <= 99) & (number2 > 9 & number2 <= 99)) {
            last_figure1 = number1 % 10;
            last_figure2 = number2 % 10;
            if (last_figure1 == last_figure2) {
                coincidence = true;
            } else {
                coincidence = false;
            }
        } else if ((number1 > 99 & number1 <= 1000) & (number2 > 99 & number2 <= 1000)) {
            last_figure1 = number1 % 100;
            last_figure2 = number2 % 100;
            if (last_figure1 == last_figure2) {
                coincidence = true;
            } else {
                coincidence = false;
            }
            System.out.println(coincidence);
        }
    }
}

