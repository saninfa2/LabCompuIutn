/*Programa que lea dos caracteres y compruebe si son iguales*/
import java.util.Scanner;
public class Ejericicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese dos caracteres para ver si son iguales: ");
        String first_character = scan.next();
        String second_character = scan.next();
        if (first_character.equals(second_character)) {
            System.out.println("Los caracteres son iguales");
        } else {
            System.out.println("Los caracteres no son iguales");
        }
    }
}
